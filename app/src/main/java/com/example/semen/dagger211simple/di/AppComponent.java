package com.example.semen.dagger211simple.di;

import com.example.semen.dagger211simple.App;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(App app);
}
