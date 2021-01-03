package aop;

public class Student {
    private String nameSurname;
    private int course;
    private Double avgGradle;

    public Student(String nameSurname, int course, Double avgGradle) {
        this.nameSurname = nameSurname;
        this.course = course;
        this.avgGradle = avgGradle;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Double getAvgGradle() {
        return avgGradle;
    }

    public void setAvgGradle(Double avgGradle) {
        this.avgGradle = avgGradle;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameSurname='" + nameSurname + '\'' +
                ", course=" + course +
                ", avgGradle=" + avgGradle +
                '}';
    }
}