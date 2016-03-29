package com.example.paul.mindfulnessprojectquotespictures;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

/**
 * A simple {@link Fragment} subclass.
 */
public class CameraPopUpFragment extends Fragment {

    RelativeLayout popup_text_view;

    public CameraPopUpFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_camera_popup, container, false);

        popup_text_view = (RelativeLayout)v.findViewById(R.id.popup_text_view);
        Button gotitButton = (Button)v.findViewById(R.id.gotit_button);

        gotitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup_text_view.setVisibility(View.GONE);
                CameraFragment cameraFragment = new CameraFragment();
                final FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.fragment_container, cameraFragment);
                ft.addToBackStack(null);
                ft.commit();
            }
        });

        return v;
    }

}
