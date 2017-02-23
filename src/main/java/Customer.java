import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by davids on 23/02/2017.
 */
public class Customer {

    private LoyaltyCard loyaltyCard;
    private String name;
    private Map<LocalDate, Groceries> groceriesMap;

    public Customer(LoyaltyCard loyaltyCard, String name) {
        this.loyaltyCard = loyaltyCard;
        this.name = name;
        groceriesMap = new HashMap<>();
    }

    public LoyaltyCard getLoyaltyCard() {
        return loyaltyCard;
    }

    public String getName() {
        return name;
    }


}
