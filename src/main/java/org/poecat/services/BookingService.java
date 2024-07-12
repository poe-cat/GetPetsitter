package org.poecat.services;


import org.poecat.entities.Booking;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookingService {

    private List<Booking> bookings = new ArrayList<>();

    public void createBooking(Booking booking) {
        bookings.add(booking);
    }

    public List<Booking> getBookingsForUser(String userId) {
        return bookings.stream()
                .filter(booking -> booking.getOwnerId().equals(userId) || booking.getSitterId().equals(userId))
                .collect(Collectors.toList());
    }
}
