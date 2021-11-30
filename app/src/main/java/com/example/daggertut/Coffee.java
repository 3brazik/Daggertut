package com.example.daggertut;

import android.util.Log;

import javax.inject.Inject;

public class Coffee {
    private static final String TAG = "Coffee";
    @Inject
    public Farm farm;

    public River river;
@Inject
    public Coffee(River river) {

    this.river=river;
    }

    @Inject
    public  void  connectElectricity() {
        Log.d(TAG, "aly  Coffee: Connecting...... ");
    }

        public String getCoffeeCup (){
    return farm.GetBeans() +"+"+ river.getWater() ;
    }
}
