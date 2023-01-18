package com.java.minterface;

public class Mobile implements Tele_phone

{

	private int number;
	private boolean isRinging = true;
	private boolean isOn = true;
	

	public Mobile(int number) {
		super();
		this.number = number;
	}

	@Override
	public void powerOn() 
	{ 
		isOn = true;
		
		System.out.println("phone is on");
		
	}

	@Override
	public void call(int phonenumber) 
	{
		if(isOn)
		{
			System.out.println("make call to this number " +phonenumber);
		}
		else
		{
			System.out.println("switched off");
		}
		
		
	}

	@Override
	public void hold()
	{
		if(isRinging)
		{
			System.out.println("anwer the call");
			isRinging = false; 
		}
	}

	@Override
	public boolean dail(int phonenumber) {
		if(number == phonenumber && isOn)
		{
			isRinging = true;
			System.out.println("ya it is ringing");
		}
		else
		{
			isRinging = false;
		}
		return isRinging;
	}

	@Override
	public boolean isRinging() {
		// TODO Auto-generated method stub
		return isRinging;
	}
	

}
