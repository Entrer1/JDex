package io.github.tryexceptelse.jdex;
/*
 * one object of this class represents one contact to be added to the list storing contacts.
 */
public class Contact 
{
	private String first;
	private String last;
	private String email;
	private String streetAddr;
	private String phoneNumber;
	private String notes;
	public void Contact(String newFirst, String newLast, String newEmail, String newStreetAddr, String newPhoneNumber,String newNotes)
	{
		first=newFirst;
		last=newLast;
		email=newEmail;
		streetAddr=newStreetAddr;
		phoneNumber=newPhoneNumber;
		notes=newNotes;
	}
	/*
	 * the following methods can be called to set set the variable of the same name
	 */
	public void setFirst(String newFirst)
	{
		first=newFirst;
	}
	public void setLast(String newLast)
	{
		last=newLast;
	}
	public void setEmai(String newEmail)
	{
		email=newEmail;
	}
	public void setStreetAddr(String newStreetAddr)
	{
		streetAddr=newStreetAddr;
	}
	public void setPhoneNumber(String newPhoneNumber)
	{
		phoneNumber=newPhoneNumber;
	}
	public void setNotes(String newNotes)
	{
		notes=newNotes;
	}
	/*
	 * the following methods can be called to get variables of the same name
	 */
	public String getFirst()
	{
		return first;
	}
	public String getLast()
	{
		return last;
	}
	public String getEamil()
	{
		return email;
	}
	public String getstreetAddr()
	{
		return streetAddr;
	}
	public String getnotes()
	{
		return notes;
	}
}
