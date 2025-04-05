package javaa.oops.com;

 class Dog {
	 private String name;
	 private String color;
	 private String breed;
	 private int cost;
	 private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	 
	 
	 
 }
public class Encapsulation {

	public static void main(String[] args) {
		
    Dog d1=new Dog();
    /*
    //error as the private members cannot be accessed
    d1.name="jimmy";
    d1.color="brown";
    d1.breed="golden ret";
    d1.cost=3000;
    d1.age=4;
    */
    
    d1.getName();
    d1.setColor("brown");
    d1.getColor();
    d1.setBreed("golden ret");
    d1.getBreed();
    d1.setAge(6);
    d1.getAge();
    d1.setCost(1110);
    d1.getCost();
    
    System.out.println("Dog's Name: " + d1.getName());
    System.out.println("Dog's Color: " + d1.getColor());
    System.out.println("Dog's Breed: " + d1.getBreed());
    System.out.println("Dog's Age: " + d1.getAge());
    System.out.println("Dog's Cost: Rs = " + d1.getCost());

    
    
	}

}
