package Unguided;

public class ModelKlasifikasiDL extends ModelKlasifikasi {
    private int jumlahLayer;

    public ModelKlasifikasiDL(String nama, int jumlahDataLatih, int jumlahKelas, int jumlahLayer) {
        super(nama, jumlahDataLatih, jumlahKelas);
        this.jumlahLayer = jumlahLayer;
    }

    // Override
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah layer: " + jumlahLayer);
    }

    // Override
    @Override
    public int hitungBiaya() {
        return super.hitungBiaya() + (jumlahLayer * 200);
    }
}