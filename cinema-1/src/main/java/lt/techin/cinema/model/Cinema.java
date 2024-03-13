package lt.techin.cinema.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Cinema {
    private int rows;
    private int columns;
    private List<Seat> seats = new ArrayList<>();

    public Cinema(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                seats.add(new Seat(i, j));
            }
        }
    }
}
