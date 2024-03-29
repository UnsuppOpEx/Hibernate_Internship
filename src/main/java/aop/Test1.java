package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        Book book = context.getBean("book", Book.class);
//        uniLibrary.getBook();
//        uniLibrary.getMagazine();
//        uniLibrary.returnMagazine();
//        uniLibrary.addBook("Anton", book);
//        uniLibrary.addMagazine();

//        uniLibrary.returnBook();
        context.close();
    }
}
