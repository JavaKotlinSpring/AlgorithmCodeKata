package HangHae99;

import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        // 정수 num1, num2가 매개변수로 주어질 때, num1을 num2로 나눈 몫을 return하도록
        // solution함수를 완성
        // 문제 URL : https://school.programmers.co.kr/learn/courses/30/lessons/120805
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = solution(num1, num2);
        System.out.println(result);
    }

    static int solution(int num1, int num2) {
        int answer = num1/num2;
        return answer;
    }
}
