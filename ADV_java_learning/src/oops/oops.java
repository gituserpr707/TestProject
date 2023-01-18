package oops;

public class oops
{
	private int number;
	private int phone;
	private String name;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		char ch=(char)number;
		System.out.println(ch);
		this.number = number;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name == "RKBoss" || name == "RK")
		{
		this.name = name;
	    }
		else
		{
			this.name = "invalid person";
		}
	}
	
	

}
