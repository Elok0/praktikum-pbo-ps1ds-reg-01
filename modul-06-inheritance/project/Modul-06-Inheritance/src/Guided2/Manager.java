package Guided2;

public class Manager extends Employee {
    private String alamat;

    public Manager(String nama, String alamat) {
        /* memanggil konstruktor employee */
        super(nama);
        this.alamat = alamat;
    }

    public void tampilInformasi() {
        super.tampilNama();

        /* menampilkan variabel alamat dan departemen */
        System.out.println("alamat : " + alamat);
        System.out.println("departemen : " + super.departemen);
    }
}