package com.example.TripMate.Repository;

import com.example.TripMate.Entity.Tour;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TourRepository extends JpaRepository<Tour, Long> {}

