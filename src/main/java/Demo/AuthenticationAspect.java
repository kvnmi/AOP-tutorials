package Demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {
    @Pointcut("within(Demo..*)")
    public void authenticationPoint () {}

    @Pointcut("within(Demo..*)")
    public void authorizationPoint () {}

    @Before("authenticationPoint() && authorizationPoint()")
    public void authenticate() {
        System.out.println("User is authenticated");
    }
}

