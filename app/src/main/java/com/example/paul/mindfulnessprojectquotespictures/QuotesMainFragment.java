package com.example.paul.mindfulnessprojectquotespictures;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class QuotesMainFragment extends Fragment {


    FrameLayout quote_page;

    public QuotesMainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_quotes_main, container, false);

        quote_page = (FrameLayout)v.findViewById(R.id.quote_page);

        Button generate_quote_button = (Button)v.findViewById(R.id.generate_quote);
        final TextView quote_view = (TextView)v.findViewById(R.id.quote_textview);

        //animation
        final Animation screenFadeIn = AnimationUtils.loadAnimation(this.getActivity(), R.anim.fade_in);
        quote_page.startAnimation(screenFadeIn);

        generate_quote_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String[] arrayOfStrings = v.getResources().getStringArray(R.array.quote_list);
                String randomString = arrayOfStrings[new Random().nextInt(arrayOfStrings.length)];
                quote_view.setText(randomString);


            }
        });





        return v;
    }

}
