/**
 * Created by davids on 23/02/2017.
 */
public class Customer {

    private LoyaltyCard loyaltyCard;
    private String name;

    public Customer(LoyaltyCard loyaltyCard, String name) {
        this.loyaltyCard = loyaltyCard;
        this.name = name;
    }

    public LoyaltyCard getLoyaltyCard() {
        return loyaltyCard;
    }

    public String getName() {
        return name;
    }
}
