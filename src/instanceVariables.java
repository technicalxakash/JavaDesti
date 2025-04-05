import java.util.Scanner;

public class instanceVariables {
//instances variables
	String name;
	String color;
	String breed;
	int age;
	int cost;
	 void alloacateData() {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the name of the dog : ");
		 name = sc.nextLine();
		 System.out.println("enter the color of the dog : ");
		 color =sc.nextLine();
		 System.out.println("enter the breed of the dog : ");
		 breed =sc.nextLine();
		 System.out.println("enter the age of the dog : ");
		 age =sc.nextInt();
		 System.out.println("enter the cost of the dog : ");
		 cost =sc.nextInt();
	 }
		 
		 void display(){
			 System.out.println(name);
			 System.out.println(color);
			 System.out.println(breed);
			 System.out.println(age);
			 System.out.println(cost);
			 
		 }
		 	 
	public static void main(String[] args) {
		instanceVariables dog=new instanceVariables();
		dog.alloacateData();
		dog.display();

	}

}
