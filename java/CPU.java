
public class CPU extends Komponen {
    private String jumlahCore;
    private double kecepatanGhz;
    private Komponen processor;

    public CPU(String merk, String nama, String jumlahCore, double kecepatanGhz) {
        super(merk, nama);
        this.jumlahCore = jumlahCore;
        this.kecepatanGhz = kecepatanGhz;
        this.processor = null;
    }

    public CPU() {
        this("", "", "", 0.0);
    }


    public String getJumlahCore() {
        return jumlahCore;
    }

    public double getKecepatanGhz() {
        return kecepatanGhz;
    }

    public Komponen getProcessor() {
        return processor;
    }

    public void setJumlahCore(String jumlahCore) {
        this.jumlahCore = jumlahCore;
    }

    public void setKecepatanGhz(double kecepatanGhz) {
        this.kecepatanGhz = kecepatanGhz;
    }

    public void setProcessor(Komponen processor) {
        this.processor = processor;
    }

    public String info() {
        String result = "CPU: " + getNama() + " " + jumlahCore + " " + kecepatanGhz + "GHz (Merk: " + getMerk() + ")";
        if (processor != null) {
            result += "\n  Processor: " + processor.info();
        }
        return result;
    }
}