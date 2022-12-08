package pl.pjatk.CarRentalApplication;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CarSegmentPremiumSegmentPriceTest {
    @Test
    void CarSegmentPremiumShouldReturnFive(){
        Double price = CarSegment.PREMIUM.getNumVal();

        assertThat(price).isEqualTo(5.0);
    }
}
