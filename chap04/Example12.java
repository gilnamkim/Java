package chap04;

public class Example12 {
    public static void main(String[] args) {
        
        // continue문
        // 특정 조건을 건너뛰고 나머지를 계속 실행하려는 경우에 사용합니다.
        // 반복문의 블록 내부에서 for문의 증감식 또는 while문의 조건식으로 이동하는 역할을 합니다.
        for(int i = 0; i <= 10; i++){
            if(i == 3 || i == 6 || i == 9) continue; // i가 3,6,9이면 아래 출력문으로 가지않고 for문의 끝"}"으로 갑니다.
            System.out.print(i + " ");
        }
    }
}
