package AirlineReservationSystem;
import java.util.Scanner;
import java.util.InputMismatchException;


public class AirLineApp { 
    static ConsoleStyles _cc_ = new ConsoleStyles();
    public static Scanner input = new Scanner(System.in); 
    public static Person g_per = null;
    public static PassengerDetails g_perobj = null;
    public static flightDetails g_fd = null;
    public static FlightScheduler g_sch = null;
    
    public static void FilinDetails()
    {
    	PersonDetails g_cusTobj = new PersonDetails();
    	g_cusTobj.sName = "Harry";
    	g_cusTobj.sAddress = "LE16BH";
    	g_cusTobj.nAge = 9;
    	g_cusTobj.nPhoneNumber = "7401562876";  
    	Person g_per = new Person(g_cusTobj);
    	ProjectDB.insert(g_per);
    	g_fd = new flightDetails("CHN", "LDN",  "12:10",  "11:10", 100);
    	ProjectDB.insert(g_fd);
		String date = "12/1/2022";
		g_sch = new FlightScheduler(g_fd, date);
		ProjectDB.insert(g_sch);
		g_perobj = new PassengerDetails(g_per, g_sch.nflight_number);
		ProjectDB.insert(g_perobj);
			  
    }
    
    public static void main(String[] args) 
    {
    	FilinDetails();
    	printHeadUI();
        printMenuUI();       
    } 

    private static void exit_Message()
    {
    	printMessage("Thanks! Welcome Again");
    }

    public static void printHeadUI() 
    {
    	printMessage("****************************************"+_cc_.RESET);
    	printBold(_cc_.BLACK_BOLD + "       Ailine Application System       " +_cc_.RESET);
    	printBold("****************************************"+_cc_.RESET);
    	printBold("\n");
    }
    public static boolean choiceMenuUI(int choice)
    {
    	if(choice > 0 && choice < 4)
    	{
    		switch (choice) 
	    	{
	        case 1:
	            System.out.println();
	            printPassengerUI();
	            break;
	        case 2:
	            System.out.println();
	            printFlightsMenuUI();
	            break;
	        case 3:
	        	exit_Message();
	    	}
    		return true;
    	}
    	System.out.println("Warning : Choice Not Valid!");
    	return false;
    }

    private static int getOptionFromUser(Scanner inOption)
    {
        System.out.print("Enter Your Choice : ");
        try
        {
        	int Option = inOption.nextInt();
            inOption.nextLine();
            return Option;
        }
        catch (InputMismatchException e)
        {        	
        	System.out.println();
            return -1;
        }
    } 
    
    public static void printMenuUI() 
    {
    	printBold(" --------  Main Menu  ---------");
    	printBold("1. Passenger Menu");
    	printBold("2. Flights Management Menu");
    	printAlertBold("3. Exit " );
    	printBold("------------------------------------\n");
    	
        do{ } while (!choiceMenuUI(getOptionFromUser(input)));
    }

    private static void printAlertBold(String menu)
    {
    	printMessage(  _cc_.RED_BOLD  + menu + _cc_.RESET);
    }
    
    private static void printMessage(String Message)
    {
    	System.out.println(Message);
    }
    
    private static void printBold(String menu)
    {
    	printMessage( _cc_.BLACK_BOLD + menu + _cc_.RESET);
    }

    
    public static boolean choicePassengerUI(int option) 
    {
    	if(option > 0 && option < 8)
    	{
        	int index = 0;
	    	   switch (option) 
	    	   { 
		           case 1:
					printMessage("----- NEW CUSTOMERS -----");
					PersonDetails cusTomerObject = new PersonDetails();
					
					System.out.print("Full Name : ");
					cusTomerObject.sName = input.nextLine();
					System.out.print("Address : ");
					cusTomerObject.sAddress = input.nextLine();
					System.out.print("Age : ");
					cusTomerObject.nAge = Long.parseLong(input.nextLine());
					System.out.print("Phone Number : ");
					cusTomerObject.nPhoneNumber = input.nextLine();   
	               try 
	               {
	                   ProjectDB.insert(new Person(cusTomerObject));
	               } 
	               catch (Exception ex) 
	               {
	            	   printMessage("ERROR: File not Found!");
	               }
	           
	               printMessage( cusTomerObject.sName + " Record is inserted successfully\n");
		           printPassengerUI();
		           break;
		
		           case 2:
		        	   printBold("---- CUSTOMERS TABLE  ----");
		               Person.showPersonTable();
		               printPassengerUI();
		               break;
		
		           case 3:
		        	   printBold("-----  CUSTOMERS TABLE  -----");
		               Person.showPersonTable(); 
		               if (ProjectDB.personlst.size() == 0) {
		                   printPassengerUI();
		                   System.out.println("Warning : No Passanger Avaialable.");
		               }
		               else 
		               { 
		               	do {
		               		printMessage("Enter valid index value :");
		                       index = input.nextInt();		                     
		                       if(index > ProjectDB.personlst.size()|| index < 1)
		                    	   printMessage("Choice not valid !");		                      
		                   } while (index < 1 || index > ProjectDB.personlst.size());
		                   ProjectDB.personlst.remove(ProjectDB.personlst.get(index - 1));
		                   printMessage("Removed Successfully!\n");                        
		                printPassengerUI();
		               }
		               break;
		           case 4:
		        	   printBold("----  NEW RESERVATION   ----");
		               Person.showPersonTable();
		               if (ProjectDB.personlst.size() == 0) {
		                   printPassengerUI();
		               }
		               else {
		                   do {
		                       System.out.print("Enter Customer Index : ");
		                       index = input.nextInt();
		                   } while (index < 1 || index > ProjectDB.personlst.size());
		                   Person p = ProjectDB.personlst.get(index - 1);
		                   //Choose the flight
		                   
		                   FlightScheduler scfObject;		
		                   FlightScheduler.showFlightSchedulerTable();
		                   if (ProjectDB.flightSchedulerlst.size() == 0) {
		                       printPassengerUI();
		                   }
		                   else {
		                       do {
			       					System.out.print("Enter The Flight Index : ");
									index = input.nextInt();
	
	                                if (index > 0 && index <= ProjectDB.flightSchedulerlst.size())
									{
										break;	
									}
									else
									{
										System.out.println("Warning : Please enter a valid Flight index.");
									}
	                            } while (true);
		                       
		                       
		                       scfObject = ProjectDB.flightSchedulerlst.get(index - 1);
		                       if (scfObject.ncapacity == PassengerDetails.getSCFlightPassengersCount(scfObject.nflight_number)) 
		                       {
		                           System.out.println("This Flight is Occcupied");
		                       }
		                       else 
		                       {
		                           int prevLen = ProjectDB.passengerlst.size();
		                           {
		                               try 
		                               {
		                                   ProjectDB.insert(new PassengerDetails(p, scfObject.nflight_number));
		                               } catch (Exception ex) 
		                               {
		                                   System.out.println("ERROR : flight_number not found !");
		                               }
		                           }
		                           int afterLen = ProjectDB.passengerlst.size();
		                           if (prevLen != afterLen) {
		                               System.out.println("Reservation completed : " + p.persnDet.sName + " (" + scfObject.sfrom + " => " + scfObject.sto + ")\n");
		                           }
		                       }
		                       printPassengerUI();
		                   }
		               }
		               //PrintPassengerUI();
		               break;
		           case 5:
		               System.out.println("------ RESERVATIONS TABLE  -----");
		               PassengerDetails.show_PassengerDetails();
		               printPassengerUI();
		               break;
		           case 6:
		               System.out.println("------ RESERVATIONS TABLE  ------");
		               PassengerDetails.show_PassengerDetails();
		               if (ProjectDB.passengerlst.size() == 0) {
		                   printPassengerUI();
		               }
		               else {
		                   do {
		                       System.out.print("Enter Passenger Index : ");
		                       index = input.nextInt();
		                   } while (index < 1 || index > ProjectDB.passengerlst.size());
		                   ProjectDB.passengerlst.remove(ProjectDB.passengerlst.get(index - 1));
		                   System.out.println("Reservation Cancelled Successfully!\n");
		                   printPassengerUI();
		               }
		               break;
		
		           case 7:
		               System.out.println();
		               printMenuUI();
		               break;
		           case 8:
		               printPassengerUI();
		               break;
		           default:
		               System.out.println("ERROR: Choice not valid");
		       }
    	   return true;
	   }
    	System.out.println("Warning : Choice is invalid! Enter Again..");
    	return false;
    }
    
    public static void printPassengerUI() {
    	printBold(" --------  Passengers Menu  ---------");
    	printBold("1. Add New Customer");
    	printBold("2. View Customers");
    	printBold("3. Remove A Customer");
    	printBold("4. Add New Reservation");
    	printBold("5. View Reservations");
    	printBold("6. Cancel A Reservation");
    	printAlertBold("7. Return Main Menu");
    	printBold("----------------------------------");
        do{ } while (!choicePassengerUI(getOptionFromUser(input)));
          
    }

    public static boolean flightMenuChoice(int choice)
    {
    	if(choice > 0 && choice < 10)
    	{// refresh scanner to avoid errors;
    		int index=0;
	    	  switch (choice) 
	    	  {
	          case 1:
	              System.out.println("----- NEW FLIGHT DESCRIPTION -----");
	              
	              System.out.print("From : ");
	              String from = input.nextLine();
	              System.out.print("To   : ");
	              String to = input.nextLine();
	              String depTime, arrTime;
	
	              System.out.print("Departure time (HH:MM): ");
	              depTime = input.nextLine();
	
	              System.out.print("Arrival   time (HH:MM): ");
	              arrTime = input.nextLine();
	
	
	              System.out.print("Capacity : ");
	              int cap = input.nextInt();
	              int prevSize = ProjectDB.flightdetlst.size();
	              try 
	              {
	                  ProjectDB.insert(new flightDetails(from, to, depTime, arrTime, cap));
	              } 
	              catch (Exception ex) 
	              {
	                  System.out.println("ERROR: File not Found!");
	              }
		          int afterSize = ProjectDB.flightdetlst.size();
		          if (prevSize != afterSize) 
		          {
		              System.out.println("Flight Description added successfully : " + from + " -> " + to + "\n");
		          }
		          printFlightsMenuUI();
		          break;
	
	          case 2:
	              System.out.println("--- FLIGHT DESCRIPTION TABLE  ---");
	              flightDetails.show_FlightDetails();
	              printFlightsMenuUI();
	              break;
	          case 3:
	              System.out.println("--- FLIGHT DESCRIPTION TABLE ---");
	              flightDetails.show_FlightDetails();
	              if (ProjectDB.flightdetlst.size() == 0) {
	                  printFlightsMenuUI();
	              }
	              else {
	                  do {
	                      System.out.print("Flight description index to remove : ");
	                      index = input.nextInt();
	                  } while (index < 1 || index > ProjectDB.flightdetlst.size());
	                  ProjectDB.flightdetlst.remove(ProjectDB.flightdetlst.get(index - 1));
	
	                  System.out.println("Flight description removed Successfully!\n");
	                  printFlightsMenuUI();
	              }
	              break;
	          case 4:
	              System.out.println("--  FLIGHT DESCRIPTION TABLE  ---");
	              flightDetails.show_FlightDetails();
	              if (ProjectDB.flightdetlst.size() == 0) {
	                  printFlightsMenuUI();
	              }
	              else {
	                  do 
	                  {
	                      System.out.print("Flight description index to schedule : ");
	                      index = input.nextInt();
	                  } while (index < 1 || index > ProjectDB.flightdetlst.size());
	                  
	                  flightDetails fd = ProjectDB.flightdetlst.get(index - 1);
	                
	                  String date;
	
	                  System.out.print("Date (YYYY/MM/DD) : ");
	                  date = input.nextLine();
	
	                  int prevLen = ProjectDB.flightSchedulerlst.size();
	                  {
	                      try {
	                          ProjectDB.insert(new FlightScheduler(fd, date));
	                      } catch (Exception ex) {
	                          System.out.println("ERROR : FILE NOT FOUND !");
	                      }
	                  }
	                  int afterLen = ProjectDB.flightSchedulerlst.size();
	                  if (prevLen != afterLen) {
	                      System.out.println("Scheduled " + date + " for flight : " + fd.sfrom + " -> " + fd.sto + "\n");
	                  }
	                  printFlightsMenuUI();
	              }
	              break;
	          case 5:
	              System.out.println("-- SCHEDULED FLIGHTS TABLE  --");
	              FlightScheduler.showFlightSchedulerTable();
	              printFlightsMenuUI();
	              break;
	
	          case 6:
	              System.out.println("-- SCHEDULED FLIGHT TABLE ---");
	              FlightScheduler.showFlightSchedulerTable();
	              if (ProjectDB.flightSchedulerlst.size() == 0) {
	                  printFlightsMenuUI();
	              }
	              else {
	                  do {
	                      System.out.print("Scheduled Flight index to canceled : ");
	                      index = input.nextInt();
	                  } while (index < 1 || index > ProjectDB.flightSchedulerlst.size());
	                  ProjectDB.flightSchedulerlst.remove(ProjectDB.flightSchedulerlst.get(index - 1));
	                  System.out.println("Scheduled Flight & Reservations canceled successfullyy!\n");
	                  printFlightsMenuUI();
	              }
	              break;
	
	          case 7:
	              System.out.println("-- SCHEDULED FLIGHT TABLE  --");
	              FlightScheduler.showFlightSchedulerTable();
	              do {
	                  System.out.print("Flight Index : ");
	                  index = input.nextInt();
	              } while (index < 1 || index > ProjectDB.flightSchedulerlst.size());
	              int flight_num = ProjectDB.flightSchedulerlst.get(index - 1).nflight_number;
	              PassengerDetails.showFlightNumber(flight_num);
	              printFlightsMenuUI();
	              break;
	          case 8:
	              System.out.println();
	              printMenuUI();
	              break;
	          case 9:
	              printFlightsMenuUI();
	              break;
	          default:
	              System.out.println("ERROR: Choice not valid");
	      }
	    	  return true;
    	}
    	return false;

    }
    
    public static void printFlightsMenuUI() 
    {
    	printBold("----  Flight Management Menu  -----");
    	printBold("1. Add New Flight Description");
    	printBold("2. View All Flight Description");
    	printBold("3. Remove Flight Description");
    	printBold("4. Schedule New Flight");
    	printBold("5. View All Scheduled Flights");
    	printBold("6. Cancel Scheduled Flight");
    	printBold("7. View Scheduled Flight Passengers");
    	printAlertBold("8. Main Menu");
    	printBold("----------------------------------");
        
        do{ } while (!flightMenuChoice(getOptionFromUser(input)));
    }
}