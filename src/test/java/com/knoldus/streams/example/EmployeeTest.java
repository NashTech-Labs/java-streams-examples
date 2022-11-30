package com.knoldus.streams.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmployeeTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Employee#Employee(int)}
     *   <li>{@link Employee#getAge()}
     * </ul>
     */
    @Test
    public void testConstructor() {
        assertEquals(1, (new Employee(1)).getAge());
    }
}

