package com.changeyourself.fitnesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import fragments.LegsFragment1;
import fragments.LegsFragment2;
import fragments.LegsFragment3;
import fragments.LegsFragment4;

public class Legsactivity extends AppCompatActivity {
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
    //private ImageView imageViewlegsmale1;

   // private boolean isImageFitToScreen=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legsactivity);
        //imageViewlegsmale1=findViewById(R.id.giftlegs1);

//        imageViewlegsmale1.setOnClickListener(new View.OnClickListener() {
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



    public void onCklickgotomalelegs(View view) {

    }

    public void oncklickGotolegsFragment1(View view) {
        LegsFragment1 legsFragment1=new LegsFragment1();
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.containerlegsmale,legsFragment1);
        fragmentTransaction.commit();
    }

    public void onCklikcGoTomalelegsfragment2(View view) {
        LegsFragment2 legsFragment2=new LegsFragment2();
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.containerlegsmale,legsFragment2);
        fragmentTransaction.commit();
    }

    public void onCklikcGoTomalelegsfragment3(View view) {
        LegsFragment3 legsFragment3=new LegsFragment3();
        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.containerlegsmale,legsFragment3);
        transaction.commit();
    }

    public void onCklikcGoTomalelegsfragment4(View view) {
        LegsFragment4 legsFragment4=new LegsFragment4();
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.containerlegsmale,legsFragment4);
        fragmentTransaction.commit();
    }
}