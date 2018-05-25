import java.time.LocalDateTime;

public class ClubApplication {

	public static void main(String[] args) {
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
	    Booking b1 = new Booking(c.getMembers().get(0), c.getFacility("Badminton Court"), LocalDateTime.now(), LocalDateTime.now());
	    System.out.println(b1.toString());
	}

}
