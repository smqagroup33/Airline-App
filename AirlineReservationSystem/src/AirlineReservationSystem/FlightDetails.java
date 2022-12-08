package AirlineReservationSystem;

/*Name : FlightDetails 
Description : Contains flight details and attributes*/ 
public class FlightDetails {

	//Departure as string
	public String sfrom;
	//Destination as string 
	public String sto;
	//Deparure time as string format
	public String sdeparture_time;
	//Arrival time as string format
	public String sarrival_time;
	//ncapacity count
	public int ncapacity;

	/* Name : getFrom
	 * Arguments : None
	 * Return : String
	 * Description : Returns the Destination location 
	 * */
	public String getFrom() {
		return sfrom;
	}

	/* Name : setFrom
	 * Arguments : String
	 * Return : void
	 * Description : Sets the departure location as string 
	 * */
	public void setFrom(String from) {
		this.sfrom = from;
	}

	/* Name : getTo
	 * Arguments : None
	 * Return : String
	 * Description : Get destination as string
	 * */
	public String getTo() {
		return sto;
	}

	/* Name : setTo
	 * Arguments : String
	 * Return : void
	 * Description : Sets the destination string 
	 * */
	public void setTo(String to) {
		this.sto = to;
	}

	/* Name : getFrom
	 * Arguments : None
	 * Return : String
	 * Description : Get the departure time  as string
	 * */
	public String getDeparture_time() {
		return sdeparture_time;
	}

	/* Name : getFrom
	 * Arguments : None
	 * Return : void
	 * Description : sets the string to departure time as time format
	 * */
	public void setDeparture_time(String departure_time) {
		this.sdeparture_time = departure_time;
	}

	/* Name : getFrom
	 * Arguments : None
	 * Return : String
	 * Description : Gets the arrival time as string format
	 * */
	public String getArrival_time() {
		return sarrival_time;
	}

	/* Name : getFrom
	 * Arguments : String
	 * Return : void
	 * Description : Sets arrival time as time format
	 * */
	public void setArrival_time(String arrival_time) {
		this.sarrival_time = arrival_time;
	}

	/* Name : getFrom
	 * Arguments : None
	 * Return : int
	 * Description : Gets capacity as integer
	 * */
	public int getCapacity() {
		return ncapacity;
	}

	/* Name : getFrom
	 * Arguments : int
	 * Return : Void
	 * Description : Inserts capacity as integers
	 * */
	public void setCapacity(int capacity) {
		this.ncapacity = capacity;
	}

	/* Name : getFrom
	 * Arguments : String , String, String, String, int
	 * Return : Void
	 * Description : Insert all flight details and return nothing  
	 * */
	public FlightDetails(String from, String to, String departureTime, String arrivalTime, int capacity) {
		this.sfrom = from;
		this.sto = to;
		this.sdeparture_time = departureTime;
		this.sarrival_time = arrivalTime;
		this.ncapacity = capacity;
	}

	/* Name : getFrom
	 * Arguments : None
	 * Return : void
	 * Description : Displays Flight details a
	 * */
	public static void show_FlightDetails() {
		int ncounter = 0;
		for (int i = 0; i < 90; i++)
		{
			System.out.print("-");
		}
		System.out.println();
		System.out.printf("%5s | %-20s | %-20s | %-10s | %-10s | %-8s |\n", "Index", "FROM", "To", "Dep Time",
				"Arr Time", "Capacity");
		for (int it=0;it<90;it++)
		{
			if (it==6||it==29||it==52||it==65||it==78||it==89)
			{
				System.out.print("|");
			}
			else
			{
				System.out.print("-");
			}
		}
		System.out.println();

		if (ProjectDB.flightdetlst.isEmpty()) 
		{
			System.out.println("\t Warning : Flight descriptions Not Available");
		}
		for (FlightDetails fd : ProjectDB.flightdetlst) 
		{
			System.out.printf("%5d | %-20s | %-20s | %-10s | %-10s | %8d |\n", ++ncounter, fd.sfrom, fd.sto,
					fd.sdeparture_time, fd.sarrival_time, fd.ncapacity);
		}
		for (int it=0;it<90;it++)
		{
			System.out.print("-");
		}
		System.out.println();
	}
}
