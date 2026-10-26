package csc372module6;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        // Store 10 student objects in the ArrayList.
        students.add(new Student(106, "Ethan", "Lake Wales, FL"));
        students.add(new Student(102, "Liam", "Tampa, FL"));
        students.add(new Student(110, "Olivia", "Miami, FL"));
        students.add(new Student(101, "Noah", "Lakeland, FL"));
        students.add(new Student(108, "Emma", "Kissimmee, FL"));
        students.add(new Student(104, "James", "Winter Haven, FL"));
        students.add(new Student(107, "Ava", "Haines City, FL"));
        students.add(new Student(103, "Lucas", "Bartow, FL"));
        students.add(new Student(109, "Mia", "Plant City, FL"));
        students.add(new Student(105, "Sophia", "Orlando, FL"));

        // Display the original list.
        System.out.println("===== ORIGINAL STUDENT LIST =====");
        displayStudents(students);

        // Sort students alphabetically by name.
        SelectionSort.sort(students, new NameComparator());

        System.out.println("\n===== STUDENTS SORTED BY NAME =====");
        displayStudents(students);

        // Sort students by roll number.
        SelectionSort.sort(students, new RollNoComparator());

        System.out.println("\n===== STUDENTS SORTED BY ROLL NUMBER =====");
        displayStudents(students);
    }

    public static void displayStudents(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}