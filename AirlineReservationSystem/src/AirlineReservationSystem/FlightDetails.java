package AirlineReservationSystem;

public class FlightDetails {

	public String sfrom;
	public String sto;
	public String sdeparture_time;
	public String sarrival_time;
	public int ncapacity;

	public String getFrom() {
		return sfrom;
	}

	public void setFrom(String from) {
		this.sfrom = from;
	}

	public String getTo() {
		return sto;
	}

	public void setTo(String to) {
		this.sto = to;
	}

	public String getDeparture_time() {
		return sdeparture_time;
	}

	public void setDeparture_time(String departure_time) {
		this.sdeparture_time = departure_time;
	}

	public String getArrival_time() {
		return sarrival_time;
	}

	public void setArrival_time(String arrival_time) {
		this.sarrival_time = arrival_time;
	}

	public int getCapacity() {
		return ncapacity;
	}

	public void setCapacity(int capacity) {
		this.ncapacity = capacity;
	}

	public FlightDetails(String from, String to, String departureTime, String arrivalTime, int capacity) {
		this.sfrom = from;
		this.sto = to;
		this.sdeparture_time = departureTime;
		this.sarrival_time = arrivalTime;
		this.ncapacity = capacity;
	}

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
