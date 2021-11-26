package bridgrlabz.com;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.InvoiceGenerator;
import com.bridgelabz.Ride;

public class CabInvoiceGeneratorTest {
	
	//Step-1
	@Test
	public void givenDistanceAndTime_ShouldReturnTotalFaretest() {
	InvoiceGenerator invoiceGenerator= new InvoiceGenerator();
	double diatance = 2.0;
	int time = 5;
	double fare = invoiceGenerator.calculateFare(diatance, time);
	assertEquals(25, fare, 0.0);
		
	}
	
	@Test
	public void givenLessDistanceAndTime_ShouldReturnMinFare() {
	InvoiceGenerator invoiceGenerator= new InvoiceGenerator();
	double diatance = 0.1;
	int time = 1;
	double fare = invoiceGenerator.calculateFare(diatance, time);
	assertEquals(5, fare, 0.0);
		
	}
	
	//Step-2
	@Test
	public void  giveMultipleRides_ShouldReturnTotalFare() {
		 InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
		 Ride[] rides = {  	new Ride(2.0,5),
				 			new Ride(0.2,1)
		 		 };
		double fare = invoiceGenerator.calculateFare(rides);
		assertEquals(30, fare,0.0);
	}

}
