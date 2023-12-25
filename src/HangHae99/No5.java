package HangHae99;

import java.util.Scanner;

public class No5 {
    public static void main(String[] args) {
        // 정수 num1과 num2가 매개변수로 주어집니다. 두 수가 같으면 1 다르면 -1을
        // return 하도록 solution 함수를 완성하시오.
        // 문제 URL : https://school.programmers.co.kr/learn/courses/30/lessons/120807
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(solution(num1, num2));
    }
    static int solution(int num1, int num2) {
        if(num1 == num2) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
