package lt.techin.cinema.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;

@Getter
public class Statictics {
    private int income;
    private int available;
    private int purchased;

    @JsonIgnore
    private Cinema cinema;

    public Statictics(Cinema cinema) {
        this.cinema = cinema;
        income = countIncome();
        available = countAvailable();
        purchased = countPurchased();

    }

    public int countIncome() {
        return (int)cinema.getSeats().stream().filter(Seat::isBooked).mapToInt(Seat::getPrice).sum();
    }

    public int countAvailable() {
        return (int)cinema.getSeats().stream().filter(s -> !s.isBooked()).count();
    }

    public int countPurchased() {
        return (int)cinema.getSeats().stream().filter(Seat::isBooked).count();
    }
}
