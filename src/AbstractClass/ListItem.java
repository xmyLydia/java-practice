package AbstractClass;

public abstract class ListItem {
    ListItem previousItem;
    ListItem nextItem;
    int value;

    public ListItem(int value) {
        this.value = value;
    }

    abstract public int compareTo(ListItem item);

    abstract public ListItem getPreviousItem();

    abstract public void setPreviousItem(ListItem previousItem);

    abstract public ListItem getNextItem();

    abstract public void setNextItem(ListItem nextItem);

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
