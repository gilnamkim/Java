package chap07;

public class Example01 {

    // 멤버 변수
    //  >> 객체의 데이터가 저장되는 곳
    //  >> 클래스의 속성으로 클래스 내의 멤버 변수 또는 필드(field)라고 부름
    //  >> 멤버 변수는 객체의 데이터, 메서드의 반환값, 상태 등을 저장한느 곳을 의미함
    //  >> 멤버 변수 접근
    //      - 클래스 내의 멤버 변수는 객체를 만들고 마침표 구문을 사용하여 접근 가능

    public static void main(String[] args) {
        Cat catObj = new Cat();
        catObj.breed = "페르시안 고양이";
        catObj.color = "흰색";
        System.out.println("품종: " + catObj.breed);
        System.out.println("색상: " + catObj.color);
    }
}
