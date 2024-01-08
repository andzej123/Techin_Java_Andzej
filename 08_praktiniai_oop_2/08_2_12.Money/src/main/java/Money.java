
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        int newCents = cents + addition.cents;
        int newEuros = euros + addition.euros;

        return new Money(newEuros, newCents);
    }

    public boolean lessThan(Money compared) {
        if (euros != compared.euros) {
            return euros < compared.euros;
        } else {
            return cents < compared.cents;
        }

    }

    public Money minus(Money decreaser) {
        int newCents = cents - decreaser.cents;
        int newEuros = euros - decreaser.euros;
        if (newCents < 0) {
            newCents = 100 - decreaser.cents;
            newEuros--;
        }

        if (newEuros < 0) {
            return new Money(0, 0);
        } else {
            return new Money(newEuros, newCents);
        }
    }

}
