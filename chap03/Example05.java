package chap03;

public class Example05 {
    public static void main(String[] args) {
        int x = 10;

        // < 증감연산자 >
        // ++는 피연산자에 1을 더하고 --는 피연산자에서 1을 뺌
        // 증가 및 감소 연산자가 변수의 앞에 위치하느냐 뒤에 위치하느냐에 따라서 값이 달라지기 때문에 주의해야 합니다.
        System.out.println(x++); // 피연산자(x)를 출력하고 피연산자(x)를 1 증가시킨다.
        System.out.println(++x); // 피연산자(x)를 1 증가시키고 피연산자(x)를 출력한다.
        System.out.println(x--); // 피연산자(x)를 출력하고 피연산자(x)를 1 감소시킨다.
        System.out.println(--x); // 피연산자(x)를 1 감소시키고 피연산자(x)를 출력한다.
    }
}
