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
import fragments.ChestFragment2;
import fragments.ChestFragment3;
import fragments.ChestFragment4;

public class ChestActivity extends AppCompatActivity {
    //private ImageView imageViewchestmale1;
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
        setContentView(R.layout.activity_chest);
        //imageViewchestmale1=findViewById(R.id.giftmalechest1);

//        imageViewchestmale1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(!isImageFitToScreen)
//                    v.animate().scaleX(1.4f).scaleY(1.4f).setDuration(1000);
//                if(isImageFitToScreen)
//                    v.animate().scaleX(1f).scaleY(1f).setDuration(1000);
//                isImageFitToScreen=!isImageFitToScreen;
//            }
//        });

    }
    public void onCklickgotochest(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/-kJAFNN8t2Y"));
        startActivity(intent);
    }

    public void oncklickGotoFragmentChest1(View view) {
        ChestFragment1 chestFragment1=new ChestFragment1();
        FragmentTransaction transaction1=getSupportFragmentManager().beginTransaction();
        transaction1.replace(R.id.containerchest,chestFragment1);
        transaction1.commit();
    }

    public void onCklikcGoTomaleChestfragment2(View view) {
        ChestFragment2 chestFragment2=new ChestFragment2();
        FragmentTransaction transaction1=getSupportFragmentManager().beginTransaction();
        transaction1.replace(R.id.containerchest,chestFragment2);
        transaction1.commit();
    }

    public void onCklikcGoTomaleChestfragment3(View view) {
        ChestFragment3 chestFragment3=new ChestFragment3();
        FragmentTransaction transaction1=getSupportFragmentManager().beginTransaction();
        transaction1.replace(R.id.containerchest,chestFragment3);
        transaction1.commit();
    }

    public void onCklikcGoTomaleChestfragment4(View view) {
        ChestFragment4 chestFragment3=new ChestFragment4();
        FragmentTransaction transaction1=getSupportFragmentManager().beginTransaction();
        transaction1.replace(R.id.containerchest,chestFragment3);
        transaction1.commit();
    }
}