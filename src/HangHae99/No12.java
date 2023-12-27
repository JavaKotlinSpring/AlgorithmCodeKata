package HangHae99;

public class No12 {
    public static void main(String[] args) {
        // 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성
    }
    // 주소 URL : https://school.programmers.co.kr/learn/courses/30/lessons/12944
    public static double solution(int[] arr) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            answer = answer + arr[i];
        }
        return (double) answer / arr.length;
    }
}
