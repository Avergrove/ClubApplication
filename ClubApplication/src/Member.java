
public class Member extends Person implements Comparable{
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

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
		Member m = (Member) o;
		
		if(this == m) {
			return 0;
		}
		
		return this.firstName.compareTo(m.firstName);		
		
	}
}
