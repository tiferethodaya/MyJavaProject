package com.dugma.tiferet.myapplicationchadash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    private  Button button1;
    private  Button button2;
    private  Button button3;
    private  Button button4;
    private  Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();

    }

    private void findViews() {
        button1 = (Button)findViewById((R.id.targil1));
        button2 = (Button)findViewById((R.id.targil2));
        button3 = (Button)findViewById((R.id.targil3));
        button4 = (Button)findViewById((R.id.targil4));
        button5 = (Button)findViewById((R.id.targil5));

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    //      button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.targil1:
                dotargil1();
                break;
            case R.id.targil2:
                dotargil2();
                break;
            case R.id.targil3:
                dotargil3();
                break;
//            case R.id.targil4:
//                dotargil4();
//                break;
//            case R.id.targil5:
//                dotargil5();
//                break;
        }



    }

//    private void dotargil5() {
//        Intent intent = new Intent(this,Targuil5Activity.class) ;
//        startActivity(intent);
//    }
//    private void dotargil4() {
//        Intent intent = new Intent(this,Targuil4Activity.class) ;
//        startActivity(intent);
//    }
    private void dotargil3() {
        Intent intent = new Intent(this,Targuil3Activity.class) ;
        startActivity(intent);
    }
    private void dotargil2() {
        Intent intent = new Intent(this,Targuil2Activity.class) ;
        startActivity(intent);
    }
    private void dotargil1() {
        Intent intent = new Intent(this,Targuil1Activity.class) ;
        startActivity(intent);
    }
}