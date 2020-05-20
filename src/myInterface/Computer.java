package myInterface;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mingyux
 */
public class Computer implements Savable {
    String name;
    String storage;
    List<SavedObject> objects = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }


    public List<SavedObject> getObjects() {
        return objects;
    }

    public void setObjects(List<SavedObject> objects) {
        this.objects = objects;
    }


    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", storage='" + storage + '\'' +
                ", objects=" + objects +
                '}';
    }

    @Override
    public List<SavedObject> getValues() {
        return objects;
    }

    @Override
    public void populateFields(ArrayList<String> values) {
        if (values != null) {
            for (String field : values) {
                if (field.contains("name")) {
                    String[] nameValues = field.split(":");
                    if (nameValues.length > 1) {
                        this.setName(nameValues[1].trim());
                    }
                    break;
                }
            }
        }
    }
}
