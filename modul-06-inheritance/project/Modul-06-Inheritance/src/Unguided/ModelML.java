package Unguided;

public class ModelML {
    private String nama;
    private int jumlahDataLatih;

    public ModelML(String nama, int jumlahDataLatih) {
        this.nama = nama;
        this.jumlahDataLatih = jumlahDataLatih;
    }

    public int getJumlahDataLatih() {
        return jumlahDataLatih;
    }

    public void tampilkanInfo() {
        System.out.println("Model: " + nama + " | Data latih: " + jumlahDataLatih);
    }

    // Overloading: tanpa parameter
    public int hitungBiaya() {
        return jumlahDataLatih * 2;
    }

    // Overloading: dengan parameter epoch
    public int hitungBiaya(int epoch) {
        return jumlahDataLatih * epoch;
    }
}
