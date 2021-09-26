package fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.changeyourself.fitnesapp.R;

public class LegsFragment1 extends Fragment {
    private ImageView imageViewmalelegs1;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_legs1, container, false);
        imageViewmalelegs1=(ImageView) view.findViewById(R.id.imageViewgotomalelegsYoutube1);
        imageViewmalelegs1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/_j91KMBtYas"));
                startActivity(intent);
            }
        });
        return view;
    }
}