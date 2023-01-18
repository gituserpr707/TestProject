package inheritance;

public class Dog extends Inhertance
{
	private String food;
	private String place;
	

	public Dog(String name, int size, int weight) 
	{
		super(name,1,1, size, weight);
		this.food = food;
		this.place = place;
		
	}

	
	public void eat()
	{
	System.out.println("dog is eating food");
	super.eat();
	}
	public void walk()
	{
		System.out.println("The dog is moving now");
        move();
	}
}

