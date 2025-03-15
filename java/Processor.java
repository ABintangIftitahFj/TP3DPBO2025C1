public class Processor extends Komponen {
    private String namaprocessor;
    private String generasi;
    private double kecepatanGhz;

    public Processor() {
        super();
        this.namaprocessor = "";
        this.generasi = "";
        this.kecepatanGhz = 0.0;
    }

    public Processor(String merk, String nama, String namaprocessor, String generasi, double kecepatanGhz) {
        super(merk, nama);
        this.namaprocessor = namaprocessor;
        this.generasi = generasi;
        this.kecepatanGhz = kecepatanGhz;
    }

    // Getter
    public String getNamaprocessor() {
        return namaprocessor;
    }

    public String getGenerasi() {
        return generasi;
    }

    public double getKecepatanGhz() {
        return kecepatanGhz;
    }

    // Setter
    public void setNamaprocessor(String namaprocessor) {
        this.namaprocessor = namaprocessor;
    }

    public void setGenerasi(String generasi) {
        this.generasi = generasi;
    }

    public void setKecepatanGhz(double kecepatanGhz) {
        this.kecepatanGhz = kecepatanGhz;
    }

    // Method info
    public String info() {
        return "Processor: " + this.namaprocessor + " " + this.generasi + " " + this.kecepatanGhz + " GHz (Merk: " + this.getMerk() + ")";
    }
}