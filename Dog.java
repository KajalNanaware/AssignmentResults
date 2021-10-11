package InheritanceandSuper.abstraction;

public class Dog extends Animal implements Jump, Bark {
	
	Dog(){
		super();
	}
	
	public String furColor;
	public String[] dogBreeds;

	//Getters And Setters for fixed unique field
	public String getFurColor() {
		return furColor;
	}

	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}
	
	public void printAnimal() {
		super.setName("Dog");
		System.out.println(super.getName());
	}
	
	//Getters And Setters for arbitrary field
	public void dogBreeds(String... a) {
		
		int n = a.length;
		dogBreeds = new String[n];		
		
		for(int i=0;i<n;i++) {
			dogBreeds[i] = a[i];		
		}		
	}
	
	public String[] getdogBreeds() {		
		return dogBreeds;
	}
	
	
	//Implementing Interface methods
	
	@Override
	public void printBark() {
		// TODO Auto-generated method stub
		System.out.println("Dogs do bark.. always!!");
	}

	@Override
	public void printJump() {
		// TODO Auto-generated method stub
		System.out.println("Dogs just keep jumping always!!");
	}	
}
