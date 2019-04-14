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
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.luongoc.n3_13_fitness.R;

public class MainMenu extends AppCompatActivity {

    private LinearLayout llMenu1;
    private LinearLayout llMenu2;
    private LinearLayout llMenu3;
    private LinearLayout llMenu4;
    private LinearLayout llMenu5;
    private TextView tvMenu;
    private Button btnExit;
    private ImageView imgMenu1, imgMenu2, imgMenu3, imgMenu4, imgMenu5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        llMenu1= findViewById(R.id.llMenu1);
        llMenu2= findViewById(R.id.llMenu2);
        llMenu3= findViewById(R.id.llMenu3);
        llMenu4= findViewById(R.id.llMenu4);
        llMenu5= findViewById(R.id.llMenu5);
        tvMenu= findViewById(R.id.tvMenu);
        btnExit= findViewById(R.id.btnExit);
        imgMenu1=findViewById(R.id.imgMenu1);
        imgMenu2=findViewById(R.id.imgMenu2);
        imgMenu3=findViewById(R.id.imgMenu3);
        imgMenu4=findViewById(R.id.imgMenu4);
        imgMenu5=findViewById(R.id.imgMenu5);

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowDialogMenu();
            }
        });

        llMenu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1= new Intent(MainMenu.this, MainActivity.class);
                startActivity(intent1);
            }
        });

        //Hàm Bo ảnh
        BoAnh();

    }

    //Bo ảnh
    private void BoAnh(){
        Bitmap bitmap1= BitmapFactory.decodeResource(getResources(), R.drawable.icon_exe);
        RoundedBitmapDrawable roundedBitmapDrawable1= RoundedBitmapDrawableFactory.create(getResources(), bitmap1);
        roundedBitmapDrawable1.setCircular(true);
        imgMenu1.setImageDrawable(roundedBitmapDrawable1);

        Bitmap bitmap2= BitmapFactory.decodeResource(getResources(), R.drawable.icon_work);
        RoundedBitmapDrawable roundedBitmapDrawable2= RoundedBitmapDrawableFactory.create(getResources(), bitmap2);
        roundedBitmapDrawable2.setCircular(true);
        imgMenu2.setImageDrawable(roundedBitmapDrawable2);

        Bitmap bitmap3= BitmapFactory.decodeResource(getResources(), R.drawable.icon_node);
        RoundedBitmapDrawable roundedBitmapDrawable3= RoundedBitmapDrawableFactory.create(getResources(), bitmap3);
        roundedBitmapDrawable3.setCircular(true);
        imgMenu3.setImageDrawable(roundedBitmapDrawable3);

        Bitmap bitmap4= BitmapFactory.decodeResource(getResources(), R.drawable.icon_history);
        RoundedBitmapDrawable roundedBitmapDrawable4= RoundedBitmapDrawableFactory.create(getResources(), bitmap4);
        roundedBitmapDrawable4.setCircular(true);
        imgMenu4.setImageDrawable(roundedBitmapDrawable4);

        Bitmap bitmap5= BitmapFactory.decodeResource(getResources(), R.drawable.icon_more);
        RoundedBitmapDrawable roundedBitmapDrawable5= RoundedBitmapDrawableFactory.create(getResources(), bitmap5);
        roundedBitmapDrawable5.setCircular(true);
        imgMenu5.setImageDrawable(roundedBitmapDrawable5);
    }


    private Dialog mDialog;
    private  void ShowDialogMenu(){
        mDialog = new Dialog(MainMenu.this);

        mDialog.setCanceledOnTouchOutside(false);
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.setContentView(R.layout.dialog_layout_exit);
        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

        Button btnOk= mDialog.findViewById(R.id.btnOk);
        Button btnCancle= mDialog.findViewById(R.id.btnCancel);

        btnCancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDialog.dismiss();
            }
        });
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDialog.dismiss();
            }
        });
        mDialog.show();
    }
}
