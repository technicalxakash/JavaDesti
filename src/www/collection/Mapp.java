package www.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Mapp {

	public static void main(String[] args) {
			Map<Integer, String> m=new HashMap<Integer, String>();

	        m.put(1, "akash");
	        m.put(2, "abhi");

	        
	        System.out.println(m);
	        
	        Map<Integer, String> m1=new HashMap<Integer, String>();
	        m1.put(3, "hitish");
	        m1.put(4, "sridhar");
	        m1.put(5, "ram");
	        
	        System.out.println(m1);
	        
	        //put all
	        
//	        m.putAll(m1);
//	        System.out.println("Put all "+m);
	        
	        //putifabsent=is used to add the object if the key is not present
	        
	        m.putIfAbsent(1, null);
	        System.out.println(m); //{1=akash, 2=abhi}
	        
	        //get==with the help of key getting value
	        
	        System.out.println(m.get(1));
	        System.out.println(m.get(4));
	        
	        //getorDefault=set the default value if the key is not present 
	        
	        System.out.println(m.getOrDefault(4, "KeyNotFound"));
	        
	        //keyset=return only keys
	        
	        System.out.println(m.keySet());
	        
	        //values=only return values
	        
	        System.out.println(m.values());
	        
	        //entryset=return both key value pair
	        System.out.println(m.entrySet());
	        
	        
	        //remove=pass key or pass both key and value pair not present return null values
//	        System.out.println(m.remove(1));
//	        System.out.println(m);
	        
	        
	        
	        //updating
	        //replace
//	        m.replace(1, "akashhh");
	        System.out.println("====="+m);
	        
	        m.replace(1, "akashhhh", "akashhh");
	        System.out.println(m);
	        
	        //=========================
	        
	        System.out.println(m1.containsKey(m1));
	        System.out.println(m1.containsValue(m1));
	        System.out.println(m1.);
	}

}
