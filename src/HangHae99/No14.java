package HangHae99;

public class No14 {
    public static void main(String[] args) {
        // 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성하세요
        // 주소 URL : https://school.programmers.co.kr/learn/courses/30/lessons/12928
    }
    public static int solution(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if(n % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
