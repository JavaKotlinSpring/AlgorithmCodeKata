package HangHae99;

import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        // 머쓱이는 40살인 선생님이 몇 년도에 태어 났는지 궁금해졌습니다. 나이 age가 주어질 때,
        // 2022년을 기준 출생 연도를 return하는 solution함수를 완성하시오.
        // 문제 URL : https://school.programmers.co.kr/learn/courses/30/lessons/120820
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(solution(age));
    }

    static int solution(int age) {
        int answer = 2022 - (age-1);
        return answer;
    }
}
