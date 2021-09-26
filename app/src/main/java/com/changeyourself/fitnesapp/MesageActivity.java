package com.changeyourself.fitnesapp;

import androidx.activity.result.ActivityResultLauncher;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.IdpResponse;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QuerySnapshot;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Adapters.MessagesAdapter;
import DataBase.Message;

public class MesageActivity extends AppCompatActivity {
   private RecyclerView recyclerViewmessages;
   private MessagesAdapter messagesAdapter;
   private EditText editTextsendingmessages;
   private ImageView imageViewsendmessage;
   private ImageView imageViewsendimages;
   private FirebaseFirestore db;
   private SharedPreferences preferences;
   private FirebaseAuth firebaseAuth;
    private static final int signInLauncher=103;
    private static final int getimage=101;
    private FirebaseStorage firebaseStoragE;
    private StorageReference storageRef;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.item_menu2, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
         if(item.getItemId()==R.id.itemsignoutchat){
             firebaseAuth.signOut();
             sighnout();
         }
         if(item.getItemId()==R.id.itembactomainmenu){
             Intent intent=new Intent(this,MainActivity.class);
             startActivity(intent);
         }
        if(item.getItemId()==R.id.itembactomainmenumale){
            Intent intentmalebac=new Intent(this,MailActivitycategory.class);
            startActivity(intentmalebac);
        }
        if(item.getItemId()==R.id.itembactomainmenufemale){
            Intent intentmalebacfemale=new Intent(this,FemaleActivity.class);
            startActivity(intentmalebacfemale);
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesage);
        recyclerViewmessages=findViewById(R.id.recycklerviewforthecaht);
        db=FirebaseFirestore.getInstance();
        firebaseAuth=FirebaseAuth.getInstance();
        firebaseStoragE=FirebaseStorage.getInstance();
        storageRef = firebaseStoragE.getReference();
        messagesAdapter=new MessagesAdapter(this);
        editTextsendingmessages=findViewById(R.id.editTextTextMultiLinechar);
        imageViewsendimages=findViewById(R.id.imageViewchatimages);
        imageViewsendmessage=findViewById(R.id.imageViewsendmesages);
        recyclerViewmessages.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewmessages.setAdapter(messagesAdapter);
        preferences= PreferenceManager.getDefaultSharedPreferences(this);
        imageViewsendmessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            sendMessage(editTextsendingmessages.getText().toString().trim(),null);
            }
        });
        imageViewsendimages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //poluchaem izobrajenie iz telephona
                Intent intent=new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("image/jpeg");
                intent.putExtra(Intent.EXTRA_LOCAL_ONLY,true);
                startActivityForResult(intent,getimage);
            }
        });

        if(firebaseAuth.getCurrentUser()!=null){
            preferences.edit().putString("author",firebaseAuth.getCurrentUser().getEmail()).apply();

        }else{
            sighnout();
        }
    }
    public void sendMessage(String textOfMessage,String imageurl){
        Message message=null;
        String author=preferences.getString("author","anonim");
        if(textOfMessage!=null&&!textOfMessage.isEmpty()){
            message=new Message(author,textOfMessage,System.currentTimeMillis(),null);
        }else if(imageurl!=null&&!imageurl.isEmpty()){
            message=new Message(author,null,System.currentTimeMillis(),imageurl);
        }
        assert message != null;
        db.collection("messages").add(message).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
            @Override
            public void onSuccess(DocumentReference documentReference) {
                editTextsendingmessages.setText("");
                recyclerViewmessages.scrollToPosition(messagesAdapter.getItemCount()-1);
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure( Exception e) {
                Toast.makeText(MesageActivity.this, "Error message not send", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void sighnout(){
        AuthUI.getInstance().signOut(this).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete( Task<Void> task) {
                if(task.isSuccessful()){
                    List<AuthUI.IdpConfig> providers = Arrays.asList(
                            new AuthUI.IdpConfig.EmailBuilder().build(),
                            new AuthUI.IdpConfig.GoogleBuilder().build());
                    startActivityForResult(AuthUI.getInstance()
                            .createSignInIntentBuilder()
                            .setAvailableProviders(providers)
                            .build(),signInLauncher);
                }
            }
        });



    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==getimage&&resultCode==RESULT_OK){
            if(data!=null) {
                Uri uri = data.getData();
                if(uri!=null) {
                    final StorageReference storageReference=storageRef.child("images/"+uri.getLastPathSegment());
                    storageReference.putFile(uri).continueWithTask(new Continuation<UploadTask.TaskSnapshot, Task<Uri>>() {
                        @Override
                        public Task<Uri> then(@NonNull Task<UploadTask.TaskSnapshot> task) throws Exception {
                            if (!task.isSuccessful()) {
                                throw task.getException();
                            }

                            // Continue with the task to get the download URL
                            return storageReference.getDownloadUrl();
                        }
                    }).addOnCompleteListener(new OnCompleteListener<Uri>() {
                        @Override
                        public void onComplete(@NonNull Task<Uri> task) {
                            if (task.isSuccessful()) {
                                Uri downloadUri = task.getResult();
                                if(downloadUri!=null) {
                                   sendMessage(null,downloadUri.toString());
                                }
                            } else {
                                // Handle failures
                                // ...
                            }
                        }
                    });
                }
            }
        }
        if (requestCode == signInLauncher) {
            IdpResponse response=IdpResponse.fromResultIntent(data);
            if(resultCode==RESULT_OK) {
                // Successfully signed in
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if(user!=null) {
                    Toast.makeText(this, user.getEmail(), Toast.LENGTH_SHORT).show();
                    preferences.edit().putString("author",user.getEmail()).apply();
                }
            }else {
                if(response!=null) {
                    Toast.makeText(this, "ERROR: " + response.getError(), Toast.LENGTH_SHORT).show();

                }
                // Sign in failed. If response is null the user canceled the
                // sign-in flow using the back button. Otherwise check
                // response.getError().getErrorCode() and handle the error.
                // ...
            }
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        db.collection("messages").orderBy("date").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent( QuerySnapshot value,  FirebaseFirestoreException error) {
                if(value!=null) {
                    List<Message> messages = value.toObjects(Message.class);
                    messagesAdapter.setMessages(messages);
                    recyclerViewmessages.scrollToPosition(messagesAdapter.getItemCount()-1);
                }
            }
        });
    }
}