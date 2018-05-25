
public class Member extends Person{
	int memberNumber;
	
	public Member() {
		memberNumber = 0;
	}
	
	public Member(String surName, String firstName, String secondName, int memberNumber) {
		super(surName, firstName, secondName);
		this.memberNumber = memberNumber;
	}
	
	public int getMemberNumber() {
		return memberNumber;
	}
	
	public String toString() {
		return super.toString() + String.format(", %s", memberNumber);
	}
}
