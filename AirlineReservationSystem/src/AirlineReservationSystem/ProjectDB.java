package AirlineReservationSystem;

import java.util.ArrayList;

public class ProjectDB {

	public static ArrayList<Person> personlst = new ArrayList<>();
	public static ArrayList<PassengerDetails> passengerlst = new ArrayList<>();
	public static ArrayList<FlightDetails> flightdetlst = new ArrayList<>();
	public static ArrayList<FlightScheduler> flightSchedulerlst = new ArrayList<>();

	public static void insert(Person person) 
	{
		for (Person perobj : personlst) 
		{
			if (perobj.PersnDet.sName.equals(person.PersnDet.sName)) 
			{
				System.out.println("Warning ! Can't Save the Date..");
				System.out.println(person.PersnDet.sName + " : Already Exist!");
				return;
			}
		}
		personlst.add(person);
	}

	public static void insert(PassengerDetails passenger) 
	{
		for (PassengerDetails pdObj : passengerlst) 
		{
			if (pdObj.nflight_number == passenger.nflight_number && pdObj.PersnDet.sName.equals(passenger.PersnDet.sName)) 
			{
				System.out.println("Can't save this data!");
				System.out.println(passenger.PersnDet.sName + " : has already reserved the flight!");
				return;
			}
		}
		passengerlst.add(passenger);
	}

	public static void insert(FlightDetails flight_desc) 
	{
		for (FlightDetails flightObj : flightdetlst) 
		{
			if (flightObj.sarrival_time.equals(flight_desc.sarrival_time)
					&& flightObj.sdeparture_time.equals(flight_desc.sdeparture_time) && flightObj.sfrom.equals(flight_desc.sfrom)
					&& flightObj.sto.equals(flight_desc.sto) && flightObj.ncapacity == flight_desc.ncapacity) {
				System.out.println("Warning : data can't be saved!");
				System.out.println("This Flight Details already exists  !");
				return;
			}
		}
		flightdetlst.add(flight_desc);
	}

	public static void insert(FlightScheduler flightsc) 
	{
		for (FlightScheduler flight : flightSchedulerlst) 
		{
			if (flight.sarrival_time.equals(flightsc.sarrival_time)
					&& flight.sdeparture_time.equals(flightsc.sdeparture_time) && flight.sfrom.equals(flightsc.sfrom)
					&& flight.sto.equals(flightsc.sto) && flight.ncapacity == flightsc.ncapacity
					&& flight.sdate.equals(flightsc.sdate)) 
			{
				System.out.println("Warning : data can't be saved!");
				System.out.println("This Flight is already scheduled !");
				return;
			}
		}
		flightSchedulerlst.add(flightsc);
	}
}
