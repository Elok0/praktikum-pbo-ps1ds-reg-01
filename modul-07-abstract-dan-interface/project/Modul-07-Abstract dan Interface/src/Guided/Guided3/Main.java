package Guided.Guided3;

public class Main {
    public static void main(String[] args) {
        // 1. Memanggil STATIC METHOD pertama
        Payable.logTransaction("Sistem Pembayaran diinisialisasi");
        
        Payable[] items = new Payable[2];
        items[0] = new Invoice("Ram DDR 5 16GB", 2, 2000000);
        items[1] = new SalariedEmployee("Raymundus Ariel Abas", 5000000);

        // 2. Looping hanya untuk mencetak struk masing-masing objek
        for (Payable item : items) {
            item.printReceipt();
        }

        // 3. Memanggil STATIC METHOD di luar loop agar hanya muncul sekali di akhir
        Payable.logTransaction("Tagihan selesai diproses.");
    }
}