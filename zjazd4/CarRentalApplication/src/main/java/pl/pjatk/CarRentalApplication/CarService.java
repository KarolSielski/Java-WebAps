package pl.pjatk.CarRentalApplication;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CarService {

    private final CarStorage carStorage;
    private final RentalStorage rentalStorage;

    public CarService(CarStorage carStorage, RentalStorage rentalStorage) {
        this.carStorage = carStorage;
        this.rentalStorage = rentalStorage;
    }

    public List<Car> getAllCars() {
        return carStorage.getCarList();
    }

    public List<Rental> getAllRentals() {
        return rentalStorage.getRentalList();
    }
}
