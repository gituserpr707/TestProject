package ChallengeInterface;

import java.util.ArrayList;
import java.util.List;

public class Player implements savable
{
	
	
	private String name;
	private int hintPoints;
	private int strength;
	private String weapon;
	

	public Player(String name, int hintPoints, int strength) {
		super();
		this.name = name;
		this.hintPoints = hintPoints;
		this.strength = strength;
		weapon ="sword";
	}
	 

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getHintPoints() {
		return hintPoints;
	}


	public void setHintPoints(int hintPoints) {
		this.hintPoints = hintPoints;
	}


	public int getStrength() {
		return strength;
	}


	public void setStrength(int strength) {
		this.strength = strength;
	}
	


	public String getWeapon() {
		return weapon;
	}


	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}


	
	@Override
	public String toString() {
		return "Player [name=" + name + ", hintPoints=" + hintPoints + ", strength=" + strength + ", weapon=" + weapon
				+ "]";
	}

 
	@Override
	public List<String> write() 
	{
		
		List<String> values = new ArrayList<>();
		values.add(0, this.name);
		values.add(1, ""+this.hintPoints);
		values.add(2, ""+this.strength);
		values.add(3,""+ this.weapon);
		
		return values;
	}

	@Override
	public void read(List<String> savedValues) {
		if(savedValues != null && savedValues.size() > 0 )
		{
			this.name = savedValues.get(0);
			this.hintPoints=Integer.parseInt(savedValues.get(1));
			this.strength = Integer.parseInt(savedValues.get(2));
			this.weapon=savedValues.get(3);
			
		}
	}

}
