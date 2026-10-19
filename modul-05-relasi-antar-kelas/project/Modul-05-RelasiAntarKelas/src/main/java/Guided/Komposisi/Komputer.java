package Guided.Komposisi;

public class Komputer {
    private String merk;
    private Processor processor;
    private Monitor monitor;
    private Mouse mouse;

    public Komputer(String merk, String brandProcessor, int kecepatan,
                    String brandMonitor, String brandMouse, String tipeMouse) {
        this.merk = merk;
        // objek dibuat DI DALAM class Komputer (ciri komposisi)
        this.processor = new Processor(brandProcessor, kecepatan);
        this.monitor = new Monitor(brandMonitor);
        this.mouse = new Mouse(brandMouse, tipeMouse);
    }

    public void displaySpec() {
        System.out.println("Komputer: " + this.merk);
        System.out.print("Processor: ");
        processor.displaySpec();
        System.out.print("Monitor: ");
        monitor.DisplaySpec();
        System.out.print("Mouse: ");
        mouse.displaySpec();
    }
}