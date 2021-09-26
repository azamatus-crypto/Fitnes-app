package com.changeyourself.fitnesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import fragments.MaleButtsFragment3;
import fragments.ShoulderFragment1;
import fragments.ShoulderFragment2;
import fragments.ShoulderFragment3;
import fragments.ShoulderFragment4;

public class Shoulders extends AppCompatActivity {
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
        setContentView(R.layout.activity_shoulders);

    }


    public void oncklickGotoShouldersFragment1(View view) {
        ShoulderFragment1 shoulderFragment1=new ShoulderFragment1();
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.containerShoulder,shoulderFragment1);
        fragmentTransaction.commit();
    }

    public void onCklikcGoTomaleShouldersfragment2(View view) {
        ShoulderFragment2 shoulderFragment2=new ShoulderFragment2();
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.containerShoulder,shoulderFragment2);
        fragmentTransaction.commit();
    }

    public void onCklikcGoTomaleShouldersfragment3(View view) {
        ShoulderFragment3 shoulderFragment3=new ShoulderFragment3();
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.containerShoulder,shoulderFragment3);
        fragmentTransaction.commit();
    }

    public void onCklikcGoTomaleShouldersfragment4(View view) {
        ShoulderFragment4 shoulderFragment4=new ShoulderFragment4();
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.containerShoulder,shoulderFragment4);
        fragmentTransaction.commit();
    }
}