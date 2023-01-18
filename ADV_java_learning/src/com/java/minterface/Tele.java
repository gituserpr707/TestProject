package com.java.minterface;

public class Tele implements Tele_phone  
{

	private int number;
	private boolean isRinging = true;
	
	public Tele(int number) {
		super();
		this.number = number;
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void call(int phonenumber) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hold() 
	{
		// TODO Auto-generated method stub
		if(isRinging)
		{
			System.out.println("answer to the call");
		}
		else
		{
			isRinging = false ;
		}
		
	}

	@Override
	public boolean dail(int phonenumber)
	{
		// TODO Auto-generated method stub
		if(phonenumber == number)
		{
			isRinging = true ;
			System.out.println("ring ring phone");
		}
		else
		{
			isRinging = false ;
			
		}
		
		return isRinging;
	}

	@Override
	public boolean isRinging() {
		// TODO Auto-generated method stub
		return isRinging;
	}
   
	
	}


