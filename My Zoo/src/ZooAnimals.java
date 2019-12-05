
public abstract class ZooAnimals 
{
	protected String type;
	protected String food;
	
	public abstract void giveBirth();
	public abstract void makeSound();
	public void eatFood()
	{
		System.out.println(type + " is looking forward to eating its next meal ;) which is " + food + ".");
	}
}
