package AirlineReservationSystem;
import java.util.ArrayList;
import java.lang.reflect.Array;

/*Name : Person 
Description : Gets and set the attribites fo person */ 
public class Person {

	//Details object which holds the person details
	public PersonDetails persnDet = null;

	public Person(PersonDetails Details) 
	{
		this.persnDet = Details;
	}

	/*
	 * Name : showBodyLine 
	 * Arguments : int , int
	 * Return : boolean
	 * Description : Prints the body line on the screen
	 * */
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
	
	/*
	 * Name : showHeaderLine 
	 * Arguments : int , int
	 * Return : boolean
	 * Description : Prints the Header line on the screen
	 * */
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
	
	/*
	 * Name : showPersonTable 
	 * Arguments :void
	 * Return : void 
	 * Description : show the person attributes as table
	 * */
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
	
	/*
	 * Name : IteratePersonObject 
	 * Arguments :ArrayList
	 * Return : Boolean 
	 * Description : Find if the person object is exist returns true else false
	 * */
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
