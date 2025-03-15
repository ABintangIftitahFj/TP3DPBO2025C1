public class ModulInternetInternal extends Komponen {
    private int kecepatanMbps;
    private String statusKoneksi;

    public ModulInternetInternal(String merk, String nama, int kecepatanMbps, String statusKoneksi) {
        super(merk, nama);
        this.kecepatanMbps = kecepatanMbps;
        this.statusKoneksi = statusKoneksi;
    }

    public int getKecepatanMbps() {
        return kecepatanMbps;
    }

    public void setKecepatanMbps(int kecepatanMbps) {
        this.kecepatanMbps = kecepatanMbps;
    }

    public String getStatusKoneksi() {
        return statusKoneksi;
    }

    public void setStatusKoneksi(String statusKoneksi) {
        this.statusKoneksi = statusKoneksi;
    }

    public String info() {
        return "Modul Internet Internal: " + getNama() + " (Merk: " + getMerk() + ")\n" +
               "  Kecepatan: " + kecepatanMbps + " Mbps\n" +
               "  Status: " + statusKoneksi;
    }
}