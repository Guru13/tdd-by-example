package guru.springframework;

/**
 * @author Aliaksei Huryanchyk
 */
public class Money {
    protected int amount;

    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;
        return amount == money.amount;
    }
}
