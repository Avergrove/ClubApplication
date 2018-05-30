import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/*
 * A short workshop project, based on the workshop assignment on https://ivle.nus.edu.sg/v1/File/Student/default.aspx?CourseID=1be31a83-389c-4e37-b8cd-84758a54c70d&WorkbinID=93c91e93-5570-4eed-841d-a59af3677196&FolderID=4eff5413-b200-4121-9cea-e4582096719f
 */

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
	    
	    /*
	    // Make some booking
	    Booking b1 = new Booking(c.getMembers().get(0), c.getFacility("Badminton Court"), LocalDateTime.now(), LocalDateTime.now().plusDays(1));
	    System.out.println(b1.toString());
	    Booking b2 = new Booking(c.getMembers().get(1), c.getFacility("Chess Board Room"), LocalDateTime.now(), LocalDateTime.now().plusDays(2));
	    System.out.println(b2.toString());
	    
	    // Check for conflicts
	    System.out.println("Booking overlaps: " + b1.overlaps(b2));
	    
	    // Try making malformed bookings
	    Booking b3 = new Booking(c.getMembers().get(2), c.getFacility("Badminton Court"), LocalDateTime.now().plusDays(1), LocalDateTime.now());
	    Booking b4 = new Booking(null, null, null, null);
	    */
	    
	    // Try making some bookings in the club.
	    c.addBooking(1, "Badminton Court", LocalDateTime.now(), LocalDateTime.now().plusDays(1));
	    c.addBooking(2, "Badminton Court", LocalDateTime.now().plusDays(1), LocalDateTime.now().plusDays(2));
	    
	    System.out.println("\nPrinting bookings for badminton court..");
	    c.showBookings("Badminton Court", LocalDateTime.now().minusDays(1), LocalDateTime.now().plusDays(3));
	    
	    // Usage of the DateTimeFormatter class
	    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d-MMM-yyyy H:mm");
	    ArrayList<Booking> bookings = c.getBookings("Badminton Court", LocalDateTime.now().minusDays(1), LocalDateTime.now().plusDays(3));
	    
	    // Attempt to format the date
	    Booking b1 = bookings.get(0);
	    System.out.println("\nThe formatted start date is: ");
	    System.out.println(b1.getStartDate().format(dtf));
	    System.out.println("The formatted end date is: ");
	    System.out.println(b1.getEndDate().format(dtf));
	    
	    // Member sort test
	    c.sortMembers();
	    c.showMembers();
	    
	    
	}

}
