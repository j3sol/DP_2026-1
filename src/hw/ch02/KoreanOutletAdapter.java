package hw.ch02;

public class KoreanOutletAdapter implements Charger {

    private KoreanOutlet outlet;

    public KoreanOutletAdapter(KoreanOutlet outlet) {
        this.outlet = outlet;
    }

    @Override
    public int charge() {
        // 기존 provide()를 charge()로 변환
        return outlet.provide();
    }
}