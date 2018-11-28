package com.example.resource_library;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

public class CustomApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ARouter.init(this);
        ARouter.openDebug();
    }
}
