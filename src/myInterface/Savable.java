package myInterface;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mingyux
 */
public interface Savable {
    /**
     * @return all saved objects as list
     */
    List<SavedObject> getValues();


    /**
     * @param values populate fields
     */
    void populateFields(ArrayList<String> values);
}
