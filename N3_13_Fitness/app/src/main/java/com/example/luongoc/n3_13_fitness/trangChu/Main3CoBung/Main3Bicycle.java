package com.example.luongoc.n3_13_fitness.trangChu.Main3CoBung;

import android.app.DatePickerDialog;
import android.app.Fragment;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.CountDownTimer;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.luongoc.n3_13_fitness.R;
import com.example.luongoc.n3_13_fitness.trangChu.Main2.Main2CoBung;

import java.util.Calendar;
import java.util.Locale;

public class Main3Bicycle extends AppCompatActivity {

    private ImageView imgBackCobung;
    private TextView tvDate;
    private TextView tvCalendar;
//    private Button btnHenGio;
    private DatePickerDialog.OnDateSetListener mDateSetListenner;

    //Timer
    private static final long START_TIME_IN_MILLIS= 90000;
    private CountDownTimer mCountDownTimer;
    private boolean mTimeRunning;
    private long mTimeLeftOnMillis= START_TIME_IN_MILLIS;
    private Button btnReset, btnStartPause, btnIntervals;
    private TextView tvTimer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3_bicycle);


        /////
        imgBackCobung=findViewById(R.id.imgBackCobung);
        imgBackCobung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Main3Bicycle.this, Main2CoBung.class);
                startActivity(intent);
            }
        });


        //Gắn id cho textViewDate - lịch
        tvDate= findViewById(R.id.tvDate);
            tvDate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Calendar c= Calendar.getInstance();
                    int year= c.get(Calendar.YEAR);
                    int month= c.get(Calendar.MONTH);
                    int day= c.get(Calendar.DAY_OF_MONTH);

                    DatePickerDialog dialog= new DatePickerDialog(
                            Main3Bicycle.this, android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                            mDateSetListenner,
                            year, month, day);
                    dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    dialog.show();
                }
            });
            mDateSetListenner= new DatePickerDialog.OnDateSetListener(){
                @Override
                public void onDateSet(DatePicker datePicker, int year, int day, int month) {
                    month= month+1;
                    Log.d("tag", "onDateSet: dd/mm/yyy:" +day+"/"+ month+"/"+year);
                    String date= day+"/" +month+"/"+ year;
                    tvDate.setText(date);
                }
            };

        //------------------------------Chức năng Timer--------------------------------//
        //Gắn id chức năng Timer
        btnReset=findViewById(R.id.btnReset);
        btnIntervals=findViewById(R.id.btnIntervals);
        btnStartPause= findViewById(R.id.btnStartPause);
        btnIntervals= findViewById(R.id.btnIntervals);
        tvTimer=findViewById(R.id.tvTimer);

        btnStartPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mTimeRunning){
                    pauseTime();
                }else {
                    startTime();
                }
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetTime();
            }
        });
        updateCountDownText();


        //-----------------------------Fragment-------------------------
//        BottomNavigationView bottomNavigationView= findViewById(R.id.bottom_navigationBicycle);
//        bottomNavigationView.setOnNavigationItemSelectedListener(navigation);
//
//        getSupportFragmentManager().beginTransaction().replace(R.id.frameBicycle, new Main1Fragment()).commit();
    }


    //-------------------------Fragment--------------------------------
//    private BottomNavigationView.OnNavigationItemSelectedListener navigation =new BottomNavigationView.OnNavigationItemSelectedListener() {
//        @Override
//        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//            android.support.v4.app.Fragment selectedFragment= null;
//            switch (item.getItemId()){
//                case R.id.item1:
//                    selectedFragment= new Main1Fragment();
//                    break;
//                case R.id.item2:
//                    selectedFragment= new Main2Fragment();
//                    break;
//                case R.id.item3:
//                    selectedFragment= new Main3Fragment();
//                    break;
//            }
//            getSupportFragmentManager().beginTransaction().replace(R.id.frameBicycle, selectedFragment).commit();
//            return true;
//        }
//    };



    //-------------------------Timer------------------
        private void startTime(){
            mCountDownTimer= new CountDownTimer(mTimeLeftOnMillis, 1000) {
                @Override
                public void onTick(long l) {
                    mTimeLeftOnMillis=l;
                    updateCountDownText();
                }

                @Override
                public void onFinish() {
                    mTimeRunning=false;
                    btnStartPause.setText("Start");
                }
            }.start();
            mTimeRunning=true;
            btnStartPause.setText("Pause");
        }

        private void pauseTime(){
            mCountDownTimer.cancel();
            mTimeRunning=false;
            btnStartPause.setText("Start");
        }

        private void resetTime(){
            mTimeLeftOnMillis=START_TIME_IN_MILLIS;
            updateCountDownText();
        }
        private void updateCountDownText(){
            int minutes= (int) (mTimeLeftOnMillis/1000)/60;
            int seconds= (int) (mTimeLeftOnMillis/1000)%60;

            String timeOnLeftFormated= String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);
            tvTimer.setText(timeOnLeftFormated);
        }



}
