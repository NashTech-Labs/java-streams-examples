package com.knoldus.streams.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy {

    public static void main(String[] args) {
        Map<String, List<Student>> groupByTeachers = getStudentList().stream()
                .collect(Collectors.groupingBy(Student::getTeacher));
        System.out.println(groupByTeachers);
    }

    private static List<Student> getStudentList() {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("A", 141, "Intro to Web"));
        studentList.add(new Student("B", 142, "Advanced Java"));
        studentList.add(new Student("C", 141, "Intro to Cobol"));
        studentList.add(new Student("A", 141, "Intro to Web"));
        studentList.add(new Student("B", 142, "Advanced Web"));
        return studentList;
    }
}
