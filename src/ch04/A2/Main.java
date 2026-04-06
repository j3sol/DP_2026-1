package ch04.A2;

import ch04.A2.framework.Factory;
import ch04.A2.framework.Product;
import ch04.A2.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Youngjin Kim");
        Product card2 = factory.create("Heungmin Son");
        Product card3 = factory.create("Kane");
        card1.use();
        card2.use();
        card3.use();

        // 해시맵 테스트
        IDCardFactory idCardFactory = (IDCardFactory) factory;
        System.out.println("시리얼 번호와 오너 이름 대응표:");
        idCardFactory.getOwners().forEach((serial, owner) ->
            System.out.println("시리얼: " + serial + ", 오너: " + owner));
    }
}
