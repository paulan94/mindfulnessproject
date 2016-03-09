package com.example.paul.mindfulnessprojectquotespictures;


import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
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

        final Animation translateAnim = AnimationUtils.loadAnimation(getActivity(), R.anim.anim_translate);
        button1.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View v) {

                v.startAnimation(translateAnim);


                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ChooseOptionsFragment chooseOptionsFragment = new ChooseOptionsFragment();
                        final FragmentTransaction ft = getFragmentManager().beginTransaction();
                        ft.replace(R.id.fragment_container, chooseOptionsFragment);
                        ft.addToBackStack(null);
                        ft.commit();
                    }
                }, 500);
            }


        });

        return v;
    }

}