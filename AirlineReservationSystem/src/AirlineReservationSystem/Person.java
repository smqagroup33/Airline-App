package AirlineReservationSystem;

public class Person {

	public PersonDetails PersnDet = null;

	public Person(PersonDetails Details) 
	{
		this.PersnDet = Details;
	}

	public static void ShowPersonTable() 
	{
		int ncntr = 0;
		int nTotalCol = 100;
		int itr = 0;
		
		while (itr < nTotalCol) 
		{
			System.out.print("-");
			itr++;
		}
		System.out.println();
		System.out.printf("%5s | %-20s | %-30s | %-10s | %-10s |\n", "Index", "Full Name", "Address", "Age", "Ph Num");
		itr = 0;
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
		System.out.println();
		if (ProjectDB.personlst.isEmpty()) 
		{
			System.out.println("\tWarning : No Customer Details Available.");
		}
		for (Person pObject : ProjectDB.personlst) 
		{
			System.out.printf("%5d | %-20s | %-30s | %-10s | %-10s |\n", ++ncntr, pObject.PersnDet.sName,
					pObject.PersnDet.sAddress, pObject.PersnDet.nAge, pObject.PersnDet.nPhoneNumber);
		}
		itr = 0;
		while (itr < nTotalCol) 
		{
			System.out.print("-");
			itr++;
		}
		System.out.println();
	}

}
