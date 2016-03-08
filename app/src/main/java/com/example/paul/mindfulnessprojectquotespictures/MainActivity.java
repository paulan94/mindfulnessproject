package com.example.paul.mindfulnessprojectquotespictures;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;



import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class MainActivity extends FragmentActivity {

    FrameLayout main_screen;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_screen = (FrameLayout)findViewById(R.id.fragment_container);

        //animations
        final Animation screenFadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);

        //screenAnimation fade in
        main_screen.startAnimation(screenFadeIn);

        // Check that the activity is using the layout version with
        // the fragment_container FrameLayout
        if (findViewById(R.id.fragment_container) != null) {

            // However, if we're being restored from a previous state,
            // then we don't need to do anything and should return or else
            // we could end up with overlapping fragments.
            if (savedInstanceState != null) {
                return;
            }

            // Create a new Fragment to be placed in the activity layout
            MainFragment mainFragment = new MainFragment();

            // In case this activity was started with special instructions from an
            // Intent, pass the Intent's extras to the fragment as arguments
            mainFragment.setArguments(getIntent().getExtras());

            // Add the fragment to the 'fragment_container' FrameLayout
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, mainFragment).commit();
        }
    }
}

//
//public class MainActivity extends AppCompatActivity {
//    Fragment fr;
//    FragmentManager fm;
//    FragmentTransaction fragmentTransaction;
//    RelativeLayout main_screen;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        main_screen = (RelativeLayout)findViewById(R.id.welcome_screen_container);
//
//        //animations
//        final Animation screenFadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);
//        final Animation animTranslate = AnimationUtils.loadAnimation(this, R.anim.anim_translate);
//
//        //screenAnimation fade in
//        main_screen.startAnimation(screenFadeIn);
//
//        Button button1 = (Button) findViewById(R.id.get_started_button);
//
//        button1.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//
//                //animate button transition with translate animation
//                v.startAnimation(animTranslate);
//
////
//                fr =  new MainFragment();
//
//                fm = getSupportFragmentManager();
//                fragmentTransaction = fm.beginTransaction();
//                fragmentTransaction.add(R.id.fragment_area, fr);
//                fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
////                fragmentTransaction.addToBackStack(null);
//                fragmentTransaction.commit();
//
//                Button button1 = (Button) findViewById(R.id.get_started_button);
//                button1.setVisibility(View.GONE);
//
//            }
//        });
//
//        TextView tx = (TextView)findViewById(R.id.welcome_screen_txt);
//        Button get_started_btn = (Button)findViewById(R.id.get_started_button);
//
//        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/scriptina.ttf");
//        Typeface amatic = Typeface.createFromAsset(getAssets(), "fonts/AmaticSC-Regular.ttf");
//
//        tx.setTypeface(custom_font);
//        get_started_btn.setTypeface(amatic);
//    }
//}
