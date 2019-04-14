package com.example.luongoc.n3_13_fitness.trangChu.trangChu;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuView;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.luongoc.n3_13_fitness.R;
import com.example.luongoc.n3_13_fitness.trangChu.Main2.Main2BapChan;
import com.example.luongoc.n3_13_fitness.trangChu.Main2.Main2BapTay;
import com.example.luongoc.n3_13_fitness.trangChu.Main2.Main2CangTay;
import com.example.luongoc.n3_13_fitness.trangChu.Main2.Main2CoBaDau;
import com.example.luongoc.n3_13_fitness.trangChu.Main2.Main2CoBung;
import com.example.luongoc.n3_13_fitness.trangChu.Main2.Main2CoChan;
import com.example.luongoc.n3_13_fitness.trangChu.Main2.Main2CoLung;
import com.example.luongoc.n3_13_fitness.trangChu.Main2.Main2CoNguc;
import com.example.luongoc.n3_13_fitness.trangChu.Main2.Main2CoVai;

public class MainActivity extends AppCompatActivity {
    private ImageView imgAvt1, imgAvt2, imgAvt3, imgAvt4, imgAvt5, imgAvt6, imgAvt7, imgAvt8, imgAvt9;

    private ImageView imgMenu;
    private LinearLayout llTrangChu1;
    private LinearLayout llTrangChu2;
    private LinearLayout llTrangChu3;
    private LinearLayout llTrangChu4;
    private LinearLayout llTrangChu5;
    private LinearLayout llTrangChu6;
    private LinearLayout llTrangChu7;
    private LinearLayout llTrangChu8;
    private LinearLayout llTrangChu9;

    private ImageView imgDNDK;
    private MenuView.ItemView itExit;


    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgMenu = findViewById(R.id.imgMenu);
        imgAvt1= findViewById(R.id.imgAvt1);
        imgAvt2= findViewById(R.id.imgAvt2);
        imgAvt3= findViewById(R.id.imgAvt3);
        imgAvt4= findViewById(R.id.imgAvt4);
        imgAvt5= findViewById(R.id.imgAvt5);
        imgAvt6= findViewById(R.id.imgAvt6);
        imgAvt7= findViewById(R.id.imgAvt7);
        imgAvt8= findViewById(R.id.imgAvt8);
        imgAvt9= findViewById(R.id.imgAvt9);
        llTrangChu1 = findViewById(R.id.llTrangChu1);
        llTrangChu2 = findViewById(R.id.llTrangChu2);
        llTrangChu3 = findViewById(R.id.llTrangChu3);
        llTrangChu4 = findViewById(R.id.llTrangChu4);
        llTrangChu5 = findViewById(R.id.llTrangChu5);
        llTrangChu6 = findViewById(R.id.llTrangChu6);
        llTrangChu7 = findViewById(R.id.llTrangChu7);
        llTrangChu8 = findViewById(R.id.llTrangChu8);
        llTrangChu9 = findViewById(R.id.llTrangChu9);

//==============================
//        ArrayList<trangchuModel> modelArrayList= new ArrayList<>();
//        modelArrayList.add(new trangchuModel(R.id.imgAvt, "Chese"));
//        modelArrayList.add(new trangchuModel(R.id.imgAvt, "Chese"));
//        modelArrayList.add(new trangchuModel(R.id.imgAvt, "Chese"));
//        modelArrayList.add(new trangchuModel(R.id.imgAvt, "Chese"));
//        modelArrayList.add(new trangchuModel(R.id.imgAvt, "Chese"));
//        modelArrayList.add(new trangchuModel(R.id.imgAvt, "Chese"));
//        modelArrayList.add(new trangchuModel(R.id.imgAvt, "Chese"));
//        modelArrayList.add(new trangchuModel(R.id.imgAvt, "Chese"));
//        modelArrayList.add(new trangchuModel(R.id.imgAvt, "Chese"));
//
//        adapter= new trangchuAdapter(MainActivity.this, modelArrayList);
//        rcHome.setLayoutManager(new LinearLayoutManager(MainActivity.this));
//        rcHome.setAdapter(adapter);

        llTrangChu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLL1 = new Intent(MainActivity.this, Main2CoBung.class);
                startActivity(intentLL1);
            }
        });

        llTrangChu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLL2 = new Intent(MainActivity.this, Main2CoLung.class);
                startActivity(intentLL2);
            }
        });

        llTrangChu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLL3 = new Intent(MainActivity.this, Main2BapTay.class);
                startActivity(intentLL3);
            }
        });

        llTrangChu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLL4 = new Intent(MainActivity.this, Main2BapChan.class);
                startActivity(intentLL4);
            }
        });

        llTrangChu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLL5 = new Intent(MainActivity.this, Main2CoNguc.class);
                startActivity(intentLL5);
            }
        });

        llTrangChu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLL6 = new Intent(MainActivity.this, Main2CangTay.class);
                startActivity(intentLL6);
            }
        });

        llTrangChu7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLL7 = new Intent(MainActivity.this, Main2CoChan.class);
                startActivity(intentLL7);
            }
        });

        llTrangChu8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLL8 = new Intent(MainActivity.this, Main2CoVai.class);
                startActivity(intentLL8);
            }
        });

        llTrangChu9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLL9 = new Intent(MainActivity.this, Main2CoBaDau.class);
                startActivity(intentLL9);
            }
        });



        //Gắn id cho MENU
        imgMenu= findViewById(R.id.imgMenu);
        imgMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, MainMenu.class);
                startActivity(intent);
            }
        });

        //Bo tròn ảnh
        BoAnhTron();


        //Đăng nhập đăng kí
        //Bắt sự kiện setOnClick vào Đăng nhập đăng kí
        imgDNDK= findViewById(R.id.imgDNDK);
        imgDNDK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowDNDK();
            }
        });

    }

    //Bo tròn ảnh
    private void BoAnhTron(){
        //Ảnh avt1
        Bitmap bitmap1= BitmapFactory.decodeResource(getResources(), R.drawable.hot);
        RoundedBitmapDrawable roundedBitmapDrawable1= RoundedBitmapDrawableFactory.create(getResources(), bitmap1);
        roundedBitmapDrawable1.setCircular(true);
        imgAvt1.setImageDrawable(roundedBitmapDrawable1);
        //Ảnh avt2
        Bitmap bitmap2= BitmapFactory.decodeResource(getResources(), R.drawable.hot);
        RoundedBitmapDrawable roundedBitmapDrawable2= RoundedBitmapDrawableFactory.create(getResources(), bitmap2);
        roundedBitmapDrawable2.setCircular(true);
        imgAvt2.setImageDrawable(roundedBitmapDrawable2);
        //Ảnh avt3
        Bitmap bitmap3= BitmapFactory.decodeResource(getResources(), R.drawable.hot);
        RoundedBitmapDrawable roundedBitmapDrawable3= RoundedBitmapDrawableFactory.create(getResources(), bitmap3);
        roundedBitmapDrawable3.setCircular(true);
        imgAvt3.setImageDrawable(roundedBitmapDrawable3);
        //Ảnh avt4
        Bitmap bitmap4= BitmapFactory.decodeResource(getResources(), R.drawable.hot);
        RoundedBitmapDrawable roundedBitmapDrawable4= RoundedBitmapDrawableFactory.create(getResources(), bitmap4);
        roundedBitmapDrawable4.setCircular(true);
        imgAvt4.setImageDrawable(roundedBitmapDrawable4);
        //Ảnh avt5
        Bitmap bitmap5= BitmapFactory.decodeResource(getResources(), R.drawable.hot);
        RoundedBitmapDrawable roundedBitmapDrawable5= RoundedBitmapDrawableFactory.create(getResources(), bitmap5);
        roundedBitmapDrawable5.setCircular(true);
        imgAvt5.setImageDrawable(roundedBitmapDrawable5);
        //Ảnh avt6
        Bitmap bitmap6= BitmapFactory.decodeResource(getResources(), R.drawable.hot);
        RoundedBitmapDrawable roundedBitmapDrawable6= RoundedBitmapDrawableFactory.create(getResources(), bitmap6);
        roundedBitmapDrawable6.setCircular(true);
        imgAvt6.setImageDrawable(roundedBitmapDrawable6);
        //Ảnh avt7
        Bitmap bitmap7= BitmapFactory.decodeResource(getResources(), R.drawable.hot);
        RoundedBitmapDrawable roundedBitmapDrawable7= RoundedBitmapDrawableFactory.create(getResources(), bitmap7);
        roundedBitmapDrawable7.setCircular(true);
        imgAvt7.setImageDrawable(roundedBitmapDrawable7);
        //Ảnh avt8
        Bitmap bitmap8= BitmapFactory.decodeResource(getResources(), R.drawable.hot);
        RoundedBitmapDrawable roundedBitmapDrawable8= RoundedBitmapDrawableFactory.create(getResources(), bitmap8);
        roundedBitmapDrawable8.setCircular(true);
        imgAvt8.setImageDrawable(roundedBitmapDrawable8);
        //Ảnh avt9
        Bitmap bitmap9= BitmapFactory.decodeResource(getResources(), R.drawable.hot);
        RoundedBitmapDrawable roundedBitmapDrawable9= RoundedBitmapDrawableFactory.create(getResources(), bitmap9);
        roundedBitmapDrawable9.setCircular(true);
        imgAvt9.setImageDrawable(roundedBitmapDrawable9);
    }

    private Dialog mDialog;
    private void ShowDNDK(){
        mDialog= new Dialog(MainActivity.this);

        mDialog.setCanceledOnTouchOutside(false);
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.setContentView(R.layout.activity_main__dang_nhap__dang_ki);
        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

        Button btnDangNhap= mDialog.findViewById(R.id.btnDangNhap);
        EditText edtUser= mDialog.findViewById(R.id.edtUser);
        EditText edtPass= mDialog.findViewById(R.id.edtPass);
        TextView tvDangKy= mDialog.findViewById(R.id.tvDangKy);

        //Bấm vào dòng đăng kí tài khoản >>> đến trang đăng kí
        //
        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDialog.dismiss();
            }
    });
        mDialog.show();
    }
}
