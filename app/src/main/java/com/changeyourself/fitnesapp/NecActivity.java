package com.changeyourself.fitnesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class NecActivity extends AppCompatActivity {
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
    private ImageView imageViewneck1;
    private ImageView imageViewneck2;
    private boolean isImageFitToScreen=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nec);
        imageViewneck1=findViewById(R.id.giftfemaleneck1);
        imageViewneck2=findViewById(R.id.giftfemaleneck2);
        imageViewneck1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isImageFitToScreen)
                    v.animate().scaleX(1.4f).scaleY(1.4f).setDuration(1000);
                if(isImageFitToScreen)
                    v.animate().scaleX(1f).scaleY(1f).setDuration(1000);
                isImageFitToScreen=!isImageFitToScreen;
            }
        });
        imageViewneck2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isImageFitToScreen)
                    v.animate().scaleX(1.4f).scaleY(1.4f).setDuration(1000);
                if(isImageFitToScreen)
                    v.animate().scaleX(1f).scaleY(1f).setDuration(1000);
                isImageFitToScreen=!isImageFitToScreen;
            }
        });
    }



    public void onCklickgotomalelneck(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/I1ertAfrClU"));
        startActivity(intent);
    }
}