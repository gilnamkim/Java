package chap04;

public class Example04 {
    public static void main(String[] args) {
        int num = 70;

        // 중첩 if ~ else문
        // if문 또는 else문 코드 블록 내에 다른 if문, if~else문, if~else if문 등이 포함된 조건문입니다.
        // 외부 if문의 조건식이 참이면 내부 if문의 코드 블록을 실행합니다.
        if(num < 100) {
            System.out.println("숫자가 100보다 작습니다.");
            if(num > 50) System.out.println("숫자가 50보다 큽니다.");
        }
    }
}
