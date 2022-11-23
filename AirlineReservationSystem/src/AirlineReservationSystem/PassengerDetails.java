package AirlineReservationSystem;
import java.util.List;
import java.util.ArrayList;


public class PassengerDetails extends Person 
{
	public int nflight_number;

	public PassengerDetails(Person perObj, int nflight_number) {
		super(perObj.persnDet);
		this.nflight_number = nflight_number;
	}

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

	public static List showFlightNumber(int nflight_num) 
	{
		ArrayList<PassengerDetails> PassengerList = new ArrayList<>();
		for (PassengerDetails pdObj : ProjectDB.passengerlst) 
		{
			if (pdObj.nflight_number == nflight_num)
			{
				PassengerList.add(pdObj);
			}
		}

		int ncounter = 0;

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

		for (PassengerDetails pdObject : PassengerList) 
		{
			System.out.printf("%5d | %-30s |\n", ++ncounter, pdObject.persnDet.sName);
		}

		return PassengerList;
	}

}
