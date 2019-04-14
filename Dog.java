
public class Dog {
	
	String name;
	String breed;
	int age;
	double weight;
	String newName;
	
	public Dog (String name, String breed) {
		// constructor
		weight = 125.0;
		age = 0;
	}
	
	/**
	 * methods
	 * @return
	 */
	public String getBreed() {
		return breed;
	}
	
	public String getName() {
		return name;
	}
    
	public int getAge() {
		return age;
	}
	
	public double getWeight() {
		return weight;
	}
	
	
	public void eat() {
		// this method increases the weight of the dog by 0.1g
		weight = Math.round(weight + 0.1);
	}
	
	public void rename(String newName) {
		/*
		 *  this method changes the name of the dog to the new name 
		 *  that is supplied as an argument
		 */
		name = newName;
	}
	
	public void hasBirthday() {
		/*
		 * print out happy birthday
		 * increment age of the dog by 1
		 */
		System.out.println("Happy birthday");
		age = age + 1;
	}
	
	public static void main(String[] args) {
		
		//execute code
		
		Dog myDog = new Dog("doggy","brown");
		myDog.newName = "Brownie";
		
	}
}
