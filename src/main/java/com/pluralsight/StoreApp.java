import com.pluralsight.Product;
import java.util.ArrayList;
import java.util.Scanner;

public class StoreApp {
    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();
        System.out.println("We carry the following inventory: ");
        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.printf("id: %d %s - Price: $%.2f%n",
                    p.getId(), p.getName(), p.getPrice());
        }
    }
    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();
        // inventory of music instruments
        inventory.add(new Product(1, "Electric Guitar", 1699.00f));
        inventory.add(new Product(2, "Bass Guitar", 1350.00f));
        inventory.add(new Product(3, "Keyboard", 1400.00f));
        inventory.add(new Product(4, "Microphone", 1800.00f));
        inventory.add(new Product(5, "Drums", 4000.00f));








// this method loads product objects into inventory
// and its details are not shown
        return inventory;
    }


}
