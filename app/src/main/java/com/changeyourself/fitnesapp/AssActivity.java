package com.changeyourself.fitnesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import fragments.MaleButtFragment2;
import fragments.MaleButtFragment4;
import fragments.MaleButtsFragment3;
import fragments.MaleBuutsFragment;

public class AssActivity extends AppCompatActivity {
    //private boolean isImageFitToScreen=false;

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
        setContentView(R.layout.activity_ass);
        //imageViewgift1=findViewById(R.id.giftbut1);
//        imageViewgift1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(!isImageFitToScreen)
//                    v.animate().scaleX(1.4f).scaleY(1.4f).setDuration(1000);
//                if(isImageFitToScreen)
//                    v.animate().scaleX(1f).scaleY(1f).setDuration(1000);
//                    isImageFitToScreen=!isImageFitToScreen;
//            }
//        });

    }

    public void oncklickGotoFragmentbuuts1(View view) {
        MaleBuutsFragment maleBuutsFragment1=new MaleBuutsFragment();
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.containerbuutmale,maleBuutsFragment1);
        fragmentTransaction.commit();
    }

    public void onCklikcGoTomaleBuutsfragment2(View view) {
        MaleButtFragment2 maleBuutsFragment2=new MaleButtFragment2();
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.containerbuutmale,maleBuutsFragment2);
        fragmentTransaction.commit();
    }

    public void onCklikcGoTomaleBuutsfragment3(View view) {
        MaleButtsFragment3 maleBuutsFragment3=new MaleButtsFragment3();
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.containerbuutmale,maleBuutsFragment3);
        fragmentTransaction.commit();
    }

    public void onCklikcGoTomaleButtsfragment4(View view) {
        MaleButtFragment4 maleBuutsFragment4=new MaleButtFragment4();
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.containerbuutmale,maleBuutsFragment4);
        fragmentTransaction.commit();
    }
}