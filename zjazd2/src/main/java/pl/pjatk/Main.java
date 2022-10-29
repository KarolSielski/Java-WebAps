package pl.pjatk;

public class Main {

    public static void main(String[] args) {

        Pizzeria pizzeria = new Pizzeria();

        Pizza typeOfPizza = pizzeria.checkIfPizza("wiejska");
        if (typeOfPizza != null) {
            System.out.println("Pizza " + typeOfPizza.getName() + " Została zamówiona, Cena: " + typeOfPizza.getPrice());
        } else {
            System.out.println("Nie ma takiej pizzy");
        }

    }

}
