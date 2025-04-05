import java.util.Arrays;
public class StringMethods {

	public static void main(String[] args) {
		/*
//literal based representations =equals
				String s1="akash";
				String s2="akash";
				if(s1.equals(s2)) {
					System.out.println("s1 equals to s2");
				}
				else {
					System.out.println("s1 is not equals s2");
				}
				if(s1==s2) {
					System.out.
					println("address is equals");	
				}
				else {
					System.out.println("address are not equals");	
				}
		 //output=s1 equals to s2
				// address is equals

//object based representation =equals
				String s1=new String("Akash");
				String s2=new String("Akash");
				if(s1.equals(s2)) {
					System.out.println("s1 equals to s2");
				}
				else {
					System.out.println("s1 is not equals s2 ");
				}
				if(s1==s2) {
					System.out.println("address is equals");	
				}
				else {
					System.out.println("address are not equals");	
				}
          output=s1 equals to s2
        		  address are not equals


//literal based representations =equalsIgnoreCase
		String s1="akash";
		String s2="AKASH";
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("s1 equals to s2");
		}
		else {
			System.out.println("s1 is not equals s2");
		}
		if(s1==s2) {
			System.out.
			println("address is equals");	
		}
		else {
			System.out.println("address are not equals");	
		}

		output=s1 equals to s2
				address are not equals


//object based representation =equalsIgnoreCase
		String s1=new String("Akash");
		String s2=new String("akash");
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("s1 equals to s2");
		}
		else {
			System.out.println("s1 is not equals s2 ");
		}
		if(s1==s2) {
			System.out.println("address is equals");	
		}
		else {
			System.out.println("address are not equals");	
		}
		output=s1 equals to s2
				address are not equals
				 
		
//compareTo
		String s1=new String("Akash");
		String s2=new String("Akash");
		if(s1.compareTo(s2)==0) {
			System.out.println("it is a same");
		}
		else {
			System.out.println("it is not same");
		}
		
//	.compareToIgnoreCase
		String s1=new String("Akash");
		String s2=new String("akash");
		if(s1.compareToIgnoreCase(s2)==0) {
			System.out.println("it is a same");
		}
		else {
			System.out.println("it is not same");
			
		}
		
		
//compareTo with memory difference
				String s1=new String("Akash");
				String s2=new String("akash");
				if(s1.compareTo(s2)==0) {
					System.out.println("it is a same");
				}
				else {
					System.out.println("it is not same");
				}
		
		System.out.println(s1.compareTo(s2));
		output=it is notsame
                -32
		
//compareToIgnoreCase with memory difference
		String s1=new String("Akash");
		String s2=new String("akash");
		if(s1.compareToIgnoreCase(s2)==0) {
			System.out.println("it is a same");
		}
		else {
			System.out.println("it is not same");
			
		}
		System.out.println(s1.compareTo(s2));
		output=it is a same
                -32

		
		
		
//charAt
		    String s1 = "akashAkashAKash";
	       System.out.println(s1.charAt(9)); //output = h
	       System.out.println(s1.charAt(90)); //output =Index 90 out of bounds for length 15
				int i=s1.charAt(9);
				System.out.println(i);
				
System.out.println("=======================================");
				
//indexOf
          String s1 ="SachinRameshGandhi";
          System.out.println(s1.indexOf("a"));//1
          System.out.println(s1.indexOf("Ramesh"));//6
          System.out.println("=======================================");
          
		
//contains
		String s1 ="SachinRameshGandhi";
		System.out.println(s1.contains("Ramesh"));//true
		System.out.println(s1.contains("Uamesh"));//false
		System.out.println(s1.contains("RAM"));//false
		System.out.println("=======================================");

//endsWith
		String s1 ="SachinRameshGandhi";
		boolean res=s1.endsWith("Gandhi");//true
		System.out.println(res);      
		System.out.println(s1.endsWith("Hi"));//false
		System.out.println(s1.endsWith("i"));//true

//hashCode
		String s1 ="SachinRameshGandhi";
		System.out.println(s1.hashCode()); //output=returns a hash value of an objects,850348197
	
//getClass
		String s1 ="SachinRameshGandhi";
		System.out.println(s1.getClass());
		//output=class java.lang.String
		
//lastIndexOf		
		String s1 ="SachinRameshGandhi";
		 System.out.println(s1.lastIndexOf("a"));//13
        System.out.println("=======================================");
       
       
//isBlank
		String s1="";
		String s2="     ";
		System.out.println(s1.isBlank());  //output=true				                              	
		System.out.println(s2.isBlank());     //true
		System.out.println("=======================================");
		

//isEmpty
		String s1="";
		String s2="     ";
		System.out.println(s1.isEmpty());// true
		System.out.println(s2.isEmpty());//false
		System.out.println("=======================================");
		
		
//length	
String s1 ="SachinRameshGandhi";
System.out.println(s1.length()); //18
System.out.println("=======================================");


//replace		
String s1 ="SachinRameshGandhi";
System.out.println(s1.replace("Sachin","akash"));

		
	
//startsWith
		String s1 ="SachinRameshGandhi";
		System.out.println();



		
		
		
//strip
		String s1 ="   Sachin   Ramesh   Gandhi   ";
		System.out.println(s1.strip());
		
		
//stripTrailing
		String s1 ="   Sachin   Ramesh   Gandhi   ";
		System.out.println(s1.stripTrailing());
//stripTrailing
		
		System.out.println(s1.stripLeading());
		
		
			
		
//substring
		String s1 ="Sachin Ramesh Gandhi";
		System.out.println(s1.substring(5)); //n Ramesh Gandhi
		System.out.println(s1.substring(3,9));//hin Ra
		
		
//to char array
		String s1 ="Sachin Ramesh Gandhi";
		char[] ch=s1.toCharArray();
		System.out.println(Arrays.toString(ch));
		//output=[S, a, c, h, i, n,  , R, a, m, e, s, h,  , G, a, n, d, h, i]

		
//toLowerCase and  toUpperCase
		String s1 ="Sachin Ramesh Gandhi";
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
//trim
		String s1 ="   Sachin   Ramesh   Gandhi   ";
		System.out.println(s1.trim());
		*/
//
		
//split methods		
		String str="Hello How are you dude!";
		System.out.println(Arrays.toString(str.split(" ")));
		
		String st1r="Hello H$ow are y$ou dud$e!";
		System.out.println(Arrays.toString(st1r.split("\\$")));
		
		//output =[Hello, How, are, you, dude!]
		//[Hello H, ow are y, ou dud, e!]
}
}	
	
