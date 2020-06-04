package AbstractClass;

public abstract class ListItem {
    ListItem previousItem;
    ListItem nextItem;
    Object value;

    public ListItem(int value) {
        this.value = value;
    }

    abstract public int compareTo(ListItem item);

    abstract public ListItem getPreviousItem();

    abstract public ListItem setPreviousItem(ListItem previousItem);

    abstract public ListItem getNextItem();

    abstract public ListItem setNextItem(ListItem nextItem);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
