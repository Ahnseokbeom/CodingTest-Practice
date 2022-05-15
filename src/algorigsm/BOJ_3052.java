package algorigsm;

import java.util.HashSet;
import java.util.Scanner;

public class BOJ_3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> hash = new HashSet<Integer>(); // 해쉬셋 초기화
		//해쉬셋은 같은 숫자가 들어오면 안됨.
		for(int i = 0;i<10;i++) {
			hash.add(sc.nextInt()%42);
		}
		sc.close();
		System.out.println(hash.size());
	}

}
