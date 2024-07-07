
import java.util.LinkedHashMap;
public class LinkedHashMapExample {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map=new LinkedHashMap<Integer, String>();
		map.put(null,"Z");
		map.put(3,"C");
		map.put(4,"D");
		map.put(1,"A");
		map.put(2,"B");
		System.out.println(map);
	}
}