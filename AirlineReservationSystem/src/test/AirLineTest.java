package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import AirlineReservationSystem.FlightDescription;
import AirlineReservationSystem.Passenger;
import AirlineReservationSystem.Person;
import AirlineReservationSystem.PersonDetails;
import AirlineReservationSystem.ProjectDB;
import AirlineReservationSystem.ScheduledFlight;

class AirLineTest {

	@Test
	void validateAddPersonDetails() {
		int count = ProjectDB.person_list.size();
		PersonDetails new_customer = new PersonDetails();
		new_customer.setsName("John");
		new_customer.setnAge(25);
		new_customer.setsAddress("LE16RT");
		new_customer.setnPhoneNumber("9876549876");

		ProjectDB.add(new Person(new_customer));
		assertEquals(count + 1, ProjectDB.person_list.size());
		count = ProjectDB.person_list.size();
		ProjectDB.add(new Person(new_customer));
		assertEquals(count, ProjectDB.person_list.size());
	}

	@Test
	void validateAddPassenger() {
		int count = ProjectDB.passenger_list.size();
		PersonDetails new_customer = new PersonDetails();
		new_customer.setsName("Johnny");
		new_customer.setnAge(24);
		new_customer.setsAddress("LE16RT");
		new_customer.setnPhoneNumber("9876549876");

		Person person = new Person(new_customer);
		Passenger pass = new Passenger(person, 12345);
		ProjectDB.add(pass);
		assertEquals(count + 1, ProjectDB.passenger_list.size());
		count = ProjectDB.passenger_list.size();
		ProjectDB.add(new Passenger(person, 12345));
		assertEquals(count, ProjectDB.passenger_list.size());
	}

	@Test
	void validateAddFlightDescription() {
		int count = ProjectDB.flight_desc_list.size();
		FlightDescription flights = new FlightDescription("London", "Glasgow", "10.30", "12.30", 123);
		ProjectDB.add(flights);
		assertEquals(count + 1, ProjectDB.flight_desc_list.size());
		count = ProjectDB.flight_desc_list.size();
		ProjectDB.add(new FlightDescription("London", "Glasgow", "10.30", "12.30", 123));
		assertEquals(count, ProjectDB.flight_desc_list.size());

	}

	@Test
	void validateScheduleFlight() {
		int count = ProjectDB.scheduled_flight_list.size();
		FlightDescription flights = new FlightDescription("London", "Glasgow", "10.30", "12.30", 123);
		ScheduledFlight schFlight = new ScheduledFlight(flights, "12332");
		ProjectDB.add(schFlight);
		assertEquals(count + 1, ProjectDB.scheduled_flight_list.size());
		count = ProjectDB.scheduled_flight_list.size();
		ProjectDB.add(new ScheduledFlight(flights, "12332"));
		assertEquals(count, ProjectDB.scheduled_flight_list.size());
	}

	@Test
	void validateGetSCFlightPassengersCount() {

		PersonDetails new_customer = new PersonDetails();
		new_customer.setsName("Johnny1");
		new_customer.setnAge(24);
		new_customer.setsAddress("LE16RT1");
		new_customer.setnPhoneNumber("98765498761");

		Person person = new Person(new_customer);
		Passenger pass = new Passenger(person, 87655);
		ProjectDB.add(pass);
		assertEquals(1, Passenger.getSCFlightPassengersCount(87655));
	}
	
	@Test
	void validateShowOnlyFlightNo() {
		PersonDetails new_customer = new PersonDetails();
		new_customer.setsName("Johnny"); 
		new_customer.setnAge(24);
		new_customer.setsAddress("LE16RT");
		new_customer.setnPhoneNumber("9876549876");

		Person person = new Person(new_customer);
		Passenger pass = new Passenger(person, 379137);
		ProjectDB.add(pass); 
		
		ArrayList<Passenger> expectedOutput =new ArrayList<Passenger>();
		expectedOutput.add(pass);
		
		assertEquals(expectedOutput,Passenger.show_only_flight_no(379137));
		
		assertEquals(new ArrayList<Passenger>(),Passenger.show_only_flight_no(34543098));
	}
}
