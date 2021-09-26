package com.changeyourself.fitnesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import fragments.FemaleArmFragment1;
import fragments.FemaleArmFragment2;
import fragments.FemaleArmFragment3;

public class Femalearm extends AppCompatActivity {
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
    private boolean isImageFitToScreen=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_femalearm);


    }


    public void onCklickgotofemalearm(View view) {

    }

    public void oncklickGotoFemaleFragmentarms1(View view) {
        FemaleArmFragment1 femaleArmFragment1=new FemaleArmFragment1();
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.containerfemalearm,femaleArmFragment1);
        fragmentTransaction.commit();
    }

    public void oncklickGotoFemaleFragmentarms2(View view) {
        FemaleArmFragment2 femaleArmFragment2=new FemaleArmFragment2();
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.containerfemalearm,femaleArmFragment2);
        fragmentTransaction.commit();
    }

    public void oncklickGotoFemaleFragmentarms3(View view) {
        FemaleArmFragment3 femaleArmFragment3=new FemaleArmFragment3();
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.containerfemalearm,femaleArmFragment3);
        fragmentTransaction.commit();
    }

    public void oncklickGotoFemaleFragmentarms4(View view) {
        FemaleArmFragment1 femaleArmFragment1=new FemaleArmFragment1();
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.containerfemalearm,femaleArmFragment1);
        fragmentTransaction.commit();
    }
}