package model;

public class Dataset {
    private String nama;
    private int jumlahBaris;
    private int jumlahKolom;
    private int jumlahMissing;

    // flag supaya setter hanya bisa mengisi sekali
    private boolean barisSudahDiisi;
    private boolean kolomSudahDiisi;
    private boolean missingSudahDiisi;

    public static final double BATAS_MISSING = 5.0;
    private static int totalDataset = 0;

    // Constructor 1: tanpa parameter
    public Dataset() {
        totalDataset++;
    }

    // Constructor 2: hanya nama
    public Dataset(String nama) {
        this.nama = nama;
        totalDataset++;
    }

    // Constructor 3: lengkap
    public Dataset(String nama, int jumlahBaris, int jumlahKolom, int jumlahMissing) {
        this.nama = nama;
        this.jumlahBaris = jumlahBaris;
        this.jumlahKolom = jumlahKolom;
        this.jumlahMissing = jumlahMissing;
        barisSudahDiisi = true;
        kolomSudahDiisi = true;
        missingSudahDiisi = true;
        totalDataset++;
    }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public int getJumlahBaris() { return jumlahBaris; }
    public void setJumlahBaris(int jumlahBaris) {
        if (!barisSudahDiisi) {
            this.jumlahBaris = jumlahBaris;
            barisSudahDiisi = true;
        }
    }

    public int getJumlahKolom() { return jumlahKolom; }
    public void setJumlahKolom(int jumlahKolom) {
        if (!kolomSudahDiisi) {
            this.jumlahKolom = jumlahKolom;
            kolomSudahDiisi = true;
        }
    }

    public int getJumlahMissing() { return jumlahMissing; }
    public void setJumlahMissing(int jumlahMissing) {
        if (!missingSudahDiisi) {
            this.jumlahMissing = jumlahMissing;
            missingSudahDiisi = true;
        }
    }

    public double getPersentaseMissing() {
        long totalSel = (long) jumlahBaris * jumlahKolom;
        if (totalSel == 0) {
            return 0;
        }
        return (double) jumlahMissing / totalSel * 100;
    }

    public boolean perluDibersihkan() {
        return getPersentaseMissing() > BATAS_MISSING;
    }

    public static int getTotalDataset() {
        return totalDataset;
    }
}
