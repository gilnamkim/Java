package chap07;

public class AccessModifier03 {
    public static void main(String[] args) {
        
        // private 접근제한자
        //  >> 가장 제한적인 것으로, 외부 클래스로부터의 접근을 허용하지않는 멤버에는 사용할 수 있지만 클래스와 인터페이스에는 사용할 수 없음
        //  >> private로 선언된 필드, 메서드, 생성자는 엄격하게 제어되므로 둘러싸는 클래스 외부에서 접근할 수 없음
        Dog obj = new Dog();
		
		obj.breed = "포메라니안";
		obj.color = "갈색";
		
		System.out.println("강아지 품종: "+ obj.breed);
		System.out.println("강아지 색상: "+ obj.color);
		
		obj.bowwow();
		obj.age = 10;
		System.out.println("강아지 나이: "+ obj.age);
		obj.run();
		
		
		//obj.name = "다운";
		//System.out.println("강아지 이름: "+ obj.name);
		//obj.sleep;
		

    }
    
}
