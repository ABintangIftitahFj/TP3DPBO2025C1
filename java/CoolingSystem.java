
public class CoolingSystem extends Komponen {
    private String tipePendingin;
    private int kecepatanRpms;

    public CoolingSystem() {
        super();
        this.tipePendingin = "";
        this.kecepatanRpms = 0;
    }

    public CoolingSystem(String merk, String nama, String tipePendingin, int kecepatanRpms) {
        super(merk, nama);
        this.tipePendingin = tipePendingin;
        this.kecepatanRpms = kecepatanRpms;
    }

    // Getter
    public String getTipePendingin() {
        return tipePendingin;
    }

    public int getKecepatanRpms() {
        return kecepatanRpms;
    }

    // Setter
    public void setTipePendingin(String tipePendingin) {
        this.tipePendingin = tipePendingin;
    }

    public void setKecepatanRpms(int kecepatanRpms) {
        this.kecepatanRpms = kecepatanRpms;
    }

    // Method info
    public String info() {
        return "Cooling System: " + tipePendingin + " " + kecepatanRpms + " RPM (Merk: " + getMerk() + ")";
    }
}