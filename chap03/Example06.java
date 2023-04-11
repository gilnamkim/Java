package chap03;

public class Example06 {
    public static void main(String[] args) {
        int i = 100;
        long l = i;
        float f = l;

        // 자동형변환
        // 작은 자료형을 큰 변수에 할당할 때 더 큰 자료형으로 변환함
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
    }
}
