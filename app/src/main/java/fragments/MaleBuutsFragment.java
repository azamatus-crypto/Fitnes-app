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


public class MaleBuutsFragment extends Fragment {
    private String butyoutube="https://youtu.be/vetFqD_t8P8";
    private ImageView imageViewbuutsyoutube;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_male_buuts, container, false);
        imageViewbuutsyoutube=(ImageView) view.findViewById(R.id.imageViewgotomalebuttYoutube1);
        imageViewbuutsyoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentarmsyoutube=new Intent(Intent.ACTION_VIEW, Uri.parse(butyoutube));
                startActivity(intentarmsyoutube);
            }
        });
        return view;
    }
}