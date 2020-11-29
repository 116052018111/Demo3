package com.example.lab_03_02;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;



public class MainActivity extends AppCompatActivity {


    public void customView(View source){
        TableLayout loginLayout =(TableLayout) getLayoutInflater().inflate(R.layout.login,null);
        new AlertDialog.Builder(this).setView(loginLayout)
                .create().show();

    }
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}
