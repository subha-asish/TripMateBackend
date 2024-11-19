package com.example.TripMate.Service;

import com.example.TripMate.Entity.Booking;
import com.example.TripMate.Repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    public Booking addBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    public void deleteBooking(Long id) {
        bookingRepository.deleteById(id);
    }
}

