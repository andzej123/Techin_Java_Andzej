package lt.techin.cinema.controller;

import lt.techin.cinema.exception.TicketBookException;
import lt.techin.cinema.model.Cinema;
import lt.techin.cinema.model.Seat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class SeatController {


    Cinema cinema;

    @Autowired
    public SeatController(Cinema cinema) {
        this.cinema = cinema;
    }

    @GetMapping("/seats")
    public Cinema listAllSeats() {
//        List<Seat> seats = cinema.getSeats().stream().filter(s -> !s.isBooked()).toList();
//        Cinema c = new Cinema();
//        c.setSeats(seats);
//        return c;
        return cinema;
    }

    @PostMapping("/purchase")
    public Seat buyTicket(@RequestBody Seat seat) {
        return cinema.getSeats().stream()
                .filter(se -> se.getColumn() == seat.getColumn() && se.getRow() == seat.getRow())
                .findFirst()
                .map(s -> {
                    if (s.isBooked()) {
                        throw new TicketBookException("The ticket has been already purchased!");
                    }
                    s.setBooked(true);
                    return s;
                })
                .orElseThrow(() -> new TicketBookException("The number of a row or a column is out of bounds!"));
    }
}
