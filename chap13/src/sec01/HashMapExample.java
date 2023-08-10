package sec01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);

		System.out.println("총 개수 : " + map.size());

		System.out.println("홍길동의 점수는 : " + map.get("홍길동"));

		Set<String> keySet = map.keySet(); // 키 값을 모두 가져옴

		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next(); // 변수지정, 반복해서 키 가져옴
			Integer value = map.get(key); // 변수지정, 반복해서 값 가져옴
			System.out.println(key + " : " + value);
		}

		map.remove("홍길동");
		// 홍길동 제거
		System.out.println("총 개수 : " + map.size());

		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " : " + value);
		}

	}

}
