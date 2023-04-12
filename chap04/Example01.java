package chap04;

public class Example01 {
    public static void main(String[] args) {
        int num = 10;

        // 조건문
        // 가장 간단한 조건문 입니다. 특정 코드 또는 코드 블록 실행 여부를 결정하는 데 사용합니다.
        if(num > 15) 
            System.out.println("숫자가 15보다 큽니다."); // 조건문 안의 코드가 1줄이면 {}를 생략해도 괜찮습니다.
        System.out.println("이 문장은 if문 외부에 있습니다.");
    }
}
