package myInterface;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer implements Savable {
    private String name;
    private String material;
    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void populateFields(List<String> list) {
        if (list != null && !list.isEmpty() && list.size() >= 3) {
            setName(list.get(0));
            setMaterial(list.get(1));
            setWeight(Double.parseDouble(list.get(2)));
        }
    }

    @Override
    public List<String> generateFieldsList() {
        List<String> fields = new ArrayList<>();
        fields.add(0, getName());
        fields.add(1, getMaterial());
        fields.add(2, String.valueOf(getWeight()));
        return fields;
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
                "name='" + name + '\'' +
                ", material='" + material + '\'' +
                ", weight=" + weight +
                '}';
    }
}
