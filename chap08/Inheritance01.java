package chap08;

public class Inheritance01 extends Calculation {
    public void multiplication(int x, int y) {
        z = x * y;
        System.out.println("두 수의 곱셈: " + z);
    }

    public static void main(String[] args) {
        int a = 20, b = 10;
        Inheritance01 obj = new Inheritance01(); // 객체를 만들어 준다.
        obj.addition(a, b); // Calculation을 상속받아 메서드 접근 가능
        obj.subtraction(a, b); // Calculation을 상속받아 메서드 접근 가능
        obj.multiplication(a, b); //같은 클래스 안의 메서드는 당연히 접근 가능
    }
}
