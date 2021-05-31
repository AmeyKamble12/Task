package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ImageSlider imagesilder;

    ImageView  img2,img3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagesilder = findViewById(R.id.Image_slider);

        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);



        ArrayList<SlideModel> images = new ArrayList<>();
        images.add(new SlideModel(R.drawable.s2,null));
        images.add(new SlideModel(R.drawable.s3,null));

        imagesilder.setImageList(images);


        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, coldplay.class);
                startActivity(intent);
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,jb.class);
                startActivity(intent);
            }
        });
}}