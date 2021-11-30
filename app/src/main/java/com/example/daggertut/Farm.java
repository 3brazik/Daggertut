package com.example.daggertut;

import android.util.Log;

import javax.inject.Inject;

public class Farm {
    private static final String TAG = "Farm";
@Inject
    public Farm() {
    Log.d(TAG, "aly Farm: ");
    }
    public String GetBeans(){
    return "beans";

    }
}
