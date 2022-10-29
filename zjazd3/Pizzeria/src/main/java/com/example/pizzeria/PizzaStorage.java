package com.example.pizzeria;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PizzaStorage {

    private final List<Pizza> pizzas;

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public PizzaStorage() {
        this.pizzas = List.of(
                new Pizza("Domowa", 15),
                new Pizza("Wiejska", 22),
                new Pizza("Włoska", 25),
                new Pizza("Polo", 26),
                new Pizza("Beef", 21)
        );


    }
}
