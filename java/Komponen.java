

public class Komponen {
    private String merk;
    private String nama;

    // Constructor
    public Komponen(String merk, String nama) {
        this.merk = merk;
        this.nama = nama;
    }

    // Default constructor
    public Komponen() {
        this.merk = "";
        this.nama = "";
    }

    // Getter for merk
    public String getMerk() {
        return merk;
    }

    // Setter for merk
    public void setMerk(String merk) {
        this.merk = merk;
    }

    // Getter for nama
    public String getNama() {
        return nama;
    }

    // Setter for nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Method info
    public String info() {
        return "Komponen : " + nama + " (Merk : " + merk + ")";
    }
}