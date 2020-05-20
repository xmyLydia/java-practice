package myInterface;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer implements Savable {
    String name;
    List<SavedObject> objectList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public List<SavedObject> getValues() {
        return objectList;
    }

    @Override
    public void populateFields(ArrayList<String> values) {
        if (values != null) {
            for (String field : values) {
                if (field.contains("name")) {
                    this.setName(field);
                    break;
                }
            }
        }
    }


}
