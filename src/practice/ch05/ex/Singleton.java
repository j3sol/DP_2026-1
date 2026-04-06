package practice.ch05.ex;

public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {
        System.out.println("인스턴스가 생성되었습니다.");
        slowdown();
    }

    public static Singleton getInstance() {
        if (singleton == null) { //최초 호출 시에만 인스턴스가 생성됨
            singleton = new Singleton();
        }
        return singleton;
    }

    private void slowdown() {
        try {
            Thread.sleep(1000); //CPU를 내놓고 1초간 쉼
        } catch (InterruptedException e) {
        }
    }
}
