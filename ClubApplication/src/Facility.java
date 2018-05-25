
public class Facility {
	String name;
	String description;
	
	public Facility(String name) {
		this.name = name;
	}
	
	public Facility(String name, String description) {
		this(name);
		this.description = description;
	}
	
	public void show() {
		System.out.println(this.toString());
	}
	
	public String toString() {
		return String.format("Name: %s, Description: %s", name, description);
	}
	
}
