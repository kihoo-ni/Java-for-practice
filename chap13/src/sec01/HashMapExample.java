package sec01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("�ſ��", 85);
		map.put("ȫ�浿", 90);
		map.put("���屺", 80);
		map.put("ȫ�浿", 95);

		System.out.println("�� ���� : " + map.size());

		System.out.println("ȫ�浿�� ������ : " + map.get("ȫ�浿"));

		Set<String> keySet = map.keySet(); // Ű ���� ��� ������

		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next(); // ��������, �ݺ��ؼ� Ű ������
			Integer value = map.get(key); // ��������, �ݺ��ؼ� �� ������
			System.out.println(key + " : " + value);
		}

		map.remove("ȫ�浿");
		// ȫ�浿 ����
		System.out.println("�� ���� : " + map.size());

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
