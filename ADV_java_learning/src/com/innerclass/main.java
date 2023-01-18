package com.innerclass;

public class main
{
	public static void main(String args[])
	{
		Gearbox ferrari = new Gearbox(6);
//		Gearbox.Gear first = ferrari.new Gear(1,12.3);
		ferrari.addGear(1, 5.3);
		ferrari.addGear(2, 10.6);
		ferrari.addGear(3, 15.9);
		ferrari.operateClutch(true);
		ferrari.ChangeGear(1);
		ferrari.operateClutch(false);
		System.out.println(ferrari.wheelSpeed(1000));
		ferrari.ChangeGear(2);
		System.out.println(ferrari.wheelSpeed(3000));
		ferrari.operateClutch(true);
		ferrari.ChangeGear(3);
		ferrari.operateClutch(false);
		System.out.println(ferrari.wheelSpeed(6000));
		
	}

}
