package com.keshavrkaranth.wallpapper_changer;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

import java.io.IOException;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    Button wc;
    Bitmap walpapper;
    WallpaperManager wallpaperManager = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wallpaperManager = WallpaperManager.getInstance(this);

        wc = findViewById(R.id.change_wp);

        wc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    while (true){
                        walpapper = BitmapFactory.decodeResource(getResources(),R.drawable.daytona);
                        DisplayMetrics metrices = new DisplayMetrics();
                        getWindowManager().getDefaultDisplay().getMetrics(metrices);
                        int height = metrices.heightPixels;
                        int width = metrices.widthPixels;
                        Bitmap scaledWlp = Bitmap.createScaledBitmap(walpapper,width,height, true);
                        wallpaperManager.setBitmap(scaledWlp);
                        Thread.sleep(30000);

                        walpapper = BitmapFactory.decodeResource(getResources(),R.drawable.hyabusa);
                        scaledWlp = Bitmap.createScaledBitmap(walpapper,width,height, true);
                        wallpaperManager.setBitmap(scaledWlp);
                        Thread.sleep(30000);

                        walpapper = BitmapFactory.decodeResource(getResources(),R.drawable.gsa);
                        scaledWlp = Bitmap.createScaledBitmap(walpapper,width,height, true);
                        wallpaperManager.setBitmap(scaledWlp);
                        Thread.sleep(30000);


                        walpapper = BitmapFactory.decodeResource(getResources(),R.drawable.s100rr);
                        scaledWlp = Bitmap.createScaledBitmap(walpapper,width,height, true);
                        wallpaperManager.setBitmap(scaledWlp);
                        Thread.sleep(30000);



                        walpapper = BitmapFactory.decodeResource(getResources(),R.drawable.z900);
                        scaledWlp = Bitmap.createScaledBitmap(walpapper,width,height, true);
                        wallpaperManager.setBitmap(scaledWlp);
                        Thread.sleep(30000);
                    }





                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });


    }

}