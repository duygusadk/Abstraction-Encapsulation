import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final List<InventoryItem> inventory = FileIO.loadFile();

    public static void main(String[] args) {
        listItems();
    }

    private static void listItems() {

        if (inventory.isEmpty()) {
            System.out.println("No items in inventory.");
        } else {
            for (InventoryItem item : inventory) {
                System.out.println(item.getItemDetails());
            }
        }
    }
}