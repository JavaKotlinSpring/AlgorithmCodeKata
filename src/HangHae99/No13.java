package HangHae99;

public class No13 {
    public static void main(String[] args) {
        // 자연수 n이 주어지면, 각 자릿수의 합을 구해서 return하는 solution함수를 만들어 주세요.
        // 주소 URL : https://school.programmers.co.kr/learn/courses/30/lessons/12931
    }
    public class Solution {
        public int solution(int n) {
            int answer = 0;
            while (n != 0) {
                answer += n % 10;
                n /= 10;
            }
            return answer;
        }
    }
}
