package chap08;

public class Son extends Father {
    public String name = "홍길동";

    public void printDetail() {
        System.out.println("나의 이름은 " + this.name);
        System.out.println("나의 아버지는 " + this.familyName);
        System.out.println("나의 집은 " + this.houseAddress);
    }
}
