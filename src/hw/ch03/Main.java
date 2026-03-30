package hw.ch03;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("20231351 이솔희");
        // [3-1] 기본 테스트 (기존 코드 유지)
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello");
        d1.display();
        d2.display();

        System.out.println();

        // [3-2] 반복 횟수 테스트
        AbstractDisplay d3 = new CharDisplay('X', 3);
        AbstractDisplay d4 = new StringDisplay("Test", 7);
        d3.display();
        d4.display();

        System.out.println();

        // [3-3] NumberDisplay 테스트
        AbstractDisplay num = new NumberDisplay(42, 4);
        num.display();
    }
}
