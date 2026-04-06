package practice.ch05;
    
// enum을 이용한 싱글턴 패턴
public enum Singleton2 {
    INSTANCE; //상수: Singleton2 타입의 객체가 생성되어 저장됨 (enum클래스특성상 자동으로 생성)

    public void hello(){
        System.out.println("싱글톤 객체의 hello 메소드가 호출되었습니다.");
    }
}
