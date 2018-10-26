package com.example.semen.dagger211simple;

import com.example.semen.dagger211simple.base.BaseActivityModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;

@Singleton

@Component(modules = {AppModule.class, BaseActivityModule.class})
public interface AppComponent extends AndroidInjector<App> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<App> {
    }

}
