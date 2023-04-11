package chap03;

public class Operator02 {
    public static void main(String[] args) {
        int a = 10, b = 25;
        
        System.out.println("a == b = "+(a==b)); // 왼쪽 피연산자(a)와 오른쪽 피연산자(b)가 같으면 true
        System.out.println("a != b = "+(a!=b)); // 왼쪽 피연산자(a)와 오른쪽 피연산자(b)가 같지 않으면 true
        System.out.println("a > b = "+(a>b)); // 왼쪽 피연산자(a)가 오른쪽 피연산자(b)보다 크면 true
        System.out.println("a < b = "+(a<b)); // 왼쪽 피연산자(a)가 오른쪽 피연산자(b)보다 작으면 true
        System.out.println("a <= b = "+(a<=b)); // 왼쪽 피연산자(a)가 오른쪽 피연산자(b)보다 작거나 같으면 true
        System.out.println("a >= b = "+(a>=b)); // 왼쪽 피연산자(a)가 오른쪽 피연산자(b)보다 크거나 같으면 true
    }
}
