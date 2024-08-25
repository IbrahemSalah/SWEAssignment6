package com.example.DBDemo.edu.mum.cs.cs425.demos.studentrecordsmgmtapp;

import com.example.DBDemo.edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model.Student;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyStudentRecordsMgmtApp {

    public static void main(String[] args) {

        ArrayList<Student> studentList = new ArrayList<>();

        Student s1 = new Student();
        s1.setId(110001);
        s1.setName("Dave");
        s1.setDateOfAdmission("11/18/1951");

        Student s2 = new Student();
        s2.setId(110002);
        s2.setName("Anna");
        s2.setDateOfAdmission("12/07/1990");

        Student s3 = new Student();
        s3.setId(110003);
        s3.setName("Erica");
        s3.setDateOfAdmission("01/31/1974");

        Student s4 = new Student();
        s4.setId(110004);
        s4.setName("Carlos");
        s4.setDateOfAdmission("08/22/2009");

        Student s5 = new Student();
        s5.setId(110005);
        s5.setName("Bob");
        s5.setDateOfAdmission("03/05/1990");


        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);

        printListOfStudents(studentList);

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 14, 35, 21, 20, 49, 70, 8));

        System.out.println();
        System.out.println();

        printHelloWorld(numbers);

        System.out.println();
        System.out.println();

        System.out.println("Second largest = " + findSecondBiggest(numbers));

    }


    static void printListOfStudents(ArrayList<Student> studentList) {
        for (Student s : studentList) {
            System.out.print(s.getId() + "  , ");
            System.out.print(s.getName()+ "  , ");
            System.out.print(s.getDateOfAdmission()+ "  , ");
            System.out.println();
        }
    }

    static List<Student> getListOfPlatinumAlumniStudents(ArrayList<Student> studentList) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return studentList.stream()
                .filter(student -> {
                    LocalDate admissionDate = LocalDate.parse(student.getDateOfAdmission(), formatter);
                    int age = Period.between(admissionDate, LocalDate.now()).getYears();
                    return age > 30;
                })
                .collect(Collectors.toList());
    }

    static void printHelloWorld(ArrayList<Integer> intList) {
        for (int number : intList) {
            if (number % 5 == 0 && number % 7 == 0) {
                System.out.println("HelloWorld");
            } else if (number % 5 == 0) {
                System.out.println("Hello");
            } else if (number % 7 == 0) {
                System.out.println("World");
            }
        }
    }

    static int findSecondBiggest(ArrayList<Integer> intList) {
        if (intList == null || intList.size() < 2) {
            return -1; // this value means wrong input
        }

        int first, second;

        if (intList.get(0) > intList.get(1)) {
            first = intList.get(0);
            second = intList.get(1);
        } else {
            first = intList.get(1);
            second = intList.get(0);
        }

        for (int i = 2; i < intList.size(); i++) {
            if (intList.get(i) > first) {
                second = first;
                first = intList.get(i);
            } else if (intList.get(i) > second && intList.get(i) != first) {
                second = intList.get(i);
            }
        }
        return second;
    }
}

