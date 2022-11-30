package com.knoldus.streams.example;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.knoldus.streams.example.PartitioningBy.getStudentList;

public class Main {

    public static void main(String[] args) {
        Map<String, List<Student>> groupByTeachers = getStudentList().stream()
                .collect(Collectors.groupingBy(Student::getTeacher));
        System.out.println(groupByTeachers);


        Map<Boolean, List<Student>> partitioningByLevel = getStudentList().stream()
                .collect(Collectors.partitioningBy(e -> e.getLevel()>101));
        System.out.println(partitioningByLevel);
    }
}