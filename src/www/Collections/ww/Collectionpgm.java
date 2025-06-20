package www.Collections.ww;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collectionpgm {

	public static void main(String[] args) {
		List<Integer> a=new ArrayList<Integer>();
		a.add(100);
		a.add(200);
		System.out.println(a);
		Collections.addAll(a,30,340,40,56,56);
		System.out.println("the arraylist of element are "+a);
		System.out.println("the maximum element in the a is "+Collections.max(a));
		System.out.println("the minium element in the a is "+Collections.min(a));
		Collections.sort(a);
		System.out.println("The sorted element in asceding order is "+a);
		Collections.sort(a,Collections.reverseOrder());
		System.out.println("The descending  element is "+a);
		Collections.reverse(a);
		System.out.println("the reversed order "+a);
		
		System.out.println("the index is searched based on element or obj "+Collections.binarySearch(a, 40));
		
        System.out.println("count the element "+Collections.frequency(a,56));
        
        Collections.swap(a, 1, 5);
        System.out.println("Swapping the element are "+a);
        
        a.remove(3);        
        System.out.println("removing 0f element by index "+a);
        
       Collections.rotate(a, -2);
       System.out.println("rotating the a "+a); //- =>left henda rigth ge rotate agtaidhe ,+ andre left hemda rigth ge
       
       
       Collections.shuffle(a);
       System.out.println("The shuffle elements is"+a);
       
       
		List<Integer> a1=new ArrayList<Integer>();
		a1.add(1000);
		a1.add(200);
	
		Collections.addAll(a1,300);
		System.out.println(a1);
      System.out.println("the dijoint is "+Collections.disjoint(a, a1));//two group na compare madi element same idre true kodute hella false kodute
      
      Collections.fill(a, 100);
      System.out.println("fill all the elements by 100 in a "+a);
      
      System.out.println(a);
      System.out.println(a1);
      Collections.copy(a,a1);
      System.out.println(a);
      
     
	}

}
