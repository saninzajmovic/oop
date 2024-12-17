package org.example.week11.Task;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class StudentSystemTest {
    String filename = "C:\\Users\\Sanin\\IdeaProjects\\oop-labs\\src\\main\\java\\org\\example\\week11\\Task\\students.csv";
    StudentSystem ss = new StudentSystem(filename);
    @Test
    public void testifStudentisPresent() {
        assertTrue(ss.noOfStudents() > 0, "There should be at least one student in the file");
    }

    @Test
    public void testStudentWithId100() {
        assertTrue(ss.getStudentById(100).isEmpty(), "Student with ID 100 should not exist");
    }

    @Test
    public void testHighestGPAStudent() {
        assertEquals(9.8, ss.getHighestGPAStudent().getGPA(), "Student with highest GPA should have GPA of 9.8");
    }

    @Test
    public void testExceptionForEmptyStudentList() {
        StudentSystem sS = new StudentSystem("C:\\Users\\Sanin\\IdeaProjects\\oop-labs\\src\\main\\java\\org\\example\\week11\\Task\\empty.csv");
        assertThrows(EmptyStudentListException.class, () -> {
            sS.getHighestGPAStudent();
        });
    }

    @Test
    public void testExceptionMessageForEmptyStudentList() {
        StudentSystem sS = new StudentSystem("C:\\Users\\Sanin\\IdeaProjects\\oop-labs\\src\\main\\java\\org\\example\\week11\\Task\\empty.csv");
        Exception exception = assertThrows(EmptyStudentListException.class, () -> {
            sS.getHighestGPAStudent();
        });
        assertEquals("List of students is empty", exception.getMessage());
    }

    @Test
    public void testNamesArray() throws IOException {
        ///Camila Wood, Alexander Thompson, Liam Taylor, Evelyn Jenkins, Michael Jackson
        List<Student> students = StudentSystem.readStudents(filename);
        List<String> expectedNames = new ArrayList<>(Arrays.asList("Camila Wood", "Alexander Thompson", "Liam Taylor", "Evelyn Jenkins", "Michael Jackson"));
        List<String> actualNames = students.stream().map(Student::getName).limit(5).collect(Collectors.toList());

        assertEquals(expectedNames, actualNames);
    }

    @Test
    public void testSameStudent() {
        assertEquals(ss.getHighestGPAStudent(), ss.getStudentById(12).get());
    }

    @Test
    public void testExceptionMessageForEmptyStudentList2() {
        StudentSystem sS = new StudentSystem("C:\\Users\\Sanin\\IdeaProjects\\oop-labs\\src\\main\\java\\org\\example\\week11\\Task\\empty.csv");
        Exception exception = assertThrows(EmptyStudentListException.class, () -> {
            sS.getLongestNameStudent();
        });
        assertEquals("List of students is empty", exception.getMessage());
    }

    @Test
    public void testLongestNameStudent() {
        assertEquals("Benjamin Richardson", ss.getLongestNameStudent().getName());
    }

    @Test
    public void testConstructor() {
        Student s1 = new Student(1, "namw", "department", "uni", 9.2);
        Student s2 = new Student(2, "namw", "departmesadnt", "uasni", 9);
        Student s3 = new Student(3, "nasmw", "depassrtment", "unsi", 3);
        List<Student> studenti= new ArrayList<>(Arrays.asList(s1, s2,s3));
        StudentSystem sSys = new StudentSystem(studenti);
        assertEquals(s1, sSys.getHighestGPAStudent());
    }

}