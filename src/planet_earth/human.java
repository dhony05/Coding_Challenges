package planet_earth;

public class human {

	String name;
	int age;
	int heighInInches;
	String eyeColor;



	

	public human(String name, int age, int heighInInches, String eyeColor)
	{
		super();
		this.name = name;
		this.age = age;
		this.heighInInches = heighInInches;
		this.eyeColor = eyeColor;
	}
	public void speak()
	{
		System.out.println("Hello my name is " + name);
		System.out.println("I am " + age + " years old");
		System.out.println("I am "+ heighInInches + " inches tall");
		System.out.println("My eye color is "+ eyeColor);
	}
	public void work()
	{
		System.out.println("is working......");
	}
	
	
	public void eat()
	{
		System.out.println("is eating .....");
	}
}