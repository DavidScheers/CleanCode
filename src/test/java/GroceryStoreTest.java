import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * Created by davids on 23/02/2017.
 */
public class GroceryStoreTest {


    @Test
    public void addNewCustomer() throws Exception {
        LoyaltyCard testCard = new LoyaltyCard("15156454", 0);
        Customer testCustomer = new Customer(testCard, "David");
        GroceryStore testStore = new GroceryStore();
        testStore.addNewCustomer(testCustomer);

        Assertions.assertThat(testStore.getCustomerList()).contains(testCustomer);
    }

    @Test
    public void customerListDoesNotContainNotAddedCustomers() throws Exception {
        LoyaltyCard testCard = new LoyaltyCard("15156454", 0);
        GroceryStore testStore = new GroceryStore();
        Customer testCustomer = new Customer(testCard, "David");

        Assertions.assertThat(testStore.getCustomerList()).doesNotContain(testCustomer);
    }

    @Test
    public void searchCustomerByBarcode() throws Exception {
        LoyaltyCard testCard = new LoyaltyCard("15156454", 0);
        GroceryStore testStore = new GroceryStore();
        Customer testCustomer = new Customer(testCard, "David");
        testStore.addNewCustomer(testCustomer);

        Assertions.assertThat(testStore.searchCustomerByBarcode("15156454")).isEqualTo(testCustomer);
    }
}
