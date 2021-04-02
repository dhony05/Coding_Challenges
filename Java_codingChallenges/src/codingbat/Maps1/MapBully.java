package codingbat.Maps1;

import java.util.Map;

public class MapBully {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * 
	 * url:https://codingbat.com/prob/p197888
	 * 
Modify and return the given map as follows: if the key "a" has a value, 
set the key "b" to have that value, and set the key "a" to have the value "".
 Basically "b" is a bully, taking the value and replacing it with the empty string.


mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
	 * @param map
	 * @return
	 */
	public static  Map<String, String> mapBully(Map<String, String> map) {
		 
	    if(map.containsKey("a")){
	      if (map.get("a").equals("")){
	        return map;
	      }
	      else if (!map.get("a").equals("") ){
	      
	        map.put("b",map.get("a"));
	        map.put("a","");
	        return map;
	    }
	    
	  }
	  return map;
	}


}
