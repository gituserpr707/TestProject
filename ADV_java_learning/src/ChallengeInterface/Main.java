package ChallengeInterface;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

	public static void main(String args[])
	{
		
		Player p=new Player("TIm", 10, 15);
		System.out.println(p.toString());
		saveObject(p);
		
		p.setHintPoints(45);
		System.out.println(p);
		p.setWeapon("STorm bringer");
		saveObject(p);
		loadObject(p);
		System.out.println(p);
		
		
		

		savable monsterobje =new monster("monster",12,23);
		System.out.println(("Strength = " + ((monster) monsterobje).getStrength()));
		System.out.println(monsterobje);
		saveObject(monsterobje); 
		loadObject(monsterobje);
		System.out.println(monsterobje.toString());
		
		
	}
	public static ArrayList<String> readvalue()
	{
		ArrayList<String> values=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		boolean quit = false;
		int index = 0;
		System.out .println("choose \n"+
		                    "1 to enter the string \n"+
				             "0 to quite");
		while(!quit)
			
		{
			System.out.println("choose an option:");
			int  choice =sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
			case 0: 
				quit = true;
				break;
			case 1:System.out.println("Enter the string: ");
			String stringInput  =sc.nextLine();
			values .add(index,stringInput);
			index++;
			
			break;
			}
		}
		return values;
		
	}
	 public static void saveObject(savable saveobject)
	 { 
		 System.out.println("saving under  progress");
		 for(int i=0;i<saveobject.write().size();i++)
		 {
			 System.out.println("saving "+saveobject.write().get(i)+" to storage devices");
		 }
			
	 }
	 public static void loadObject(savable saveobject )
	 { 
		 System.out.println("loading under process");
		 ArrayList<String> values=readvalue();
		 saveobject.read(values);
		  
	 
		
		
	}
}
