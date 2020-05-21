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
    void populateFields(List<String> list);


    /**
     * @param values populate fields
     */
    List<String> generateFieldsList();
}
