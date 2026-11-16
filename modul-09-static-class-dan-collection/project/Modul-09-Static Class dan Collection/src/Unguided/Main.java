package Unguided;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // 5. Menyimpan data ke dalam List menggunakan generics
        List<ModelEksperimen> listModel = new ArrayList<>();
        listModel.add(new ModelEksperimen("Logistic Regression", 0.82, 12));
        listModel.add(new ModelEksperimen("Random Forest", 0.91, 45));
        listModel.add(new ModelEksperimen("SVM", 0.87, 60));
        listModel.add(new ModelEksperimen("KNN", 0.79, 5));
        listModel.add(new ModelEksperimen("Decision Tree", 0.84, 8));

        // 6.1 Tampilkan jumlah eksperimen menggunakan static method
        System.out.println("Jumlah eksperimen: " + ModelEksperimen.getJumlahEksperimen());

        // 6.2 Tampilkan daftar model diurutkan berdasarkan akurasi tertinggi (Comparable)
        System.out.println("\nSorted by akurasi");
        Collections.sort(listModel);
        listModel.forEach(System.out::println);

        // 6.3 Tampilkan daftar model diurutkan berdasarkan waktu training tercepat (Comparator)
        System.out.println("\nSorted by waktu training");
        listModel.sort(new WaktuTrainingComparator());
        listModel.forEach(System.out::println);

        // 6.4 Tampilkan daftar model dengan akurasi minimal 0.85 (filtering menggunakan lambda)
        System.out.println("\nModel dengan akurasi minimal 0.85");
        List<ModelEksperimen> filteredAkurasi = listModel.stream()
                .filter(e -> e.getAkurasi() >= 0.85)
                .collect(Collectors.toList());
        filteredAkurasi.forEach(System.out::println);

        // 6.5 Cari data model dengan nama "KNN" (pencarian menggunakan lambda)
        System.out.println("\nPencarian model KNN");
        ModelEksperimen hasilCari = listModel.stream()
                .filter(e -> e.getNamaModel().equals("KNN"))
                .findFirst()
                .orElse(null);
        System.out.println(hasilCari);
    }
}
