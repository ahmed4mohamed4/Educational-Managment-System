
/*
>                   _____                          _     _                       
>                  |  ___|  _   _   _ __     ___  | |_  (_)   ___    _ __    ___ 
>                  | |_    | | | | | '_ \   / __| | __| | |  / _ \  | '_ \  / __|
>                  |  _|   | |_| | | | | | | (__  | |_  | | | (_) | | | | | \__ \
>                  |_|      \__,_| |_| |_|  \___|  \__| |_|  \___/  |_| |_| |___/
*/

import java.util.List;
import java.util.Scanner;

public class Functions {

    static Scanner sc = new Scanner (System.in);


    public static boolean CheckStrInput (String input, String word) {
        /*
        # To check the input type: "String":
            --> make the two words lower case
            --> if the input word in plural, we will add s to check word

            ***** Don't worry our system don't have any s in end of our words *****
            👀👀👀👀👀👀👀👀👀👀👀👀👀👀👀👀👀👀👀👀👀👀👀👀👀👀👀👀👀👀👀👀👀👀
        */

        input.toLowerCase ();
        word.toLowerCase ();

        if (input.charAt (input.length() - 1) == 's') {
            word += "s";
            if (input.equals (word)) {
                return true;
            }
        }
        return input.equals (word);
    }


    /* OVERLOADING FUNCTION "SearchFor"🫣*/
    public static Student SearchFor (List <Student> students, int id) {
        /*
        # Search to get student
            --> loop throw the list of student objects
            --> using if condition to check if this is the id we want or not 🫠
        */
        for (final Student student : students) {
            if (student.getId () == id) {
                return student;
            }
        }
        return null; // Return null if not found
    }
    
    public static Course SearchFor (List <Course> courses, String code) {
        /*
        # Search to get course
            --> loop throw the list of course objects
            --> using if condition to check if this is the code we want or not 🫠
        */
        for (final Course course : courses) {
            if (course.getCode().equals (code)) {
                return course;
            }
        }
        return null; // Return null if not found
    }
    
    public static Instructor SearchFor (List <Instructor> instructors, float id) {
        /*
        # Search to get the instructor
            --> Loop throw the list of instructor objects
            --> Using if condition to check if this id we want ot not 
        */
        for (final Instructor ins : instructors) {
            if (ins.getId() == id) {
                return ins;
            }
        }
        return null;
    }


    public static void SaySorryIfEmpty (final String section) {
        /* Sorry message if we don't have any object */
        System.out.println ("Sorry, There is no " + section + " yet \n-----> Try add new " + section);
    }

    public static String ShowMessageAndInputProcessForSection (final String section) {
        /* 
        - Show message for (View all - add one - edit one - delete one - exit)
        - Take input

        * Department not have searched it just 4 😂
        */

        System.out.println ("You are in the " + section + " section");
        System.out.println ("> View " + section + 's' + "\n> Add " + section + "\n> Edit " + section + "\n> Delete " + section + "\n> Search " + section + "\n> Exit");
        
        System.out.print ("Choose one: ");
        String process_input  = sc.nextLine ().toLowerCase ();
        
        return process_input;
    }

}