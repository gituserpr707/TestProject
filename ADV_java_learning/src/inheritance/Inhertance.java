package inheritance;

public class Inhertance
{
	private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;
	public Inhertance(String name, int brain, int body, int size, int weight) {
		super();
		this.name = name;
		this.brain = brain;
		this.body = body;
		this.size = size;
		this.weight = weight;
	}
	public void eat()
	{
		System.out.println(this.brain+ "The animal is eating");
	}
	public void move()
	{
		System.out.println("the animal is moving now");
		
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBrain() {
		return brain;
	}
	public void setBrain(int brain) {
		this.brain = brain;
	}
	public int getBody() {
		return body;
	}
	public void setBody(int body) {
		this.body = body;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
    
	
    

}
