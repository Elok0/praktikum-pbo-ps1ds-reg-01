package unguided;

public class RekapNilai {

    public static void main(String[] args) {
        // Deklarasi konstanta KKM
        final double KKM = 75.0;

        // Array 1 Dimensi untuk menyimpan nama mahasiswa
        String[] namaMahasiswa = {"Andi", "Budi", "Citra"};

        // Array 2 Dimensi Rectangular (3 baris, 2 kolom) untuk nilai Modul 1 dan Modul 2
        double[][] nilaiModul = {
            {80.0, 85.0}, // Nilai Andi
            {70.0, 65.0}, // Nilai Budi
            {90.0, 90.0} // Nilai Citra
        };

        // Header output
        System.out.println("REKAP NILAI PRAKTIKUM");
        System.out.println("KKM: " + KKM);
        System.out.println();

        // Perulangan untuk mengakses data array, menghitung rata-rata, dan evaluasi status
        for (int i = 0; i < namaMahasiswa.length; i++) {
            double rataRata = (nilaiModul[i][0] + nilaiModul[i][1]) / 2.0;
            String status;

            // Percabangan untuk menentukan kelulusan
            if (rataRata >= KKM) {
                status = "LULUS";
            } else {
                status = "REMEDIAL";
            }

            // Menampilkan data mahasiswa dan hasil evaluasi
            System.out.println("Mahasiswa " + (i + 1) + ": " + namaMahasiswa[i]);
            System.out.println("Nilai Modul 1 : " + nilaiModul[i][0]);
            System.out.println("Nilai Modul 2 : " + nilaiModul[i][1]);
            System.out.println("Rata-rata     : " + rataRata);
            System.out.println("Status        : " + status);
            System.out.println();
        }
    }
}