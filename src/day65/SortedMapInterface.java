package day65;
import java.util.*;

public class SortedMapInterface {

	public static void main(String[] args) {
		/**
		 *  * 
		 *  		Map
		 *   			General Implementation	-- HashMap
		 *  	
		 *    		SortedMap     extends Map interface
		 *  	  NavigatableMap  extends SortedMap interface	
		 * 			 TreeMap      implements NavigatableMap
		 * 
		 * 
		 * methods  : 
		 * 
		 *  SortedMap<K,V> subMap(K fromKey, K toKey);
		 *  SortedMap<K,V> headMap(K toKey);
		 *  SortedMap<K,V> tailMap(K fromKey);
		 *  K firstKey();
		 *  K lastKey();
		 *  
		 */
		
		SortedMap<Integer,String> studentMap = new TreeMap<>(); 
		
		
	}

}
