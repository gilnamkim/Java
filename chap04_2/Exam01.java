package chap04_2;

import java.util.Scanner;

public class Exam01 {
    public static void main(String[] args) {
        //팩토리얼 계산기
        Scanner s = new Scanner(System.in);

        int sum = 0;

        System.out.println("첫 번째 숫자를 입력하세요: ");
        int a = s.nextInt();
        System.out.println("두 번째 숫자를 입력하세요: ");
        int b = s.nextInt();
        for(int i = a; i < b+1; i++) {
            sum += i;
        }
        System.out.println("합계: " + sum);
    }
}
