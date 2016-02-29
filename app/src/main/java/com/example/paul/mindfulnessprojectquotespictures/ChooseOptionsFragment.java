package com.example.paul.mindfulnessprojectquotespictures;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ChooseOptionsFragment extends Fragment {


    public ChooseOptionsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_choose_options, container, false);

        TextView tx = (TextView)v.findViewById(R.id.choose_options_top);
        Typeface windsong = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Windsong.ttf");
        tx.setTypeface(windsong);


        Button bx = (Button)v.findViewById(R.id.meditation_button);
        Button bx2 = (Button)v.findViewById(R.id.other_button);
        Typeface amatic = Typeface.createFromAsset(getActivity().getAssets(), "fonts/AmaticSC-Regular.ttf");
        bx.setTypeface(amatic);
        bx2.setTypeface(amatic);

        return v;
    }

}
