package Guided.Guided1;

public abstract class Employee {
    private String name;
    
    // three-argument constructor
    public Employee( String name )
    {
        this.name = name;
    } 
    
    public String getName()
    {
        return name;
    } 
    
    // Setiap pegawai pasti punya gaji, tapi rumusnya beda-beda
    public abstract double earnings(); 
}