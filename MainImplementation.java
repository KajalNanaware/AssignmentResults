package InheritanceandSuper.abstraction;

public class MainImplementation {

	public static void main(String[] args) {
		
		//Implementation Demo for Dog
		Dog d = new Dog();
		System.out.print("Creating Animal:");
		d.printAnimal();
		
		System.out.println("..Variable demo..");
		d.setFurColor("White");
		System.out.println("Fur color:" + d.getFurColor());
		
		d.dogBreeds("Husky", "PitBull","Pug");
		String[] breeds = d.getdogBreeds();
		System.out.print("Dog Breeds:");
		for(int i=0;i<breeds.length;i++)
		System.out.print(" " +breeds[i]);
		
		System.out.println();
		System.out.println("..Method demo..");
		d.printJump();
		d.printBark();
		
		System.out.println("--------------------------------------------------------");
		
		//Implementation Demo for Frog
		Frog f = new Frog();
		System.out.print("Creating Animal:");
		f.printAnimal();
		
		System.out.println("..Variable demo..");
		f.setPoisonLevel("High");
		System.out.println("Poison level:" + f.getPoisonLevel());
		
		f.family("Ceratophrys", "True Toad","Glass Frog");
		String[] family = f.getFamily();
		System.out.print("Frog Family:");
		for(int i=0;i<family.length;i++)
		System.out.print(" " +family[i]);
		
		System.out.println();
		System.out.println("..Method demo..");
		f.printJump();
		f.printCroak();

	}

}
