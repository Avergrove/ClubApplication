import java.util.ArrayList;
import java.util.HashMap;

public class Club {
	private int currentNumber;
	private ArrayList<Member> members;
	private HashMap<String, Facility> facilities;
	
	public Club() {
		currentNumber = 0;
		members = new ArrayList<Member>();
		facilities = new HashMap<String, Facility>();
	}
	
	/*
	 * Member methods
	 */
	
	// Adds a member to the club. Don't talk about us on fight club!
	public Member addMember(String surName, String firstName, String secondName) {
		currentNumber++;
		Member m = new Member(surName, firstName, secondName, currentNumber);
		members.add(m);
		
		return m;
	}
	
	// Prints out all the members and their id
	public void showMembers() {
		for(Member m: members) {
			m.show();
		}
	}
	
	// Removes a member from the club based on their id.
	public void removeMember(int id) {
		
		boolean removed = false;
		
		// Remove corresponding member
		for(Member m: members) {
			if(m.memberNumber == id) {
				members.remove(m);
			}
		}

		
	}
	
	/*
	 * Facility methods
	 */
	// Returns a specific facility by providing a name
	public Facility getFacility(String name) {
		return facilities.get(name);
	}
	
	// Adds a facility to the hash map
	public void addFacility(Facility f) {
		facilities.put(f.name, f);
	}
	
	// Removes a facility by name
	public void removeFacility(String name) {
		facilities.remove(name);
	}
	
	// Displays a list of facilities
	public void showFacilities() {
		for(Facility f: facilities.values()) {
			System.out.println(f.toString());
		}
	}
	
	
	/*
	 * Other methods
	 */
	
	// Shows all information about the club
	public void show() {
		showMembers();
		showFacilities();
	}


	
	
	
	
	
	// Getters and Setters
	public int getCurrentNumber() {
		return currentNumber;
	}

	public void setCurrentNumber(int currentNumber) {
		this.currentNumber = currentNumber;
	}

	public ArrayList<Member> getMembers() {
		return members;
	}

	public void setMembers(ArrayList<Member> members) {
		this.members = members;
	}

	public HashMap<String, Facility> getFacilities() {
		return facilities;
	}

	public void setFacilities(HashMap<String, Facility> facilities) {
		this.facilities = facilities;
	}	
	
}
