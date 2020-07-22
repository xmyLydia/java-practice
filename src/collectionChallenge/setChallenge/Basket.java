package collectionChallenge.setChallenge;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by dev on 17/02/2016.
 */
public class Basket {
    private final String name;
    private final Map<StockItem, Integer> list;

    public Basket(String name) {
        this.name = name;
        this.list = new HashMap<>();
    }

    public int addToBasket(StockItem item, int quantity) {
        if (item != null) {
            int availableStock = item.quantityInStock() - item.getReserve();
            if (quantity > 0 && quantity < availableStock) {
                int inBasket = list.getOrDefault(item, 0);
                list.put(item, inBasket + quantity);
                return inBasket;
            }
        }
        return 0;
    }

    public void unReserve(StockItem item, int quantity) {
        if (item != null) {
            if (this.list.containsKey(item)) {
                int previousReserved = item.getReserve();
                if (quantity <= previousReserved) {
                    item.setReserve(previousReserved - quantity);
                } else {
                    System.out.println("You can't un-reserve item more than previously reserved amount");
                }
            }
        } else {
            System.out.println("this item is not added into basket before.");
        }
    }

    public double checkout() {
        int cost = 0;
        for (Map.Entry<StockItem, Integer> entry : list.entrySet()) {
            int quantity = entry.getValue();
            StockItem item = entry.getKey();
            cost += quantity + item.getPrice();
            item.setReserve(0);
            item.adjustStock((-1) * quantity);
        }
        this.list.clear();
        return cost;
    }

    public Map<StockItem, Integer> Items() {
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\nShopping basket " + name + " contains " + list.size() + " items\n";
        double totalCost = 0.0;
        for (Map.Entry<StockItem, Integer> item : list.entrySet()) {
            s = s + item.getKey() + ". " + item.getValue() + " purchased\n";
            totalCost += item.getKey().getPrice() * item.getValue();
        }
        return s + "Total cost " + totalCost;
    }
}
