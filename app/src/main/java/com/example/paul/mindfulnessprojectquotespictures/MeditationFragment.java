package com.example.paul.mindfulnessprojectquotespictures;


import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;


/**
 * A simple {@link Fragment} subclass.
 */
@TargetApi(Build.VERSION_CODES.GINGERBREAD)
@SuppressLint("NewApi")
public class MeditationFragment extends Fragment {

    Button BtnStart, BtnStop;
    TextView TextViewTime;

    public MeditationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_meditation, container, false);


        BtnStart = (Button)v.findViewById(R.id.BtnStart);
        BtnStop = (Button)v.findViewById(R.id.BtnStop);
        TextViewTime = (TextView)v.findViewById(R.id.TextViewTime);

        TextViewTime.setText("00:03:00");

        final CounterClass timer = new CounterClass(180000, 1000);
        BtnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                timer.start();
            }
        });

        BtnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timer.cancel();
            }
        });

        return v;
    }

    @TargetApi(Build.VERSION_CODES.GINGERBREAD)
    @SuppressLint("NewApi")
    public class CounterClass extends CountDownTimer{

        public CounterClass(long millisInFuture, long countDownInterval){
            super (millisInFuture, countDownInterval);
        }
        @TargetApi(Build.VERSION_CODES.GINGERBREAD)
        @SuppressLint("NewApi")
        @Override
        public void onTick(long millisUntilFinished) {
            long millis = millisUntilFinished;
            String hms = String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(millis),
                    TimeUnit.MILLISECONDS.toMinutes(millis)-TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millis)),
                    TimeUnit.MILLISECONDS.toSeconds(millis)-TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis)));
            System.out.println(hms);
            TextViewTime.setText(hms);
        }

        @Override
        public void onFinish() {
            TextViewTime.setText("Completed.");
        }


    }

    public static class CameraFragment extends Fragment {


        public CameraFragment() {
            // Required empty public constructor
        }


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.fragment_camera, container, false);
        }

    }
}
