package Unguided;

import java.util.Arrays;
import java.util.Locale;

public class PengolahSuhu {

    // CLASS FIELD: milik class, dipakai bersama semua object.
    // static  -> satu salinan saja untuk seluruh object
    // final   -> nilainya tidak bisa diubah (aturan tetap)
    private static final double NILAI_KOSONG = -1.0;

    // INSTANCE FIELD: milik masing-masing object.
    // private -> tidak bisa diakses/diubah langsung dari luar class (enkapsulasi)
    private double[] suhuHarian;

    // Constructor: nama parameter sama dengan nama field, sehingga pakai "this"
    public PengolahSuhu(double[] suhuHarian) {
        this.suhuHarian = suhuHarian; // menyimpan REFERENSI array yang sama (bukan salinan)
    }

    // Kebutuhan 3: tampilkan seluruh data, hari kosong diberi tanda
    public void tampilkanData() {
        for (int i = 0; i < suhuHarian.length; i++) {
            if (suhuHarian[i] == NILAI_KOSONG) {
                System.out.println("Hari " + (i + 1) + " : (kosong)");
            } else {
                System.out.println("Hari " + (i + 1) + " : " + suhuHarian[i] + "\u00B0C");
            }
        }
    }

    // Kebutuhan 4: cari index hari kosong, return -1 jika tidak ada
    public int cariIndexKosong() {
        for (int i = 0; i < suhuHarian.length; i++) {
            if (suhuHarian[i] == NILAI_KOSONG) {
                return i;
            }
        }
        return -1;
    }

    // Kebutuhan 5: isi hari kosong dengan rata-rata hari sebelum dan sesudahnya
    public void isiDataKosong() {
        int index = cariIndexKosong();
        if (index != -1) {
            suhuHarian[index] = (suhuHarian[index - 1] + suhuHarian[index + 1]) / 2;
        }
    }

    // Kebutuhan 6: hitung rata-rata suhu dari data yang sudah bersih
    public double hitungRataRata() {
        double total = 0;
        for (int i = 0; i < suhuHarian.length; i++) {
            total += suhuHarian[i];
        }
        return total / suhuHarian.length;
    }

    public static void main(String[] args) {
        // 1. Siapkan array suhu mentah
        double[] suhuHarian = { 30.4, 24.3, 26.8, -1.0, 31.4, 30.8, 32.9 };

        // 2. Buat object, tampilkan data awal, cari index kosong
        PengolahSuhu pengolah = new PengolahSuhu(suhuHarian);

        System.out.println("=== Data Suhu Awal ===");
        pengolah.tampilkanData();

        System.out.println();
        System.out.println("Index hari kosong (dimulai dari 0): " + pengolah.cariIndexKosong());

        // 3. Isi data kosong
        pengolah.isiDataKosong();

        // 4. Tampilkan data akhir + rata-rata
        System.out.println();
        System.out.println("=== Data Suhu Setelah Pengisian ===");
        pengolah.tampilkanData();

        System.out.println();
        System.out.printf(Locale.US, "Rata-rata : %.2f\u00B0C%n", pengolah.hitungRataRata());

        // 5. Tampilkan array di main (bukan lewat object)
        System.out.println();
        System.out.println("Isi array suhuHarian di main setelah isiDataKosong() dijalankan:");
        System.out.println(Arrays.toString(suhuHarian));
        System.out.println("(ikut berubah: constructor menyimpan referensi array yang sama)");

        /*
         * PENJELASAN:
         * Array di Java adalah tipe reference. Variabel suhuHarian di main tidak
         * menyimpan isi array, tetapi alamat memori tempat array berada. Saat
         * object PengolahSuhu dibuat, constructor menerima alamat itu lalu
         * menyimpannya di field this.suhuHarian, tanpa membuat salinan baru.
         * Akibatnya, suhuHarian di main dan field di dalam object menunjuk ke
         * SATU array yang sama di memori. Ketika isiDataKosong() mengubah
         * elemen index 3 lewat object, array yang sama itulah yang berubah,
         * sehingga perubahannya juga terlihat dari variabel suhuHarian di main
         * meskipun main tidak pernah mengubahnya secara langsung.
         * (Ini berbeda dengan tipe primitif yang dilewatkan secara pass by value,
         * di mana yang disalin adalah nilainya.)
         */
    }
}