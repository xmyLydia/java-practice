package AbstractClass;

public class ListConcrete extends ListItem {
    private ListItem head;
    private ListItem current;

    public ListConcrete(int value) {
        super(value);
    }

    public ListItem getHead() {
        return head;
    }

    public void setHead(ListItem head) {
        this.head = head;
    }

    public ListItem getCurrent() {
        return current;
    }

    public void setCurrent(ListItem current) {
        this.current = current;
    }

    private void insert(ListItem item) {
        if (this.getCurrent().getPreviousItem() != null) {
            this.getCurrent().getPreviousItem().setNextItem(item);
        } else {
            this.getCurrent().setPreviousItem(item);
        }
        item.setNextItem(getCurrent());
    }

    public void add(ListItem item) {
        if (getHead() == null) {
            setHead(item);
        } else {
            if (item.compareTo(getCurrent()) < 0) {
                insert(item);
            } else {
                while (getCurrent().getNextItem() != null) {
                    setCurrent(getCurrent().getNextItem());
                    if (item.compareTo(getCurrent()) < 0) {
                        insert(item);
                        break;
                    }
                }
                if (getCurrent().getNextItem() == null && item.compareTo(getCurrent()) > 0) {
                    getCurrent().setNextItem(item);
                }
            }
        }
    }
}
