package HangHae99;

public class No15 {
    public static void main(String[] args) {
        // 자연수 n이 매개변수로 주어집니다. n을 x로 나눈 나머지가 1이 되도록 하는
        // 가장 작은 자연수 x를 return하도록 solution함수를 완성하세요.
        // 주소 URL : https://school.programmers.co.kr/learn/courses/30/lessons/87389
    }
    public int solution(int n) {
        int answer = 1;

        while(true) {
            if (n%answer==1) break;
            answer++;
        }
        return answer;
    }
}
