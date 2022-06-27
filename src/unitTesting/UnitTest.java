package unitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class UnitTest {

	@Test
	void testExample() {
		System.out.println("Did not fail.");
		//fail("Not yet implemented");
	}
	
	@Test
	void over50Test () {
		//Calculations calculation = new Calculations ();
		assertEquals(false, Calculations.over50(0));
		assertEquals(true, Calculations.over50(51));
	}
	
	
	@Test
	void monthlyBillPaymentTest () {
		Calculations num = new Calculations ();
		int sum = num.monthlyBillPayment(1000, 150);
		assertEquals(sum, 1150);
	}
/*	
	//unit testing with mockito
	@Test
	void getBankAccountTest () {
		Calculations calc = Mockito.mock(Calculations.class);
	}
*/	
	
}
