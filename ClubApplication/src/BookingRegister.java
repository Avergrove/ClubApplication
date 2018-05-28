import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

public class BookingRegister {
	private HashMap<Facility, ArrayList<Booking>> registry;
	
	public BookingRegister() {
		registry = new HashMap<Facility, ArrayList<Booking>>();
	}
	
	
	
	// Adds a booking into the registry
	public void addBooking(Member m, Facility f, LocalDateTime startDate, LocalDateTime endDate) {
		Booking newBooking = new Booking(m, f, startDate, endDate);
		
		// "Retrieve the ArrayList corresponding to the given Facility from the HashMap, using the Facility object as the key "
		ArrayList<Booking> bookings = registry.get(f);
		
		
		// "If no ArrayList object is retrieved (i.e. this is the first booking for the Facility), a new empty ArrayList object must be created, and put into the table, using the Facility object as the key"
		if(bookings == null) {
			bookings = new ArrayList<Booking>();
			registry.put(f, bookings);
		}
		
		boolean overlaps = false;
		// "Go through all the existing Booking objects in the ArrayList, and make sure they do not overlap with the new booking; if there is an overlap, the addBooking() method must throw a BadBookingException "
		for(Booking b : bookings) {
			

			
			try {
				if(b.overlaps(newBooking)) {
					throw new BadBookingException(String.format("Booking %s conflicts with Booking %s!", newBooking, b));
				}
			}
			
			catch(BadBookingException ex) {
				ex.getMessage();
				overlaps = true;
			}
		}
		
		if(overlaps == false) {
			bookings.add(newBooking);
		}
	}
	
	
	
	// Retrieves all bookings for a facility within a given time period
	public ArrayList<Booking> getBookings(Facility f, LocalDateTime startDate, LocalDateTime endDate){
		ArrayList<Booking> returnBookings = new ArrayList<Booking>();
		ArrayList<Booking> registryBookings = registry.get(f);
		
		for(Booking b : registryBookings) {
			if(b.getStartDate().isAfter(startDate) && b.getEndDate().isBefore(endDate)) {
				returnBookings.add(b);
			}
		}
		
		return returnBookings;
	}
	
	// Removes a booking from the relevant facility
	public void removeBooking(Booking booking) {
		ArrayList<Booking> bookings = registry.get(booking.getFacility());
		bookings.remove(booking);
	}
	
}
