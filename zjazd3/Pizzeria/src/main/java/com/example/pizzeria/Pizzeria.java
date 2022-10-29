package com.example.pizzeria;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Pizzeria {

    private final PizzaStorage pizzaStorage;

    public Pizzeria(PizzaStorage pizzaStorage) {
        this.pizzaStorage = pizzaStorage;
    }

    public Pizza checkIfPizza(String order) {
        for (Pizza typeOfPizza : pizzaStorage.getPizzas()) {
            if (typeOfPizza.getName().equals(order)) {
                return typeOfPizza;
            }
        }
        return null;

    }
}

