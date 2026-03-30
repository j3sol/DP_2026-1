package practice.ch03;

public class Main {
    public static void main(String[] args) {
        //CharDisplay d1 = new CharDisplay('H'); //'H' (작은따옴표) 캐릭터타입 "H" (큰따옴표) 문자열
        AbstractDisplay d1 = new CharDisplay('H');
        d1.display(); // CharDisplay에는 없어서 CharDisplay의 부모인 AbstractDisplay에서 물려받은 display가 실행됨

        //StringDisplay d2 = new StringDisplay("Hello, world.");
        AbstractDisplay d2 = new StringDisplay("Hello, world.");
        d2.display(); // StringDisplay에는 없어서 StringDisplay의 부모인 AbstractDisplay에서
  
        
       // AbstractDisplay d3 = new AbstractDisplay(); 추상클래스는 인스턴스를 만들 수 없음
        
    }
}
