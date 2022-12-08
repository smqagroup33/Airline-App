package AirlineReservationSystem;
import java.util.List;
import java.util.ArrayList;


/*Name : PassengerDetails 
Description : Child class of Person , 
Passengedetails maps person with the flight number*/ 
public class PassengerDetails extends Person 
{
	//Flight number as string 
	public int nflight_number;

	public PassengerDetails(Person perObj, int nflight_number) {
		super(perObj.persnDet);
		this.nflight_number = nflight_number;
	}

	/*
	 * Name : FlightScheduler 
	 * Arguments : int
	 * Return : int
	 * Description : iterate the passenger details and returns the count
	 * */
	public static int getSCFlightPassengersCount(int nflight_num) 
	{
		int ncounter = 0;
		for (PassengerDetails pasobj : ProjectDB.passengerlst) 
		{
			if (pasobj.nflight_number == nflight_num)
			{
				ncounter++;
			}
		}
		return ncounter;

	}
	
	/*
	 * Name : show_PassengerDetails 
	 * Arguments : None
	 * Return : Void
	 * Description : Show the passenger details as table
	 * */
	public static void show_PassengerDetails() 
	{
		int ncounter = 0;
		for (int it = 0; it <48; it++)
		{
			System.out.print("-");
		}
		System.out.println();
		System.out.printf("%5s | %-5s | %-30s |\n", "Index", "F.No", "Full Name");
		for (int it = 0; it < 48; it++)
		{
			if(it==6||it==14||it==47)
			{
				System.out.print("|");
			}
			else
			{
				System.out.print("-");
			}
		}
		System.out.println();

		if (ProjectDB.passengerlst.isEmpty()) 
		{
			System.out.println("\t Warning : No Reservations Found..");
		}

		for (PassengerDetails pdObj : ProjectDB.passengerlst) 
		{
			System.out.printf("%5d | %5d | %-30s |\n", ++ncounter, pdObj.nflight_number, pdObj.persnDet.sName);
		}
		for (int it = 0; it < 48; it++)
		{
			System.out.print("-");
		}
		System.out.println();
	}

	/*
	 * Name : insertPassengerList 
	 * Arguments : ArrayList<PassengerDetails>
	 * Return : ArrayList<PassengerDetails>
	 * Description : Insert details into passengerLsit map
	 * */
	public static ArrayList<PassengerDetails> insertPassengerList(ArrayList<PassengerDetails> passengerlst , int nflight_num)
	{
		if(passengerlst != null)
		{
			ArrayList<PassengerDetails> PassengerList = new ArrayList<>();
			for (PassengerDetails pdObj : passengerlst) 
			{
				if (pdObj.nflight_number == nflight_num)
				{
					PassengerList.add(pdObj);
				}
			}
			return PassengerList;
		}
		return null;
	}
		
	/*
	 * Name : showFlightNumber 
	 * Arguments : int
	 * Return : List
	 * Description : Prints the relavant passenger 
	 * details from PassengerList
	 * */
	public static List showFlightNumber(int nflight_num) 
	{
		ArrayList<PassengerDetails> PassengerList = insertPassengerList(ProjectDB.passengerlst,nflight_num);

		System.out.printf("%5s | %-30s |\n", "Index", "Full Name");
		for (int it = 0; it < 40; it++)
		{
			if (it == 6 || it == 39)
			{		
				System.out.print("|");
			}
			else
			{
				System.out.print("-");
			}
		}
		System.out.println();

		if (PassengerList.isEmpty()) 
		{
			System.out.println("\t Warning : Reservations Not Available..");
		}

		printPassengerDetails(PassengerList);

		return PassengerList;
	}

	/*
	 * Name : printPassengerDetails 
	 * Arguments : ArrayList
	 * Return : Boolean
	 * Description : Iterates passenger details to print Data
	 * */
	public static Boolean printPassengerDetails(ArrayList<PassengerDetails> PassengerList )
	{
		int ncounter = 0;
		if(PassengerList != null)
		{
			for (PassengerDetails pdObject : PassengerList) 
			{
				System.out.printf("%5d | %-30s |\n", ++ncounter, pdObject.persnDet.sName);
			}
			return true;
		}
		return false;
	}
}
