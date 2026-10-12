package Guided.Guided01.Manusia;

public class Manusia {
    //definisi atribut
    private String nama;
    private int umur;
    
    //4.2
    public Manusia(){};
    public Manusia(String nama){
        this.nama = nama;
        
        //mahasiswa objManusia = new Manusia("Jhon", ();
    }
    public Manusia(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }
    
    //definisi Method
    public void setNama(String a) {
        nama = a;
    }

    public String getNama() {
        return nama;
    }

    public void setUmur(int a) {
        umur = a;
    }

    public int getUmur() {
        return umur;
    }
}