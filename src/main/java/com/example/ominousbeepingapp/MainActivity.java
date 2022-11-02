package com.example.ominousbeepingapp;

import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageview);
        Glide.with(this).load(R.drawable.sonar).into(imageView);
        final MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.beep);
        mp.setLooping(true);
        mp.start();
    }
}