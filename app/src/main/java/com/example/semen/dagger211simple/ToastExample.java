package com.example.semen.dagger211simple;

import android.content.Context;
import android.widget.Toast;

import javax.inject.Inject;

public class ToastExample {


    @Inject
    public ToastExample() {

    }

    public void makeToast(Context context){
        Toast.makeText(context,"Inject",Toast.LENGTH_LONG).show();
    }
}
