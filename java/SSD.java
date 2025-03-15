public class SSD extends Komponen {
    private double readingSpeed;

    public SSD(String merk, String nama, double readingSpeed) {
        super(merk, nama);
        this.readingSpeed = readingSpeed;
    }

    public double getReadingSpeed() {
        return readingSpeed;
    }

    public void setReadingSpeed(double readingSpeed) {
        this.readingSpeed = readingSpeed;
    }

    public String info() {
        return "SSD: " + getNama() + " dengan kecepatan baca " + readingSpeed + " MB/s (Merk: " + getMerk() + ")";
    }
}