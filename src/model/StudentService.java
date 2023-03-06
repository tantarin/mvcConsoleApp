package model;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    List<Student> students = new ArrayList<>();

    public StudentService() {
        students.add(new Student(1, "Ivan", "Ivanov"));
        students.add(new Student(2, "Petr", "Petrov"));
        students.add(new Student(3, "Ira", "Smirnova"));
    }
}
