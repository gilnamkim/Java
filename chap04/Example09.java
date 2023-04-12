package chap04;

public class Example09 {
    public static void main(String[] args) {
        int i = 1;

        // do while문
        // while문과 for문 처럼 조건식에 의해 반복 실행된다는 점은 비슷합니다.
        // 하지만 조건식을 확인하기 전에 코드블록의 코드가 한 번 실행된다는 점이 다릅니다.
        do {
            System.out.println("Hello World!");
            i++;
        } while(i < 6); //일단 한번 실행시키고 참거짓여부를 확인합니다.
    }
}
