package chap04;

public class Example10 {
    public static void main(String[] args) {
        
        // 중첩 반복문
        // 반복문 안에 또 다른 반복문을 원하는 만큼 포함합니다.
        // 외부 루프의 첫번째 반복이 시작된 후 내부 루프가 시작됩니다.
        // 내부 루프가 반복되고 종료되자마자 외부 루프의 첫번째 반복이 완료됩니다.
        // 외부 루프의 두번째 반복이 시작됩니다.
        // 가장 바깥쪽의 루프가 반복을 마칠 때까지 계속 반복합니다.

        for(int i = 2; i <= 9; i++){
            System.out.println("구구단 " + i + " 단");
            for(int j = 1; j < 10; j++) System.out.println(i+" * " + j + " = " + (i*j));
            System.out.println();
        }
    }
}
