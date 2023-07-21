package Travel;

public class Flight 
{
	private String id;
	private String source;
	private String destination;
	private double fare;
	private int totalSeats;
	private int availableSeats;
	private String arrivalTime;
	private String departureTime;
	private String companyName;
	public Flight() {}
	public Flight(String id, String source, String destination, double fare, int totalSeats, int availableSeats,
			String arrivalTime, String departureTime, String companyName) {
	
		this.id = id;
		this.source = source;
		this.destination = destination;
		this.fare = fare;
		this.totalSeats = totalSeats;
		this.availableSeats = availableSeats;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.companyName = companyName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public String toString()
	{
		return id +"  "+ source + "  "+ destination+"  "+fare+"   "+totalSeats+"  "+availableSeats+"  "+arrivalTime+"  "+departureTime+"  "+companyName;
	}
	public boolean equals(Object obj)
	{
		
		if(obj instanceof Flight)
		{
			Flight flights = (Flight)obj;
			return id.equals(flights.id) && source.equals(flights.source) && destination.equals(flights.destination) && fare==flights.fare && totalSeats==flights.totalSeats && availableSeats==flights.availableSeats && 
					arrivalTime.equals(flights.arrivalTime) && departureTime.equals(flights.departureTime) && companyName.equals(flights.companyName);
		}
		return false;
	}

}
