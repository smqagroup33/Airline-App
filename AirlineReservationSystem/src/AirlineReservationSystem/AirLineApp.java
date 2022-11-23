package AirlineReservationSystem;
import java.util.Scanner;
import java.util.InputMismatchException;


public class AirLineApp 
{
    static ConsoleStyles _cc_ = new ConsoleStyles();
    public static Scanner input = new Scanner(System.in); 
    
    public static void main(String[] args) 
    {
    	PrintHeadUI();
        PrintMenuUI();
    }

    private static void Exit_Message()
    {
    	PrintMessage("Thanks! Welcome Again");
    }

    private static void PrintHeadUI() 
    {
    	PrintMessage("****************************************"+_cc_.RESET);
    	PrintBold(_cc_.BLACK_BOLD + "       Ailine Application System       " +_cc_.RESET);
    	PrintBold("****************************************"+_cc_.RESET);
    	PrintBold("\n");
    }

    private static Boolean ChoiceMenuUI(int choice)
    {
    	if(choice > 0 && choice < 4)
    	{
    		switch (choice) 
	    	{
	        case 1:
	            System.out.println();
	            PrintPassengerUI();
	            break;
	        case 2:
	            System.out.println();
	            PrintFlightsMenuUI();
	            break;
	        case 3:
	        	Exit_Message();
	    	}
    		return true;
    	}
    	System.out.println("Warning : Choice Not Valid!");
    	return false;
    }

    private static int GetOptionFromUser(Scanner inOption)
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
    
    public static void PrintMenuUI() 
    {
    	PrintBold(" --------  Main Menu  ---------");
    	PrintBold("1. Passenger Menu");
    	PrintBold("2. Flights Management Menu");
    	PrintAlertBold("3. Exit " );
    	PrintBold("------------------------------------\n");
    	
        do{ } while (!ChoiceMenuUI(GetOptionFromUser(input)));
    }

    private static void PrintAlertBold(String Menu)
    {
    	PrintMessage(  _cc_.RED_BOLD  + Menu + _cc_.RESET);
    }
    
    private static void PrintMessage(String Message)
    {
    	System.out.println(Message);
    }
    
    private static void PrintBold(String Menu)
    {
    	PrintMessage( _cc_.BLACK_BOLD + Menu + _cc_.RESET);
    }

    
    public static Boolean ChoicePassengerUI(int Option) 
    {
    	if(Option > 0 && Option < 8)
    	{
        	int index = 0;
	    	   switch (Option) 
	    	   {
		           case 1:
					PrintMessage("----- NEW CUSTOMERS -----");
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
	            	   PrintMessage("ERROR: File not Found!");
	               }
	           
	               PrintMessage( cusTomerObject.sName + " Record is inserted successfully\n");
		           PrintPassengerUI();
		           break;
		
		           case 2:
		        	   PrintBold("---- CUSTOMERS TABLE  ----");
		               Person.ShowPersonTable();
		               PrintPassengerUI();
		               break;
		
		           case 3:
		        	   PrintBold("-----  CUSTOMERS TABLE  -----");
		               Person.ShowPersonTable(); 
		               if (ProjectDB.personlst.size() == 0) {
		                   PrintPassengerUI();
		                   System.out.println("Warning : No Passanger Avaialable.");
		               }
		               else 
		               {
		               	do {
		               		PrintMessage("Enter valid index value :");
		                       index = input.nextInt();		                     
		                       if(index > ProjectDB.personlst.size()|| index < 1)
		                    	   PrintMessage("Choice not valid !");		                      
		                   } while (index < 1 || index > ProjectDB.personlst.size());
		                   ProjectDB.personlst.remove(ProjectDB.personlst.get(index - 1));
		                   PrintMessage("Removed Successfully!\n");                        
		                PrintPassengerUI();
		               }
		               break;
		           case 4:
		        	   PrintBold("----  NEW RESERVATION   ----");
		               Person.ShowPersonTable();
		               if (ProjectDB.personlst.size() == 0) {
		                   PrintPassengerUI();
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
		                       PrintPassengerUI();
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
		                               System.out.println("Reservation completed : " + p.PersnDet.sName + " (" + scfObject.sfrom + " => " + scfObject.sto + ")\n");
		                           }
		                       }
		                       PrintPassengerUI();
		                   }
		               }
		               //PrintPassengerUI();
		               break;
		           case 5:
		               System.out.println("------ RESERVATIONS TABLE  -----");
		               PassengerDetails.show_PassengerDetails();
		               PrintPassengerUI();
		               break;
		           case 6:
		               System.out.println("------ RESERVATIONS TABLE  ------");
		               PassengerDetails.show_PassengerDetails();
		               if (ProjectDB.passengerlst.size() == 0) {
		                   PrintPassengerUI();
		               }
		               else {
		                   do {
		                       System.out.print("Enter Passenger Index : ");
		                       index = input.nextInt();
		                   } while (index < 1 || index > ProjectDB.passengerlst.size());
		                   ProjectDB.passengerlst.remove(ProjectDB.passengerlst.get(index - 1));
		                   System.out.println("Reservation Cancelled Successfully!\n");
		                   PrintPassengerUI();
		               }
		               break;
		
		           case 7:
		               System.out.println();
		               PrintMenuUI();
		               break;
		           case 8:
		               PrintPassengerUI();
		               break;
		           default:
		               System.out.println("ERROR: Choice not valid");
		       }
    	   return true;
	   }
    	System.out.println("Warning : Choice is invalid! Enter Again..");
    	return false;
    }
    
    public static void PrintPassengerUI() {
    	PrintBold(" --------  Passengers Menu  ---------");
    	PrintBold("1. Add New Customer");
    	PrintBold("2. View Customers");
    	PrintBold("3. Remove A Customer");
    	PrintBold("4. Add New Reservation");
    	PrintBold("5. View Reservations");
    	PrintBold("6. Cancel A Reservation");
    	PrintAlertBold("7. Return Main Menu");
    	PrintBold("----------------------------------");
        do{ } while (!ChoicePassengerUI(GetOptionFromUser(input)));
          
    }

    private static Boolean FlightMenuChoice(int choice)
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
	                  ProjectDB.insert(new FlightDetails(from, to, depTime, arrTime, cap));
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
		          PrintFlightsMenuUI();
		          break;
	
	          case 2:
	              System.out.println("--- FLIGHT DESCRIPTION TABLE  ---");
	              FlightDetails.show_FlightDetails();
	              PrintFlightsMenuUI();
	              break;
	          case 3:
	              System.out.println("--- FLIGHT DESCRIPTION TABLE ---");
	              FlightDetails.show_FlightDetails();
	              if (ProjectDB.flightdetlst.size() == 0) {
	                  PrintFlightsMenuUI();
	              }
	              else {
	                  do {
	                      System.out.print("Flight description index to remove : ");
	                      index = input.nextInt();
	                  } while (index < 1 || index > ProjectDB.flightdetlst.size());
	                  ProjectDB.flightdetlst.remove(ProjectDB.flightdetlst.get(index - 1));
	
	                  System.out.println("Flight description removed Successfully!\n");
	                  PrintFlightsMenuUI();
	              }
	              break;
	          case 4:
	              System.out.println("--  FLIGHT DESCRIPTION TABLE  ---");
	              FlightDetails.show_FlightDetails();
	              if (ProjectDB.flightdetlst.size() == 0) {
	                  PrintFlightsMenuUI();
	              }
	              else {
	                  do 
	                  {
	                      System.out.print("Flight description index to schedule : ");
	                      index = input.nextInt();
	                  } while (index < 1 || index > ProjectDB.flightdetlst.size());
	                  
	                  FlightDetails fd = ProjectDB.flightdetlst.get(index - 1);
	                
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
	                  PrintFlightsMenuUI();
	              }
	              break;
	          case 5:
	              System.out.println("-- SCHEDULED FLIGHTS TABLE  --");
	              FlightScheduler.showFlightSchedulerTable();
	              PrintFlightsMenuUI();
	              break;
	
	          case 6:
	              System.out.println("-- SCHEDULED FLIGHT TABLE ---");
	              FlightScheduler.showFlightSchedulerTable();
	              if (ProjectDB.flightSchedulerlst.size() == 0) {
	                  PrintFlightsMenuUI();
	              }
	              else {
	                  do {
	                      System.out.print("Scheduled Flight index to canceled : ");
	                      index = input.nextInt();
	                  } while (index < 1 || index > ProjectDB.flightSchedulerlst.size());
	                  ProjectDB.flightSchedulerlst.remove(ProjectDB.flightSchedulerlst.get(index - 1));
	                  System.out.println("Scheduled Flight & Reservations canceled successfullyy!\n");
	                  PrintFlightsMenuUI();
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
	              PassengerDetails.ShowFlightNumber(flight_num);
	              PrintFlightsMenuUI();
	              break;
	          case 8:
	              System.out.println();
	              PrintMenuUI();
	              break;
	          case 9:
	              PrintFlightsMenuUI();
	              break;
	          default:
	              System.out.println("ERROR: Choice not valid");
	      }
	    	  return true;
    	}
    	return false;

    }
    
    public static void PrintFlightsMenuUI() 
    {
    	PrintBold("----  Flight Management Menu  -----");
    	PrintBold("1. Add New Flight Description");
    	PrintBold("2. View All Flight Description");
    	PrintBold("3. Remove Flight Description");
    	PrintBold("4. Schedule New Flight");
    	PrintBold("5. View All Scheduled Flights");
    	PrintBold("6. Cancel Scheduled Flight");
    	PrintBold("7. View Scheduled Flight Passengers");
    	PrintAlertBold("8. Main Menu");
    	PrintBold("----------------------------------");
        
        do{ } while (!FlightMenuChoice(GetOptionFromUser(input)));
    }
}