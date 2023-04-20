package chap07;

public class Example02 {
    
    // 멤버 메서드의 유형
    //  >> 메서드는 클래스 내에서 선언되고 특정 작업을 수행하는 데 사용됨
    //  >> 메서드는 선언부와 중괄호 안의 구현부로 구성되며, 호출되면 중괄호 안의 모든 내용이 순차적으로 실행됨
    
    // 정적 메서드 >> static 키워드를 선언합니다. >> 객체를 생성하지 않고 바로 사용합니다.
    static void myMethod1() {
        System.out.println("정적 메서드 호출");
    }

    // 인스턴스 메서드 >> static 키워드를 선언하지 않습니다. >> 객체를 생성해야만 사용할 수 있습니다.
    public void myMethod2() {
        System.out.println("인스턴스 메서드 호출");
    }

    public static void main(String[] args) {
        myMethod1();
        // myMethod2();
        Example02 myObj = new Example02();
        myObj.myMethod2();
    }
}
