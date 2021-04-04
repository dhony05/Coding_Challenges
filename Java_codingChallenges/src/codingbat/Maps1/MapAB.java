package codingbat.Maps1;

import java.util.Map;

public class MapAB {
	
	
	/**
	 * url:https://codingbat.com/prob/p107259
	 * 
Modify and return the given map as follows: 
for this problem the map may or may not contain the "a" and "b" keys.
 If both keys are present, append their 2 string values together and store the result under the key "ab".


mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
mapAB({"a": "Hi"}) → {"a": "Hi"}
mapAB({"b": "There"}) → {"b": "There"}
	 * @param map
	 * @return
	 */
	
	public Map<String, String> mapAB(Map<String, String> map) {
		  if(map.containsKey("a")&& map.containsKey("b")){
		    String ab = map.get("a").concat(map.get("b"));
		    map.put("ab",ab);
		  }
		  return map;
		}


}
