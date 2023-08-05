package basicloops;


//import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionsPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Arrrylist
		ArrayList<String> al = new ArrayList<String>();
		al.add("Collections");
		al.add("ArrayList");
		al.add("List");
		al.add("ArrayList");
		al.add("");
		al.add("LinkedList");
		al.add("");
		al.add("Vector");
		System.out.println(al + " :array length is::" + al.size());
		// How to convert the arraylist of strings into the array ?
		for (String Aaarylist : al) {
			System.out.println("Aaaray list values are:" + Aaarylist);
		}
		////Vector
		LinkedList<String> llist = new LinkedList<String>();
		llist.add("Collections");
		llist.add("ArrayList");
		llist.add("List");
		llist.add("ArrayList");
		llist.add("");
		llist.add("LinkedList");
		llist.add("");
		llist.add("Vector");
		System.out.println(al + " :linkedlist length is::" + llist.size());
		for (String Limkedlist : llist) {
			System.out.println("Aaaray list values are:" + Limkedlist);
		}

		
		//Vector
		Vector<String> vector = new Vector<String>();
		
		  vector.add("Collections"); 
		  vector.add("ArrayList");
		  vector.add("List");
		  vector.add("ArrayList"); 
		  vector.add(""); 
		  vector.add("LinkedList");
		  vector.add("");
		 
		vector.add("Vector");

		for (String vname : vector) {
			System.out.println("Vector values are:" + vname);
		}

		//LinkedHashMap
		
		
		  LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		  lhm.put(12, "Map");
		  lhm.put(5,"abc");
		  lhm.put(2, "LinkedHashMap"); 
		  lhm.put(7, "SortedMap");
		  lhm.put(49, "TreeMap");
		  lhm.put(3, "HashMap");
		  lhm.put(5, "abc");
		  lhm.put(null, null);
		  lhm.put(24, null); 
		  for (Integer lhmapKey : lhm.keySet())
		  { System.out.println("key: " + lhmapKey + " value: " + lhm.get(lhmapKey)); }
		 
		 
		//HashMap
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(12, "Map");
		hmap.put(5, "abc");
		hmap.put(2, "LinkedHashMap");
		hmap.put(7, "SortedMap");
		hmap.put(49, "TreeMap");
		hmap.put(3, "Hashmap");
		hmap.put(5, "abc");
		
		hmap.put(null, null);
		hmap.put(24, null);
		
		
		for (Integer hmapKey : hmap.keySet()) {
			System.out.println("key: " + hmapKey + " value: " + hmap.get(hmapKey));
		}
			//tREEmAP
		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
		tmap.put(12, "Map");
		tmap.put(5, "abc");
		tmap.put(2, "LinkedHashMap");
		tmap.put(7, "SortedMap");
		tmap.put(49, "TreeMap");
		tmap.put(3, "Hashmap");
		tmap.put(5, "abc");
		tmap.put(null, null);
		tmap.put(24, null);
		for (Integer Treekey : tmap.keySet()) {
			System.out.println("key: " + Treekey + " value: " + tmap.get(Treekey));
		}
		
		
      //Mashsey
		HashSet<String> fruitsStore = new HashSet<String>();

		fruitsStore.add("Mango");
		fruitsStore.add("Orange");
		fruitsStore.add("Banana");
		fruitsStore.add("Apple");
		fruitsStore.add("Guava");
		fruitsStore.add("Grape");

		Iterator<String> itrSet = fruitsStore.iterator();
		while (itrSet.hasNext()) {
			System.out.println("HashSet values:" + itrSet.next());
		}

		
		//LinkedHashSet
		LinkedHashSet<String> fruitMarket = new LinkedHashSet<String>();

		fruitMarket.add("Mango");
		fruitMarket.add("Orange");
		fruitMarket.add("Banana");
		fruitMarket.add("Apple");
		fruitMarket.add("Guava");
		fruitMarket.add("Grape");
		for (String fruit : fruitMarket) {
			System.out.println("LinkedHashSet values:" + fruit);
		}

		//Tressset
		TreeSet<String> fruitBuzz = new TreeSet<String>();
		fruitBuzz.add("Mango");
		fruitBuzz.add("Orange");
		fruitBuzz.add("Banana");
		fruitBuzz.add("Apple");
		fruitBuzz.add("Guava");
		fruitBuzz.add("Grape");
		
		for( String fruitTset : fruitBuzz)	{
			System.out.println("Tressset Values " + fruitTset);
			}
		
		//Hashtable
		Hashtable<String, Integer> numbers = new Hashtable<String, Integer> ();
		numbers.put("one", 1);
		numbers.put("two", 2);
		numbers.put("two", 3);
		numbers.put("three", 3);
		
		for( String numversset : numbers.keySet())	{
			System.out.println("number hashtable" +numversset+ "values" + numbers.get(numversset));
			}
		}
}
		
	


		

	
		
	


