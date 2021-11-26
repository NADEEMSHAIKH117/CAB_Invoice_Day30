package bridgrlabz.com;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.InvoiceGenerator;

public class CabInvoiceGeneratorTest {
	
	//UC1
	@Test
	public void givenDistanceAndTime_ShouldReturnTotalFaretest() {
	InvoiceGenerator invoiceGenerator= new InvoiceGenerator();
	double diatance = 2.0;
	int time = 5;
	double fare = invoiceGenerator.calculateFare(diatance, time);
	assertEquals(25, fare, 0.0);
		
	}
	
//	@Test
//	public void givenLessDistanceAndTime_ShouldReturnMinFare() {
//	InvoiceGenerator invoiceGenerator= new InvoiceGenerator();
//	double diatance = 0.1;
//	int time = 1;
//	double fare = invoiceGenerator.calculateFare(diatance, time);
//	assertEquals(5, fare, 0.0);
//		
//	}

}
