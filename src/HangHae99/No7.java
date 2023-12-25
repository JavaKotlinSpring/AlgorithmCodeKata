package HangHae99;

import java.util.Scanner;

public class No7 {
    public static void main(String[] args) {
        // 정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1000을 곱한 후 정수
        // 부분을 return하고록 solution함수를 완성하시오.
        // 문제 URL : https://school.programmers.co.kr/learn/courses/30/lessons/120806
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(solution(num1, num2));
    }
    static int solution(int num1, int num2) {
        double answer = (double)num1 / (double)num2 * 1000;
        return (int)answer;
    }
}
