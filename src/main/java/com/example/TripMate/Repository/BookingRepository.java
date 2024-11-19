package com.example.TripMate.Repository;

import com.example.TripMate.Entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {}

