package chap07;

public class Example04 {
    
    // 생성자
    //  >> 객체를 생성할 때 new 연산자를 사용하여 호출되는 부분
    //  >> 클래스의 객체가 생성될 때마다 자동으로 호출되고 객체를 초기화하는 데 이용되는 특수한 메서드
    //  >> 생성자명은 클래스명과 같고 반환 유형이 없음

    // 생성자를 작성하는 규칙
    //  >> 생성자명은 해당 클래스명과 동일해야함
    //  >> 생성자는 abstract, final, static을 선언할 수 없음
    //  >> 접근제한자는 생성자의 접근을 제어하는 데 사용할 수 있음. 즉 다른 클래스가 생성자를 호출할 수 있음

    // 기본생성자
    //  >> 매개변수가 없는 생성자
    //  >> 클래스 내에 기본 생성자를 정의하지 않아도 됨
    //  >> 클래스 내에 기본 생성자를 정의하지않으면 컴파일러는 해당 클래스에 대한 기본생성자를 자동으로 생성함

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.breed = "페르시안";
        Cat cat2 = new Cat();
        cat2.breed = "샴";
        Cat cat3 = new Cat();
        cat3.breed = "러시안블루";
        System.out.println("첫 번째 고양이 품종 : " + cat1.breed);
        System.out.println("두 번째 고양이 품종 : " + cat2.breed);
        System.out.println("세 번째 고양이 품종 : " + cat3.breed);
    }
}
