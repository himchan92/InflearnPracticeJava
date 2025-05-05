package javaBasic.class1;

public class ClassStart4 {

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "학생";
        student.age = 20;
        student.grade = 100;

        Student student1 = new Student();
        student1.name = "학생2";
        student1.age = 18;
        student1.grade = 90;

        Student[] students = {student, student1};

        for(int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + ", " + students[i].age + ", " + students[i].grade);
        }

        for(Student s : students) {
            System.out.println(s.name + ", " + s.age + ", " + s.grade);
        }
    }
}
