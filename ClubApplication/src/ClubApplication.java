
public class ClubApplication {

	public static void main(String[] args) {
		// Human beings
		// Person p1 = new Person("Doe", "Jane", "Deer");
		// Person p2 = new Member("Hoe", "You", "Dumb", 69);
		
		// Create a club and add new members
	    Club c1 = new Club();
	    
	    c1.addMember("Doe", "Jane", "Deer");
	    c1.addMember("Hoe", "You", "Dumb");
	    c1.addMember("I'm", "Number", "one");
	    c1.showMembers();
	    
	    // Test removing members
	    c1.removeMember(2);
	    System.out.println("\nRemoving member..");
	    c1.showMembers();
	    
	    
		// p1.show();
		// p2.show();

		System.out.println("");
		
		// Facilities
		Facility f1 = new Facility("Badminton Court", "A facility for people to play a fun game of badminton!");
		Facility f2 = new Facility("Chess Board Room", "A room where people play chess, where they sit around for half an hour every turn!");
		
		f1.show();
		f2.show();
		
	}

}
