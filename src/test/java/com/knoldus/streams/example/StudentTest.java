package com.knoldus.streams.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StudentTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Student#Student(String, double, String)}
     *   <li>{@link Student#toString()}
     *   <li>{@link Student#getClassName()}
     *   <li>{@link Student#getLevel()}
     *   <li>{@link Student#getTeacher()}
     * </ul>
     */
    @Test
    public void testConstructor() {
        Student actualStudent = new Student("Teacher", 10.0d, "Class Name");
        String actualToStringResult = actualStudent.toString();
        assertEquals("Class Name", actualStudent.getClassName());
        assertEquals(10.0d, actualStudent.getLevel(), 0.0);
        assertEquals("Teacher", actualStudent.getTeacher());
        assertEquals("Student [teacher=Teacher, level=10.0, className=Class Name]", actualToStringResult);
    }

    /**
     * Method under test: {@link Student#Student(String, double, String)}
     */
    @Test
    public void testConstructor2() {
        Student actualStudent = new Student("Teacher", 10.0d, "Class Name");

        assertEquals("Class Name", actualStudent.getClassName());
        assertEquals("Teacher", actualStudent.getTeacher());
        assertEquals(10.0d, actualStudent.getLevel(), 0.0);
    }
}

