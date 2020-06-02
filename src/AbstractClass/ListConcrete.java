package AbstractClass;

public class ListConcrete extends ListItem {
    private ListConcrete head;
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

    private void insert(ListConcrete item) {
        if (this.getPreviousItem() != null) {
            this.getPreviousItem().setNextItem(item);
        } else {
            this.setPreviousItem(item);
        }
        item.setNextItem(this);
    }

    public void add(ListConcrete item) {
        if (getHead() == null) {
            setHead(item);
        } else {
            if (item.compareTo(this) < 0) {
                insert(item);
            } else {
                while (this.getNextItem() != null) {
                    if (item.compareTo(this) < 0) {
                        insert(item);
                        break;
                    }
                }
                if (this.getNextItem() == null && item.compareTo(this) > 0) {
                    this.setNextItem(item);
                }
            }
        }
    }
}
