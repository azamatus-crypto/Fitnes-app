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

public class ChestFragment1 extends Fragment {
    private ImageView imageViewbuutsyoutube;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_chest1, container, false);
        imageViewbuutsyoutube=(ImageView) view.findViewById(R.id.imageViewgotomalechestYoutube1);
        imageViewbuutsyoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentarmsyoutube=new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/-kJAFNN8t2Y"));
                startActivity(intentarmsyoutube);
            }
        });
        return view;
    }
}