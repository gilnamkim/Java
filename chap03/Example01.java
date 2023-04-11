package chap03;

public class Example01 {
    public static void main(String[] args) {
        int x = 10, y = 20;

        //산술연산자 : 수학 표현식의 덧셈, 뺄셈 등과 같은 산술 연산을 수행하는데 사용합니다.
        System.out.println("x + y = "+(x+y)); // 왼쪽 피연산자(x)와 오른쪽 피연산자(y)를 더합니다.
        System.out.println("x - y = "+(x-y)); // 왼쪽 피연산자(x)에서 오른쪽 피연산자(y)를 뺍니다.
        System.out.println("x * y = "+(x*y)); // 왼쪽 피연산자(x)와 오른쪽 피연산자(y)를 곱합니다.
        System.out.println("x / y = "+(x/y)); // 왼쪽 피연산자(x)를 오른쪽 피연산자(y)로 나누고 몫을 반환합니다.
        System.out.println("x % y = "+(x%y)); // 왼쪽 피연산자(x)를 오른쪽 피연산자(y)로 나누고 나머지 값을 반환합니다.
    }
}
