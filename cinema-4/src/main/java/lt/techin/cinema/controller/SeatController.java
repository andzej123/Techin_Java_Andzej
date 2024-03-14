package lt.techin.cinema.controller;


import lt.techin.cinema.exception.TicketBookException;
import lt.techin.cinema.exception.WrongPasswordException;
import lt.techin.cinema.model.Cinema;
import lt.techin.cinema.model.Seat;
import lt.techin.cinema.model.Statictics;
import lt.techin.cinema.model.Token;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

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
    public Map<String, Object> buyTicket(@RequestBody Seat seat) {
        return cinema.getSeats().stream()
                .filter(se -> se.getColumn() == seat.getColumn() && se.getRow() == seat.getRow())
                .findFirst()
                .map(s -> {
                    if (s.isBooked()) {
                        throw new TicketBookException("The ticket has been already purchased!");
                    }
                    s.setBooked(true);
                    s.setToken(new Token());
                    Map<String, Object> result = new LinkedHashMap<>();
                    result.put("token", s.getToken().getToken());
                    result.put("ticket", s);
                    return result;
                })
                .orElseThrow(() -> new TicketBookException("The number of a row or a column is out of bounds!"));
    }

    @PostMapping("/return")
    public Map<String, Object> returnTicket(@RequestBody Token token) {
        Seat seat = cinema.getSeats().stream()
                .filter(s -> s.getToken() != null && s.getToken().getToken().equals(token.getToken()))
                .findFirst()
                .orElseThrow(() -> new TicketBookException("Wrong token!"));
        seat.setToken(null);
        seat.setBooked(false);
        Map<String, Object> result = new HashMap<>();
        result.put("ticket", seat);
        return result;

    }

    @GetMapping("/stats")
    public Statictics getStatistics(@RequestParam(defaultValue = "student") String password) {
        if (!password.equals("super_secret")) throw new WrongPasswordException("The password is wrong!");
        return new Statictics(cinema);
    }
}
