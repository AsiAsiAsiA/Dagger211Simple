package com.example.semen.dagger211simple;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    ToastExample toastExample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("Inject успешен");
//        Toast.makeText(this,"Inject",Toast.LENGTH_LONG).show();
        toastExample.makeToast(this);
    }
}
