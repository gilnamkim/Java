package chap06;

public class Example05 {
    
    // 문자열의 개요
    // 문자열은 쉽게 말해 문자의 배열임
    // 문자열은 공백도 문자로 인식함
    // 문자열은 항상 큰따옴표 안에 작성함
    // 문자열은 String 클래스의 객체임
    // new 키워드를 이용하여 문자열을 메모리에 동적으로 할당함

    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        String s4 = new String("Java");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
