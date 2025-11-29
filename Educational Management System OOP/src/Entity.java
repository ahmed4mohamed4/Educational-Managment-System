

/*
>                    _____           _     _   _           
>                   | ____|  _ __   | |_  (_) | |_   _   _ 
>                   |  _|   | '_ \  | __| | | | __| | | | |
>                   | |___  | | | | | |_  | | | |_  | |_| |
>                   |_____| |_| |_|  \__| |_|  \__|  \__, |
>                                                    |___/ 
*/

abstract class Entity {
    protected abstract void PrintAllInfo ();

    /* JUST Separation signs */
    protected void PrintSeparator () {
        System.out.println ("===========================");
    }
}
