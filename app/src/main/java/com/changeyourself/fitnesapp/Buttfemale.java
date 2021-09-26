package com.changeyourself.fitnesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import fragments.FemaleButtFragment1;
import fragments.FemaleButtFragment2;
import fragments.FemaleButtFragment3;
import fragments.FemaleButtFragment4;

public class Buttfemale extends AppCompatActivity {
    private String gotofemalebuuts="https://youtu.be/3GWCpUkvJTA";
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
        setContentView(R.layout.activity_buttfemale);

    }


    public void onCklickgotofemmaleBuuts(View view) {
        Intent intenttofemalebuts=new Intent(Intent.ACTION_VIEW, Uri.parse(gotofemalebuuts));
        startActivity(intenttofemalebuts);
    }



    public void oncklickGotoFemaleFragmentbuuts1(View view) {
        FemaleButtFragment1 femaleButtFragment1=new FemaleButtFragment1();
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.containerfemalebuut,femaleButtFragment1);
        fragmentTransaction.commit();
    }

    public void oncklickGotoFemaleFragmentbuuts2(View view) {
        FemaleButtFragment2 femaleButtFragment2=new FemaleButtFragment2();
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.containerfemalebuut,femaleButtFragment2);
        fragmentTransaction.commit();
    }

    public void oncklickGotoFemaleFragmentbuuts3(View view) {
        FemaleButtFragment3 femaleButtFragment3=new FemaleButtFragment3();
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.containerfemalebuut,femaleButtFragment3);
        fragmentTransaction.commit();
    }

    public void oncklickGotoFemaleFragmentbuuts4(View view) {
        FemaleButtFragment4 femaleButtFragment4=new FemaleButtFragment4();
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.containerfemalebuut,femaleButtFragment4);
        fragmentTransaction.commit();
    }
}