/*
>                                    ___                 _                           _                  
>                                   |_ _|  _ __    ___  | |_   _ __   _   _    ___  | |_    ___    _ __ 
>                                    | |  | '_ \  / __| | __| | '__| | | | |  / __| | __|  / _ \  | '__|
>                                    | |  | | | | \__ \ | |_  | |    | |_| | | (__  | |_  | (_) | | |   
>                                   |___| |_| |_| |___/  \__| |_|     \__,_|  \___|  \__|  \___/  |_|   
*/


public class Instructor extends Entity {
    // Data member
    private String FullName, DoctorOrAssistant;
    private int Salary, Id;
    // Constructors
    // Default constructor
    public Instructor () {
        this.FullName = "###";
        this.DoctorOrAssistant = "^^^";
        this.Salary = 0;
        this.Id = 0;
    }
    // parameterize constructor
    public Instructor (final String full_name, final String doctor_or_assistant, final int salary, final int id) {
        this.FullName = full_name;
        this.DoctorOrAssistant = doctor_or_assistant;
        this.Salary = salary;
        this.Id = id;
    }
    // Getter methods
    public String getFullName () { return FullName; }
    public String getDoctorOrAssistant () { return DoctorOrAssistant; }
    public int getSalary () { return Salary; }
    public int getId () { return Id; }
    // Setter methods
    public void setName (final String full_name) { FullName = full_name; }
    public void setDoctorOrAssistant (final String doc_or_assis) { DoctorOrAssistant = doc_or_assis; }
    public void setSalary (final int salary) { Salary = salary; }
    public void setId (final int id) { Id = id; }
    // Methods
    @Override
    public void PrintAllInfo() {
        System.out.println ("Full Name: " + getFullName () + " | " + "> " + getDoctorOrAssistant () + " <");
        System.out.println ("ID: " + getId ());
        System.out.println ("$" + getSalary ());
    }
}
