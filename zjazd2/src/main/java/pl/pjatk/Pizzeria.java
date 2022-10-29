package pl.pjatk;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;


public class Pizzeria {

    Pizza margarita = new Pizza("margarita", 20);
    Pizza wiejska = new Pizza("wiejska", 24);
    Pizza ostra = new Pizza("ostra", 26);

    ArrayList<Pizza> pizzas = new ArrayList<Pizza>();

    public Pizzeria() {
        pizzas.add(margarita);
        pizzas.add(wiejska);
        pizzas.add(ostra);
    }

    public Pizza checkIfPizza(String order) {


        for (Pizza typeOfPizza : pizzas) {
            if (typeOfPizza.getName().equals(order)) {
                return typeOfPizza;
            }
        }
        return null;

    }

}
