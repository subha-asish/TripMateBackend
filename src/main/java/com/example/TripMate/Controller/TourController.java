package com.example.TripMate.Controller;

import com.example.TripMate.Entity.Tour;
import com.example.TripMate.Service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/tour")
public class TourController {
    @Autowired
    private TourService tourService;

    @GetMapping
    public List<Tour> getTours() {
        return tourService.getAllTours();
    }

    @PostMapping
    public Tour createTour(@RequestBody Tour tour) {
        return tourService.addTour(tour);
    }

    @PutMapping("/{id}")
    public Tour updateTour(@PathVariable Long id, @RequestBody Tour tourDetails) throws Exception {
        return tourService.updateTour(id, tourDetails);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteTour(@PathVariable Long id) {
        tourService.deleteTour(id);
        return ResponseEntity.ok().build();
    }
}

