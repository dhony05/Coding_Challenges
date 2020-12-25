package random_challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class IPaddressChallenge1 {

	
	/**
	 * Challenge: Having Common Log Format you have a arrays of logs that start with IP address followed by empty space and more info like the time and date. 
	 * Creates a method that return the IP address that was logged the most.
	 * @param args
	 */
	public static void main(String[] args) {
		
		String[] logs = 
			{
					"10.0.0.1 - frank [10/Dec/2000:12:34:56 - 0500] \"GET /a.gif HTTP/1.0\" 200 234",
					"10.0.0.3 - frank [10/Dec/2000:12:34:56 - 0500] \"GET /a.gif HTTP/1.0\" 200 234",
					"10.0.10.1 - frank [10/Dec/2000:12:34:56 - 0500] \"GET /a.gif HTTP/1.0\" 200 234",
					"10.0.2.1 - frank [10/Dec/2000:12:34:56 - 0500] \"GET /a.gif HTTP/1.0\" 200 234",
					"10.0.0.3 - frank [10/Dec/2000:12:34:56 - 0500] \"GET /a.gif HTTP/1.0\" 200 234",
					"10.10.9.1 - frank [10/Dec/2000:12:34:56 - 0500] \"GET /a.gif HTTP/1.0\" 200 234",
					"10.0.10.1 - frank [10/Dec/2000:12:34:56 - 0500] \"GET /a.gif HTTP/1.0\" 200 234",
					"10.0.9.6 - frank [10/Dec/2000:12:34:56 - 0500] \"GET /a.gif HTTP/1.0\" 200 234",
					"10.10.10.1 - frank [10/Dec/2000:12:34:56 - 0500] \"GET /a.gif HTTP/1.0\" 200 234",
					"10.0.8.1 - frank [10/Dec/2000:12:34:56 - 0500] \"GET /a.gif HTTP/1.0\" 200 234",
					"10.0.0.3 - frank [10/Dec/2000:12:34:56 - 0500] \"GET /a.gif HTTP/1.0\" 200 234",
					"10.0.9.4 - frank [10/Dec/2000:12:34:56 - 0500] \"GET /a.gif HTTP/1.0\" 200 234",
					"10.0.10.10 - frank [10/Dec/2000:12:34:56 - 0500] \"GET /a.gif HTTP/1.0\" 200 234",
									
			};
		
		getMostLoggedIp(logs);
	}
	
	public static String getIP(String log) {
		int limit = 0;
		
		while (log.charAt(limit)!= ' ')
		{
			limit++;		
		}
		System.out.println(log.substring(0,limit));
		return log.substring(0,limit);
	}
	
	public static String getMostLoggedIp(String[] logs) {
		int times = 0;
		Map<String, Integer> map = new HashMap<String,Integer>();
		ArrayList<String> ips = new ArrayList<>();
		for (String log : logs) {
			ips.add(getIP(log));
		}
		
		for(String ip: ips) {
			if(!map.containsKey(ip)) {
				times = 1;
			map.put(ip, times);
			
			}else {
				times = map.get(ip);
				times++;
				map.put(ip, times);
				
			}
						
		}
		System.out.println(map);
		
		int max  = Integer.MIN_VALUE;
		String ip = "";
		for(String key: map.keySet()) {
			if(map.get(key) > max) {
				max = map.get(key);
				ip = key;
			}
			
		}
		
		System.out.println("Most logged ip: "+ ip);
		return ip;
	}
	

}
