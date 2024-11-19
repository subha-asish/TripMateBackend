package com.example.TripMate.Service;

import com.example.TripMate.Entity.Tour;
import com.example.TripMate.Repository.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TourService {
    @Autowired
    private TourRepository tourRepository;

    public List<Tour> getAllTours() {
        return tourRepository.findAll();
    }

    public Tour addTour(Tour tour) {
        return tourRepository.save(tour);
    }

    public void deleteTour(Long id) {
        tourRepository.deleteById(id);
    }

    public Tour updateTour(Long id, Tour tourDetails) throws Exception {
        Tour tour = tourRepository.findById(id)
                .orElseThrow(() -> new Exception("Tour not found"));
        tour.setDestination(tourDetails.getDestination());
        tour.setPrice(tourDetails.getPrice());
        return tourRepository.save(tour);
    }
}

