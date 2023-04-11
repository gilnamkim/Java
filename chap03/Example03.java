package chap03;

public class Example03 {
    public static void main(String[] args) {
        
        int x = 10;
        // < 논리연산자 >
        // 표현식이 참인지 거짓인지 확인하는 데 사용합니다.
        // 일반적으로 논리 연산자는 if문, while문 등에서 조건식을 판별하는데 사용합니다.
        System.out.println(x < 10 && x < 20); // 두 피연산자의 조건이 모두 참이면 true, 그렇지 않으면 false(논리적 AND)
        System.out.println(x < 10 || x < 20); // 두 피연산자의 조건 중 하나라도 참이면 true, 그렇지 않으면 false(논리적 OR)
        System.out.println(!(x < 10 && x < 20)); // 조건을 부정합니다. 피연산자의 조건이 참이면 false, 그렇지 않으면 true(논리적 NOT)
    }
}
