package HangHae99;

public class No10 {
    public static void main(String[] args) {
        // 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution함수를
        // 완성하시오.
        // 주소URL : https://school.programmers.co.kr/learn/courses/30/lessons/120817
    }
    public static double solution(int[] numbers) {
        int answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            answer = answer + numbers[i];
        }
        return (double) answer / numbers.length;
    }
}
