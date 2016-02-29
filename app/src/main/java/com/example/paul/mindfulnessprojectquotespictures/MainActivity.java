package com.example.paul.mindfulnessprojectquotespictures;

import android.graphics.Typeface;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Fragment fr;
    FragmentManager fm;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.get_started_button);

        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

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
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/scriptina.ttf");
        tx.setTypeface(custom_font);
    }
}
