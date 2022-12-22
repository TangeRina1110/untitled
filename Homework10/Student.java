package Homework10;

public class Student {
    private String Name;
    private String Surname;
    private String speciality;
    private int course;
    private String group;
    private int gpa;

    public Student(String Name, String Surname, String speciality, int course, String group, int gpa) {
        this.Name = Name;
        this.Surname = Surname;
        this.speciality = speciality;
        this.course = course;
        this.group = group;
        this.gpa = gpa;
    }

    public int getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", speciality='" + speciality + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}