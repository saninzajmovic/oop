package org.example.week11.Task;

import java.io.*;
import java.util.*;

class StudentManagementSystem {
    public static void main(String[] args) throws IOException {
        String filename = "C:\\Users\\Sanin\\IdeaProjects\\oop-labs\\src\\main\\java\\org\\example\\week11\\Task\\students.csv";
        StudentSystem ss = new StudentSystem("C:\\Users\\Sanin\\IdeaProjects\\oop-labs\\src\\main\\java\\org\\example\\week11\\Task\\students.csv");
        System.out.println(ss.getLongestNameStudent());
        //System.out.println(StudentSystem.readStudents(filename));;
    }
}

class Student {
//    private String id;
//    private String name;
//    private String university;
//    private String department;
//    private String GPA;

    private int id;
    private String name;
    private String university;
    private String department;
    private double GPA;

    public Student(int id, String name, String university, String department, double GPA) {
        this.id = id;
        this.name = name;
        this.university = university;
        this.department = department;
        this.GPA = GPA;
    }

    public Student(String line) {
        List<String> lista = new ArrayList<>(Arrays.asList(line.split(",")));
        this.id = Integer.valueOf(lista.get(0));
        this.name = lista.get(1);
        this.university = lista.get(2);
        this.department = lista.get(3);
        this.GPA = Double.valueOf(lista.get(4));
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniversity() {
        return this.university;
    }

    public void setUniversity(String University) {
        this.university = university;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getGPA() {
        return this.GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String message) {
        super(message);
    }
}

class EmptyStudentListException extends RuntimeException { // unchecked
    public EmptyStudentListException(String message) {
        super(message);
    }
}

class StudentSystem {
    private List<Student> students;

    public StudentSystem(String filename) {
        this.students = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                students.add(new Student(line));
            }
            validateStudentData(students);
        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        } catch (StudentNotFoundException e) {
            e.printStackTrace();
        }
    }

    public StudentSystem(List<Student> students) {
        this.students = students;
    }


    public static List<Student> readStudents(String filename) throws IOException {
        List<Student> studentsList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = br.readLine()) != null) {
            studentsList.add(new Student(line));
        }
        return studentsList;
    }

    public int noOfStudents() {
        return students.size();
    }

    public Optional<Student> getStudentById (int id) {
        Optional<Student> optionalStudent;
        for (Student student : this.students) {
            if (student.getId() == id) {
                return Optional.of(student);
            }
        }
        return Optional.ofNullable(null);
    }

    public Student getHighestGPAStudent() {
        if (this.students.isEmpty()) {
            throw new EmptyStudentListException("List of students is empty");
        }
        Student highestGPAStudent = new Student(0, "a", "a", "a", 0);
        for (Student student : this.students) {
            if (student.getGPA() > highestGPAStudent.getGPA()) {
                highestGPAStudent = student;
            }
        }
        return highestGPAStudent;
    }

    ///If the list is empty, throw a custom exception named with the message "List of students is empty."

    public Student getLongestNameStudent() {
        if (this.students.isEmpty()) {
            throw new EmptyStudentListException("List of students is empty");
        }
        Student longestName = new Student(0, "", "", "", 0);
        for (Student student : this.students) {
            if (student.getName().length() > longestName.getName().length()) {
                longestName = student;
            }
        }
        return longestName;
    }

    private void validateStudentData(List<Student> studentsList) throws StudentNotFoundException {
        for (Student student : studentsList) {
            if (!(6 <= student.getGPA() && student.getGPA() <= 10)) {
                throw new StudentNotFoundException("Read data has invalid rows");
            }
        }
    }
}