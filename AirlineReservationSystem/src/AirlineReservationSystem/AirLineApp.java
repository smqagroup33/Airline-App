<<<<<<< HEAD
package AirlineReservationSystem;
import java.util.Scanner;
import java.util.InputMismatchException;


public class AirLineApp 
{
    static ConsoleStyles _cc_ = new ConsoleStyles();
    public static Scanner input = new Scanner(System.in); 
    
    public static void main(String[] args) 
    {
    	printHeadUI();
        printMenuUI();
    } 

    private static void exit_Message()
    {
    	printMessage("Thanks! Welcome Again");
    }

    private static void printHeadUI() 
    {
    	printMessage("****************************************"+_cc_.RESET);
    	printBold(_cc_.BLACK_BOLD + "       Ailine Application System       " +_cc_.RESET);
    	printBold("****************************************"+_cc_.RESET);
    	printBold("\n");
    }
    private static boolean choiceMenuUI(int choice)
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
=======
package AirlineReservationSystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AirLineApp {
    static ConsoleColors cc = new ConsoleColors();

    public static void main(String[] args) {

    	/*PersonDetails Details = new PersonDetails();
    	Details.sName = "Hariharan";
    	Details.nPhoneNumber = "97766891784";
    	Details.nAge = 2;
    	
        Person person1 = new Person(Details);
        ProjectDB.add(person1);

        Person person2 = new Person(Details);
        ProjectDB.add(person2);

        Passenger passenger1 = new Passenger(person1, 1);
        ProjectDB.add(passenger1);

        FlightDescription flightDescription1 = new FlightDescription("Karachi", "Lahore", "01:00", "02:45", 10);
        ProjectDB.add(flightDescription1);

        ScheduledFlight scheduledFlight1 = new ScheduledFlight(flightDescription1, "25/06/2022");
        ProjectDB.add(scheduledFlight1);
*/

        print_header();
        main_menu();
    }

    //To exit the program
    private static void exitMessage(){
        System.out.println("Thank you for using airline reservation system");
    }

    private static void print_header() {
        System.out.println(cc.GREY_BACKGROUND + "<><><><><><><><><><><><><><><><><><><><>" + cc.RESET);
        System.out.println(cc.RED_BACKGROUND_BRIGHT + cc.BLACK_BOLD + "       Airline Reservation System       " + cc.RESET);
        System.out.println(cc.GREY_BACKGROUND + "<><><><><><><><><><><><><><><><><><><><>" + cc.RESET);
        System.out.print("\n");
    }


    private static void main_menu() {
        System.out.println(cc.RED_BACKGROUND + cc.BLACK_BOLD + "---------->  Main Menu  <-----------" + cc.RESET);
        System.out.println(cc.GREY_BACKGROUND + cc.BLACK_BOLD + "1- Passengers Menu                  " + cc.RESET);
        System.out.println(cc.GREY_BACKGROUND + cc.BLACK_BOLD + "2- Flight Management Menu           " + cc.RESET);
        System.out.println(cc.GREY_BACKGROUND + cc.RED_BOLD + "3- Exit System                      " + cc.RESET);
        System.out.println(cc.RED_BACKGROUND + cc.BLACK_BOLD + "------------------------------------" + cc.RESET);
        short choice=4;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Choice: ");
            //choice = input.nextShort();
            try{
                choice = input.nextShort();
                input.nextLine();
            }catch (InputMismatchException e){
                System.out.println();
            }
            switch (choice) {
                case 1:
                    System.out.println();
                    passengers_menu();
                    break;
                case 2:
                    System.out.println();
                    flights_menu();
                    break;
                case 3:
                    exitMessage();
                    break;
                case 4:
                    main_menu();
                    break;
                default:
                    System.out.println("ERROR: Choice not valid!");
            }
        } while (choice < 1 || choice > 4);
    }

    private static void passengers_menu() {
        System.out.println(cc.RED_BACKGROUND + cc.BLACK_BOLD + "------->  Passengers Menu  <--------" + cc.RESET);
        System.out.println(cc.GREY_BACKGROUND + cc.BLACK_BOLD + "1- Add Customer                     " + cc.RESET);
        System.out.println(cc.GREY_BACKGROUND + cc.BLACK_BOLD + "2- View All Customers               " + cc.RESET);
        System.out.println(cc.GREY_BACKGROUND + cc.BLACK_BOLD + "3- Remove Customer                  " + cc.RESET);
        System.out.println(cc.GREY_BACKGROUND + cc.BLACK_BOLD + "4- New Reservation                  " + cc.RESET);
        System.out.println(cc.GREY_BACKGROUND + cc.BLACK_BOLD + "5- view All Reservations            " + cc.RESET);
        System.out.println(cc.GREY_BACKGROUND + cc.BLACK_BOLD + "6- Cancel Reservation               " + cc.RESET);
        System.out.println(cc.GREY_BACKGROUND + cc.RED_BOLD + "7- Main Menu                        " + cc.RESET);
        System.out.println(cc.RED_BACKGROUND + cc.BLACK_BOLD + "------------------------------------" + cc.RESET);
        short choice=8;
        int index;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Choice: ");
            try{
                choice = input.nextShort();
                input.nextLine();
            }catch (InputMismatchException e){
                System.out.println("Invalid Choice");
            }

            switch (choice) {
                case 1:
                    System.out.println("---->  NEW CUSTOMERS  <----");
                    PersonDetails new_customer = new PersonDetails();
                    input = new Scanner(System.in); 
                    System.out.print("Full Name : ");
                    new_customer.sName = input.nextLine();
                    System.out.print("Address : ");
                    new_customer.sAddress = input.nextLine();
                    System.out.print("Age : ");
                    new_customer.nAge = Long.parseLong(input.nextLine());
                    System.out.print("Phone Number : ");
                    new_customer.nPhoneNumber = input.nextLine();
                    
                {
                    try {
                        ProjectDB.add(new Person(new_customer));
                    } catch (Exception ex) {
                        System.out.println("ERROR: File not Found!");
                    }
                }
                System.out.println( new_customer.sName + " Record has been added successfully\n");
                passengers_menu();
                break;

                case 2:
                    System.out.println("=> CUSTOMERS TABLE  <----");
                    Person.showtable();
                    passengers_menu();
                    break;

                case 3:
                    System.out.println("---->  CUSTOMERS TABLE  <----");
                    Person.showtable();
                    if (ProjectDB.person_list.size() == 0) {
                        passengers_menu();
                        System.out.println("The list is empty");
                    }
                    else {
                    	do {//geethika
                        	System.out.println("Enter valid index value :");
                            index = input.nextInt();
                          
                            if(index>ProjectDB.person_list.size()|| index<1)
                            	System.out.println("Choicle not valid !");
                           
                        } while (index < 1 || index > ProjectDB.person_list.size());
                        ProjectDB.person_list.remove(ProjectDB.person_list.get(index - 1));
                        System.out.println("Removed Successfully!\n");                        
                     passengers_menu();
                    }
                    break;
                case 4:
                    System.out.println("---->  NEW RESERVATION   <----");
                    //Choose person
                    Person.showtable();
                    if (ProjectDB.person_list.size() == 0) {
                        passengers_menu();
                    }
                    else {
                        do {
                            System.out.print("Customer Index : ");
                            index = input.nextInt();
                        } while (index < 1 || index > ProjectDB.person_list.size());
                        Person p = ProjectDB.person_list.get(index - 1);
                        //Choose flight
                        ScheduledFlight scf;

                        ScheduledFlight.show_all();
                        if (ProjectDB.scheduled_flight_list.size() == 0) {
                            passengers_menu();
                        }
                        else {
                            do {
                                System.out.print("Flight Index : ");
                                index = input.nextInt();
                            } while (index < 1 || index > ProjectDB.scheduled_flight_list.size());
                            scf = ProjectDB.scheduled_flight_list.get(index - 1);
                            if (scf.capacity == Passenger.getSCFlightPassengersCount(scf.flight_number) || ProjectDB.passenger_list.size() == 0) {
                                System.out.println("This flight is at maximum capacity.");
                            }
                            else {
                                int prevLen = ProjectDB.passenger_list.size();
                                {
                                    try {
                                        ProjectDB.add(new Passenger(p, scf.flight_number));
                                    } catch (Exception ex) {
                                        System.out.println("ERROR : FILE NOT FOUND !");
                                    }
                                }
                                int afterLen = ProjectDB.passenger_list.size();
                                if (prevLen != afterLen) {
                                    System.out.println("Reservation completed : " + p.PersnDet.sName + " (" + scf.from + " -> " + scf.to + ")\n");
                                }
                            }
                            passengers_menu();
                        }
                    }
                    //passengers_menu();
                    break;
                case 5:
                    System.out.println("---->  RESERVATIONS TABLE  <----");
                    Passenger.show_all();
                    passengers_menu();
                    break;
                case 6:
                    System.out.println("---->  RESERVATIONS TABLE  <----");
                    Passenger.show_all();
                    if (ProjectDB.passenger_list.size() == 0) {
                        passengers_menu();
                    }
                    else {
                        do {
                            System.out.print("Passenger Index to Cancel trip for : ");
                            index = input.nextInt();
                        } while (index < 1 || index > ProjectDB.passenger_list.size());
                        ProjectDB.passenger_list.remove(ProjectDB.passenger_list.get(index - 1));
                        System.out.println("Reservation Canceled Successfully!\n");
                        passengers_menu();
                    }
                    break;

                case 7:
                    System.out.println();
                    main_menu();
                    break;
                case 8:
                    passengers_menu();
                    break;
                default:
                    System.out.println("ERROR: Choice not valid");
            }
        } while (choice < 1 || choice > 8);

    }

    private static void flights_menu() {
        System.out.println(cc.RED_BACKGROUND + cc.BLACK_BOLD + "---->  Flight Management Menu  <----" + cc.RESET);
        System.out.println(cc.GREY_BACKGROUND + cc.BLACK_BOLD + "1- Add New Flight Description       " + cc.RESET);
        System.out.println(cc.GREY_BACKGROUND + cc.BLACK_BOLD + "2- View All Flight Description      " + cc.RESET);
        System.out.println(cc.GREY_BACKGROUND + cc.BLACK_BOLD + "3- Remove Flight Description        " + cc.RESET);
        System.out.println(cc.GREY_BACKGROUND + cc.BLACK_BOLD + "4- Schedule New Flight              " + cc.RESET);
        System.out.println(cc.GREY_BACKGROUND + cc.BLACK_BOLD + "5- view All Scheduled Flights       " + cc.RESET);
        System.out.println(cc.GREY_BACKGROUND + cc.BLACK_BOLD + "6- Cancel Scheduled Flight          " + cc.RESET);
        System.out.println(cc.GREY_BACKGROUND + cc.BLACK_BOLD + "7- View Scheduled Flight Passengers " + cc.RESET);
        System.out.println(cc.GREY_BACKGROUND + cc.RED_BOLD + "8- Main Menu                        " + cc.RESET);
        System.out.println(cc.RED_BACKGROUND + cc.BLACK_BOLD + "------------------------------------" + cc.RESET);
        short choice=9;
        int index;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Choice: ");
            
            //choice = input.nextShort();
            try{
                choice = input.nextShort();
                input.nextLine();
            }catch (InputMismatchException e){
                System.out.println("Invalid Choice");
            }

            switch (choice) {
                case 1:
                    System.out.println("---->  NEW FLIGHT DESCRIPTION  <----");
                    input = new Scanner(System.in); // refresh scanner to avoid errors
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
                    input = new Scanner(System.in);
                    int cap = input.nextInt();
                    int prevSize = ProjectDB.flight_desc_list.size();
                {
                    try {
                        ProjectDB.add(new FlightDescription(from, to, depTime, arrTime, cap));
                    } catch (Exception ex) {
                        System.out.println("ERROR: File not Found!");
                    }
                }
                int afterSize = ProjectDB.flight_desc_list.size();
                if (prevSize != afterSize) {
                    System.out.println("Flight Description added successfully : " + from + " -> " + to + "\n");
                }
                flights_menu();
                break;

                case 2:
                    System.out.println("---->  FLIGHT DESCRIPTION TABLE  <----");
                    FlightDescription.show_all();
                    flights_menu();
                    break;
                case 3:
                    System.out.println("---->  FLIGHT DESCRIPTION TABLE  <----");
                    FlightDescription.show_all();
                    if (ProjectDB.flight_desc_list.size() == 0) {
                        flights_menu();
                    }
                    else {
                        do {
                            System.out.print("Enter Flight description index to remove : ");
                            index = input.nextInt();
                            if(index < 1 || index > ProjectDB.flight_desc_list.size())//jeswitha
                            	System.out.println("Choice not valid!");//jeswitha
                        } while (index < 1 || index > ProjectDB.flight_desc_list.size());
                        ProjectDB.flight_desc_list.remove(ProjectDB.flight_desc_list.get(index - 1));

                        System.out.println("Flight description removed Successfully!\n");
                        flights_menu();
                    }
                    break;
                case 4:
                    System.out.println("---->  FLIGHT DESCRIPTION TABLE  <----");
                    FlightDescription.show_all();
                    if (ProjectDB.flight_desc_list.size() == 0) {
                    	System.out.println("The list is empty");//jeswitha
                        flights_menu();
                    }
                    else {
                    	
                        do {
                            System.out.print("Flight description index to schedule : ");
                            index = input.nextInt();
                            if(index < 1 || index > ProjectDB.flight_desc_list.size())//jeswitha
                            	System.out.println("Choice not valid!");//jeswitha
                        } while (index < 1 || index > ProjectDB.flight_desc_list.size());
                        FlightDescription fd = ProjectDB.flight_desc_list.get(index - 1);
                        input = new Scanner(System.in); // refresh scanner to avoid errors
                        String date;

                        System.out.print("Date (YYYY/MM/DD) : ");
                        date = input.nextLine();

                        int prevLen = ProjectDB.scheduled_flight_list.size();
                        {
                            try {
                                ProjectDB.add(new ScheduledFlight(fd, date));
                            } catch (Exception ex) {
                                System.out.println("ERROR : FILE NOT FOUND !");
                            }
                        }
                        System.out.println("list length before adding : "+ prevLen);
                        int afterLen = ProjectDB.scheduled_flight_list.size();
                       
                        if (prevLen != afterLen) {
                            System.out.println("Scheduled " + date + " for flight : " + fd.from + " -> " + fd.to + "\n");
                            System.out.println("list length after adding : "+ afterLen);
                        }
                        flights_menu();
                    }
                    //flights_menu();
                    break;
                case 5:
                    System.out.println("---->  SCHEDULED FLIGHTS TABLE  <----");
                    ScheduledFlight.show_all();
                    flights_menu();
                    break;

                case 6:
                    System.out.println("---->  SCHEDULED FLIGHT TABLE  <----");
                    ScheduledFlight.show_all();
                    if (ProjectDB.scheduled_flight_list.size() == 0) {
                        flights_menu();
                    }
                    else {
                        do {
                            System.out.print("Scheduled Flight index to canceled : ");
                            index = input.nextInt();
                            if(index < 1 || index > ProjectDB.scheduled_flight_list.size())
                            {
                            	System.out.println("Choice not valid!");
                            }
                        } while (index < 1 || index > ProjectDB.scheduled_flight_list.size());
                        ProjectDB.scheduled_flight_list.remove(ProjectDB.scheduled_flight_list.get(index - 1));
                        System.out.println("Scheduled Flight & Reservations canceled Successfully!\n");
                        flights_menu();
                    }
                    break;

                case 7:
                    System.out.println("---->  SCHEDULED FLIGHT TABLE  <----");
                    ScheduledFlight.show_all();
                    do {
                        System.out.print("Flight Index : ");
                        index = input.nextInt();
                    } while (index < 1 || index > ProjectDB.scheduled_flight_list.size());
                    int flight_num = ProjectDB.scheduled_flight_list.get(index - 1).flight_number;
                    Passenger.show_only_flight_no(flight_num);
                    flights_menu();
                    break;
                case 8:
                    System.out.println();
                    main_menu();
                    break;
                case 9:
                    flights_menu();
                    break;
                default:
                    System.out.println("ERROR: Choice not valid");
            }
        } while (choice < 1 || choice > 9);
    }
>>>>>>> 9cf2454d1955b538bea40dd2f2908d1e2575fca2
}