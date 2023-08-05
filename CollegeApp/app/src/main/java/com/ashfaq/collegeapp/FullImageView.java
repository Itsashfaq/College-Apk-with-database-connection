package com.ashfaq.collegeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.bumptech.glide.Glide;
import com.github.chrisbanes.photoview.PhotoView;

public class FullImageView extends AppCompatActivity {

    private PhotoView imageView ;
    private ProgressBar progress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_image_view);

        imageView = findViewById(R.id.imageView);
        progress = findViewById(R.id.progress);

        progress.setVisibility(View.VISIBLE);

        String image = getIntent().getStringExtra("image");

        Glide.with(this).load(image).into(imageView);
        progress.setVisibility(View.GONE);
    }
}