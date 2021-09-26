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

public class FemaleActivity extends AppCompatActivity {
    private Animation animation1;
    private Animation animation2;
    private Animation animation3;
    private Animation animation4;
    private Animation animation5;
    private ImageView imageViewarms,imageViewbuuts,imageViewchest,imageViewlegs,imageViewpress;
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
        setContentView(R.layout.activity_female);
        imageViewarms=findViewById(R.id.imageViewfemalecategoryactvity);
        imageViewbuuts=findViewById(R.id.imageViewbuttsfemalescategory);
        imageViewchest=findViewById(R.id.imageViewchestfemales);
        imageViewpress=findViewById(R.id.imageViewABCfemalescategory);
        imageViewlegs=findViewById(R.id.imageViewLEGSfemalescategory);
        animation1= AnimationUtils.loadAnimation(this,R.anim.imgpage);
        animation2= AnimationUtils.loadAnimation(this,R.anim.imgpage2);
        animation3= AnimationUtils.loadAnimation(this,R.anim.imgpage3);
        animation4= AnimationUtils.loadAnimation(this,R.anim.imagpage4);
        animation5= AnimationUtils.loadAnimation(this,R.anim.imgpage5);
        imageViewarms.startAnimation(animation1);
        imageViewbuuts.startAnimation(animation3);
        imageViewchest.startAnimation(animation2);
        imageViewlegs.startAnimation(animation5);
        imageViewpress.startAnimation(animation4);

    }


    public void onCklickJoinTochat(View view) {
        Intent intenttochat=new Intent(this,RegistrActivity.class);
        startActivity(intenttochat);
    }

    public void onCklickarmsfemale(View view) {
        Intent intent=new Intent(this,Femalearm.class);
        startActivity(intent);
    }

    public void onCklickchestFemale(View view) {
        Intent intent=new Intent(this,FEmalechests.class);
        startActivity(intent);
    }

    public void onCklickbuttFemale(View view) {
        Intent intent=new Intent(this,Buttfemale.class);
        startActivity(intent);
    }

    public void onCklickABCFemale(View view) {
        Intent intent=new Intent(this,FemalePressactivity.class);
        startActivity(intent);
    }

    public void onCklickLegsFemale(View view) {
        Intent intent=new Intent(this,LegsFemale.class);
        startActivity(intent);
    }
}