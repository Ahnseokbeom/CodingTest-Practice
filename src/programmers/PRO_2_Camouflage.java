package programmers;

import java.util.HashMap;

public class PRO_2_Camouflage {
	public static int solution(String[][] clothes) {
		int answer = 1;
		HashMap<String, Integer> map = new HashMap<>();

		for(int i = 0;i<clothes.length;i++) {
			String s = clothes[i][1];
			map.put(s, map.getOrDefault(s,1)+1);
		}
		for(String key : map.keySet()) answer *=map.get(key);
		return answer;
	}

}
