package com.example.pizzeria;

import org.springframework.stereotype.Component;

@Component
public class PizzaComponent {

    public PizzaComponent(Pizzeria pizzeria) {
        Pizza domowa = pizzeria.checkIfPizza("Domowa");
        System.out.println(domowa.toString());
    }
}
