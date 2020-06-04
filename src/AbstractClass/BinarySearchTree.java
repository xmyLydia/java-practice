package AbstractClass;

/**
 * @author mingyux
 */
public class BinarySearchTree {
    String value = "10, 11, 1, 4, 51, 3";
    Node node;

    public BinarySearchTree(String value, Node node) {
        this.value = value;
        this.node = node;
    }

    public BinarySearchTree(Node node) {
        this.node = node;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }
    public ListItem addItem(Node node){
        int compareValue = node.compareTo(node) ;
        if(node == null){
            node = new Node(2);
            return node;
        }
        if(compareValue < 0){
            node.setPreviousItem(addItem(node.getPrevious()));
        }else {
            node.setNextItem(addItem(node.getNext()));
        }
        return node;
    }
}
