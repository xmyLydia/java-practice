package AbstractClass;

public class MyList implements NodeList {
    private ListItem root = null;

    public MyList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (this.root == null) {
            this.root = item;
            return true;
        }
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison < 0) {
                //new one is greater, move right
                if (currentItem.nextItem != null) {
                    currentItem = currentItem.nextItem;
                } else {
                    //there is no nextItem, reach at the end of the list
                    currentItem.setNextItem(item);
                    item.setPreviousItem(currentItem);
                    return true;
                }
            } else if (comparison > 0) {
                //new item is less, insert before
                if (currentItem.getPreviousItem() != null) {
                    currentItem.getPreviousItem().setNextItem(item);
                    item.setPreviousItem(currentItem.getPreviousItem());
                    item.setNextItem(currentItem);
                    currentItem.setPreviousItem(item);
                } else {
                    //the root
                    item.setNextItem(root);
                    root.setPreviousItem(item);
                    root = item;
                }
                return true;
            } else {
                //equal
                System.out.println(item.getValue() + " is already pressed.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {

        if (item != null) {
            System.out.println("Deleting item: " + item.getValue());
        }
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison == 0) {
                //found it
                if (this.root == currentItem) {
                    this.root = currentItem.nextItem;
                } else {
                    currentItem.getPreviousItem().setNextItem(currentItem.getNextItem());
                    if (currentItem.getNextItem() != null) {
                        currentItem.getNextItem().setPreviousItem(currentItem.getPreviousItem());
                    }
                }
                return true;
            } else if (comparison < 0) {
                currentItem = currentItem.getNextItem();
            } else {
                //comparison > 0
                //we are at the item greater than then one we plan to delete
                //we can't do anything else
                return false;
            }
        }
        //we have reached the end of the list
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.nextItem;
            }
        }
    }
}
