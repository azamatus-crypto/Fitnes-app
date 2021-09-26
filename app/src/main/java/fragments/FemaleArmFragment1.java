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


public class FemaleArmFragment1 extends Fragment {
    private ImageView imageViewarm1;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_female_arm1, container, false);
        imageViewarm1=(ImageView) view.findViewById(R.id.imageViewgotofemalearmYoutube1);
        imageViewarm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/l64ifXMeraA"));
                startActivity(intent);
            }
        });
        return view;
    }
}