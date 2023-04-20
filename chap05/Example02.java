package chap05;

public class Example02 {

    // 사용자 정의 메서드
    // 반환 유형이 있는 메서드
    // 메서드명 앞에 String, int, boolean과 같은 자료형을 정의할 수 있습니다.
    // 메서드 내부의 마지막 행에 return 키워드를 사용하여 메서드명 앞의 자료형과 동일한 값을 반환합니다.

    // 반환 유형이 없는 메서드
    // 입력이 없고 출력이 있는 메서드
    // >> 입력이 없더라도 출력을 할 수 있습니다.

    public static String greeting() {
        return "Hi";
    }

    public static void main(String[] args) {
        String str = greeting();
        System.out.println(str + " Java");
    }
}
