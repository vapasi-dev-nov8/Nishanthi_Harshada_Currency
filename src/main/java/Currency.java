import java.util.Objects;

public class Currency {
    private int value;

    public Currency(int value) {
        this.value = value;
    }

    public int add(Currency currency) {
        return this.value + currency.value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Currency currency = (Currency) o;
        return value == currency.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

}