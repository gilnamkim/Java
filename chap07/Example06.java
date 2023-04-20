package chap07;

public class Example06 {
    
    // 생성자 오버로딩
    //  >> 생성자 이름이 같지만 매개변수가 다른 여러 생성자를 정의하는 것
    //  >> 매개변수의 자료형 또는 개수에 따라 구분합니다.
    //  >> 매개변수의 자료형이나 개수가 다른 생성자가 여러 개 있으나 생성자에 반환 자료형이 없음

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat("샴");
        Cat cat3 = new Cat("러시안블루", "회색");

        System.out.println("첫 번째 고양이 품종 " + cat1.breed + "\t색상: "+ cat1.color);
		System.out.println("두 번째 고양이 품종 " + cat2.breed + "\t색상: "+ cat2.color);
		System.out.println("세 번째 고양이 품종 " + cat3.breed + "\t색상: "+ cat3.color);
    }
}
