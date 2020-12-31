package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {
    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature + : " + methodSignature);
        System.out.println("methodSignature.getMethod + : " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType + : " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName+ : " + methodSignature.getName());

        if(methodSignature.getName().equals("addBook")) {
            Object[] argument = joinPoint.getArgs();
                for(Object obj: argument) {
                    if(obj instanceof Book) {
                        Book myBook = (Book) obj;
                        System.out.println("Информация о книге: название - " + myBook.getName()
                                + "автор - " + myBook.getAuthor() + "год издания - " + myBook.getYearOfPublication());
                    }

                    else if(obj instanceof String) {
                        System.out.println("книгу в библиотеку добавляет: " + obj);
                    }
                }
        }


        System.out.println("beforeAddLoggingAdvice: логирование попытки получить книгу/журнал");
        System.out.println("-----------------------------");
    }

//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodFromUniLibrary() {
//    }

//    @Pointcut("allGetMethodFromUniLibrary() || allReturnMethodFromUniLibrary()")
//    private void allGetAndReturnMethodFromUniLibrary() {
//    }
//
//    @Before("allGetMethodFromUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allGetMethodFromUniLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//    }

//    @Before("allGetAndReturnMethodFromUniLibrary()")
//    public void beforeGetAndReturnMethodFromUniLibrary() {
//        System.out.println("beforeGetAndReturnMethodFromUniLibrary: writing Log #3");
//    }
//






}
