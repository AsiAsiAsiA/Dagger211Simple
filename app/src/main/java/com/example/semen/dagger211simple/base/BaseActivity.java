package com.example.semen.dagger211simple.base;

import android.app.Activity;
import android.app.Fragment;

import dagger.android.AndroidInjector;
import dagger.android.HasFragmentInjector;

public class BaseActivity extends Activity implements HasFragmentInjector {
    @Override
    public AndroidInjector<Fragment> fragmentInjector() {
        return null;
    }
}
