/*
>                    __  __           _         
>                   |  \/  |   __ _  (_)  _ __  
>                   | |\/| |  / _` | | | | '_ \ 
>                   | |  | | | (_| | | | | | | |
>                   |_|  |_|  \__,_| |_| |_| |_|
*/

// Importing
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main (String [] args) {

        
        Scanner sc = new Scanner (System.in);

        // Welcome message
        System.out.println ("\n\nHello and welcome\n\n");



        // Containers for objects
        List <Student> students = new ArrayList <> ();
        List <Course> courses = new ArrayList <> ();
        List <Instructor> Instructors = new ArrayList <> ();


        /*
            [
                [
                    [
        TAKE INPUT
                    ]
                ]
            ]
        */
        boolean WHILE_OK = true;

        String chosen_section = ""; // User input

        while (WHILE_OK) {
            // Menu message
            System.out.println ("Which section you want?");
            System.out.println ("> Students\n> Courses\n> Instructor\n> EXIT");
            System.out.print ("Which one: ");
            
            chosen_section = sc.nextLine ().toLowerCase ();

            boolean ok_1 = Functions.CheckStrInput (chosen_section, "student");
            boolean ok_2 = Functions.CheckStrInput (chosen_section, "course");
            boolean ok_3 = Functions.CheckStrInput (chosen_section, "instructor");
            boolean ok_4 = Functions.CheckStrInput (chosen_section, "exit");

            /* ***************|😴😴😴😴😴😴😴😴😴😴😴😴😴😴😴😴😴😴😴😴😴😴😴😴😴😴😴😴😴😴😴😴😴😴|*************** */

            if (ok_1) {

                // Input what the user want to do in student section
                String usr_choose_in_student = "";
                boolean student_while_ok = true;

                while (student_while_ok) {
                    // Take process for the section
                    usr_choose_in_student = Functions.ShowMessageAndInputProcessForSection ("student");

                    if (Functions.CheckStrInput (usr_choose_in_student, "view")) { // VIEW ALL STUDENTS
                        if (students.isEmpty ()) {
                            Functions.SaySorryIfEmpty ("Students");
                            continue;
                        }
                        else {
                            for (final Student student : students) {
                                student.PrintAllInfo ();
                            }
                        }
                    }
                    else if (Functions.CheckStrInput (usr_choose_in_student, "add")) { // ADD STUDENT
                        // Taking student info
                        System.out.print ("Enter Full Name: ");
                        String full_name = sc.nextLine ();

                        System.out.print ("Enter Department: ");
                        String department = sc.nextLine ();

                        System.out.print ("Enter ID: ");
                        int id = sc.nextInt ();

                        System.out.print ("Enter Level: ");
                        int level = sc.nextInt ();

                        System.out.print ("Enter GPA: ");
                        double gpa = sc.nextDouble ();
                        sc.nextLine ();

                        // Create student object
                        Student new_student = new Student (full_name, department, id, level, gpa);

                        // Add student to the list
                        students.add (new_student);

                        System.out.println ("Student added successfully");

                    }

                    else if (Functions.CheckStrInput (usr_choose_in_student, "edit")) {
                        // Ask for the student ID to edit it
                        System.out.print ("Enter Student ID to edit: ");
                        int search_id = sc.nextInt ();
                        sc.nextLine ();

                        Student found_student = Functions.SearchFor (students, search_id); // Search about it

                        if (found_student != null) {
                            // Show message
                            System.out.println ("# Editing Student: " + found_student.getFullName ());

                            // What do you want to edit
                            System.out.print ("> Name\n> Department\n> ID\n> Level\n> GPA\n----->");
                            String field_to_edit = sc.nextLine ().toLowerCase ();

                            if (Functions.CheckStrInput (field_to_edit, "name")) {
                                /* EDIT THE NAME */
                                System.out.print ("Enter new name: ");
                                String new_name = sc.nextLine ();
                                found_student.setFullName (new_name);
                                System.out.println ("Name updated successfully");
                            }
                            else if (Functions.CheckStrInput (field_to_edit, "department")) {
                                /* EDIT THE DEPARTMENT */
                                System.out.print ("Enter new department: ");
                                String new_department = sc.nextLine ();
                                found_student.setDepartment (new_department);
                                System.out.println ("Department updated successfully");
                            }
                            else if (Functions.CheckStrInput (field_to_edit, "id")) {
                                /* EDIT ID */
                                System.out.print ("Enter new ID: ");
                                int new_id = sc.nextInt ();
                                sc.nextLine ();
                                found_student.setId (new_id);
                                System.out.println ("ID updated successfully");
                            }
                            else if (Functions.CheckStrInput (field_to_edit, "level")) {
                                /* EDIT THE LEVEL */
                                System.out.print ("Enter new level: ");
                                int new_level = sc.nextInt ();
                                sc.nextLine ();
                                found_student.setLevel (new_level);
                                System.out.println ("Level updated successfully");
                            }
                            else if (Functions.CheckStrInput (field_to_edit, "gpa")) {
                                /* EDIT THE GPA */
                                System.out.print ("Enter new GPA: ");
                                double new_gpa = sc.nextDouble ();
                                sc.nextLine ();
                                found_student.setGpa (new_gpa);
                                System.out.println ("GPA updated successfully");
                            }
                            else {
                                System.out.println ("Something is wrong.");
                            }
                        }
                        else System.out.println ("Student not found.");
                    }
                    else if (Functions.CheckStrInput (usr_choose_in_student, "delete")) {
                        // Ask the ID
                        System.out.print ("Enter Student ID to delete: ");
                        int search_id = sc.nextInt ();
                        sc.nextLine ();

                        Student found_student = Functions.SearchFor (students, search_id); // Search for the student

                        if (found_student != null) {
                            students.remove (found_student);
                            System.out.println ("Student deleted successfully");
                        }
                        else {
                            System.out.println ("Student not found.");
                        }
                    }
                    else if (Functions.CheckStrInput (usr_choose_in_student, "search")) {
                        // Ask for the id
                        System.out.print ("Enter Student ID to search: ");
                        int search_id = sc.nextInt ();
                        sc.nextLine (); 

                        Student found_student = Functions.SearchFor (students, search_id); // Search

                        if (found_student != null) {
                            System.out.println ("Student found:");
                            found_student.PrintAllInfo ();
                        }
                        else {
                            System.out.println ("Student not found.");
                        }
                    }
                    else if (Functions.CheckStrInput (usr_choose_in_student, "exit")) {
                        student_while_ok = false;
                    }
                    else {
                        System.out.println ("Invalid option. Please try again.");
                    }

                }
            }
            else if (ok_2) {
                // Input what the user want to do in course section
                String usr_choose_in_student = "";
                boolean COURSE_WHILE_OK = true;

                while (COURSE_WHILE_OK) {
                    // Input what the user want to do in course section
                    
                    usr_choose_in_student = Functions.ShowMessageAndInputProcessForSection("course");

                    if (Functions.CheckStrInput (usr_choose_in_student, "view")) {
                        if (courses.isEmpty ()) {
                            Functions.SaySorryIfEmpty ("Courses");
                            continue;
                        }
                        else {
                            for (final Course course : courses) {
                                course.PrintAllInfo ();
                            }
                        }
                    }

                    else if (Functions.CheckStrInput (usr_choose_in_student, "add")) { // ADD COURSE
                        // Taking course info
                        System.out.print ("Enter Course Name: ");
                        String name = sc.nextLine ();
                        System.out.print ("Enter Course Code: ");
                        String code = sc.nextLine ();
                        System.out.print ("Enter Instructor Name: ");
                        String instructor = sc.nextLine ();
                        System.out.print ("Enter Course Hours: ");
                        int hours = sc.nextInt ();
                        sc.nextLine ();
                        List <String> content = new ArrayList <> ();
                        System.out.print ("Enter number of titles in the course: ");
                        int num_of_titles = sc.nextInt ();
                        sc.nextLine ();
                        for (int i = 0; i < num_of_titles; ++i) {
                            System.out.print ("Enter title " + (i + 1) + ": ");
                            String title = sc.nextLine ();
                            content.add (title);
                        }
                        // Create course object
                        Course new_course = new Course (name, code, instructor, content, hours);
                        // Add course to the list
                        courses.add (new_course);
                        System.out.println ("Course added successfully");

                    }
                    else if (Functions.CheckStrInput (usr_choose_in_student, "edit")) {
                        // Ask for the course code to edit it
                        System.out.print ("Enter Course Code to edit: ");
                        String search_code = sc.nextLine ();
                        // Search for the course
                        Course found_course = Functions.SearchFor (courses, search_code); // Search about it
                        if (found_course != null) {
                            // Show message
                            System.out.println ("# Editing Course: " + found_course.getName ());

                            // What do you want to edit
                            System.out.print ("> Name\n> Code\n> Hours\n> Content\n> Instructor\n----->");
                            String field_to_edit = sc.nextLine ().toLowerCase ();

                            if (Functions.CheckStrInput(field_to_edit, "name")) {
                                /* EDIT THE NAME */
                                System.out.print ("Enter new name: ");
                                String new_name = sc.nextLine ();
                                found_course.setName (new_name);
                                System.out.println ("Name updated successfully");
                            }
                            else if (Functions.CheckStrInput (field_to_edit, "code")) {
                                /* EDIT THE CODE */
                                System.out.print ("Enter new code: ");
                                String new_code = sc.nextLine ();
                                found_course.setCode (new_code);
                                System.out.println ("Code updated successfully");
                            }
                            else if (Functions.CheckStrInput (field_to_edit, "hours")) {
                                /* EDIT THE HOURS */
                                System.out.print ("Enter new hours: ");
                                int new_hours = sc.nextInt ();
                                sc.nextLine ();
                                found_course.setHours (new_hours);
                                System.out.println ("Hours updated successfully");
                            }
                            else if (Functions.CheckStrInput (field_to_edit, "content")) {
                                /* EDIT THE CONTENT */
                                List <String> new_content = new ArrayList <> ();
                                System.out.print ("Enter number of titles in the course: ");
                                int num_of_titles = sc.nextInt ();
                                sc.nextLine ();
                                for (int i = 0; i < num_of_titles; ++i) {
                                    System.out.print ("Enter title " + (i + 1) + ": ");
                                    String title = sc.nextLine ();
                                    new_content.add (title);
                                }
                                found_course.setContent (new_content);
                                System.out.println ("Content updated successfully");
                            }
                            else if (Functions.CheckStrInput (field_to_edit, "instructor")) {
                                /* EDIT THE INSTRUCTOR */
                                System.out.print ("Enter new instructor name: ");
                                String new_instructor = sc.nextLine ();
                                found_course.setInstructor (new_instructor);
                                System.out.println ("Instructor updated successfully");
                            }
                            else {
                                System.out.println ("Something is wrong.");
                            }

                        }
                    }
                    else if (Functions.CheckStrInput (usr_choose_in_student, "delete")) {
                        // Ask the code
                        System.out.print ("Enter Course Code to delete: ");
                        String search_code = sc.nextLine ();

                        Course found_course = Functions.SearchFor (courses, search_code); // Search for the course

                        if (found_course != null) {
                            courses.remove (found_course);
                            System.out.println ("Course deleted successfully");
                        }
                        else {
                            System.out.println ("Course not found.");
                        }
                    }
                    else if (Functions.CheckStrInput (usr_choose_in_student, "search")) {
                        // Ask the code
                        System.out.print ("Enter Course Code to search: ");
                        String search_code = sc.nextLine ();

                        Course found_course = Functions.SearchFor (courses, search_code); // Search for the course

                        if (found_course != null) {
                            System.out.println ("Course found successfully");
                            found_course.PrintAllInfo ();
                        }
                        else {
                            System.out.println ("Course not found.");
                        }
                    }
                    else if (Functions.CheckStrInput (usr_choose_in_student, "exit")) {
                        COURSE_WHILE_OK = false;
                    }
                    else {
                        System.out.println ("Invalid option. Please try again.");
                    }
                }
            }
            
            else if (ok_3) {
                // Input what the user want to do in instructor section
                String usr_choose_in_instructor = "";
                boolean INSTRUCTOR_WHILE_OK = true;

                while (INSTRUCTOR_WHILE_OK) {
                    // Take process for the instructor
                    usr_choose_in_instructor = Functions.ShowMessageAndInputProcessForSection ("instructor");

                    if (Functions.CheckStrInput (usr_choose_in_instructor, "view")) { // VIEW ALL INSTRUCTORS
                        if (Instructors.isEmpty ()) {
                            Functions.SaySorryIfEmpty ("instructor");
                            continue;
                        }
                        else {
                            for (final Instructor someone : Instructors) {
                                someone.PrintAllInfo ();
                            }
                        }
                    }
                    else if (Functions.CheckStrInput (usr_choose_in_instructor, "add")) {
                        // Taking instructor info
                        System.out.print ("Enter Full name: ");
                        String full_name = sc.nextLine ();

                        System.out.print ("Doctor | Assistant: ");
                        String doc_assis = sc.nextLine ();

                        System.out.print ("ID: ");
                        int id = sc.nextInt ();
                        sc.nextLine ();

                        System.out.print ("Salary: ");
                        int salary = sc.nextInt ();
                        sc.nextLine ();

                        // Create instructor object
                        Instructor instructor = new Instructor (full_name, doc_assis, salary, id);

                        // add instructor to the list
                        Instructors.add (instructor);

                        System.out.println ("Instructor added successfully");

                    }
                    else if (Functions.CheckStrInput (usr_choose_in_instructor, "edit")) {
                        // Ask for the instructor ID to edit
                        System.out.print ("Enter Instructor ID to edit: ");
                        int search_id = sc.nextInt ();

                        Instructor found_instructor = Functions.SearchFor (Instructors, search_id); // Search about it

                        if (found_instructor != null) {
                            // Show message
                            System.out.println ("# Editing Instructor: " + found_instructor.getFullName ());

                            // (❁´◡`❁)(❁´◡`❁)(❁´◡`❁)(❁´◡`❁)(❁´◡`❁)(❁´◡`❁)(❁´◡`❁)(❁´◡`❁)(❁´◡`❁)(❁´◡`❁)
                            // What do you want to edit
                            System.out.print ("> Name\n> Doctor | Assistant\n> ID\n> Salary\n-----> ");
                            String field_to_edit = sc.nextLine ().toLowerCase ();

                            if (Functions.CheckStrInput(field_to_edit, "name")) {
                                /* EDIT THE NAME */
                                System.out.print ("Enter new name: ");
                                String new_name = sc.nextLine ();
                                found_instructor.setName (new_name);
                                System.out.println ("Name updated successfully");
                            }
                            else if (Functions.CheckStrInput (field_to_edit, "doctor") || Functions.CheckStrInput (field_to_edit, "assistant")) {
                                /* EDIT THE DOCTOR | ASSISTANT */
                                System.out.print ("Enter new Doctor | Assistant: ");
                                String new_doc_assis = sc.nextLine ();
                                found_instructor.setDoctorOrAssistant (new_doc_assis);
                                System.out.println (new_doc_assis + " updated successfully");
                            }
                            else if (Functions.CheckStrInput (field_to_edit, "id")) {
                                /* EDIT ID */
                                System.out.print ("Enter new ID: ");
                                int new_id = sc.nextInt ();
                                sc.nextLine ();
                                found_instructor.setId (new_id);
                                System.out.println ("ID updated successfully");
                            }
                            else if (Functions.CheckStrInput (field_to_edit, "salary")) {
                                /* EDIT THE SALARY */
                                System.out.print ("Enter new Salary: ");
                                int new_salary = sc.nextInt ();
                                sc.nextLine ();
                                found_instructor.setSalary (new_salary);
                                System.out.println ("Salary updated successfully");
                            }
                            else {
                                System.out.println ("Something is wrong.");
                            }
                        }
                        else {
                            System.out.println ("Instructor not found");
                        }
                    }
                    else if (Functions.CheckStrInput (usr_choose_in_instructor, "delete")) {
                        // Ask the ID
                        System.out.print ("Enter Instructor ID to delete: ");
                        int search_id = sc.nextInt ();
                        sc.nextLine ();

                        Instructor found_instructor = Functions.SearchFor (Instructors, search_id); // Search for the instructor

                        if (found_instructor != null) {
                            Instructors.remove (found_instructor);
                            System.out.println ("Instructor deleted successfully");
                        }
                        else {
                            System.out.println ("Instructor not found.");
                        }
                    }
                    else if (Functions.CheckStrInput (usr_choose_in_instructor, "search")) {
                        // Ask for the id
                        System.out.print ("Enter Instructor ID to search: ");
                        int search_id = sc.nextInt ();
                        sc.nextLine (); 

                        Instructor found_instructor = Functions.SearchFor (Instructors, search_id); // Search

                        if (found_instructor != null) {
                            System.out.println ("Instructor found:");
                            found_instructor.PrintAllInfo ();
                        }
                        else {
                            System.out.println ("Instructor not found.");
                        }
                    }
                    else if (Functions.CheckStrInput (usr_choose_in_instructor, "exit")) {
                        INSTRUCTOR_WHILE_OK = false;
                    }
                    else {
                        System.out.println ("Invalid option. Please try again.");
                    }
                }
            }
            else if (ok_4) {
                WHILE_OK = false;
            }
            else if (!ok_1 && !ok_2 && !ok_3 && !ok_4) {
                System.out.println ("I see you typed ===> " + chosen_section + " <===");
                System.out.println ("And this not in our system");
            }
            else {
                System.out.println ("Invalid section selected.");
            }
        }
        System.out.println ("\n\nThank you for using our system\n\n");
        sc.close();
    }
}
