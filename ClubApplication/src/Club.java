import java.util.Arrays;

public class Club {
	int currentNumber;
	private Member[] members;
	
	public Club() {
		currentNumber = 0;
		members = new Member[0];
	}
	
	// Adds a member to the club. Don't talk about us on fight club!
	public Member addMember(String surName, String firstName, String secondName) {
		currentNumber++;
		Member m = new Member(surName, firstName, secondName, currentNumber);
		
		members = Arrays.copyOf(members, currentNumber);
		members[currentNumber - 1] = m;
		
		return m;
	}
	
	// Prints out all the members and their id
	public void showMembers() {
		for(int i = 0; i < members.length; i++) {
			members[i].show();
		}
	}
	
	// Removes a member from the club based on their id.
	public void removeMember(int id) {
		
		boolean removed = false;
		
		// Remove corresponding member
		for(int i = 0; i < members.length; i++) {
			if(members[i].memberNumber == id) {
				members[i] = null;
				removed = true;
			}
			
			else if(removed == true) {
				members[i - 1] = members[i];
			}
		}
		
		// If the member is removed resize the array
		members = Arrays.copyOf(members, currentNumber - 1);
		

		
	}
	
}
