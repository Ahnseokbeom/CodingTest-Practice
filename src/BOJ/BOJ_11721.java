package BOJ;

import java.util.Scanner;

public class BOJ_11721 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next(); // ���ڿ� �Է�
		sc.close();
		
		for(int i = 0;i<str.length();i++) { // ���ڿ����̸�ŭ �ݺ�
			System.out.print(str.charAt(i)); // ���� ���
			if(i%10==9)System.out.println();// ���� 10���� ��� ���� �������� �̵�
		}
	}

}