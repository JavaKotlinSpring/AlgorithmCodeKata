package HangHae99;

import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        // 정수 num1, num2가 매개변수 주어집니다. num1과 num2를 곱한 값을 return하도록 solution함수를 완성
        // 문제 URL : https://school.programmers.co.kr/learn/courses/30/lessons/120804
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = solution(num1, num2);
        System.out.println(result);
    }

    static int solution(int num1, int num2) {
        int answer = num1*num2;
        return answer;
    }
}
