package edu.cscc;
BAD CODE;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author musab fiqi
 * 2019-11-05
 * Comparing Students by various means
 */
public class Main {

    public static void main(String[] args) {
        Student[] students = TestData.createStudents();

        // Sort by Last Name
        Arrays.sort(students,new Comparator<Student>() {
            public int compare(Student s1,Student s2) {
                String lastname1 = s1.getLastName();
                String lastname2 = s2.getLastName();
                return lastname1.compareTo(lastname2);
            }
        });
        printStudentList("Students Sorted By LastName",students);

        //Sort by Major
        Arrays.sort(students,new Comparator<Student>() {
            public int compare(Student s1,Student s2) {
                String major1 = s1.getMajor();
                String major2 = s2.getMajor();
                return major1.compareTo(major2);
            }
        });
        printStudentList("Students Sorted By Major",students);

        //Sort by Integer
        Arrays.sort(students,new Comparator<Student>() {
            public int compare(Student s1,Student s2) {
                Integer zip1 = s1.getZipcode();
                Integer zip2 = s2.getZipcode();
                return zip1.compareTo(zip2);
            }
        });
        printStudentList("Students Sorted By Zip Code",students);

        //Sort by GPA
        Arrays.sort(students,new Comparator<Student>() {
            public int compare(Student s1,Student s2) {
                Double gpa1 = s1.getGpa();
                Double gpa2 = s2.getGpa();
                return gpa2.compareTo(gpa1);
            }
        });
        printStudentList("Students Sorted By GPA",students);
    }

    /**
     * Print Student List Method
     * @param title Title
     * @param list List
     */
    private static void printStudentList(String title, Student[] list) {
        final String format = "%-12s %-12s %-18s %-12s %-12s\n";
        System.out.println(title);
        System.out.printf(format,"First Name","Last Name","Major","Zip Code","GPA");
        for (Student s : list) {
            System.out.printf(format,s.getFirstName(),s.getLastName(),s.getMajor(),s.getZipcode(),s.getGpa());
        }
        System.out.println("==============================================================\n");
    }
}
