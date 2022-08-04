package Demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class Logging {
    @Before("execution(* Demo.ShoppingCart.checkout(..))")
    // * in the above statement infers regardless of return type
    public void logger(JoinPoint jp) {
        System.out.println(Arrays.stream(jp.getArgs()).toList()); // Prints out all the arguments of the checkout method
        System.out.println("USER ABOUT TO PERFORM AN ACTION");
    }
    @Pointcut("execution(* Demo.ShoppingCart.getCartItems())")
    public void afterGettingItems(){}

    @After("execution(void *.*.checkout(..))")
    //The above statement implies that this method is invoked when any class or method calls a .checkout method
    public void report() {
        System.out.println("USER PERFORMED AN ACTION");
    }

    @AfterReturning(pointcut = "afterGettingItems()", returning = "cartItems")
    public void logReturnReport(int cartItems){
        System.out.println("Return Value"+ cartItems);
    }
}
