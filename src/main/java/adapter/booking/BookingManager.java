package adapter.booking;

import java.util.HashMap;
import java.util.Map;

public class BookingManager {

    private final Map<Long,BookingInterface> bookings = new HashMap<>();

    private long bookingIdCounter = 0;

    public void addBooking(BookingInterface booking) {
        booking.setId(bookingIdCounter++);
        bookings.put(booking.getId(),booking);
    }

    public void cancelBooking(Long bookingId) {
        bookings.remove(bookingId);
    }

}
