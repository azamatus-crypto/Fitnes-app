package com.changeyourself.fitnesapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class KogInActivity extends AppCompatActivity {
   private FirebaseAuth firebaseAuth;
    private EditText editTextemaillogin;
    private EditText editTextpaswordLogin;
    private TextView textViewgotosindup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kog_in);
        firebaseAuth=FirebaseAuth.getInstance();
        editTextemaillogin=findViewById(R.id.editTextTextEmailAddresslogin);
        editTextpaswordLogin=findViewById(R.id.editTextTextPasswordlogin);
        textViewgotosindup=findViewById(R.id.textViewbacktologin);

    }

    public void onCklickBactoregistr(View view) {
        Intent intent=new Intent(this,RegistrActivity.class);
        startActivity(intent);
    }

    public void onCklickLogin(View view) {
        String email=editTextemaillogin.getText().toString().trim();
        String pasword=editTextpaswordLogin.getText().toString().trim();
        if(email.isEmpty()||pasword.isEmpty()){
            return;
        }
        firebaseAuth.signInWithEmailAndPassword(email,pasword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete( Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Intent intenttomessage=new Intent(KogInActivity.this,MesageActivity.class);
                    startActivity(intenttomessage);
                }else{
                    Toast.makeText(KogInActivity.this, "Incorrect email or password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}