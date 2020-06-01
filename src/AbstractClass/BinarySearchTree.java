package AbstractClass;

/**
 * @author mingyux
 */
public class BinarySearchTree {
    String value = "10, 11, 1, 4, 51, 3";
    ListConcrete listConcrete;

    public BinarySearchTree(String value, ListConcrete listConcrete) {
        this.value = value;
        this.listConcrete = listConcrete;
    }

    public BinarySearchTree(ListConcrete listConcrete) {
        this.listConcrete = listConcrete;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ListConcrete getListConcrete() {
        return listConcrete;
    }

    public void setListConcrete(ListConcrete listConcrete) {
        this.listConcrete = listConcrete;
    }
    public ListItem addItem(ListConcrete listConcrete){
        int compareValue = listConcrete.getCurrent().compareTo(listConcrete) ;
        if(listConcrete == null){
            listConcrete = new ListConcrete(2);
            return listConcrete;
        }
        if(compareValue < 0){
            listConcrete.setPreviousItem(addItem(listConcrete.getCurrent().getPrevious()));
        }else {
            listConcrete.setNextItem(addItem(listConcrete.getNext()));
        }
        return listConcrete;
    }
}
