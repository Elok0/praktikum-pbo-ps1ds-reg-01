package main;

import model.Dataset;
import laporan.LaporanDataset;

public class Main {
    public static void main(String[] args) {
        // Objek 1: constructor tanpa parameter, diisi dengan setter
        Dataset dataset1 = new Dataset();
        dataset1.setNama("Titanic");
        dataset1.setJumlahBaris(891);
        dataset1.setJumlahKolom(12);
        dataset1.setJumlahMissing(866);

        // Objek 2: constructor satu parameter
        Dataset dataset2 = new Dataset("Wine Quality");

        // Objek 3: constructor lengkap
        Dataset dataset3 = new Dataset("Iris", 150, 5, 0);

        Dataset[] daftarDataset = {dataset1, dataset2, dataset3};

        LaporanDataset laporan = new LaporanDataset();
        for (Dataset dataset : daftarDataset) {
            laporan.cetak(dataset);
        }

        System.out.println("Total dataset dibuat : " + Dataset.getTotalDataset());
    }
}