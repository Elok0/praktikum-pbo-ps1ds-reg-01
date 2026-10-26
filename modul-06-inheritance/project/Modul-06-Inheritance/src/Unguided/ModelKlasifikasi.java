package Unguided;

public class ModelKlasifikasi extends ModelML {
    private int jumlahKelas;

    public ModelKlasifikasi(String nama, int jumlahDataLatih, int jumlahKelas) {
        super(nama, jumlahDataLatih);
        this.jumlahKelas = jumlahKelas;
    }

    // Override
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah kelas: " + jumlahKelas);
    }

    // Override
    @Override
    public int hitungBiaya() {
        return super.hitungBiaya() * jumlahKelas;
    }

    // hitungBiaya(int epoch) TIDAK di-override
}