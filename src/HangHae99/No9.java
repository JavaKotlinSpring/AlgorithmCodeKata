package HangHae99;

import java.util.Scanner;

public class No9 {
    public static void main(String[] args) {
        // 정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return하도록 solution함수를 완성하시오
        // URL 주소 : https://school.programmers.co.kr/learn/courses/30/lessons/120831
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
    public static int solution(int n) {
        int answer = n;
        int result = 0;
        for (int i = 1; i < answer; i++) {
            if(i % 2 == 0) {
                result= result + i;
            }
        }
        return result;
    }
}
