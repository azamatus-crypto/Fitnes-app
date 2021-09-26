package com.changeyourself.fitnesapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    private TextView textViewgreetings;
    private TextView textViewpushings;
    private Animation animationgreetings;
    private Animation animationpashings;
    private MediaPlayer mediaPlayer;
    private ObjectAnimator objectAnimator;
    private ObjectAnimator objectAnimator2;
    private Button buttonmale,buttonfemale;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewgreetings=findViewById(R.id.textViewGrreetings);
        textViewpushings=findViewById(R.id.textViewPashings);
        buttonmale=findViewById(R.id.buttonmale);
        buttonfemale=findViewById(R.id.buttonfemale);
        ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null){
            actionBar.hide();
        }
//        Animation blinkin=AnimationUtils.loadAnimation(this,R.anim.blinkinbutton);
//        buttonmale.setAnimation(blinkin);
//        buttonfemale.setAnimation(blinkin);
//        buttonchat.setAnimation(blinkin);
         objectAnimator=(ObjectAnimator) AnimatorInflater.loadAnimator(this,R.animator.blinkintext);
         objectAnimator2=(ObjectAnimator) AnimatorInflater.loadAnimator(this,R.animator.blinkintext);
        objectAnimator.setTarget(buttonmale);
        objectAnimator.start();
        objectAnimator2.setTarget(buttonfemale);
        objectAnimator2.start();
        animationgreetings= AnimationUtils.loadAnimation(this,R.anim.textgreetings_item_anim);
        textViewgreetings.startAnimation(animationgreetings);
        animationpashings=AnimationUtils.loadAnimation(this,R.anim.pashings_anim);
        textViewpushings.startAnimation(animationpashings);
        mediaPlayer=MediaPlayer.create(this,R.raw.bowie_war);
        mediaPlayer.start();
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                   stopPlay();
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        if(mediaPlayer.isPlaying()){
            stopPlay();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if(mediaPlayer.isPlaying()){
            mediaPlayer.pause();
        }
    }
    @Override
    protected void onStart() {
        super.onStart();
        if(!mediaPlayer.isPlaying()) {
            mediaPlayer.start();
        }
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mediaPlayer.isPlaying()){
            mediaPlayer.pause();
        }
    }
    public void stopPlay(){
        mediaPlayer.stop();
        try {
            mediaPlayer.prepare();
            mediaPlayer.seekTo(0);
        } catch (IOException e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }

    }

    public void onCklickMale(View view) {
        Intent intent=new Intent(this,MailActivitycategory.class);
        startActivity(intent);
        objectAnimator.end();
        objectAnimator.cancel();
    }

    public void oncklIckgototofemale(View view) {
        Intent intent=new Intent(this,FemaleActivity.class);
        startActivity(intent);
        objectAnimator2.end();
        objectAnimator2.cancel();
    }

    public void onCklickgotoRegistr(View view) {
        Intent intent=new Intent(this,RegistrActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        //mediaPlayer.getCurrentPosition();
        mediaPlayer.isPlaying();
        mediaPlayer.start();
        objectAnimator.start();
        objectAnimator2.start();
    }
}