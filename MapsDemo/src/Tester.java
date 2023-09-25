import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Tester {

	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<>();
		map.put(100, "K");
		map.put(101, "Ka");
		map.put(102, "Kahs");
		map.put(103, "Kahsi");

		System.out.println(map);

		Set<Integer> keys = map.keySet();

		System.out.println(keys);

		for(Integer k: keys) {
			System.out.println(map.get(k));
		}
	}

}
