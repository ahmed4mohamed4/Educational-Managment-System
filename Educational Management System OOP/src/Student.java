
/*
>             ____    _                 _                  _   
>            / ___|  | |_   _   _    __| |   ___   _ __   | |_ 
>            \___ \  | __| | | | |  / _` |  / _ \ | '_ \  | __|
>             ___) | | |_  | |_| | | (_| | |  __/ | | | | | |_ 
>            |____/   \__|  \__,_|  \__,_|  \___| |_| |_|  \__|

=====> 🧑‍🎓👩‍🎓🧑‍🎓👩‍🎓🧑‍🎓👩‍🎓🧑‍🎓👩‍🎓🧑‍🎓👩‍🎓🧑‍🎓👩‍🎓🧑‍🎓👩‍🎓🧑‍🎓👩‍🎓🧑‍🎓👩‍🎓🧑‍🎓👩‍🎓🧑‍🎓👩‍🎓🧑‍🎓👩‍🎓🧑‍🎓👩‍🎓
*/

public class Student extends Entity {
    // Data members
    private String FullName, Department;
    private int Id, Level;
    private double Gpa;

    // Constructors
    public Student () { /* Default */
        this.FullName = "#NONE_NONE_NONE#";
        this.Department = "#GENERAL#";
        this.Id = 000000;
        this.Level = 000;
        this.Gpa = 0.00d;
    }

    public Student (final String full_name, final String department, final int id, final int level, final double gpa) { /* parameterized */
        this.FullName = full_name;
        this.Department = department;
        this.Id = id;
        this.Level = level;
        this.Gpa = gpa;
    }

    // Getter Methods
    public String getFullName () { return FullName; } 
    public String getDepartment () { return Department; } 
    public int getId () { return Id; } 
    public int getLevel () { return Level; } 
    public double getGpa () { return Gpa; }

    // Setter Methods
    public void setFullName (final String f_name) { FullName = f_name; } 
    public void setDepartment (final String department){ Department = department; } 
    public void setId (final int id) { Id = id; } 
    public void setLevel (final int level) { Level = level; } 
    public void setGpa (final double gpa) { Gpa = gpa; } 

    // Methods
    @Override
    public void PrintAllInfo () {
        PrintSeparator ();
        System.out.println ("Name: " + getFullName ());
        System.out.println ("Department: " + getDepartment ());
        System.out.println ("ID: " + getId ());
        System.out.println ("Level: " + getLevel ());
        System.out.println ("GPA: " + getGpa ());
        PrintSeparator ();
    }

}
