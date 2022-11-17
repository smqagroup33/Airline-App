package test;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

import AirlineReservationSystem.Passenger;
import AirlineReservationSystem.Person;
import AirlineReservationSystem.PersonDetails;
import AirlineReservationSystem.ProjectDB;

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
		new_customer.setsName("John");
		new_customer.setnAge(25);
		new_customer.setsAddress("LE16RT");
		new_customer.setnPhoneNumber("9876549876");
		
		Person person= new Person(new_customer);
		
		
		
	
	}

}
