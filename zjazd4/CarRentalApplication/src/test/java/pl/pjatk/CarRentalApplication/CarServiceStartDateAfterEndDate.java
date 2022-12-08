package pl.pjatk.CarRentalApplication;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

public class CarServiceStartDateAfterEndDate {

    private CarStorage carStorage;
    private RentalStorage rentalStorage;
    private CarService carService;

    @BeforeEach
    void setup() {
        this.carStorage = new CarStorage();
        this.rentalStorage = new RentalStorage();
        this.carService = new CarService(carStorage, rentalStorage);
    }

    @Test
    void rentACarShouldReturnNull(){
        var result = carService.rentACar("r000000", LocalDate.of(2022,10,30),LocalDate.of(2022,9,30));

        assertThat(result).isEqualTo(null);
    }
}
