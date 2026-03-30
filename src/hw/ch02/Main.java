package hw.ch02;
public class Main {
    public static void main(String[] args) {
        System.out.println("20231351 이솔희");
        KoreanOutlet outlet = new KoreanOutlet();

        Charger adapter = new KoreanOutletAdapter(outlet);

        Smartphone phone = new Smartphone(adapter);

        phone.charge();
    }
}