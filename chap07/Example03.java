package chap07;

public class Example03 {
    
    // 멤버 메서드 접근
    //  >> 클래스 내의 멤버 메서드느 멤버 변수와 마찬가지로 객체를 만들고 마침표 구문을 사용하여 접근 가능하다.

    public static void main(String[] args) {
        Cat catObj = new Cat();
        System.out.println("페르시안 고양이");
        catObj.meow();
    }
}
