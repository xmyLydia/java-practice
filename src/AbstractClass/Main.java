package AbstractClass;

public class Main {
    public static void main(String[] args) {
       /* MyList myList = new MyList(null);
        myList.traverse(myList.getRoot());

        String stringData = "5 4 7 8 47 545";
        String[] data = stringData.split(" ");
        for (String str : data) {
            myList.addItem(new Node(str));
        }
        myList.traverse(myList.getRoot());

        myList.removeItem(new Node("5"));
        myList.traverse(myList.getRoot());
*/
        BinarySearchTree bTree = new BinarySearchTree(null);
        String stringData = "This is a rainy day";
        String[] data = stringData.split(" ");
        for (String str : data) {
            bTree.addItem(new Node(str));
        }
        bTree.traverse(bTree.getRoot());
    }
}
