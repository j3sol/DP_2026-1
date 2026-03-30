package hw.ch03;
public abstract class AbstractDisplay {

    private int repeatCount;

    // 기본 생성자 (기본 5회)
    public AbstractDisplay() {
        this(5);
    }

    // 반복 횟수 지정 생성자
    public AbstractDisplay(int repeatCount) {
        this.repeatCount = repeatCount;
    }

    // Template Method (흐름 고정)
    public final void display() {
        open();
        for (int i = 0; i < repeatCount; i++) {
            print();
        }
        close();
    }

    // Hook Methods
    public abstract void open();
    public abstract void print();
    public abstract void close();
}