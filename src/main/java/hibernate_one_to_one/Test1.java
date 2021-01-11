package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;
        try {
//            Session session = factory.getCurrentSession();
//            Employee emp = new Employee("Anton", "Zemskov", "IT", 500);
//            Detail detail = new Detail("Ivanovo", "123456789", "zemskov@gmail.com");
//            emp.setEmpDetail(detail);
//
//            session.beginTransaction();
//            session.save(emp);
//            session.getTransaction().commit();
//
//            System.out.println("done!");

//            Session session = factory.getCurrentSession();
//            Employee emp = new Employee("Oleg", "Smirnov", "Sales", 700);
//            Detail detail = new Detail("Moskow", "987654321", "olejka@gmail.com");
//            emp.setEmpDetail(detail);
//
//            session.beginTransaction();
//            session.save(emp);
//            session.getTransaction().commit();
//
//            System.out.println("done!");

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Employee emp = session.get(Employee.class, 1);
//            System.out.println(emp.getEmpDetail());
//            session.getTransaction().commit();
//
//            System.out.println("done!");

            session = factory.getCurrentSession();

            session.beginTransaction();
            Employee emp = session.get(Employee.class, 2);
            session.delete(emp);

            session.getTransaction().commit();
            System.out.println("done!");
        }

        finally {
            session.close();
            factory.close();
        }
    }
}
