package HangHae99;

public class No13 {
    public static void main(String[] args) {
        // 자연수 n이 주어지면, 각 자릿수의 합을 구해서 return하는 solution함수를 만들어 주세요.

    }
    public static int solution(int n) {
        int answer1 = n / 100;
        int answer2 = n % 100 / 10;
        int answer3 = n % 10;
        int result = answer1 + answer2 + answer3;
        return result;
    }
}
