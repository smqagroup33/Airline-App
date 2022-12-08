package AirlineReservationSystem;

import java.util.ArrayList;

/*Name : ProjectDB 
Description : Class which holds input the data of person and flights*/ 
public class ProjectDB { 

	//person attributes
	public static ArrayList<Person> personlst = new ArrayList<>();
	public static ArrayList<PassengerDetails> passengerlst = new ArrayList<>();
	public static ArrayList<FlightDetails> flightdetlst = new ArrayList<>();
	public static ArrayList<FlightScheduler> flightSchedulerlst = new ArrayList<>();

	 /* Name : insert
	 * Arguments : Person
	 * Return : Boolean
	 * Description : Inserts person attributes if the person attributes 
	 *exist already returns FALSE else True */
	public static Boolean insert(Person person) 
	{
		if(person != null)
		{
			for (Person perobj : personlst) 
			{
				if (perobj.persnDet.sName.equals(person.persnDet.sName)) 
				{
					System.out.println("Warning ! Can't Save the Date..");
					System.out.println(person.persnDet.sName + " : Already Exist!");
					return true;
				}
			}
			personlst.add(person);
		}
		return false;
	}
 
	 /* Name : insert
	 * Arguments : PassengerDetails
	 * Return : Boolean
	 * Description : Inserts Passenger object ,Return True 
	 * if data does not exist else false*/
	public static Boolean insert(PassengerDetails passenger) 
	{
		if(passenger != null)
		{
			for (PassengerDetails pdObj : passengerlst) 
			{
				if (pdObj.nflight_number == passenger.nflight_number && pdObj.persnDet.sName.equals(passenger.persnDet.sName)) 
				{
					System.out.println("Can't save this data!");
					System.out.println(passenger.persnDet.sName + " : has already reserved the flight!");
					return true;
				}
			}
			passengerlst.add(passenger);
		}
		return false;
	}

	 /* Name : insert
	 * Arguments : FlightDetails
	 * Return : Boolean
	 * Description : Insert flightdetails return False if data exist 
	 * else True */
	public static Boolean insert(FlightDetails flight_desc) 
	{
		if(flight_desc != null)
		{
			for (FlightDetails flightObj : flightdetlst) 
			{
				if (flightObj.sarrival_time.equals(flight_desc.sarrival_time)
						&& flightObj.sdeparture_time.equals(flight_desc.sdeparture_time) && flightObj.sfrom.equals(flight_desc.sfrom)
						&& flightObj.sto.equals(flight_desc.sto) && flightObj.ncapacity == flight_desc.ncapacity) {
					System.out.println("Warning : data can't be saved!");
					System.out.println("This Flight Details already exists  !");
					return true;
				}
			}
			flightdetlst.add(flight_desc);
		}
		return false;
	}

	/* Name : insert
	 * Arguments : PassengerDetails
	 * Return : Boolean
	 * Description : insert Flightscheduler object returns True 
	 * if new data else False*/
	public static Boolean insert(FlightScheduler flightsc) 
	{
		if(flightsc != null)
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
					return true;
				}
			}
			flightSchedulerlst.add(flightsc);
		}
		return false;
	}
}
