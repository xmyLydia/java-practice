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

    public DeluxeBurger(String breadRollType, int meat, double meatPrice, int chips, double chipsPrice,
                        int drink, double drinksPrice) {
        super("Delux bread type", 1, 2);
        this.setChipsPrice(chipsPrice);
        this.setDrinksPrice(drinksPrice);
        this.setChips(chips);
        this.setDrinks(drink);
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
        System.out.println("we can't add anything");
    }

    @Override
    public double getTotalPrice() {
        double basicTotalPrice = super.getTotalPrice();
        double plusPrice = this.chips * this.chipsPrice + this.drinks * this.drinksPrice;
        return basicTotalPrice + plusPrice;
    }
}
