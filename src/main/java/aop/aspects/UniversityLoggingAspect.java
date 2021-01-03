package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UniversityLoggingAspect {
//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice() {
//        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение списка студентов перед " +
//                " работтой метода getStudent");
//    }
//
//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void afterReturningGetStudentLoggingAdvice(List<Student> students) {
//        Student firstStudent = students.get(0);
//
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "Mr." + nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//
//        double avgGrade = firstStudent.getAvgGradle();
//        avgGrade = avgGrade + 1;
//        firstStudent.setAvgGradle(avgGrade);
//
//        System.out.println("afterReturningGetStudentLoggingAdvice: логируем получение списка студентов после " +
//                "работы метода getStudent");
//    }

//    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
//    public void afterThrowingGetStudentLoggingAdvice(Throwable exception) {
//        System.out.println("afterThrowingGetStudentLoggingAdvice: логируем выброс исключения "  + exception);
//    }

    @After("execution(* getStudents())")
     public void afterGetStudentsLoggingAdvice() {
        System.out.println("afterGetStudentsLoggingAdvice: логируем нормальное окончание работы метода или выброс исключения");
    }
}
