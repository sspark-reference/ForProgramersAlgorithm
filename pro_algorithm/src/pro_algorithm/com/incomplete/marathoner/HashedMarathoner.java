package pro_algorithm.com.incomplete.marathoner;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashedMarathoner {
	
	public static void main(String[] args) {
		int[] answer;
		int[] a = {11, 12, 3, 3, 0, 11, 1};

		Map<String, Integer> m = new HashMap<String, Integer>();
		
		
		for(int i = 0; i < a.length; i++) {
			if(i == 9) {
				m.put(a[i] + "", i);
			} else {
				if( m.get(a[i] + "") != null ) {
					// 중복된 숫자가 나왔으므로 아무런 동작하지않고 넘어간다.
				} else {
					m.put(a[i] + "", i);
				}
			}
		}
		
		int tmpCount = 0;
		answer = new int[m.size()];
		
//		Set<String> set = m.keySet();
//		for( String key : set) {
//			System.out.println("답은? " + key);
//		}
		
		Set<String> set = m.keySet();
		for( String key : set) {
			System.out.println("답은? " + key);
			answer[tmpCount] = Integer.parseInt(key);;
			tmpCount++;
		}
		
		for(int i = 0; i< answer.length; i++) {
			System.out.println(answer[i]);
		}
	}
}
