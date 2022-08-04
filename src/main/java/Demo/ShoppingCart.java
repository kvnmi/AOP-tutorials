package Demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public int cartItems = 23;
    public void checkout(String status, int numOfProd) {
        System.out.println("You have successfully bought the item");
    }

    public int getCartItems() {
        return cartItems;
    }
}
