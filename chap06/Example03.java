package chap06;

public class Example03 {
    
    // 2차원 배열
    //  >> 다차원 배열은 1차원 배열과 매우 유사하지만, 행과 열이 여러 개임
    //  >> 2차원 배열은 데이터가 행과 열에 저장되는 표 형식으로 데이터를 나타냄

    public static void main(String[] args) {
        int[][] myArr = new int[2][4];
        myArr[0][0] = 2;
        myArr[0][1] = 5;
        myArr[0][2] = 7;
        myArr[0][3] = 4;
        myArr[1][0] = 9;
        myArr[1][1] = 3;
        myArr[1][2] = 2;
        myArr[1][3] = 8;

        int sum1 = 0, sum2 = 0;
        for(int i = 0; i < 4; i++){
            sum1 += myArr[0][i];
        }
        System.out.println("첫 번째 행의 합계: " + sum1);

        for(int i = 0; i < 4; i++){
            sum2 += myArr[1][i];
        }
        System.out.println("두 번째 행의 합계: " + sum2);
    }
}
