package AirlineReservationSystem;
import java.util.ArrayList;
import java.lang.reflect.Array;

public class Person {

	public PersonDetails persnDet = null;

	public Person(PersonDetails Details) 
	{
		this.persnDet = Details;
	}

	public static Boolean showBodyLine(int itr , int nTotalCol)
	{
		if(itr < nTotalCol)
		{
			while (itr < nTotalCol) 
			{
				if (itr == 6 || itr == 29 || itr == 62 || itr == 75)
				{
					System.out.print("|");
				}
				else
				{
					System.out.print("-");
				}
				itr++;
			}
			return true;
		}
		return false;
	}
	public static  Boolean showHeaderLine(int itr , int nTotalCol)
	{
		if(itr < nTotalCol)
		{
			while (itr < nTotalCol) 
			{
				System.out.print("-");
				itr++;
			}
			return true;
		}
		return false;
	}
	
	public static void showPersonTable() 
	{		
		int nTotalCol = 100;
		int itr = 0;
		showHeaderLine(itr,nTotalCol);
		System.out.println();
		System.out.printf("%5s | %-20s | %-30s | %-10s | %-10s |\n", "Index", "Full Name", "Address", "Age", "Ph Num");
		itr = 0;
		showBodyLine(itr,nTotalCol);
		System.out.println();
		if (ProjectDB.personlst.isEmpty()) 
		{
			System.out.println("\tWarning : No Customer Details Available.");
		}
		IteratePersonObject(ProjectDB.personlst);
		
		itr = 0;
		showHeaderLine(itr,nTotalCol);
		System.out.println();
	}
	public static Boolean IteratePersonObject(ArrayList<Person> personlst)
	{
		int ncntr = 0;
		if(personlst != null)
		{
			for (Person pObject : personlst) 
			{
				System.out.printf("%5d | %-20s | %-30s | %-10s | %-10s |\n", ++ncntr, pObject.persnDet.sName,
						pObject.persnDet.sAddress, pObject.persnDet.nAge, pObject.persnDet.nPhoneNumber);
			}	
			return true;
		}
		
		return false;
	}

}
