package chap06;

public class Example02 {
    
    // 1차원 배열 초기화
    //  >> 배열을 선언하고 초기화할 때 배열의 요소를 직접 설정함
    //  >> 배열 선언문에서 중괄호 안에 요소를 나열함으로써 초기화된 배열을 만듦
    //      - 만약 중괄호 안에 요소를 넣지 않으면 길이가 0인 배열이 생성됨

    public static void main(String[] args) {
        int[] myArr = {10,20,30,40,50};
        for(int i = 0; i < myArr.length; i++) {
            System.out.println(i+ "번째 요소값: " + myArr[i]);
        }
    }
}
