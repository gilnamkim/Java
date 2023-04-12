package chap04;

public class Example11 {
    public static void main(String[] args) {
        
        // break문
        // 원할 때마다 반복문의 실행을 중지하거나 종료할 수 있습니다.
        // break문은 for문, while문 do~while문 에서 모두 사용할 수 있습니다.
        for(int n = 1; n <= 5; n++){
            System.out.println("*");
            if(n == 2) break;
        }
    } 
}
