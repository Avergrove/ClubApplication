import java.time.LocalDateTime;

public class Booking {
	private Member member;
	private Facility facility;
	
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	
	// Constructor
	public Booking(Member m, Facility f, LocalDateTime startDate, LocalDateTime endDate){
		try {
			
			if(m == null || f == null || startDate == null || endDate == null) {
				throw new BadBookingException("Bad Booking Exception: Arguments can't be null!");
			}
			
			else if(startDate.isAfter(endDate)) {
				throw new BadBookingException("Bad Booking Exception: Start date can't end after end date!");
			}
			
			else {
				this.member = m;
				this.facility = f;
				this.startDate = startDate;
				this.endDate = endDate;
			}
		}
		
		catch(BadBookingException ex){
			System.out.println(ex.getMessage());
		}
		
		finally {
			
		}
		
	}
	
	// Getters and Setters
	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Facility getFacility() {
		return facility;
	}

	public void setFacility(Facility facility) {
		this.facility = facility;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

	// Determines whether two strings overlap
	public boolean overlaps(Booking b) {
		if(this.startDate.isBefore(b.endDate) && this.endDate.isAfter(b.startDate)) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	// Outputs the booking in string form
	public String toString() {
		return String.format("%s, %s, %s, %s", member.toString(), facility.toString(), startDate.toString(), endDate.toString());
	}
	
	public void show() {
		System.out.println(this.toString());
	}
}
