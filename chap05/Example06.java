package chap05;

public class Example06 {
    
    // 메서드 오버로딩
    // 메서드명이 같지만 매개변수가 다른 메서드를 하나의 메서드명으로 정의하는 것 입니다.
    // 메서드 오버로딩을 위한 조건
    // >> 메서드명이 같음
    // >> 매개변수의 자료형이나 개수가 다름

    public static void calculate(int x, int y) {
        System.out.println(x*y);
    }

    public static void calculate(int x) {
        System.out.println(x*x);
    }

    public static void calculate(int x, double y) {
        System.out.println(x*y);
    }

    public static void calculate(double x) {
        System.out.println(x*x);
    }

    public static void main(String[] args) {
        calculate(2, 3);
        calculate(2, 3.14);
        calculate(2);
        calculate(2.5);
    }
}
