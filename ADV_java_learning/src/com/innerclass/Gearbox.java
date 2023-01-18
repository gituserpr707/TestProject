package com.innerclass;

import java.util.ArrayList;

public class Gearbox 
{

	private ArrayList<Gear> gears;
	private int maxGear;
	private int currentGare = 0;
	private boolean clutchIsIn;
	
	public Gearbox(int maxGear)
	{
		this.maxGear= maxGear;
		this.gears = new ArrayList<>();
		Gear neutral = new Gear(0,0.0);
		this.gears.add(neutral);
	}
	
	public void operateClutch(boolean in)
	{
		this.clutchIsIn = in;
	}
	
	public void addGear(int number, double ratio)
	{
		if(number > 0 && (number < maxGear))
		{
			this.gears.add(new Gear(number,ratio));
		}
		
	}
	
	public void ChangeGear(int newGear)
	{
		if((newGear >=0) && (newGear <this.gears.size()) && this.clutchIsIn)
		{
			this.currentGare =  newGear;
			System.out.println("Gear "+ newGear +"selected");
		}
		else
		{
			System.out.println("Grind");
			this.currentGare = 0;
			
		}
	}
	
	public double wheelSpeed(int revs)
	{
		if(clutchIsIn) 
		{
			System.out.println("Screm!!!");
			return 0.0;
		}
		return revs * gears.get(currentGare).getRatio();
		
	}
	public class Gear
	{
		private int gearNumber;
		private double ratio;
		
		public Gear(int gearnumber, double ratio)
		{
			this.gearNumber = gearnumber;
			this.ratio = ratio;
			
		}
		public double getRatio() {
			return ratio;
		}
		public double driveSpeed(int revs)
		{
			return revs *(this.ratio);
		}
	}
}
