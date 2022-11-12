package pl.pjatk.CarRentalApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarRentalApplication {

    public CarRentalApplication(CarService carService) {
        System.out.println(carService.getAllCars());
        System.out.println(carService.getAllRentals());
    }

    public static void main(String[] args) {
        SpringApplication.run(CarRentalApplication.class, args);
    }

}
