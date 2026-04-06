package hw.ch04;

public class LicenseCardFactory extends Factory {

    private int licenseCounter = 100;
    private String baseDate;

    public LicenseCardFactory(String baseDate) {
        this.baseDate = baseDate;
    }

    @Override
    protected Product createProduct(String owner) {
        return new LicenseCard(owner, licenseCounter++, baseDate, "2031-03-19");
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + " 을 등록했습니다.");
    }
}