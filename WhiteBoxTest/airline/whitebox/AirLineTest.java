package airline.whitebox;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Scanner;

import org.junit.jupiter.api.Test;
import AirlineReservationSystem.FlightDetails;
import AirlineReservationSystem.PassengerDetails;
import AirlineReservationSystem.Person;
import AirlineReservationSystem.PersonDetails;
import AirlineReservationSystem.ProjectDB;
import AirlineReservationSystem.AirLineApp;
import AirlineReservationSystem.FlightScheduler;

class AirLineTest {  

	@Test
	void validateAddPersonDetails() {
		int count = ProjectDB.personlst.size();
		PersonDetails new_customer = new PersonDetails();
		new_customer.setsName("John");
		new_customer.setnAge(25);
		new_customer.setsAddress("LE16RT");
		new_customer.setnPhoneNumber("9876549876");

		ProjectDB.insert(new Person(new_customer));
		assertEquals(count + 1, ProjectDB.personlst.size());
		count = ProjectDB.personlst.size();
		ProjectDB.insert(new Person(new_customer));
		assertEquals(count, ProjectDB.personlst.size());
	}

	@Test
	void validateAddPassenger() {
		int count = ProjectDB.passengerlst.size();
		PersonDetails new_customer = new PersonDetails();
		new_customer.setsName("Johnny");
		new_customer.setnAge(24);
		new_customer.setsAddress("LE16RT");
		new_customer.setnPhoneNumber("9876549876");

		Person person = new Person(new_customer);
		PassengerDetails pass = new PassengerDetails(person, 12345);
		ProjectDB.insert(pass);
		assertEquals(count + 1, ProjectDB.passengerlst.size());
		count = ProjectDB.passengerlst.size();
		ProjectDB.insert(new PassengerDetails(person, 12345));
		assertEquals(count, ProjectDB.passengerlst.size());
	}

	@Test
	void validateAddFlightDescription() {
		int count = ProjectDB.flightdetlst.size();
		FlightDetails flights = new FlightDetails("London", "Glasgow", "10.30", "12.30", 123);
		ProjectDB.insert(flights);
		assertEquals(count + 1, ProjectDB.flightdetlst.size());
		count = ProjectDB.flightdetlst.size();
		ProjectDB.insert(new FlightDetails("London", "Glasgow", "10.30", "12.30", 123));
		assertEquals(count, ProjectDB.flightdetlst.size());

	}

	@Test
	void validateScheduleFlight() {
		int count = ProjectDB.flightSchedulerlst.size();
		FlightDetails flights = new FlightDetails("London", "Glasgow", "10.30", "12.30", 123);
		FlightScheduler schFlight = new FlightScheduler(flights, "12332");
		ProjectDB.insert(schFlight);
		assertEquals(count + 1, ProjectDB.flightSchedulerlst.size());
		count = ProjectDB.flightSchedulerlst.size();
		ProjectDB.insert(new FlightScheduler(flights, "12332"));
		assertEquals(count, ProjectDB.flightSchedulerlst.size());
	}

	@Test
	void validateGetSCFlightPassengersCount() {

		PersonDetails new_customer = new PersonDetails();
		new_customer.setsName("Johnny1");
		new_customer.setnAge(24);
		new_customer.setsAddress("LE16RT1");
		new_customer.setnPhoneNumber("98765498761");

		Person person = new Person(new_customer);
		PassengerDetails pass = new PassengerDetails(person, 87655);
		ProjectDB.insert(pass);
		assertEquals(1, PassengerDetails.getSCFlightPassengersCount(87655));
	}

	@Test
	void validateShowOnlyFlightNo() {
		PersonDetails new_customer = new PersonDetails();
		new_customer.setsName("Johnny");
		new_customer.setnAge(24);
		new_customer.setsAddress("LE16RT");
		new_customer.setnPhoneNumber("9876549876");

		Person person = new Person(new_customer);
		PassengerDetails pass = new PassengerDetails(person, 379137);
		ProjectDB.insert(pass);

		ArrayList<PassengerDetails> expectedOutput = new ArrayList<PassengerDetails>();
		expectedOutput.add(pass);

		assertEquals(expectedOutput, PassengerDetails.showFlightNumber(379137));

		assertEquals(new ArrayList<PassengerDetails>(), PassengerDetails.showFlightNumber(34543098));
	}

	@Test
	void validateMain_menu() {

		AirLineApp.input = new Scanner("5\n3\n");
		AirLineApp.printMenuUI();
	}

	@Test
	void validateMain_menu1() {

		AirLineApp.input = new Scanner("1\n7\n3\n");
		AirLineApp.printMenuUI();
	}

	@Test
	void validateMain_menu2() {

		AirLineApp.input = new Scanner("2\n8\n3\n");
		AirLineApp.printMenuUI();
	}

	@Test
	void validateMain_menu3() { 

		AirLineApp.input = new Scanner("4\n3\n");
		AirLineApp.printMenuUI();
	}

	@Test
	void validateMain_menu_case1() {
		AirLineApp.input = new Scanner("1\n1\nShoaib\nLE16RT\n28\n7654567\n7\n3\n");
		AirLineApp.printMenuUI();
		
	} 

	@Test 
	void validateMain_menu_case2() {
		AirLineApp.input = new Scanner("1\n2\n7\n3\n");
		AirLineApp.printMenuUI();
		AirLineApp.input = new Scanner(System.in);
	}

	@Test
	void validateMain_menu_case3() {
		ProjectDB.personlst= new ArrayList<>();
		
		AirLineApp.input = new Scanner("1\n3\n7\n3\n");
		AirLineApp.printMenuUI();
		
		AirLineApp.input = new Scanner("1\n1\nShoaib\nLE16RT\n28\n7654567\n7\n3\n");
		AirLineApp.printMenuUI();
		AirLineApp.input = new Scanner("1\n3\n1\n7\n3\n");
		AirLineApp.printMenuUI(); 
	}
	 
	@Test
	void validateMain_menu_case4() {
		ProjectDB.personlst= new ArrayList<>();
		
		AirLineApp.input = new Scanner("1\n4\n7\n3\n");
		AirLineApp.printMenuUI();
		
		AirLineApp.input = new Scanner("1\n1\nShoaib\nLE16RT\n28\n7654567\n7\n3\n");
		AirLineApp.printMenuUI();
		ProjectDB.flightSchedulerlst = new ArrayList<>();
		AirLineApp.input = new Scanner("1\n4\n1\n7\n3\n");
		AirLineApp.printMenuUI(); 
		 
		AirLineApp.input = new Scanner("2\n1\nLondon\nIndia\n12:00\n1:30\n5\n8\n3\n");
		AirLineApp.printMenuUI();
		
		AirLineApp.input = new Scanner("2\n4\n1\n8\n3\n");
		AirLineApp.printMenuUI(); 
		AirLineApp.input = new Scanner("1\n4\n1\n1\n7\n3\n");
		AirLineApp.printMenuUI();
		AirLineApp.input = new Scanner(System.in);
	}

	@Test
	void validateMain_menu_case5() {
		AirLineApp.input = new Scanner("1\n5\n7\n3\n");
		AirLineApp.printMenuUI();
	}

	@Test
	void validateMain_menu_case6() {
		ProjectDB.passengerlst =new ArrayList<>(); 
		AirLineApp.input = new Scanner("1\n6\n7\n3\n");
		AirLineApp.printMenuUI();
		
		AirLineApp.input = new Scanner("1\n1\nShoaib\nLE16RT\n28\n7654567\n7\n3\n");
		AirLineApp.printMenuUI();
		//AirLineApp.input = new Scanner("1\n6\n1\n7\n3\n");
		//AirLineApp.printMenuUI();
	}

	@Test
	void validateMain_menu_case8() {
		AirLineApp.input = new Scanner("1\n8\n7\n3\n");
		AirLineApp.printMenuUI();
	}

	@Test
	void validateMain_menu_caseInvlaid() {
		AirLineApp.input = new Scanner("1\n10\n7\n3\n");
		AirLineApp.printMenuUI();
		AirLineApp.input = new Scanner(System.in);
	}

	@Test
	void validateFlight_menu_case1() {
		AirLineApp.input = new Scanner("2\n1\nLondon\nIndia\n12:00\n1:30\n5\n8\n3\n");
		AirLineApp.printMenuUI();
		AirLineApp.input = new Scanner(System.in);
	}
 
	@Test
	void validateFlight_menu_case2() {
		AirLineApp.input = new Scanner("2\n2\n8\n3\n");
		AirLineApp.printMenuUI();
		AirLineApp.input = new Scanner(System.in);
	}

	@Test
	void validateFlight_menu_case5() {
		AirLineApp.input = new Scanner("2\n5\n8\n3\n");
		AirLineApp.printMenuUI();
		AirLineApp.input = new Scanner(System.in);
	}

	@Test
	void validateFlight_menu_case9() {
		AirLineApp.input = new Scanner("2\n9\n8\n3\n");
		AirLineApp.printMenuUI();
		AirLineApp.input = new Scanner(System.in);
	}

	@Test
	void validateFlight_menu_caseInvlaid() {
		AirLineApp.input = new Scanner("2\n10\n8\n3\n");
		AirLineApp.printMenuUI();
		AirLineApp.input = new Scanner(System.in);
	}

}
