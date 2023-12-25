package HangHae99;

import java.util.Scanner;

public class No6 {
    public static void main(String[] args) {
        // 정수 num1과 num2가 주어질 때, num1과 num2의 합을 return하도록 solution
        // 함수를 완성하시오
        // 문제 URL : https://school.programmers.co.kr/learn/courses/30/lessons/120802
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(solution(num1, num2));
    }
    static int solution(int num1, int num2) {
        int answer = num1 + num2;
        return answer;
    }
}
