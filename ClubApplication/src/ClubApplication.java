import java.time.LocalDateTime;

public class ClubApplication {

	public static void main(String[] args) throws BadBookingException {
		// Human beings
		// Person p1 = new Person("Doe", "Jane", "Deer");
		// Person p2 = new Member("Git", "You", "Dumb", 69);
		
		// Create a club and add new members
	    Club c = new Club();
	    
	    c.addMember("Doe", "Jane", "Deer");
	    c.addMember("Hoe", "You", "Dumb");
	    c.addMember("I'm", "Number", "one");
		
		// Facilities
		Facility f1 = new Facility("Badminton Court", "A facility for people to play a fun game of badminton!");
		Facility f2 = new Facility("Chess Board Room", "A room where people play chess, where they sit around for half an hour every turn!");
		
	    // Add some facilities to the club.
	    c.addFacility(f1);
	    c.addFacility(f2);
	    
	    c.show();
	    
	    
	    // Make some booking
	    Booking b1 = new Booking(c.getMembers().get(0), c.getFacility("Badminton Court"), LocalDateTime.now(), LocalDateTime.now().plusDays(1));
	    System.out.println(b1.toString());
	    Booking b2 = new Booking(c.getMembers().get(1), c.getFacility("Chess Board Room"), LocalDateTime.now(), LocalDateTime.now().plusDays(2));
	    System.out.println(b2.toString());
	    
	    // Check for conflicts
	    System.out.println("Booking overlaps: " + b1.overlaps(b2));
	    
	    // Try making a malformed bookings
	    Booking b3 = new Booking(c.getMembers().get(2), c.getFacility("Badminton Court"), LocalDateTime.now().plusDays(1), LocalDateTime.now());
	    Booking b4 = new Booking(null, null, null, null);
	    
	    
	}

}
