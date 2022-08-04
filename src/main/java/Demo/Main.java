package Demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(BeanConfig.class);
        var cart_1 = context.getBean(ShoppingCart.class);
        cart_1.checkout("Successful", 5);
    }
}
