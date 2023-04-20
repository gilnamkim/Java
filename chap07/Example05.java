package chap07;

public class Example05 {

    // 일반 생성자
    //  >> 매개변수가 있는 생성자
    //  >> 기본 생성자와 달리 생략할 수 없으며 클래스의 멤버 변수를 초기화하는데 사용됨

    public static void main(String[] args) {
        Cat cat1 = new Cat("페르시안");
        Cat cat2 = new Cat("샴");
        Cat cat3 = new Cat();
        cat3.breed = "러시안블루";
        System.out.println("첫 번째 고양이 품종 : " + cat1.breed);
        System.out.println("두 번째 고양이 품종 : " + cat2.breed);
        System.out.println("세 번째 고양이 품종 : " + cat3.breed);
    }
}
