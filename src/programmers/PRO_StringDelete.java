package programmers;

public class PRO_StringDelete {
	public String solution(String my_string, String letter) {
        String answer = "";
        answer = my_string.replaceAll(letter,"");
        return answer;
    }
}