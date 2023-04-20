package chap06;

public class Example01 {
    
    // 1차원 배열
    // - 1차원 배열 선언
    //  >> 단일 인덱스를 사용하여 요소를 저장함
    //  >> 인덱스를 1씩 증가시키면 배열의 모든 요소를 얻을 수 있음

    public static void main(String[] args) {
        int[] myArr = new int[5];
        myArr[0] = 10;
        myArr[1] = 20;
        myArr[2] = 30;
        myArr[3] = 40;
        myArr[4] = 50;

        for(int i = 0; i < 5; i++) {
            System.out.println(i + "번째 요소값 : "+ myArr[i]);
        }
    }
}
