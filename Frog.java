package InheritanceandSuper.abstraction;

public class Frog extends Animal implements Jump, Croak {
	
	Frog(){
		super();
	}
	
	public String poisonLevel;
	public String[] family;
	
	//Getters And Setters for fixed unique field
	public String getPoisonLevel() {
		return poisonLevel;
	}

	public void setPoisonLevel(String poisonLevel) {
		this.poisonLevel = poisonLevel;
	}

	public void printAnimal() {
		super.setName("Frog");
		System.out.println(super.getName());
	}
	
	//Getters And Setters for arbitrary field
	public void family(String... a) {
		
		int n = a.length;
		family = new String[n];		
		
		for(int i=0;i<n;i++) {
			family[i] = a[i];		
		}		
	}
	
	public String[] getFamily() {		
		return family;
	}	

	//Implementing Interface methods
	@Override
	public void printJump() {
		// TODO Auto-generated method stub
		System.out.println("Frogs are fond of jumping in water!!");
	}

	@Override
	public void printCroak() {
		// TODO Auto-generated method stub
		System.out.println("Frogs croak are unpleasant for ears!!");
	}	
}
