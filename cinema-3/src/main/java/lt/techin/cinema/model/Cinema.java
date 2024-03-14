package lt.techin.cinema.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Component
public class Cinema {
    private int rows;
    private int columns;
    private List<Seat> seats = new ArrayList<>();

    public Cinema() {
        this.rows = 9;
        this.columns = 9;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                int price = i <= 4 ? 10 : 8;
                seats.add(new Seat(i, j, price));
            }
        }
    }
}