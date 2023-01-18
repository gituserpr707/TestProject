package ChallengeInterface;

import java.util.ArrayList;
import java.util.List;

public class monster implements savable
{
	private String name;
	private int hitpoint;
	private int strength;
	public monster(String name, int hitpoint, int strength) {
		 
		this.name = name;
		this.hitpoint = hitpoint;
		this.strength = strength;
	}
	public String getName() { 
		return name;
	}
	public int getHitpoint() {
		return hitpoint;
	}
	public int getStrength() {
		return strength;
	}
	
	@Override
	public List<String> write() {
		ArrayList<String> value = new ArrayList<>();
		value.add(0,this.name);
		value.add(1,""+this.hitpoint);
		value.add(2,""+this.strength);
		return value;
	}
	@Override
	public void read(List<String> savedValues) {
		if(savedValues  != null &&  savedValues.size() > 0)
		{
			this.name = savedValues.get(0);
			this.hitpoint = Integer.parseInt(savedValues.get(1));
			this.strength = Integer.parseInt(savedValues.get(2));
			
		}
	
	}
	@Override
	public String toString() {
		return "monster [name=" + name + ", hitpoint=" + hitpoint + ", strength=" + strength + "]";
	} 

	
	
	
	

}
