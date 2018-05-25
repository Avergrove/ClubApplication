
public class Person {
	String surName;
	String firstName;
	String secondName;
	
	public Person() {
		this.surName = null;
		this.firstName = null;
		this.secondName = null;
	}
	
	public Person(String surName) {
		this.surName = surName;
		this.firstName = null;
		this.secondName = null;
	}	
	
	public Person(String surName, String firstName) {
		this(surName);
		this.firstName = firstName;
	}		
	
	public Person(String surName, String firstName, String secondName) {
		this(surName, firstName);
		this.secondName = secondName;
	}
	
	public void show() {
		System.out.println(this.toString());
	}
	
	public String toString() {
		return String.format("%s %s %s", firstName, secondName, surName);
	}
	
}
