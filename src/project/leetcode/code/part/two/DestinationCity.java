package project.leetcode.code.part.two;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DestinationCity {

	public static void main(String[] args) {

		List<List<String>> paths = new ArrayList<>();

		List<String> obj1 = new ArrayList<>();
		obj1.add("London");
		obj1.add("New York");
		paths.add(obj1);

		List<String> obj2 = new ArrayList<>();
		obj2.add("New York");
		obj2.add("Lima");
		paths.add(obj2);

		List<String> obj3 = new ArrayList<>();
		obj3.add("Lima");
		obj3.add("Sao Paulo");
		paths.add(obj3);
		
		paths.get(0).get(0);

		Map<String, String> mapData = new HashMap<>();
		for (List<String> data : paths) {

			mapData.put(data.get(0), data.get(1));
		}

		System.out.println(mapData);
//		for (List<String> data : paths) {
//
//			
//		}
		System.out.println(findDestination(mapData, "London"));
	}

	public static String findDestination(Map<String, String> mapData, String city) {

		if (!mapData.containsKey(city)) {
			return city;
		}

		return findDestination(mapData, mapData.get(city));
	}

}
