import java.util.ArrayList;

public class Storage extends Komponen implements AutoCloseable {
    private int kapasitasGB;
    private ArrayList<HardDrive> harddrives;
    private ArrayList<SSD> ssds;

    public Storage(String merk, String nama, int kapasitasGB) {
        super(merk, nama);
        this.kapasitasGB = kapasitasGB;
        this.harddrives = new ArrayList<>();
        this.ssds = new ArrayList<>();
    }

    @Override
    public void close() {
        // Hapus semua harddrives dan SSDs
        for (HardDrive hdd : harddrives) {
            hdd = null;
        }
        for (SSD ssd : ssds) {
            ssd = null;
        }
    }

    // Getter
    public int getKapasitasGB() {
        return kapasitasGB;
    }

    // Setter
    public void setKapasitasGB(int kapasitasGB) {
        this.kapasitasGB = kapasitasGB;
    }

    // Tambah HDD dan SSD
    public void addHarddrive(HardDrive hdd) {
        harddrives.add(hdd);
    }

    public void addSsd(SSD ssd) {
        ssds.add(ssd);
    }

    // Method info
    public String info() {
        StringBuilder result = new StringBuilder("Storage: " + getNama() + " " + kapasitasGB + "GB (Merk: " + getMerk() + ")\n");
        result.append("  Harddrives:\n");
        for (HardDrive hdd : harddrives) {
            result.append("    - ").append(hdd.info()).append("\n");
        }
        result.append("  SSDs:\n");
        for (SSD ssd : ssds) {
            result.append("    - ").append(ssd.info()).append("\n");
        }
        return result.toString();
    }
}