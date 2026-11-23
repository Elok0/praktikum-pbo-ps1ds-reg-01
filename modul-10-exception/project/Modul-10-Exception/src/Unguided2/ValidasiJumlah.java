package Unguided2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidasiJumlah {
    public static void cekJumlah(int qty) throws Exception {
        if (qty <= 0) {
            throw new Exception("Jumlah barang minimal harus 1.");
        }
        System.out.println("Jumlah barang valid: " + qty + " pcs.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan jumlah barang yang dibeli: ");
            int qty = scanner.nextInt();
            cekJumlah(qty);
        } catch (InputMismatchException e) {
            System.out.println("Validasi gagal: Input harus berupa angka bulat.");
        } catch (Exception e) {
            System.out.println("Validasi gagal: " + e.getMessage());
        }

        scanner.close();
    }
}