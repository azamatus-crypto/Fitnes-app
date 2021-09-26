package com.changeyourself.fitnesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import fragments.FemaleArmFragment3;
import fragments.FemaleChestFragment1;
import fragments.FemaleChestFragment2;
import fragments.FemaleChestFragment3;

public class FEmalechests extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_femalechests);

    }


    public void onCklickgotofemalechests(View view) {

    }

    public void oncklickGotoFemaleFragmentchest1(View view) {
        FemaleChestFragment1 femaleChestFragment1=new FemaleChestFragment1();
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.containerfemalechest,femaleChestFragment1);
        fragmentTransaction.commit();
    }

    public void oncklickGotoFemaleFragmentchest2(View view) {
        FemaleChestFragment2 femaleChestFragment2=new FemaleChestFragment2();
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.containerfemalechest,femaleChestFragment2);
        fragmentTransaction.commit();
    }

    public void oncklickGotoFemaleFragmentchest3(View view) {
        FemaleChestFragment3 femaleChestFragment3=new FemaleChestFragment3();
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.containerfemalechest,femaleChestFragment3);
        fragmentTransaction.commit();

    }
}