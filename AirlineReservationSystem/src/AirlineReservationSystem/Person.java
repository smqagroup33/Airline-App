package AirlineReservationSystem;

public class Person {

    public PersonDetails PersnDet = null;
    
    public Person(PersonDetails Details)
    {
    	this.PersnDet = Details;
    }

    public static void showtable() {
        int cntr = 0;
        int i = 0;
        int TotalCol = 55;
        while(i<TotalCol)
        {
            System.out.print("-");
            i++;
        }
        System.out.println();
        System.out.printf("%5s | %-5s | %-5s | %-10s | %-10s |\n", "Index", "Full Name", "Address", "Age", "Ph Num");
        i = 0;
        while(i<TotalCol)
        {
            if (i == 6 || i == 18 || i == 28 || i == 41)
                System.out.print("|");
            else
                System.out.print("-");
        i++;
        }
        System.out.println();
        if (ProjectDB.person_list.isEmpty()) {
            System.out.println("\t==> No Customers added yet <==");
        }
        for (Person pObject : ProjectDB.person_list) {
            System.out.printf("%5d | %-9s | %-7s | %-10s | %-10s |\n", ++cntr, pObject.PersnDet.sName, pObject.PersnDet.sAddress, pObject.PersnDet.nAge, pObject.PersnDet.nPhoneNumber);
        }
        i = 0;
        while(i<TotalCol)
        {
            System.out.print("-");
            i++;
        }
        System.out.println();
    }

}
