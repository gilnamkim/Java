package chap04;

public class Example03 {
    public static void main(String[] args) {
        int num = 20;

        // if ~ else if문
        // if ~ else문 과 유사하나 else문이 서로 다른 if문의 조건식과 쌍을 이루는 조건문입니다.
        // else if문의 수는 제한이 없습니다.
        // else if문 코드 블록의 마지막에 else문의 코드 블록을 추가할 수 있습니다.
        if(num == 10) System.out.println("숫자가 10입니다.");
        else if(num == 15) System.out.println("숫자가 15입니다.");
        else if(num == 20) System.out.println("숫자가 20입니다.");
        else System.out.println("숫자가 존재하지 않습니다.");
    }
}
