package chap07;

public class AccessModifier04 {

    // default 접근제한자
    //  >> 접근제한자로 전혀 선언되지 않은 것
    //  >> 선언된 접근제한자가 없는 모든 클래스, 변수, 메서드, 생성자는 같은 패키지의 클래스에서만 접근할 수 있음
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
		
		/**
		obj.name = "다운";
		System.out.println("강아지 이름: "+ obj.name);
		obj.sleep();
		*/
		
		obj.state = "앉음";
		System.out.println("강아지 상태: "+ obj.state);
		obj.sit();
	}
}
