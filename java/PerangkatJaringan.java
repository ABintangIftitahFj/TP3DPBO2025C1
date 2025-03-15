public class PerangkatJaringan extends Komponen {
    private String alamatIp;
    private String nameProvider;
    private String internet;

    public PerangkatJaringan(String merk, String nama, String alamatIp, String nameProvider, String internet) {
        super(merk, nama);
        this.alamatIp = alamatIp;
        this.nameProvider = nameProvider;
        this.internet = internet;
    }

    // Getter
    public String getAlamatIp() {
        return alamatIp;
    }

    public String getNameProvider() {
        return nameProvider;
    }

    public String getInternet() {
        return internet;
    }

    // Setter
    public void setAlamatIp(String alamatIp) {
        this.alamatIp = alamatIp;
    }

    public void setNameProvider(String nameProvider) {
        this.nameProvider = nameProvider;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }

    // Method info
    public String info() {
        return "Perangkat Jaringan: " + getNama() + " (Merk: " + getMerk() + ")\n" +
               "  IP: " + alamatIp + "\n" +
               "  Provider: " + nameProvider + "\n" +
               "  Internet: " + internet;
    }
}