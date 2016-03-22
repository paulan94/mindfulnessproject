package com.example.paul.mindfulnessprojectquotespictures;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ChooseOptionsFragment extends Fragment {

    FrameLayout choose_options_screen;

    public ChooseOptionsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_choose_options, container, false);
        choose_options_screen = (FrameLayout)v.findViewById(R.id.choose_options_layout);

        //animation
        final Animation screenFadeIn = AnimationUtils.loadAnimation(this.getActivity(), R.anim.fade_in);
        choose_options_screen.startAnimation(screenFadeIn);

        TextView tx = (TextView)v.findViewById(R.id.choose_options_top);
        Typeface windsong = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Windsong.ttf");
        tx.setTypeface(windsong);

        Button medButton = (Button)v.findViewById(R.id.meditation_button);
        Button quoteButton = (Button)v.findViewById(R.id.quote_button);

        //meditation button stuff
        medButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                //meditation fragment
                MeditationFragment meditationFragment = new MeditationFragment();
                final FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.fragment_container, meditationFragment);
                ft.addToBackStack(null);
                ft.commit();

            }
        });
        //open up quote screen
        quoteButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                //meditation fragment
                QuotesMainFragment quotesMainFragment = new QuotesMainFragment();
                final FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.fragment_container, quotesMainFragment);
                ft.addToBackStack(null);
                ft.commit();

            }
        });

        Typeface amatic = Typeface.createFromAsset(getActivity().getAssets(), "fonts/AmaticSC-Regular.ttf");
        medButton.setTypeface(amatic);
        quoteButton.setTypeface(amatic);

        return v;
    }

}
