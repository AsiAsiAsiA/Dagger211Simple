package com.example.semen.dagger211simple.base;

import android.app.Activity;
import android.content.Context;

import com.example.semen.dagger211simple.MainActivity;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class BaseActivityModule {

    @Binds
    public abstract Context context(Activity activity);
}
