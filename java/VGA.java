public class VGA extends Komponen {
    private String namaVga;
    private int memoriGb;
    private String tipeMemori;

    public VGA() {
        super();
        this.namaVga = "";
        this.memoriGb = 0;
        this.tipeMemori = "";
    }

    public VGA(String merk, String nama, String namaVga, int memoriGb, String tipeMemori) {
        super(merk, nama);
        this.namaVga = namaVga;
        this.memoriGb = memoriGb;
        this.tipeMemori = tipeMemori;
    }

    // Getter
    public String getNamaVga() {
        return namaVga;
    }

    public int getMemoriGb() {
        return memoriGb;
    }

    public String getTipeMemori() {
        return tipeMemori;
    }

    // Setter
    public void setNamaVga(String namaVga) {
        this.namaVga = namaVga;
    }

    public void setMemoriGb(int memoriGb) {
        this.memoriGb = memoriGb;
    }

    public void setTipeMemori(String tipeMemori) {
        this.tipeMemori = tipeMemori;
    }

    // Method info
    public String info() {
        return "VGA: " + namaVga + " " + memoriGb + "GB " + tipeMemori + " (Merk: " + getMerk() + ")";
    }
}