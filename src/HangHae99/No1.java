package HangHae99;

import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        // 정수 num1과 num2가 주어질 때, num1에서 num2를 뺀 값을 return하도록 solution함수 완성
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = solution(num1, num2);
        System.out.println(result);
    }

    public static int solution(int num1, int num2) {
        int answer = num1 - num2;
        return answer;
    }
}