public class HardDrive extends Komponen {
    private String tipeDrive;

    public HardDrive() {
        super();
        this.tipeDrive = "";
    }

    public HardDrive(String merk, String nama, String tipeDrive) {
        super(merk, nama);
        this.tipeDrive = tipeDrive;
    }

    public String getTipeDrive() {
        return tipeDrive;
    }

    public void setTipeDrive(String tipeDrive) {
        this.tipeDrive = tipeDrive;
    }

    public String info() {
        return "HardDrive: " + tipeDrive + " (Merk: " + getMerk() + ", Nama: " + getNama() + ")";
    }
}