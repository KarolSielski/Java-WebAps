package pl.pjatk.CarRentalApplication;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RentalStorage {

    private final List<Rental> rentalList;


    public RentalStorage() {
        rentalList = List.of(
                new Rental(new User("0001"), new Car("Volvo", "V60", "bolbo321", CarSegment.STANDARD)),
                new Rental(new User("0002"), new Car("Seat", "Leon", "salata321", CarSegment.STANDARD)),
                new Rental(new User("0003"), new Car("Audi", "A8", "audii321", CarSegment.PREMIUM)),
                new Rental(new User("0004"), new Car("Fiat", "500", "fjat5432", CarSegment.STANDARD))
        );
    }

    public List<Rental> getRentalList() {
        return rentalList;
    }

    @Override
    public String toString() {
        return "RentalStorage{" +
                "rentalList=" + rentalList +
                '}';
    }
}
