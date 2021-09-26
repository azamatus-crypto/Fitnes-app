package com.changeyourself.fitnesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import fragments.PressFragment1;
import fragments.PressFragment2;
import fragments.PressFragment3;
import fragments.PressFragment4;

public class PressActivity extends AppCompatActivity {

    private boolean isImageFitToScreen=false;
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
        setContentView(R.layout.activity_press);



    }



    public void oncklickGotoPressFragment1(View view) {
        PressFragment1 pressFragment1=new PressFragment1();
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.containerPressmale,pressFragment1);
        fragmentTransaction.commit();
    }

    public void onCklikcGoTomalePressfragment2(View view) {
        PressFragment2 pressFragment2=new PressFragment2();
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.containerPressmale,pressFragment2);
        fragmentTransaction.commit();
    }

    public void onCklikcGoTomalePressfragment3(View view) {
        PressFragment3 pressFragment3=new PressFragment3();
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.containerPressmale,pressFragment3);
        fragmentTransaction.commit();
    }

    public void onCklikcGoTomalePressragment4(View view) {
        PressFragment4 pressFragment4=new PressFragment4();
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.containerPressmale,pressFragment4);
        fragmentTransaction.commit();
    }
}