
public class MyZooDriver 
{

	public static void main(String[] args) 
		{
			ZooAnimals [] AnimalTypes = new ZooAnimals[4];
				AnimalTypes[0] = new RiverOtter();
				AnimalTypes[1] = new Wolf();
				AnimalTypes[2] = new Turtle();
				AnimalTypes[3] = new Gecko();
				
			for(ZooAnimals za : AnimalTypes)
			{
				za.giveBirth();
				za.makeSound();
				za.eatFood();
				
				System.out.println();
			}

		}

}
