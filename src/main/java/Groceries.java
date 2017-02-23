import java.util.HashMap;
import java.util.Map;

/**
 * Created by davids on 23/02/2017.
 */
public class Groceries {

    private Map<String, Integer> shoppingCart;

    public Groceries() {
        this.shoppingCart = new HashMap<>();
    }

    public Map<String, Integer> getShoppingCart() {
        return shoppingCart;
    }

    public void buyItem(String item, int quantity) {
        if (shoppingCart.containsKey(item)) {
            shoppingCart.put(item, shoppingCart.get(item) + quantity);
        }else {
            shoppingCart.put(item, quantity);
        }
    }
}
