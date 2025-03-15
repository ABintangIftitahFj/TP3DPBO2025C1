public class Ram extends Komponen {
    private int kapasitasGB;
    private String tipeDDR;

    public Ram(String merk, String nama, int kapasitasGB, String tipeDDR) {
        super(merk, nama);
        this.kapasitasGB = kapasitasGB;
        this.tipeDDR = tipeDDR;
    }

    public int getKapasitasGB() {
        return kapasitasGB;
    }

    public String getTipeDDR() {
        return tipeDDR;
    }

    public void setKapasitasGB(int kapasitasGB) {
        this.kapasitasGB = kapasitasGB;
    }

    public void setTipeDDR(String tipeDDR) {
        this.tipeDDR = tipeDDR;
    }

    public String info() {
        return "RAM: " + kapasitasGB + "GB " + tipeDDR + " (Merk: " + getMerk() + ")";
    }
}