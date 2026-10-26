package Unguided;

public class Main {
    public static void main(String[] args) {
        // Array bertipe kelas induk (polymorphism)
        ModelML[] daftarModel = {
            new ModelRegresi("Regresi Linier", 500, 4),
            new ModelKlasifikasi("Decision Tree", 800, 3),
            new ModelKlasifikasiDL("Neural Network", 1000, 5, 3)
        };

        int totalBiaya = 0;

        for (ModelML m : daftarModel) {
            m.tampilkanInfo();
            int biaya = m.hitungBiaya();
            System.out.println("Biaya komputasi: " + biaya);
            System.out.println("---");
            totalBiaya += biaya;
        }

        System.out.println("Total biaya: " + totalBiaya);

        // Neural Network = indeks 2, Regresi Linier = indeks 0
        System.out.println("Biaya 10 epoch (Neural Network): " + daftarModel[2].hitungBiaya(10));
        System.out.println("Biaya 10 epoch (Regresi Linier): " + daftarModel[0].hitungBiaya(10));

        // Perlu casting karena hitungBiaya(int, int) hanya ada di ModelRegresi
        ModelRegresi regresi = (ModelRegresi) daftarModel[0];
        System.out.println("Biaya 10 epoch batch 50 (Regresi Linier): " + regresi.hitungBiaya(10, 50));
    }
}