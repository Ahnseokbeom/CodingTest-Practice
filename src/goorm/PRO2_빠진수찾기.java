package goorm;

public class PRO2_빠진수찾기 {
	static long answer;
	public static void main(String[] args) {
		System.out.println(solution(6, 18));
	}
	public static long solution(long a, long b) {
		answer = 0;
		for(int i = 1;i<=a;i++) answer+=i;
		return answer-b;
	}
}
