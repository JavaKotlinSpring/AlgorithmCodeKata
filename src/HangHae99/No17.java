package HangHae99;

public class No17 {
    public static void main(String[] args) {
        // 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
        // 주소URL : https://school.programmers.co.kr/learn/courses/30/lessons/12932?language=java
    }
}

class solution {
    public int[] solution(long n) {
        int length = Long.toString(n).length();
        int[] answer = new int[length];

        for (int i = 0; i < length; i++) {
            answer[i] = (int) (n % 10);
            n /= 10;
        }
        return answer;
    }

}
