import java.util.ArrayList;

public class Komputer {
    private String nama;
    private Motherboard motherBoard;
    private PowerSupply powerSupply;
    private ArrayList<Storage> storages;
    private VGA vga;
    private ModulInternetInternal internetInternal;
    private PerangkatJaringan perangkatJaringan;
    private Mouse mouse;

    public Komputer(String nama) {
        this.nama = nama;
        this.motherBoard = null;
        this.powerSupply = null;
        this.storages = new ArrayList<>();
        this.vga = null;
        this.internetInternal = null;
        this.perangkatJaringan = null;
        this.mouse = null;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("program selesai sedang memanggil destruktor");
        super.finalize();
    }

    // Getter
    public String getNama() {
        return nama;
    }

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setMotherBoard(Motherboard motherBoard) {
        this.motherBoard = motherBoard;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    public void addStorage(Storage storage) {
        this.storages.add(storage);
    }

    public void setVga(VGA vga) {
        this.vga = vga;
    }

    public void setInternetInternal(ModulInternetInternal internetInternal) {
        this.internetInternal = internetInternal;
    }

    public void setPerangkatJaringan(PerangkatJaringan perangkatJaringan) {
        this.perangkatJaringan = perangkatJaringan;
    }

    public void addMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void showInfo() {
        System.out.println("==============================================");
        System.out.printf("INFORMASI KOMPUTER: %s\n", this.nama);
        System.out.println("==============================================");

        if (this.motherBoard != null) {
            System.out.println(this.motherBoard.info());
        }

        if (this.powerSupply != null) {
            System.out.println(this.powerSupply.info());
        }

        if (this.vga != null) {
            System.out.println(this.vga.info());
        }

        if (this.internetInternal != null) {
            System.out.println(this.internetInternal.info());
        }

        if (this.perangkatJaringan != null) {
            System.out.println(this.perangkatJaringan.info());
        }

        if (this.mouse != null) {
            System.out.println(this.mouse.info());
        } else {
            System.out.println("Mouse: Tidak ada mouse yang terhubung");
        }

        System.out.println("Storages:");
        for (Storage storage : this.storages) {
            System.out.println(storage.info());
        }

        System.out.println("==============================================\n");
    }
}