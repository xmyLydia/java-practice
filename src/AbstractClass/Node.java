package AbstractClass;

public class Node extends ListItem {

    public Node(int value) {
        super(value);
    }

    @Override
    public int compareTo(ListItem item) {
        if (item == null) {
            return -1;
        }
        return ((String) this.getValue()).compareTo((String) item.getValue());
    }

    @Override
    public ListItem getPreviousItem() {
        return this.previousItem;
    }

    @Override
    public ListItem setPreviousItem(ListItem previousItem) {
        this.previousItem = previousItem;
        return this.previousItem;
    }

    @Override
    public ListItem getNextItem() {
        return this.nextItem;
    }

    @Override
    public ListItem setNextItem(ListItem nextItem) {
        this.nextItem = nextItem;
        return this.nextItem;
    }
}
