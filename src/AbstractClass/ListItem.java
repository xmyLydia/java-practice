package AbstractClass;

public abstract class ListItem {
    ListItem previousItem;
    ListItem nextItem;
    int value;

    public ListItem(int value) {
        this.value = value;
    }

    public void moveToNext(ListItem item) {
        this.nextItem = item.nextItem;
        this.previousItem = item.previousItem;
    }

    public void moveToPrevious(ListItem item) {
        this.nextItem = item.nextItem;
        this.previousItem = item.previousItem;
    }

    public int compareTo(ListItem item) {
        return this.getValue() - item.getValue();
    }

    public ListItem getPreviousItem() {
        return previousItem;
    }

    public void setPreviousItem(ListItem previousItem) {
        this.previousItem = previousItem;
    }

    public ListItem getNextItem() {
        return nextItem;
    }

    public void setNextItem(ListItem nextItem) {
        this.nextItem = nextItem;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
