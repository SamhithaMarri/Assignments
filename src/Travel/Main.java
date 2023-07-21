package Travel;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main
{
	public static void main(String[] args)
	{
		ArrayList<Flight> flights = new ArrayList<>();
	    flights.add(new Flight("one","hyd", "dallas", 130000, 80, 45, "two", "three", "air"));
	    flights.add(new Flight("two","vizag", "ny", 200000, 90, 43, "four", "eight", "indigo"));
	    flights.add(new Flight("three","wrngl", "sydny", 330000, 56, 8, "one", "five", "sg"));
	    
	    ArrayList<Traveller> travellers = new ArrayList<>();
	    travellers.add("sam",905,"sam@gmail.com","one",LocalDate.of(2023, 8, 8));
	    travellers.add("chai",915,"chai@gmail.com","two",LocalDate.of(2022, 12, 8));
	    
	    Airport a=new Airport("one", "hyd", "dallas", 100000, 30, "two", "fouur", "airinida", new Address("mindspace","hyd","tel"));
	    System.out.println(a);
	}
	
}
