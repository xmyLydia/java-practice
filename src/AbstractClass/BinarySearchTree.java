package AbstractClass;

/**
 * @author mingyux
 */
public class BinarySearchTree implements NodeList {
    private ListItem root = null;

    public BinarySearchTree(ListItem root) {
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
                if (currentItem.getNextItem() != null) {
                    currentItem = currentItem.getNextItem();

                } else {
                    currentItem.setNextItem(item);
                    return true;
                }

            } else if (comparison > 0) {
                if (currentItem.getPreviousItem() != null) {
                    currentItem = currentItem.getPreviousItem();
                } else {
                    currentItem.setPreviousItem(item);
                    return true;
                }

            } else {
                //comparison > 0
                //we are at the item greater than then one we plan to delete
                //we can't do anything else
                System.out.println(item.getValue() + " is already added");
                return false;
            }
        }
        //we have reached the end of the list
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root != null) {
            traverse(root.getPreviousItem());
            System.out.println(root.getValue());
            traverse(root.getNextItem());
        }
    }


}
