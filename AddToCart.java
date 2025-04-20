import java.util.HashMap;

public class AddToCart {

    HashMap<String, Integer> FoodItem = new HashMap<>();
    HashMap<String, Double> ItemPrice = new HashMap<>();

    public String item;
    public int quantity;

    public void addItem(String item) {
        int quantity=1;

        if(!FoodItem.containsKey(item)) {
            FoodItem.put(item, 1);
            System.out.println("Item got added Successfully " + FoodItem);
        }
    }

    public void updateQuantity(String item, int quantity) {
       int updatedQuantity = FoodItem.get(item).intValue() + quantity;
       if(updatedQuantity >= 1) {

           FoodItem.put(item, updatedQuantity);
           System.out.println(FoodItem);
       } else {
           return;
       }

    }

    public void removeItem(String item) {
        if(FoodItem.containsKey(item)) {
            FoodItem.remove(item);
            System.out.println("Item got Successfully deleted from the cart");
            System.out.println(FoodItem);
        }
    }
}
