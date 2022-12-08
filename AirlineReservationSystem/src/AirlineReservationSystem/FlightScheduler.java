package AirlineReservationSystem;

/*Name : FlightScheduler 
Description : Child class of FlightDetails, 
Schedules flights with passengers*/ 
public class FlightScheduler extends FlightDetails 
{
	// date as string format
    public String sdate;
    //flight number as integer
    public int nflight_number;

	/*
	 * Name : FlightScheduler 
	 * Arguments : FlightDetails , String
	 * Return : None
	 * Description : Create a instance of FlightScheduler class
	 * */
    public FlightScheduler(FlightDetails Flightdesc, String s_date) 
    {
        super(Flightdesc.sfrom, Flightdesc.sto, Flightdesc.sdeparture_time, Flightdesc.sarrival_time, Flightdesc.ncapacity);
        this.sdate = s_date;
        this.nflight_number = generateFlightNumber();
    }

    /*
	 * Name : generateFlightNumber 
	 * Arguments :None
	 * Return : None
	 * Description : Generates flight number flightSchedulerlst map
	 * */
   public static int generateFlightNumber() 
   {
        int nmax = 0;
        for (FlightScheduler flightScheduler : ProjectDB.flightSchedulerlst) 
        {
            if (nmax < flightScheduler.nflight_number)
            {
            	nmax = flightScheduler.nflight_number;
            }
        }
        return nmax + 1;
    }

   /*
 	 * Name : showFlightSchedulerTable 
 	 * Arguments : None
 	 * Return : None
 	 * Description : Show details from flightSchedulerlst list
 	 * */
    public static void showFlightSchedulerTable() 
    {
        int ncounter = 0;
        for (int itr = 0; itr < 113; itr++)
        {
            System.out.print("-");
        }
        System.out.println();
        System.out.printf("%5s | %-5s | %-10s | %-20s | %-20s | %-10s | %-10s | %-10s |\n", "Index", "FN", "Date", "FROM", "To", "Dep Time", "Arr Time", "Passengers");
        for (int i = 0; i < 113; i++)
        {
            if (i == 6 || i == 14 || i == 27 || i == 50 || i == 73 || i == 86 || i == 99 || i == 112)
            {
                System.out.print("|");
            }
            else
            {
                System.out.print("-");
            }
        }
        System.out.println();

        if (ProjectDB.flightSchedulerlst.isEmpty()) {
            System.out.println("\t No Scheduled Flights Avaialble so far..");
        }

        for (FlightScheduler scf : ProjectDB.flightSchedulerlst) {
            int pNumber = PassengerDetails.getSCFlightPassengersCount(scf.nflight_number);
            String pCount = (pNumber == scf.ncapacity) ? "Full(" + pNumber + ")" : Integer.toString(pNumber);
            System.out.printf("%5d | %5d | %-10s | %-20s | %-20s | %-10s | %-10s | %10s |\n",
                    ++ncounter, scf.nflight_number, scf.sdate, scf.sfrom, scf.sto, scf.sdeparture_time, scf.sarrival_time, pCount);
        }
        for (int i = 0; i < 113; i++)
            System.out.print("-");
        System.out.println();
    }

}
