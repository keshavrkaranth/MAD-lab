package com.keshavrkaranth.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b_start,b_stop;
    TextView result;
    int count = 0;
    Handler customHandler = new Handler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b_start = (Button)findViewById(R.id.start);
        b_stop = (Button)findViewById(R.id.stop);
        result = (TextView)findViewById(R.id.count);

        b_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customHandler.postDelayed(myCounter,0);


            }
        });
        b_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customHandler.removeCallbacks(myCounter);
            }
        });
    }


    Runnable myCounter = new Runnable() {
        @Override
        public void run() {
            result.setText(Integer.toString(count));
            customHandler.postDelayed(this,1000);
            count++;

        }
    };
}