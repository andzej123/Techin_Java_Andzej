package lt.techin.cinema.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Seat {
    private final int row;
    private final int column;
    private final int price;
    @JsonIgnore
    private boolean booked = false;
    @JsonIgnore
    private Token token;

    public Seat(int row, int column, int price) {
        this.row = row;
        this.column = column;
        this.price = price;
    }
}
