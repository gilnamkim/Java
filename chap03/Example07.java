package chap03;

public class Example07 {
    public static void main(String[] args) {
        double d = 3.14;
        long l = (long)d;
        int i = (int)l;

        // 캐스팅 형변환
        // 작은 자료형의 변수에 더 큰 자료형 값을 할당할 때는 명시적 유형 캐스팅을 수행
        System.out.println(d);
        System.out.println(l);
        System.out.println(i);
    }
}
