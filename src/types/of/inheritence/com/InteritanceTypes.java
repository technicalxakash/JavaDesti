package types.of.inheritence.com;

class Animal{
	void eat() {
		System.out.println("it needs requires food");
	}
	void sleep() {
		System.out.println("it should sleep");
	}
	
	void breath() {
		System.out.println("it should breath");
	}
	}

class Elephant extends Animal{
	
	@Override
	void eat() {
		System.out.println("elephants eat veg items");
	} 
	void big() {
		System.out.println("elephants are big in size");
	}
	void trunk() {
		System.out.println("elephants as trunk");
	}
}

class Tiger extends Animal{
	
	@Override
	void eat() {
		System.out.println("Tiger eat non-veg items");
	} 
	void size() {
		System.out.println("Tiger medium in size");
	}
	void fast() {
		System.out.println("Tiger is fast in running");
	}
}

class Dog extends Animal{
	
	@Override
	void eat() {
		System.out.println("Dog eat veg and non-veg items");
	} 
	void smells() {
		System.out.println("Dog can smells very high range");
	}
	void niyath() {
		System.out.println("Dog are too niyath");
	}
}
public class InteritanceTypes {

	public static void main(String[] args) {
	  
      Elephant el=new Elephant();
      Tiger ti=new Tiger();
      Dog dg=new Dog();
      
      
      el.big();
      el.trunk();
      el.eat();
      System.out.println("==================================");
      ti.eat();
      ti.fast();
      ti.size();
      System.out.println("==================================");
      dg.eat();
      dg.smells();
      dg.niyath();
      System.out.println("==================================");
	}

}
