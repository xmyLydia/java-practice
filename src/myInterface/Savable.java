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
    List<Object> getValues();

    /**
     * @param list populate fields from arrayList
     */
    void populateFields(ArrayList<Object> list);
}
