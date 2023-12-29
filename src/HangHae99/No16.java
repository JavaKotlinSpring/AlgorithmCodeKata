package HangHae99;

public class No16 {
    public static void main(String[] args) {
        // 함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지나는 리스트를
        // 리턴해야 한다. 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
        // 주소 URL : https://school.programmers.co.kr/learn/courses/30/lessons/12954
    }

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;

        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }
        return answer;
    }

}
