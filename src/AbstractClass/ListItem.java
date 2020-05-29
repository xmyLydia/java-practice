package AbstractClass;

public abstract class ListItem {
    ListItem previousItem;
    ListItem nextItem;
    int value;

    public ListItem(int value) {
        this.value = value;
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
