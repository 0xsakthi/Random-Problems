import java.util.*;

public class hashmap {
	public static void main(String[] args){
		System.out.println("hello");
		
		HashMap<String,Integer> hm = new HashMap<>();
		
		hm.put("dosa",20);
		
		hm.put("vada",5);
		
		hm.put("coffee",20);
		
		System.out.println(hm.isEmpty()); //false
		
		System.out.println(hm.containsKey("dosa")); //true
		
		System.out.println(hm.size());//3
		
		System.out.println(hm.entrySet()); //[dosa=20, coffee=20, vada=5]
		
		System.out.println(hm.keySet()); //[dosa, coffee, vada]
		
		System.out.println(hm.values());//[20, 20, 5]
		
		Collection c = hm.values(); //stores the above values
		
		System.out.println(hm.get("vada")); //5 (value of dosa is 5)
		
		System.out.println(hm.remove("vada")); //it prints 5 and remove the vada

		HashMap<String,Integer> hm2 = new HashMap<>(); //create new hashmap

		hm2.putAll(hm); //copy the hm to -> hm2

		System.out.println(hm2.get("dosa"));
	}	
}
