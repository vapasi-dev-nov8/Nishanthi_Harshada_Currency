import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CurrencyTest {

    private  Currency currency = new Currency(5);
    private  Currency currency2 = new Currency(2);

    @Test
    void shouldAddRupees(){
        assertEquals(7, currency.add(currency2));
    }
    @Test
    void shouldDoEqualsRupees(){
        currency = new Currency(10);
        currency2 = new Currency(10);

        assertTrue(currency.equals(currency2));

    }
}