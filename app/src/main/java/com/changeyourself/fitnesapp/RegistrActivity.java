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

public class RegistrActivity extends AppCompatActivity {
   private FirebaseAuth firebaseAuth;
   private EditText editTextemailregistr;
   private EditText editTextpaswordregistr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registr);
        firebaseAuth=FirebaseAuth.getInstance();
        editTextemailregistr=findViewById(R.id.editTextTextEmailAddresslogin);
        editTextpaswordregistr=findViewById(R.id.editTextTextPasswordlogin);



    }

    public void onCklickRegistr(View view) {
        String email=editTextemailregistr.getText().toString().trim();
        String pasword=editTextpaswordregistr.getText().toString().trim();
        if(email.isEmpty()||pasword.isEmpty()){
            return;
        }
        firebaseAuth.createUserWithEmailAndPassword(email,pasword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete( Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Intent intenttomessage=new Intent(RegistrActivity.this,MesageActivity.class);
                    startActivity(intenttomessage);
                }else{
                    Toast.makeText(RegistrActivity.this, "Incorrect email or password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void onCklickBacktoLogin(View view) {
        Intent intent=new Intent(this,KogInActivity.class);
        startActivity(intent);
    }
}