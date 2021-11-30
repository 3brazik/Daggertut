package com.example.daggertut;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

import dagger.Component;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity ";
    @Inject
    Coffee coffee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CoffeeComponent component = DaggerCoffeeComponent.create();
        component.Inject(this);
        Log.d(TAG, " aly onCreate: " + coffee.getCoffeeCup());
        ;
    }
}