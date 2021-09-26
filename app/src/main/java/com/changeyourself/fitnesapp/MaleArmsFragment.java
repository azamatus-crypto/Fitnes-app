package com.changeyourself.fitnesapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class MaleArmsFragment extends Fragment {

private ImageView imageViewgotoyoutube;
    private String gotoarms="https://youtu.be/wwKb-wZCEjs";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview=inflater.inflate(R.layout.fragment_male_arms, container, false);
        imageViewgotoyoutube=(ImageView) rootview.findViewById(R.id.imageViewgotomalearmsYoutube1);
        imageViewgotoyoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentarmsyoutube=new Intent(Intent.ACTION_VIEW, Uri.parse(gotoarms));
                startActivity(intentarmsyoutube);
            }
        });
        return rootview;
        
    }
}