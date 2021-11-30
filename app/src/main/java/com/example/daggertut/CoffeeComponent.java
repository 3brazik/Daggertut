package com.example.daggertut;

import dagger.Component;

@Component
public interface CoffeeComponent {
    Coffee getCoffee();
    void Inject(MainActivity mainActivity);
}
