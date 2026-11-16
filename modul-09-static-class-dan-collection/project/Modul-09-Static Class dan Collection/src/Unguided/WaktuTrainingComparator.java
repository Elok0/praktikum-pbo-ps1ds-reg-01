package Unguided;

import java.util.Comparator;

// Kelas terpisah yang mengimplementasikan Comparator untuk waktu training (tercepat ke terlama)
public class WaktuTrainingComparator implements Comparator<ModelEksperimen> {
    @Override
    public int compare(ModelEksperimen e1, ModelEksperimen e2) {
        return Integer.compare(e1.getWaktuTraining(), e2.getWaktuTraining());
    }
}
