package com.changeyourself.fitnesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import fragments.FemalePressFragment1;
import fragments.FemalePressFragment2;
import fragments.FemalePressFragment3;
import fragments.FemalePressFragment4;

public class FemalePressactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_female_pressactivity);


    }

    public void onCklickgotofemmaleABC(View view) {

    }

    public void oncklickGotoFemaleFragmentpress1(View view) {
        FemalePressFragment1 femalePressFragment1=new FemalePressFragment1();
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.containerfemalepress,femalePressFragment1);
        fragmentTransaction.commit();
    }

    public void oncklickGotoFemaleFragmentpress2(View view) {
        FemalePressFragment2 femalePressFragment2=new FemalePressFragment2();
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.containerfemalepress,femalePressFragment2);
        fragmentTransaction.commit();
    }

    public void oncklickGotoFemaleFragmentpress3(View view) {
        FemalePressFragment3 femalePressFragment3=new FemalePressFragment3();
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.containerfemalepress,femalePressFragment3);
        fragmentTransaction.commit();

    }

    public void oncklickGotoFemaleFragmentpress4(View view) {
        FemalePressFragment4 femalePressFragment4=new FemalePressFragment4();
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.containerfemalepress,femalePressFragment4);
        fragmentTransaction.commit();

    }
}