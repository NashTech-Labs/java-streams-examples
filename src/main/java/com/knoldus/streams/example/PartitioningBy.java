package com.knoldus.streams.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningBy {

    public static void main(String[] args) {
        Map<Boolean, List<Student>> partitioningByLevel = getStudentList().stream()
                .collect(Collectors.partitioningBy(e -> e.getLevel()>101));
        System.out.println(partitioningByLevel);
    }

    static List<Student> getStudentList() {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("A", 141, "Intro to Web"));
        studentList.add(new Student("B", 142, "Advanced Java"));
        studentList.add(new Student("C", 141, "Intro to Cobol"));
        studentList.add(new Student("A", 141, "Intro to Web"));
        studentList.add(new Student("B", 142, "Advanced Web"));
        return studentList;
    }
}
