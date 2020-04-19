package OOP.challenge;

/**
 * @author mingyux
 */
public class DeluxeBurger extends Hamburger {
    private int chips;
    private static String chipsName = "chips";
    private static String drinksName = "water";
    private double chipsPrice;
    private int drinks;
    private double drinksPrice;

    public DeluxeBurger(String breadRollType, int meat, double meatPrice) {
        super(breadRollType, meat, meatPrice);
        this.setChips(0);
        this.setChipsPrice(1);
        this.setDrinks(0);
        this.setDrinksPrice(1);
    }

    public int getChips() {
        return chips;
    }

    public void setChips(int chips) {
        this.chips = chips;
    }

    public double getChipsPrice() {
        return chipsPrice;
    }

    public void setChipsPrice(double chipsPrice) {
        this.chipsPrice = chipsPrice;
    }

    public int getDrinks() {
        return drinks;
    }

    public void setDrinks(int drinks) {
        this.drinks = drinks;
    }

    public double getDrinksPrice() {
        return drinksPrice;
    }

    public void setDrinksPrice(double drinksPrice) {
        this.drinksPrice = drinksPrice;
    }

    @Override
    public void add(String name, int amount) {
        super.add(name, amount);
        if (name.equals(chipsName)) {
            this.chips += amount;
        } else if (name.equals(drinksName)) {
            this.drinks += amount;
        } else {
            System.out.println("Not available in deluxe");
        }
    }

    @Override
    public double getTotalPrice() {
        double basicTotalPrice = super.getTotalPrice();
        double plusPrice = this.chips * this.chipsPrice + this.drinks * this.drinksPrice;
        return basicTotalPrice + plusPrice;
    }
}
