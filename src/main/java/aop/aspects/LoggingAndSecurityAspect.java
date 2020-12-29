package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* aop.UniLibrary.get*())")
        private void allGetMethodFromUniLibrary() {
    }

    @Pointcut("execution(* aop.UniLibrary.return*())")
    private void allReturnMethodFromUniLibrary() {
    }

    @Pointcut("allGetMethodFromUniLibrary() || allReturnMethodFromUniLibrary()")
    private void allGetAndReturnMethodFromUniLibrary() {
    }

    @Before("allGetMethodFromUniLibrary()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: writing Log #1");
    }

    @Before("allGetMethodFromUniLibrary()")
    public void beforeReturnLoggingAdvice() {
        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
    }

    @Before("allGetAndReturnMethodFromUniLibrary()")
    public void beforeGetAndReturnMethodFromUniLibrary() {
        System.out.println("beforeGetAndReturnMethodFromUniLibrary: writing Log #3");
    }




//    @Pointcut("execution(* get*())")
//    private void allGetMethods() {}
//
//    @Before("allGetMethods()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetBookAdvice: попытка получить книгу/журнал");
//    }
//
//    @Before("allGetMethods())")
//    public void beforeGetSecurityAdvice() {
//        System.out.println("beforeGetSecurityAdvice: проверка прав на поулчение книги/журнала");
//    }

}
