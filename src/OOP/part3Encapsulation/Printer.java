package OOP.part3Encapsulation;

/**
 * @author mingyux
 */
public class Printer {
    private double tonerLevel;
    private int pages;
    private boolean isDuplex;

    public Printer(double tonerLevel, int pages, boolean isDuplex) {
        this.tonerLevel = tonerLevel;
        this.pages = pages;
        this.isDuplex = isDuplex;
    }

    public double getTonerLevel() {
        return tonerLevel;
    }

    public void setTonerLevel(double tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public void setDuplex(boolean duplex) {
        isDuplex = duplex;
    }

    public void fillUpToner(double addAmount) {
        this.tonerLevel += addAmount;
        System.out.println("fill up to: " + this.tonerLevel);
    }

    public void printPage(int numberOfPages) {
        this.pages += numberOfPages;
        if(isDuplex){
            double page = this.pages / 2.0;
            this.pages = (int) Math.ceil(page);
        }
        System.out.println("print: " + this.pages);
    }
}
