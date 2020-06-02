package AbstractClass;

public class Main {
    public static void main(String[] args) {
        String insertString = "2, 4, 1, 10, 16, 22, 5";
        String[] splitArray = insertString.split(",");
        ListConcrete rootConcrete = new ListConcrete(100);
        for (String value : splitArray) {
            int numberValue = Integer.parseInt(value.trim());
            ListConcrete listConcrete = new ListConcrete(numberValue);
            rootConcrete.add(listConcrete);
        }
        //print out the list
        while(rootConcrete.getNext()!=null){
            System.out.println(rootConcrete.getValue());
            rootConcrete = rootConcrete.getNext();
        }
    }
}
