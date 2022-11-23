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
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsAddress() {
		return sAddress;
	}
	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}
	public long getnAge() {
		return nAge;
	}
	public void setnAge(long nAge) {
		this.nAge = nAge;
	}
	public String getnPhoneNumber() {
		return nPhoneNumber;
	}
	public void setnPhoneNumber(String nPhoneNumber) {
		this.nPhoneNumber = nPhoneNumber;
	}
}

 