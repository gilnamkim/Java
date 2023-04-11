package chap03;

import java.util.Scanner;

public class Example08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Scanner 클래스
        // 키보드로 데이터를 입력 받을 때 사용합니다.
        // Scanner 클래스를 사용하려면 java.util.Scanner 패키지를 임포트(import)해야 합니다.
        System.out.println("당신의 이름을 입력하세요.");
        String name = input.nextLine();
        System.out.println("당신의 이름: "+ name);
    }
}
