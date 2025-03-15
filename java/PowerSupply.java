public class PowerSupply extends Komponen {
    private int dayaWatt;
    private String sertifikasi;

    public PowerSupply(String merk, String nama, int dayaWatt, String sertifikasi) {
        super(merk, nama);
        this.dayaWatt = dayaWatt;
        this.sertifikasi = sertifikasi;
    }

    public int getDayaWatt() {
        return dayaWatt;
    }

    public void setDayaWatt(int dayaWatt) {
        this.dayaWatt = dayaWatt;
    }

    public String getSertifikasi() {
        return sertifikasi;
    }

    public void setSertifikasi(String sertifikasi) {
        this.sertifikasi = sertifikasi;
    }

    public String info() {
        return "Power Supply: " + getNama() + " " + dayaWatt + "W " + sertifikasi + " (Merk: " + getMerk() + ")";
    }
}