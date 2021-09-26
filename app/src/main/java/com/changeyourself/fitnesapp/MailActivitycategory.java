package com.changeyourself.fitnesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.io.IOException;

public class MailActivitycategory extends AppCompatActivity {
     private Animation animation1;
     private Animation animation2;
     private Animation animation3;
     private Animation animation4;
     private Animation animation5;
     private Animation animation6;
     private Animation animation7;
     private ImageView imageViewarms,imageViewbuuts,imageViewchest,imageViewlegs,imageViewshoulders,imageViewpress
             ,imageViewneck;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.item_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.itemMainmenu:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.itemMaleMenu:
                Intent intentToFavourite = new Intent(this, MailActivitycategory.class);
                startActivity(intentToFavourite);
                break;
            case R.id.itemFemaleMenu:
                Intent intentfemale = new Intent(this, FemaleActivity.class);
                startActivity(intentfemale);
                break;
            case R.id.itemBacktogroupchat:
                Intent intentbactoChat = new Intent(this,MesageActivity.class);
                startActivity(intentbactoChat);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail_activitycategory);
        imageViewarms=findViewById(R.id.view);
        imageViewbuuts=findViewById(R.id.imageViewbuttass);
        imageViewchest=findViewById(R.id.imageViewchestmale);
        imageViewshoulders=findViewById(R.id.imageViewshouldercategory);
        imageViewpress=findViewById(R.id.imageViewpresscategory);
        imageViewlegs=findViewById(R.id.imageViewlegsmail);
        imageViewneck=findViewById(R.id.imageViewnecmale);
        animation1= AnimationUtils.loadAnimation(this,R.anim.imgpage);
        animation2= AnimationUtils.loadAnimation(this,R.anim.imgpage2);
        animation3= AnimationUtils.loadAnimation(this,R.anim.imgpage3);
        animation4= AnimationUtils.loadAnimation(this,R.anim.imagpage4);
        animation5= AnimationUtils.loadAnimation(this,R.anim.imgpage5);
        animation6= AnimationUtils.loadAnimation(this,R.anim.imgpage6);
        animation7= AnimationUtils.loadAnimation(this,R.anim.imgpage7);
        imageViewarms.startAnimation(animation1);
        imageViewbuuts.startAnimation(animation2);
        imageViewchest.startAnimation(animation3);
        imageViewlegs.startAnimation(animation4);
        imageViewneck.startAnimation(animation5);
        imageViewshoulders.startAnimation(animation7);
        imageViewpress.startAnimation(animation6);

    }
    public void onCklickArmsman(View view) {
        Intent intentbuildarms=new Intent(getApplicationContext(),ArmsBuildActivity.class);
        startActivity(intentbuildarms);
    }
    public void onCklickassMan(View view) {
        Intent intentass=new Intent(getApplicationContext(),AssActivity.class);
        startActivity(intentass);
    }
    public void onCklickChestmale(View view) {
        Intent intentchests=new Intent(getApplicationContext(),ChestActivity.class);
        startActivity(intentchests);
    }
    public void onCklickLegs(View view) {
        Intent intentlegs=new Intent(getApplicationContext(),Legsactivity.class);
        startActivity(intentlegs);
    }
    public void onCklickNecworkouts(View view) {
        Intent intentneck=new Intent(getApplicationContext(),NecActivity.class);
        startActivity(intentneck);
    }
    public void onCklickpresscateg(View view) {
        Intent intentpress=new Intent(getApplicationContext(),PressActivity.class);
        startActivity(intentpress);
    }
    public void onVklickshouldercat(View view) {
        Intent intentshoulders=new Intent(getApplicationContext(),Shoulders.class);
        startActivity(intentshoulders);
    }




    public void onCklickJoinTOgroupchat(View view) {
        Intent intenttochat=new Intent(this,RegistrActivity.class);
        startActivity(intenttochat);
    }
}