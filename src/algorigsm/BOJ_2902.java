package algorigsm;

import java.util.Scanner;

public class BOJ_2902 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer = "";
		String s = sc.next();
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				answer+=s.charAt(i);
			}
		}
		System.out.println(answer);
		sc.close();
	}

}
