package AbstractClass;

public class ListConcrete extends ListItem {
    private ListConcrete head;
    private ListConcrete current;
    private ListConcrete next;
    private ListConcrete previous;

    public ListConcrete getNext() {
        return next;
    }

    public void setNext(ListConcrete next) {
        this.next = next;
    }

    public ListConcrete getPrevious() {
        return previous;
    }

    public void setPrevious(ListConcrete previous) {
        this.previous = previous;
    }

    public ListConcrete(int value) {
        super(value);
    }

    public ListConcrete getHead() {
        return head;
    }

    public void setHead(ListConcrete head) {
        this.head = head;
    }

    public ListConcrete getCurrent() {
        return current;
    }

    public void setCurrent(ListConcrete current) {
        this.current = current;
    }

    private void insert(ListConcrete item) {
        if (this.getCurrent().getPreviousItem() != null) {
            this.getCurrent().getPreviousItem().setNextItem(item);
        } else {
            this.getCurrent().setPreviousItem(item);
        }
        item.setNextItem(getCurrent());
    }

    public void add(ListConcrete item) {
        if (getHead() == null) {
            setHead(item);
        } else {
            if (item.compareTo(getCurrent()) < 0) {
                insert(item);
            } else {
                while (getCurrent().getNextItem() != null) {
                    setCurrent(getCurrent().getNext());
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
