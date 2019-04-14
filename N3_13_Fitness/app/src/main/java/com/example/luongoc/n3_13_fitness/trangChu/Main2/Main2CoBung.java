package com.example.luongoc.n3_13_fitness.trangChu.Main2;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.luongoc.n3_13_fitness.R;
import com.example.luongoc.n3_13_fitness.trangChu.Main3CoBung.Main3Bicycle;

public class Main2CoBung extends AppCompatActivity {

    private ImageView imgGoAbs1;
    private ImageView imgAvt1, imgAvt2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_co_bung);
        imgAvt1= findViewById(R.id.imgAvt1);
        imgAvt2= findViewById(R.id.imgAvt2);

        imgGoAbs1=findViewById(R.id.imgGoAbs1);
        imgGoAbs1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iAbs1= new Intent(Main2CoBung.this, Main3Bicycle.class);
                startActivity(iAbs1);
            }
        });

        //Hàm Bo ảnh
        BoAnh();
    }
    //Bo ảnh
    private void BoAnh(){
        Bitmap bitmap1= BitmapFactory.decodeResource(getResources(), R.drawable.hot);
        RoundedBitmapDrawable roundedBitmapDrawable1= RoundedBitmapDrawableFactory.create(getResources(), bitmap1);
        roundedBitmapDrawable1.setCircular(true);
        imgAvt1.setImageDrawable(roundedBitmapDrawable1);

        Bitmap bitmap2= BitmapFactory.decodeResource(getResources(), R.drawable.hot);
        RoundedBitmapDrawable roundedBitmapDrawable2= RoundedBitmapDrawableFactory.create(getResources(), bitmap2);
        roundedBitmapDrawable2.setCircular(true);
        imgAvt2.setImageDrawable(roundedBitmapDrawable2);
    }
}
