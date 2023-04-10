package chap02;

public class Example01 {
    public static void main(String[] args) {
        final int SPEED = 20; // 상수는 프로그램이 실행되는 동안 변경할 수 없고 선언과 동시에 초기화해야 합니다.
        int count = 10;
        //SPEED = 40; //컴파일 오류!
        count = 11;

        System.out.print("상수 SPEED의 값은");
        System.out.println(SPEED);
        System.out.print("변수 count의 값은");
        System.out.println(count);
    }
}
