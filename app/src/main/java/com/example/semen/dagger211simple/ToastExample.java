package com.example.semen.dagger211simple;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import javax.inject.Inject;

public class ToastExample {
    private static final String TAG = "Dagger211Simple";

    private Context context;

    @Inject
    public ToastExample(Context context) {
        this.context = context;
    }

    public void makeToast() {
        Log.i(TAG, this.getClass().getSimpleName());
        Log.i(TAG, context.toString());

        Toast.makeText(context, "Inject context", Toast.LENGTH_LONG).show();

        Log.i(TAG, "Должен был появиться Toast");
    }
}
