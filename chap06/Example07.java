package chap06;

public class Example07 {

    // 문자열 연산자
    //  >> 문자열 연산자는 문자열에 사용하는 연산자를 의미합니다.
    
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = "java";

        System.out.println(s1 == s2);
        System.out.println(s1 != s2);

        System.out.println(s2 == s3);
        System.out.println(s2 != s3);
        String s4 = s2 + s3;
        System.out.println(s4);
    }
}
