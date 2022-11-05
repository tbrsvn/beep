package com.example.ominousbeepingapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;

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
// -
//Music distributed by -https://www.youtube.com/channel/UCX1r...
//Sound effects (Copyright Free) - https://www.youtube.com/channel/UCQoz...
//Artist channel - https://www.youtube.com/channel/UCRk-...
//Music license - Creative Commons
//-
//License
//Creative Commons Attribution license (reuse allowed)