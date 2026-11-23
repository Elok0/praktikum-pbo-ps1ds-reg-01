package Unguided1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PilihBarang {
    public static void main(String[] args) {
        String[] daftarBarang = {"Buku", "Pulpen", "Penghapus"};
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Daftar Barang: [0] Buku, [1] Pulpen, [2] Penghapus");
            System.out.print("Masukkan nomor barang (0-2): ");
            int indeks = scanner.nextInt();
            System.out.println("Barang terpilih: " + daftarBarang[indeks]);
        } catch (InputMismatchException e) {
            System.out.println("Error: Input harus berupa angka bulat.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Nomor barang tidak tersedia (pilih 0-2).");
        }

        System.out.println("Proses pemilihan barang selesai.");
        scanner.close();
    }
}