package com.java.minterface;

public class TeleMain 

{
	public static void main(String args[]) 
	{
		
	
		Tele_phone tele;
		tele = new Tele(12457);
		tele.call(12457);
		tele.hold();
		tele.isRinging();
		tele.dail(12457);
		
		tele = new Mobile(894566);
		tele.call(8965);
		tele.dail(894566);
		tele.hold();
		tele.powerOn();
		tele.isRinging();
		
		
		
	}

}
