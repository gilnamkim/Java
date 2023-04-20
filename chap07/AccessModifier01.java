package chap07;

public class AccessModifier01 {

	// public 접근 제한자
	//	>> public 접근제한자가 선언된 클래스 멤버는 클래스가 같은 패키지에 있든 다른 패키지에 있든 상관없이 어디서나 직접 접근할 수 있음
	public static void main(String[] args) {
		Dog dogObj = new Dog();
		
		dogObj.breed = "포메라니안";
		dogObj.color = "갈색";
		
		System.out.println("강아지 품종: "+ dogObj.breed);
		System.out.println("강아지 색상: "+ dogObj.color);
		
		dogObj.bowwow();
	}
}
