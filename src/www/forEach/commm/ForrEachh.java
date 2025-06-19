package www.forEach.commm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

//forEach Method
public class ForrEachh {

	public static void main(String[] args) {
	
    List<Integer> list=Arrays.asList(1,2,233,4,5,4,211);
    System.out.println(list);
		

//traditionl for loop
    
//    for(int i=0;i<list.size();i++) {
//    	System.out.println(list.get(i));
//    }
//	}

    
  //forEach loop 
//	for(int a : list) {
//		System.out.println(a);
    
    //forEach Method
    
   
//Consumer<Integer> con=new Consumer<Integer>() {
//	
//	@Override
//	public void accept(Integer t) {
//		// TODO Auto-generated method stub
//		System.out.println(t);
//	}
//};
// list.forEach(con);
    
    //list.forEach(i-> System.out.println(i));

    
    Map<Integer, String> students=new HashMap<>();
    students.put(1, "akash");
    students.put(2, "sai");
    students.put(3, "vinod");
    
    //System.out.println(students);
    
    students.forEach((i,j)->System.out.println(i+">>>"+j));
	}
}

//1>>>akash
//2>>>sai
//3>>>vinod
