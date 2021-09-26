package com.changeyourself.fitnesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class ArmsBuildActivity extends AppCompatActivity {
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

    //private boolean isImageFitToScreen=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arms_build);

//        imageViewgiftarm1.setOnClickListener(new View.OnClickListener() {
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

    public void oncklickGotoFragment1(View view) {
        MaleArmsFragment maleArmsFragment=new MaleArmsFragment();
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.containerarms,maleArmsFragment);
        fragmentTransaction.commit();
    }

    public void onCklikcGoTomalearmsfragment2(View view) {
        MaleArmsFragment2 maleArmsFragment2=new MaleArmsFragment2();
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.containerarms,maleArmsFragment2);
        fragmentTransaction.commit();
    }
    public void onCklikcGoTomalearmsfragment3(View view) {
        MalearmsFragment3 maleArmsFragment3=new MalearmsFragment3();
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.containerarms,maleArmsFragment3);
        fragmentTransaction.commit();
    }
    public void onCklikcGoTomalearmsfragment4(View view) {
        MalearmsFragment4 malearmsFragment4=new MalearmsFragment4();
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.containerarms,malearmsFragment4);
        fragmentTransaction.commit();
    }
}