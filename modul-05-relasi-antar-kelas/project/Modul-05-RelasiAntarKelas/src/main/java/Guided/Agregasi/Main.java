package Guided.Agregasi;

public class Main {
    public static void main(String[] args) {
        Jurusan j = new Jurusan("IF", "Informatika");

        Mahasiswa m1 = new Mahasiswa("2024001", "Budi");
        Mahasiswa m2 = new Mahasiswa("2024002", "Siti");

        j.addMahasiswa(m1);
        j.addMahasiswa(m2);

        j.displayMahasiswa();
    }
}
