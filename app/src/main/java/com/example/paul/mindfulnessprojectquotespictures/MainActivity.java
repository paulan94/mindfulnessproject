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
import android.widget.RelativeLayout;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    Fragment fr;
    FragmentManager fm;
    FragmentTransaction fragmentTransaction;
    RelativeLayout main_screen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_screen = (RelativeLayout)findViewById(R.id.welcome_screen_container);

        //animations
        final Animation screenFadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        final Animation animTranslate = AnimationUtils.loadAnimation(this, R.anim.anim_translate);

        //screenAnimation fade in
        main_screen.startAnimation(screenFadeIn);

        Button button1 = (Button) findViewById(R.id.get_started_button);

        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //animate button transition with translate animation
                v.startAnimation(animTranslate);

//
                fr = new ChooseOptionsFragment();

                fm = getSupportFragmentManager();
                fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.add(R.id.fragment_area, fr);
                fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
//                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

                Button button1 = (Button) findViewById(R.id.get_started_button);
                button1.setVisibility(View.GONE);

            }
        });

        TextView tx = (TextView)findViewById(R.id.welcome_screen_txt);
        Button get_started_btn = (Button)findViewById(R.id.get_started_button);

        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/scriptina.ttf");
        Typeface amatic = Typeface.createFromAsset(getAssets(), "fonts/AmaticSC-Regular.ttf");

        tx.setTypeface(custom_font);
        get_started_btn.setTypeface(amatic);
    }
}
