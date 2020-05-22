package myInterface;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mingyux
 */
public class Monster implements Savable {
    String name;
    int hitPoint;
    String style;

    public Monster(String name, int hitPoint, String style) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.style = style;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public void populateFields(List<String> list) {
        if (list != null && list.size() >= 3) {
            setName(list.get(0));
            setHitPoint(Integer.parseInt(list.get(1)));
            setStyle(list.get(2));
        }
    }

    @Override
    public List<String> generateFieldsList() {
       List<String> values = new ArrayList<>();
       values.add(0, getName());
       values.add(1, String.valueOf(getHitPoint()));
       values.add(2, getStyle());
       return values;
    }
}
