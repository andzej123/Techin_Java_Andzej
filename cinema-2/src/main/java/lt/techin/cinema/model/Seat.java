package lt.techin.cinema.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

@RequiredArgsConstructor
@Getter
@Setter
public class Seat {
    private final int row;
    private final int column;
    private final int price;
    @JsonIgnore
    private boolean booked = false;
}
