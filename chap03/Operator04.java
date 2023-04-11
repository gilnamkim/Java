package chap03;

public class Operator04 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        System.out.println(c);
        System.out.println(c = a);   // 왼쪽 피연산자(c)에 오른쪽 피연산자(a)의 값을 할당한다.
        System.out.println(b += a);  // 왼쪽 피연산자(b)와 오른쪽 피연산자(a)를 더한 값을 왼쪽 피연산자(b)에 할당한다.
        System.out.println(b -= a);  // 왼쪽 피연산자(b)와 오른쪽 피연산자(a)를 뺀 값을 왼쪽 피연산자(b)에 할당한다.
        System.out.println(b *= a);  // 왼쪽 피연산자(b)와 오른쪽 피연산자(a)를 곱한 값을 왼쪽 피연산자(b)에 할당한다.
        System.out.println(b /= a);  // 왼쪽 피연산자(b)를 오른쪽 피연산자(a)로 나누고 몫을 왼쪽 피연산자(b)에 할당한다.
        System.out.println(b %= a);  // 왼쪽 피연산자(b)를 오른쪽 피연산자(a)로 나누고 나머지 값을 왼쪽 피연산자(b)에 할당한다.
    }
}
