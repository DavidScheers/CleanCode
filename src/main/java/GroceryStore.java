import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by davids on 23/02/2017.
 */
public class GroceryStore {

    private List<Customer> customerList;

    public GroceryStore() {
        this.customerList = new ArrayList<>();
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void addNewCustomer(Customer customer) {
        customerList.add(customer);
    }

    public Customer searchCustomerByBarcode(String barcode) throws Exception {
        for (Customer customer : customerList) {
            if (barcodeMatches(barcode, customer)) {
                return customer;
            }
        }
        throw new Exception("Customer not found");
    }

    private boolean barcodeMatches(String barcode, Customer customer) {
        return customer.getLoyaltyCard().getBarcode().equals(barcode);
    }

    public List<Groceries> getAllGroceriesFromCustomerOfCertainDate (Customer customer, LocalDate day){

        for (LocalDateTime dateTime:customer.getGroceriesMap().keySet())
        {
            if (dateTime.toLocalDate() == day)
                
        };
    }
}
