package chap02;

public class Datatype01 {
    public static void main(String[] args) {
        int a = 10; // int형 4바이트 변수 설정
        short s = 2; // short형 2바이트 변수 설정
        byte b = 6; // byte형 1바이트 변수 설정
        long l = 1253621332135L; //long형 8바이트 변수 설정
        //임시저장되는 데이터타입이 int형이라 int형 범위에 벗어나는 값은 변수형을 붙여줘야한다.
        
        System.out.println(a);
        System.out.println(s);
        System.out.println(b);
        System.out.println(l);
    }
    
}
