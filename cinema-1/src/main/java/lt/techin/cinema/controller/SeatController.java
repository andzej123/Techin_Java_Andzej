package lt.techin.cinema.controller;

import lt.techin.cinema.model.Cinema;
import lt.techin.cinema.model.Seat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/seats")
public class SeatController {


    @GetMapping
    public Cinema listAllSeatsWithParams(@RequestParam(defaultValue = "9") int rows, @RequestParam(defaultValue = "9") int columns) {
        return new Cinema(rows, columns);
    }


}
