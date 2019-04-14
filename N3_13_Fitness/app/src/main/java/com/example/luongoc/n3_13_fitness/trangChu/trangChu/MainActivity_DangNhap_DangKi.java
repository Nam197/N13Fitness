package com.example.luongoc.n3_13_fitness.trangChu.trangChu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.luongoc.n3_13_fitness.R;

public class MainActivity_DangNhap_DangKi extends AppCompatActivity {

    private EditText edtPass, edtUser;
    private Button btnDangNhap;
    private TextView tvDangKy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__dang_nhap__dang_ki);
        btnDangNhap= findViewById(R.id.btnDangNhap);
        tvDangKy=findViewById(R.id.tvDangKy);

        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity_DangNhap_DangKi.this, MainActivity.class);
                startActivity(i);
            }
        });

        tvDangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity_DangNhap_DangKi.this, Main_Dang_Ki.class);
                startActivity(intent);
            }
        });
    }


}
