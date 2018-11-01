package com.example.semen.dagger211simple.di;

import android.app.Application;
import android.content.Context;

import com.example.semen.dagger211simple.App;
import com.example.semen.dagger211simple.MainActivity;
import com.example.semen.dagger211simple.scope.ActivityScope;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjectionModule;
import dagger.android.ContributesAndroidInjector;

@Module(includes = AndroidInjectionModule.class)
public abstract class AppModule {

    @Binds
    @Singleton
    abstract Application application(App app);

    @Binds
    @ActivityScope
    abstract Context activityContext(MainActivity mainActivity);

    @ActivityScope
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity mainActivityInjector();
}
