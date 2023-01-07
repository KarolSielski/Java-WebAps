package pl.pjatk.CarRentalApplication;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest
public class CarServiceIntegrationTest {

    @MockBean
    private CarStorage carStorage;
    @MockBean
    private RentalStorage rentalStorage;
    @Autowired
    private CarService carService;

    @Test
    void shouldNotRentCarThatDoesntExist() {
        when(rentalStorage.getRentalList()).thenReturn(List.of(new Rental(null, new Car(null, null, "dada", null))));
        when(carStorage.getCarList()).thenReturn(new ArrayList<>());

        RentalInfo result = carService.rentACar(
                "vin",
                LocalDate.now(),
                LocalDate.now().plusDays(10)
        );

        assertThat(result).isNull();
    }

    @Test
    void shouldNotRentRentedCar() {
        when(rentalStorage.getRentalList()).thenReturn(List.of(new Rental(null, new Car(null, null, "vin", null))));
        when(carStorage.getCarList()).thenReturn(new ArrayList<>());

        RentalInfo result = carService.rentACar(
                "vin",
                LocalDate.now(),
                LocalDate.now().plusDays(10)
        );

        assertThat(result).isNull();
    }

    @Test
    void shouldNotRentWhenStartDateIsAfterEndDate() {
        when(rentalStorage.getRentalList()).thenReturn(List.of(new Rental(null, new Car(null, null, "vin", null))));
        when(carStorage.getCarList()).thenReturn(new ArrayList<>());

        RentalInfo result = carService.rentACar(
                "vin",
                LocalDate.now(),
                LocalDate.now().minusDays(10)
        );

        assertThat(result).isNull();
    }

    @Test
    void shouldReturnGoodPremiumCarSegmentValue() {
        List<Rental> rentals = new ArrayList<>();
        rentals.add(new Rental(null, new Car(null, null, "vin", null)));
        when(rentalStorage.getRentalList()).thenReturn(rentals);
        when(carStorage.getCarList()).thenReturn(List.of(new Car("Audi", "A8", "audicaA8", CarSegment.PREMIUM)));

        RentalInfo result = carService.rentACar(
                "audicaA8",
                LocalDate.now(),
                LocalDate.now().plusDays(10)
        );

        Double price = 300.00 * 10 * CarSegment.PREMIUM.getNumVal();

        assertThat(result.getPrice()).isEqualTo(price);
    }

    @Test
    void shouldReturnGoodStandardCarSegmentValue() {
        List<Rental> rentals = new ArrayList<>();
        rentals.add(new Rental(null, new Car(null, null, "vin", null)));
        when(rentalStorage.getRentalList()).thenReturn(rentals);
        when(carStorage.getCarList()).thenReturn(List.of(new Car("Toyota", "Corrola", "toyaCar", CarSegment.STANDARD)));

        RentalInfo result = carService.rentACar(
                "toyaCar",
                LocalDate.now(),
                LocalDate.now().plusDays(10)
        );

        Double price = (Double) (300.00 * 10 * CarSegment.STANDARD.getNumVal());

        assertThat(result.getPrice()).isEqualTo(price);
    }

    @Test
    void shouldNotRentIfVinIsNull() {
        when(rentalStorage.getRentalList()).thenReturn(List.of(new Rental(null, new Car(null, null, "vin", null))));
        when(carStorage.getCarList()).thenReturn(new ArrayList<>());

        RentalInfo result = carService.rentACar(
                null,
                LocalDate.now(),
                LocalDate.now().plusDays(10)
        );

        assertThat(result).isNull();
    }
}
