package OOP.challenge;

public class HealthyHamburger extends Hamburger {
    private int sourceHealthy;
    private double sourceHealthyPrice;
    private static String sourceHealthyName = "sourceHealthyName";
    private static String healthyRollType = "Brown rye bread roll";

    public HealthyHamburger(String breadRollType, int meat, double meatPrice) {
        super(breadRollType, meat, meatPrice);
        this.setBreadRollType(healthyRollType);
        this.setSourceHealthy(0);
        this.setSourceHealthyPrice(1);
    }

    public int getSourceHealthy() {
        return sourceHealthy;
    }

    public void setSourceHealthy(int sourceHealthy) {
        this.sourceHealthy = sourceHealthy;
    }

    public double getSourceHealthyPrice() {
        return sourceHealthyPrice;
    }

    public void setSourceHealthyPrice(double sourceHealthyPrice) {
        this.sourceHealthyPrice = sourceHealthyPrice;
    }

    @Override
    public void add(String name, int amount) {
        super.add(name, amount);
        if (name.equals(sourceHealthyName)) {
            this.sourceHealthy += amount;
        }
    }

    @Override
    public double getTotalPrice() {
        double basicTotalPrice = super.getTotalPrice();
        double plusPrice = this.sourceHealthy * this.sourceHealthyPrice;
        return basicTotalPrice + plusPrice;
    }
}
