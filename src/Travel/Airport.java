package Travel;

import java.time.LocalDate;
import java.util.ArrayList;

public class Airport extends Flight

{

    Address address;

     ArrayList<Flight> flights =  new ArrayList<>();

     ArrayList<Traveller> traveller =  new ArrayList<>();

 

     public Airport() {}

 

     public Airport(String Id, String source ,String destination,double fare,int totalSeats, String arrivalTime,String departureTime,String companyName,Address address)

     {

        super();

        this.address=address;

        this.flights=flights;

        this.traveller=traveller;

     }

   

 

     

        public void setAddress(Address address){

            this.address = address;

        }

       

        public Address getAddress(){

            return address;

        }

 

        public void setTravellers(ArrayList<Traveller>travellers)

        {

            this.traveller= travellers;

        }

 

        public ArrayList<Traveller> getTravellers(){

            return traveller;

        }

 

        public ArrayList<Flight>geFlights()

        {

            return flights;

        }

        public void setFlights(ArrayList<Flight>flights){

            this.flights=flights;

        }
	    public void bookTicket()
	    {
	    	for(Traveller t:traveller)
	    		if(!flights.isEmpty())
	                  System.out.println(flights.toString());
	    	
	           if(getAvailableSeats()>0)
	        	   availableSeats=getAvailableSeats()-1;
	    		
	    		
	    }
	    public boolean searchFlightBySourceAndDestination(String source,String Destinatin)
		{
			
	    	for(Flight f : flights)
	    		if(flights.contains(getSource()) && flights.contains(getDestination()))
	    			return true;
	    		else
	    			return false;
		}
	    public boolean addFlight(String Flight)
	    {
	    	
	    	for(Flight f : flights)
	    		System.out.println(fligt);
	    		
	    		
	    }
	    
				     
			
	    
	    
	
			
	
	
	
	/*public boolean addFlight(String Flight)
	{
		for(Flight f:flights)
			return flights(new )
		
	}
	public void searchFlightBySourceAndDestination(String source,String Destinatin)
	{
		for(Flight f:flights)
			if(!flights.isEmpty())
				return;
			
		}

	public void bookTicket(String FlightId,Traveller traveller)
	{
		for(Traveller t:travellers)
			if()
		
	    ArrayList<Flight> flights = new ArrayList<>();
	    flights.add(new Flight("one","hyd", "dallas", 130000, 80, 45, "two", "three", "air"));
	    flights.add(new Flight("two","vizag", "ny", 200000, 90, 43, "four", "eight", "indigo"));
	    flights.add(new Flight("three","wrngl", "sydny", 330000, 56, 8, "one", "five", "sg"));
	    
	    ArrayList<Traveller> travellers = new ArrayList<>();
	    travellers.add("sam",905,"sam@gmail.com","one",LocalDate.of(2023, 8, 8));
	    
			
	 }*/
	}
}
	
}
