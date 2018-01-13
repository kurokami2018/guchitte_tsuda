package com.example.kurokami.guchitte_tsuda;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.content.Intent;

public class monthly extends AppCompatActivity{
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monthly);

        Intent intent = getIntent();
        int count = intent.getIntExtra("count_1",0);


        if (count> 20) {
            ImageView imageView = (ImageView) findViewById(R.id.imageView5);
            imageView.setVisibility(View.VISIBLE);
        }
        if (count > 40) {
            ImageView imageView2 = (ImageView) findViewById(R.id.imageView6);
            imageView2.setVisibility(View.VISIBLE);
        }
        if (count> 60) {
            ImageView imageView3 = (ImageView) findViewById(R.id.imageView7);
            imageView3.setVisibility(View.VISIBLE);
        }
        if (count> 80) {
            ImageView imageView4 = (ImageView) findViewById(R.id.imageView8);
            imageView4.setVisibility(View.VISIBLE);
        }
        if (count > 100) {
            ImageView imageView5 = (ImageView) findViewById(R.id.imageView9);
            imageView5.setVisibility(View.VISIBLE);
        }
        if (count> 120) {
            ImageView imageView6 = (ImageView) findViewById(R.id.imageView10);
            imageView6.setVisibility(View.VISIBLE);

        }
    }
}

