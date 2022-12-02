package AirlineReservationSystem;


//Boundary value analysis - can be with the person name
//Test case for Name length 0 ,1,2   and last three values of maximum 
//Equivalance practioning - Age >11  <18  15
//

public class PersonDetails
{
	public String sName;
	public String sAddress;
	public long nAge; //
	public String nPhoneNumber;
	public String getsName() {
		return sName;
	}
	public Boolean setsName(String sName) 
	{
		if(sName.length() <= 10)
		{
			this.sName = sName;
			return true;
		}
		return false;
	}
	public String getsAddress() {
		return sAddress;
	}
	public Boolean setsAddress(String sAddress) {
		if(sAddress.length() <= 6)
		{
			this.sAddress = sAddress;
			return true;
		}
		return false;
	}
	public long getnAge() {
		return nAge;
	}
	public Boolean setnAge(long nAge) 
	{
		if(nAge > 0)
		{
			this.nAge = nAge;
			return true;
		}
		return false;
	}
	public String getnPhoneNumber() {
		return nPhoneNumber;
	}
	public void setnPhoneNumber(String nPhoneNumber) 
	{
		if(nPhoneNumber.length() <= 10)
		{
			this.nPhoneNumber = nPhoneNumber;
		}
	}
}

 