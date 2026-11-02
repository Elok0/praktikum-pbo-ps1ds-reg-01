package Unguided;

public interface ItemTransaksi {
    double getNominalBayar();
    String getNamaTransaksi();

    // Default method: mencetak satu baris struk
    default void cetakRincianItem() {
        System.out.println("- " + getNamaTransaksi() + " | Total: Rp" + getNominalBayar());
    }

    // Static method: mencatat log kasir
    static void catatLogKasir(String pesan) {
        System.out.println("[LOG SISTEM KASIR] " + pesan);
    }
}