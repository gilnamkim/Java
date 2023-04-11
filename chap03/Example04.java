package chap03;

public class Example04 {
    public static void main(String[] args) {
        int x = 10;

        // < 할당연산자 >
        // 변수에 값을 할당하는 데 사용함
        // 왼쪽 피연산자가 변수이고 오른쪽 피연산자가 값
        //   > 오른쪽에 있는 값은 왼쪽에 있는 피연산자의 자료형과 같아야 함
        //   > 그렇지 않으면 컴파일러에서 오류가 발생함
        System.out.println(x);
        x += 2;
        System.out.println(x);
        x *= 2;
        System.out.println(x);
        x -= 2;
        System.out.println(x);
    }
}
