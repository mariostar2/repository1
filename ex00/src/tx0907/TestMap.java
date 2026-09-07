package tx0907;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();

		map.put(1, "aaa");
		map.put(2, "bbb");
		map.put(2, "ccc");

		System.out.println(map.size());

		// get을 쓰면 키에 대입된 값을 출력
		// 없으면 null
		String value = map.get(3);
		System.out.println(value);

		// boolean type 반환
		System.out.println(map.containsKey(1));
		System.out.println(map.containsValue("bbb"));
		// 동일한 키값은 수정됨
		map.put(2, "xxx");
		value = map.get(2);
		System.out.println(value);

		// false = 삭제 ,true 미삭제
		// key,value가 다지워짐
		map.remove(1, "aaa");
		System.out.println(map.containsKey(1));

		map.clear();
		System.out.println(map.size());
		System.out.println(map.isEmpty());

		map.put(1, "aaaa");
		map.put(2, "bbbb");
		map.put(3, "cccc");

		// 키집합
		for (Integer key : map.keySet()) {
			System.out.println(key);
		}

		for (Integer key : map.keySet()) {
			System.out.println(map.get(key));

		}
		for (String s : map.values()) {
			System.out.println(s);
		}

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+ "," + entry.getValue());
		}
	}
}
