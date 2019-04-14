package com.example.luongoc.n3_13_fitness.trangChu.trangChu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.luongoc.n3_13_fitness.R;

public class Main_Dang_Ki extends AppCompatActivity {

    private Button btnDangKi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__dang__ki);

        btnDangKi= findViewById(R.id.btnDangKi);
        btnDangKi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Main_Dang_Ki.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
