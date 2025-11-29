/*
>                         ____                                           
>                        / ___|   ___    _   _   _ __   ___    ___   ___ 
>                       | |      / _ \  | | | | | '__| / __|  / _ \ / __|
>                       | |___  | (_) | | |_| | | |    \__ \ |  __/ \__ \
>                        \____|  \___/   \__,_| |_|    |___/  \___| |___/
*/



// Importing Section
import java.util.List;

public class Course extends Entity {
    // Data members
    private String Name, Code, Instructor;
    private int Hours;
    private List <String> Content;

    // Constructors
    public Course () { /* Default */
        this.Name = "?????";
        this.Code = "???###";
        this.Instructor = "?????";
        this.Hours = 0;
        this.Content.add ("?????");
    }

    public Course (final String name, final String code, final String instructor, final List <String> content, final int hours) { /* Parametrize */
        this.Name = name;
        this.Code = code;
        this.Instructor = instructor;
        this.Content = content;
        this.Hours = hours;
    }

    // Getter Methods
    public String getName () { return Name; }
    public String getCode () { return Code; }
    public String getInstructor () { return Instructor; }
    public List <String> getContent () { return Content; }
    public int getHours () { return Hours; }

    // Setter Methods
    public void setName (final String name) { Name = name; }
    public void setCode (final String code) { Code = code; }
    public void setInstructor (final String instructor) { Instructor = instructor; }
    public void setContent (final List <String> content) { Content = content; }
    public void setHours (final int hours) { Hours = hours; }

    // Methods
    @Override
    public void PrintAllInfo () {
        PrintSeparator ();
        System.out.println ("Name: " + getName () + " | " + "Code: " + getCode ());
        System.out.println ("Instructor: " + getInstructor () + " | " + "Hours: " + getHours ());
        int i = 1;
        System.out.println ("Titles: 👇");
        for (final String title : getContent ()) {
            System.out.println (i + ". " + title);
            ++i;
            // $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
            /* 🤠✋🤠✋🤠✋🤠✋🤠✋🤠✋🤠✋🤠✋🤠✋🤠✋🤠✋🤠✋🤠✋🤠✋🤠✋🤠✋ */
            // 🔫🔫🔫🔫🔫🔫🔫🔫🔫🔫🔫🔫🔫🔫🔫🔫🔫🔫🔫🔫🔫🔫🔫🔫🔫🔫🔫🔫🔫🔫🔫🔫
        }
    }

}
