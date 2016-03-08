package com.example.paul.mindfulnessprojectquotespictures;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {


    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_main, container, false);
        Button button1 = (Button)  v.findViewById(R.id.get_started_button);


        TextView tx = (TextView) v.findViewById(R.id.welcome_screen_txt);
        Button get_started_btn = (Button) v.findViewById(R.id.get_started_button);

        Typeface custom_font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/scriptina.ttf");
        Typeface amatic = Typeface.createFromAsset(getActivity().getAssets(), "fonts/AmaticSC-Regular.ttf");

        tx.setTypeface(custom_font);
        get_started_btn.setTypeface(amatic);
        button1.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View v) {
////]
//                Fragment fr;
//                FragmentManager fm;
//                FragmentTransaction fragmentTransaction;
//
//                fr = new MainFragment();
//                fm = getSupportFragmentManager();
//                fragmentTransaction = fm.beginTransaction();
//                fragmentTransaction.add(R.id.fragment_area, fr);
//                fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
////                fragmentTransaction.addToBackStack(null);
//                fragmentTransaction.commit();
            }

        });
        return v;
    }
}