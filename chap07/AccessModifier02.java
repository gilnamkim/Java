package chap07;

public class AccessModifier02 {

    // protected 접근제한자
    //  >> protected 접근제한자가 선언된 클래스 멤버(변수, 메서드, 생성자)는 클래스와 인터페이스에 사용할 수 없음
    //  >> 상위 클래스에서 protected가 선언된 변수, 메서드, 생성자는 다른 패키지의 하위 클래스에서만 접근할 수 있음
    //  >> 같은 패키지의 클래스는 protected가 선언된 하위 클래스가 아니더라도 클래스 멤버에 접근할 수 있음
	public static void main(String[] args) {
		Dog obj = new Dog();
		
		obj.breed = "포메라니안";
		obj.color = "갈색";
		
		System.out.println("강아지 품종: "+ obj.breed);
		System.out.println("강아지 색상: "+ obj.color);
		
		obj.bowwow();
		obj.age = 10;
		System.out.println("강아지 나이: "+ obj.age);
		obj.run();
	}
}
