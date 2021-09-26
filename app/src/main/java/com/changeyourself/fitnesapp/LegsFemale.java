package com.changeyourself.fitnesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import fragments.ChestFragment1;
import fragments.FemaleLegsFragment1;
import fragments.FemaleLegsFragment2;
import fragments.FemaleLegsFragment3;
import fragments.FemaleLegsFragment4;

public class LegsFemale extends AppCompatActivity {

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
        setContentView(R.layout.activity_legs_female);


    }




    public void onCklickgotofemalelegsik(View view) {

    }

    public void oncklickGotoFemaleFragmentlegs1(View view) {
        FemaleLegsFragment1 femaleLegsFragment1=new FemaleLegsFragment1();
        FragmentTransaction transaction1=getSupportFragmentManager().beginTransaction();
        transaction1.replace(R.id.containerfemalelegs,femaleLegsFragment1);
        transaction1.commit();
    }

    public void oncklickGotoFemaleFragmentlegs2(View view) {
        FemaleLegsFragment2 femaleLegsFragment2=new FemaleLegsFragment2();
        FragmentTransaction transaction1=getSupportFragmentManager().beginTransaction();
        transaction1.replace(R.id.containerfemalelegs,femaleLegsFragment2);
        transaction1.commit();
    }

    public void oncklickGotoFemaleFragmentlegs3(View view) {
        FemaleLegsFragment3 femaleLegsFragment3=new FemaleLegsFragment3();
        FragmentTransaction transaction1=getSupportFragmentManager().beginTransaction();
        transaction1.replace(R.id.containerfemalelegs,femaleLegsFragment3);
        transaction1.commit();
    }

    public void oncklickGotoFemaleFragmentlegs4(View view) {
        FemaleLegsFragment4 femaleLegsFragment4=new FemaleLegsFragment4();
        FragmentTransaction transaction1=getSupportFragmentManager().beginTransaction();
        transaction1.replace(R.id.containerfemalelegs,femaleLegsFragment4);
        transaction1.commit();
    }
}