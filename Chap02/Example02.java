package Chap02;

public class Example02 {
    public static void main(String[] args) {
        //print()메서드
        // - 데이터를 콘솔로 출력하는 가장 기본적인 메서드입니다.
        // - print()메서드를 사용하려면 System클래스를 사용해야 합니다.
        
        // System.out.println() - 따옴표안의 문자열, 변수 값을 출력한 후 커서를 다음 행의 시작부분으로 이동합니다.
        System.out.println("Java "+"Program");

        // System.out.print() - 따옴표안의 문자열, 변수 값을 출력합니다.
        System.out.print("Java " + "Program");
        System.out.print("\n");
        
        // System.out printf() - 문자열 형식화를 제공합니다.
        System.out.printf("%C%c%c%c "+"%C%c%c%c%c%c%c",'J','a','v','a','P','r','o','g','r','a','m');
    }
}
