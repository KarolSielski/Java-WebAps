package pl.pjatk.CarRentalApplication;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CarStorage {

    private final List<Car> carList;

    public List<Car> getCarList() {
        return carList;
    }

    public CarStorage() {
        this.carList = List.of(
                new Car("Renault", "Clio III", "abcde123", CarSegment.CITY),
                new Car("Mercedes", "CLS", "Merc1234", CarSegment.PREMIUM),
                new Car("Ford", "Focus", "ford1234", CarSegment.STANDARD),
                new Car("Renault", "Megane", "rena12345", CarSegment.STANDARD),
                new Car("Renault", "Clio III", "arenaa23", CarSegment.CITY)
        );
    }
}
