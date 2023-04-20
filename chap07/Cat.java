package chap07;

public class Cat {
    String breed;
    String color;
    
    Cat() {
        System.out.println("Cat() 생성자 호출합니다.");
    }

    Cat(String pbreed) {
        System.out.println("Cat(...) 생성자 호출합니다.");
        breed = pbreed;
    }

    void eat() {
        System.out.println("먹이를 먹다");
    }

    void scratch() {
        System.out.println("발톱으로 할퀴다");
    }

    void meow() {
        System.out.println("야옹하고 울다");
    }
}
