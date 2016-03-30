package com.example.paul.mindfulnessprojectquotespictures;


import android.hardware.Camera;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/**
 * A simple {@link Fragment} subclass.
 */
public class CameraFragment extends Fragment {

    RelativeLayout popup_text_view;
    private Camera mCamera = null;
    private CameraView mCameraView = null;

    public CameraFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_camera, container, false);

        popup_text_view = (RelativeLayout)v.findViewById(R.id.popup_text_view);
        Button gotitButton = (Button)v.findViewById(R.id.gotit_button);
        final FrameLayout cameraView = (FrameLayout)v.findViewById(R.id.camera_stuff_view);

        try{
            mCamera = Camera.open();//you can use open(int) to use different cameras
        } catch (Exception e){
            Log.d("ERROR", "Failed to get camera: " + e.getMessage());
        }

        if(mCamera != null) {
            mCameraView = new CameraView(v.getContext(), mCamera);//create a SurfaceView to show camera data
            FrameLayout camera_view = (FrameLayout)v.findViewById(R.id.camera_view);
            camera_view.addView(mCameraView);//add the SurfaceView to the layout
        }

        //btn to close the application
        ImageButton imgClose = (ImageButton)v.findViewById(R.id.imgClose);
        imgClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });

        gotitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup_text_view.setVisibility(View.GONE);
                cameraView.setVisibility(View.VISIBLE);
            }
        });

        return v;
    }

}
