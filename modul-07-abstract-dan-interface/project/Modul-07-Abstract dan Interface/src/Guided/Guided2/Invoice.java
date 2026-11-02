package Guided.Guided2;

// Benda mati non-pegawai, tapi tetap diikat oleh aturan
public class Invoice implements Payable {
    private String partName;
    private int quantity;
    private double pricePerItem;

    // three-argument constructor
    public Invoice(String partName, int quantity, double pricePerItem) {
        this.partName = partName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getPartName() {
        return partName;
    }

    // Mengimplementasikan kontrak method dari interface Payable
    //Hitung tagihan
    @Override
    public double getPaymentAmount() {
        return quantity * pricePerItem;
    }
}
