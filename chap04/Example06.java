package chap04;

public class Example06 {
    public static void main(String[] args) {
        char grade = 'B';

        // switch문
        // if~else if문 처럼 많은 선택 사항이 있고 각 선택 사항에 대해 특정 코드 또는 코드 블록을 실행하는 조건문입니다.
        switch(grade){
            case 'A':
                System.out.println("매우 우수");
                break;
            case 'B':
                System.out.println("우수");
                break;
            case 'C':
                System.out.println("좋음");
                break;
            case 'D':
                System.out.println("좀 더 열심히");
                break;
            case 'F':
                System.out.println("미흡");
                break;
            default:
                System.out.println("잘못된 등급");
        }
    }
}
