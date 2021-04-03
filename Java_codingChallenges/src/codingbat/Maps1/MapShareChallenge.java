package codingbat.Maps1;

public class MapShareChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * url: https://codingbat.com/prob/p148813
Modify and return the given map as follows: if the key "a" has a value,
 set the key "b" to have that same value. In all cases remove the key "c", leaving the rest of the map unchanged.


mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
	 * @param map
	 * @return
	 */
	
	public Map<String, String> mapShare(Map<String, String> map) {
		  //if(map.size() >1){
		  if((map.containsKey("a") && map.containsKey("b") && map.containsKey("c")) ||
		  (map.containsKey("a") && (!map.containsKey("b")) && map.containsKey("c")) &&
		  (!map.get("a").equals("")))
		  {
		      map.put("b",map.get("a"));
		      map.remove("c");
		      //return map;
		  }else if(((map.containsKey("a")) && (map.containsKey("b"))&& (!map.containsKey("c"))) 
		          &&(!map.get("a").equals(""))){
		      map.put("b",map.get("a"));
		      // return map;
		  }else if (
		    ((!map.containsKey("a")) && (map.containsKey("b")) && (map.containsKey("c")))||
		    ((!map.containsKey("a")) && (!map.containsKey("b")) && (map.containsKey("c")))
		    ){
		    map.remove("c");
		    
		  }
		  
		  // if((map.size() == 1) && (map.containsKey("c"))){
		    map.remove("c");
		  // }
		  
		  return map;
		  }



}
