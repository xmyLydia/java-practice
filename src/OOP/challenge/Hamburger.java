package OOP.challenge;

/**
 * @author mingyux
 */
public class Hamburger {
    private static double basicPrice = 1;
    private String breadRollType;
    private int meat;
    private int lettuce;
    private int tomato;
    private double meatPrice;
    private double lettucePrice;
    private double tomatoPrice;

    public Hamburger(String breadRollType, int meat, double meatPrice) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.meatPrice = meatPrice;
        this.lettuce = 0;
        this.tomato = 0;
        this.lettucePrice = 0;
        this.tomatoPrice = 0;
    }

    public static double getBasicPrice() {
        return basicPrice;
    }

    public static void setBasicPrice(double basicPrice) {
        Hamburger.basicPrice = basicPrice;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
    }

    public int getMeat() {
        return meat;
    }

    public void setMeat(int meat) {
        this.meat = meat;
    }

    public int getLettuce() {
        return lettuce;
    }

    public void setLettuce(int lettuce) {
        this.lettuce = lettuce;
    }

    public int getTomato() {
        return tomato;
    }

    public void setTomato(int tomato) {
        this.tomato = tomato;
    }

    public double getMeatPrice() {
        return meatPrice;
    }

    public void setMeatPrice(double meatPrice) {
        this.meatPrice = meatPrice;
    }

    public double getLettucePrice() {
        return lettucePrice;
    }

    public void setLettucePrice(double lettucePrice) {
        this.lettucePrice = lettucePrice;
    }

    public double getTomatoPrice() {
        return tomatoPrice;
    }

    public void setTomatoPrice(double tomatoPrice) {
        this.tomatoPrice = tomatoPrice;
    }

    public double getTotalPrice() {
        double price = basicPrice + meat * meatPrice + lettuce * lettucePrice + tomato * tomatoPrice;
        return price;
    }

    public void printBasicPrice() {
        System.out.println(getTotalPrice());
    }

    public void add(String name, int amount) {
        switch (name) {
            case "meat": {
                this.meat += amount;
                break;
            }
            case "tomato": {
                this.tomato += amount;
                break;
            }
            case "lettuce": {
                this.lettuce += amount;
                break;
            }
            default:
                break;
        }
    }
}
