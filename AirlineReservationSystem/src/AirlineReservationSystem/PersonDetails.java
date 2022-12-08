package AirlineReservationSystem;


//Boundary value analysis - can be with the person name
//Test case for Name length 0 ,1,2   and last three values of maximum 
//Equivalance practioning - Age >11  <18  15

/*Name : PersonDetails 
Description : Class maintains the details of person
*/ 

public class PersonDetails
{
	//person name
	public String sName;
	//address name
	public String sAddress;
	//age as long
	public long nAge; 
	//phonenumber string 
	public String nPhoneNumber;
	
	//Gets the Name as string
	public String getsName() {
		return sName;
	}
	
	/*
	 * Name : setsName 
	 * Arguments : String
	 * Return : Boolean
	 * Description : Sets the name as name atributes
	 * */
	public Boolean setsName(String sName) 
	{
		if(sName.length() <= 10)
		{
			this.sName = sName;
			return true;
		}
		return false;
	}
	
	/*
	 * Name : getsAddress 
	 * Arguments : None
	 * Return : String
	 * Description : Get the address
	 * */
	public String getsAddress() {
		return sAddress;
	}
	
	/*
	 * Name : setsAddress 
	 * Arguments : String
	 * Return : boolean
	 * Description : sets the address
	 * */
	public Boolean setsAddress(String sAddress) {
		if(sAddress.length() <= 6)
		{
			this.sAddress = sAddress;
			return true;
		}
		return false;
	}
	
	/*
	 * Name : getnAge 
	 * Arguments : None
	 * Return : Long
	 * Description : get the age
	 * */
	public long getnAge() {
		return nAge;
	}
	
	/*
	 * Name : setnAge 
	 * Arguments : long
	 * Return : Boolean
	 * Description : set the age
	 * */
	public Boolean setnAge(long nAge) 
	{
		if(nAge > 0)
		{
			this.nAge = nAge;
			return true;
		}
		return false;
	}
	
	/*
	 * Name : getnPhoneNumber 
	 * Arguments : none
	 * Return : String
	 * Description : gets  the phone number
	 * */
	public String getnPhoneNumber() {
		return nPhoneNumber;
	}
	
	/*
	 * Name : setnPhoneNumber 
	 * Arguments : String
	 * Return : Boolean
	 * Description : set the Phone number
	 * */
	public void setnPhoneNumber(String nPhoneNumber) 
	{
		if(nPhoneNumber.length() <= 10)
		{
			this.nPhoneNumber = nPhoneNumber;
		}
	}
}

 