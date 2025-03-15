import java.util.ArrayList;
import java.util.List;

public class Motherboard extends Komponen {
    private String socketType;
    private String chipset;
    private int usb;
    private String formFactor;
    private List<Ram> rams;
    private CPU cpu;
    private CoolingSystem coolingSystem;
    private VGA vga;

    public Motherboard(String merk, String nama, String socketType, String chipset, int usb, String formFactor) {
        super(merk, nama);
        this.socketType = socketType;
        this.chipset = chipset;
        this.usb = usb;
        this.formFactor = formFactor;
        this.rams = new ArrayList<>();
        this.cpu = null;
        this.coolingSystem = null;
        this.vga = null;
    }

    public String getSocketType() {
        return socketType;
    }

    public void setSocketType(String socketType) {
        this.socketType = socketType;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public int getUsb() {
        return usb;
    }

    public void setUsb(int usb) {
        this.usb = usb;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    public void addRam(Ram ram) {
        this.rams.add(ram);
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setCoolingSystem(CoolingSystem coolingSystem) {
        this.coolingSystem = coolingSystem;
    }

    public void setVga(VGA vga) {
        this.vga = vga;
    }

    public String info() {
        StringBuilder result = new StringBuilder();
        result.append("Motherboard: ").append(getNama()).append(" ").append(chipset).append(" (Merk: ").append(getMerk()).append(")\n")
              .append("  Socket: ").append(socketType).append("\n")
              .append("  Form Factor: ").append(formFactor).append("\n")
              .append("  USB Ports: ").append(usb).append("\n")
              .append("  RAMs:\n");

        for (Ram ram : rams) {
            result.append("    - ").append(ram.info()).append("\n");
        }

        if (cpu != null) {
            result.append("  CPU: ").append(cpu.info()).append("\n");
        }

        if (coolingSystem != null) {
            result.append("  Cooling System: ").append(coolingSystem.info()).append("\n");
        }

        if (vga != null) {
            result.append("  VGA: ").append(vga.info()).append("\n");
        }

        return result.toString();
    }
}