package com.example.semen.dagger211simple;

import android.app.Application;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjectionModule;
import dagger.android.ContributesAndroidInjector;

@Module(includes = AndroidInjectionModule.class)
public abstract class AppModule {

    @Binds
    abstract Application application(App app);

    @ContributesAndroidInjector
    abstract MainActivity mainActivity();
}
