package chap05;

public class Example05 {
    
    // 반환유형이 없는 메서드
    // 입력만 있고 출력이 없는 메서드
    public static void add(int x, int y) {
        System.out.println(x +"(와)과 "+ y +"의 합은 "+ (x + y) +"입니다.");
    }

    public static void main(String[] args) {
        int a = 5, b = 6;
        add(a, b);
    }
}
