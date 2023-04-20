package chap05;

public class Example01 {

    // 메서드 호출
    // 메서드명 뒤의 괄호 안에 인수(매개변수 목록)가 있는경우
    //   >> 인수를 사용하여 메서드를 호출
    public static void method() {
        System.out.println("static 메서드입니다.");
        System.out.println(5+6);
    }
    
    public static void main(String[] args) {
        method();
    }
}
