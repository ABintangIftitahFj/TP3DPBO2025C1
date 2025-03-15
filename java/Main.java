import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Membuat objek komputer pertama
        Komputer myComputer1 = new Komputer("Gaming PC");

        // Membuat komponen motherboard untuk komputer pertama
        Motherboard mb1 = new Motherboard("ASUS", "ROG Strix Z690-A", "LGA1700", "Z690", 8, "ATX");

        // Membuat processor dan CPU untuk komputer pertama
        Processor proc1 = new Processor("Intel", "Core i9", "12900K", "12th Gen", 5.2);
        CPU cpu1 = new CPU("Intel", "Core i9-12900K", "16-Core (8P+8E)", 5.2);
        cpu1.setProcessor(proc1);

        // Menambahkan RAM ke motherboard untuk komputer pertama
        Ram ram1_1 = new Ram("Corsair", "Vengeance RGB Pro", 16, "DDR4-3600");
        Ram ram1_2 = new Ram("Corsair", "Vengeance RGB Pro", 16, "DDR4-3600");
        mb1.addRam(ram1_1);
        mb1.addRam(ram1_2);

        // Menambahkan CPU dan Cooling System ke motherboard untuk komputer pertama
        CoolingSystem cooling1 = new CoolingSystem("NZXT", "Kraken X73", "Liquid AIO", 2000);
        mb1.setCpu(cpu1);
        mb1.setCoolingSystem(cooling1);

        // Membuat VGA untuk komputer pertama
        VGA vga1 = new VGA("NVIDIA", "GeForce RTX 3080", "RTX 3080", 10, "GDDR6X");
        mb1.setVga(vga1);

        // Membuat Storage untuk komputer pertama
        Storage storage1 = new Storage("Western Digital", "Primary Storage", 2000);
       HardDrive hdd1_1 = new HardDrive("Seagate", "Barracuda", "HDD 7200RPM");
       HardDrive hdd1_2 = new HardDrive("Western Digital", "Blue", "HDD 5400RPM");
        SSD ssd1_1 = new SSD("Samsung", "970 EVO Plus", 3500);
        SSD ssd1_2 = new SSD("Crucial", "MX500", 2200);

        storage1.addHarddrive(hdd1_1);
        storage1.addHarddrive(hdd1_2);
        storage1.addSsd(ssd1_1);
        storage1.addSsd(ssd1_2);

        // Membuat PowerSupply untuk komputer pertama
        PowerSupply psu1 = new PowerSupply("Corsair", "RM850x", 850, "80+ Gold");

        // Membuat Internet Internal untuk komputer pertama
        ModulInternetInternal inet1 = new ModulInternetInternal("Intel", "AX200", 1200, "Connected");

        // Membuat Perangkat Jaringan untuk komputer pertama
        PerangkatJaringan network1 = new PerangkatJaringan("TP-Link", "Archer C6", "192.168.1.1", "Telkom", "Fiber Optic");

        // Menambahkan Mouse
        Mouse mouse1 = new Mouse("Logitech", "G502", "RGB", "Wired", "Laser","Logitech", "G502", "Connected", false);
        mouse1.setLastDevice("Mouse");
        mouse1.setLastDevice("usb port 2");
        mouse1.setStatus("Connected");
        mouse1.setBrand("Logitech");

        // Set komponen ke komputer pertama
        myComputer1.setMotherBoard(mb1);
        myComputer1.setPowerSupply(psu1);
        myComputer1.addStorage(storage1);
        myComputer1.setVga(vga1);
        myComputer1.setInternetInternal(inet1);
        myComputer1.setPerangkatJaringan(network1);
        myComputer1.addMouse(mouse1);

        // Membuat objek komputer kedua
        Komputer myComputer2 = new Komputer("Workstation PC");

        // Membuat komponen motherboard untuk komputer kedua
        Motherboard mb2 = new Motherboard("Gigabyte", "Z590 AORUS Elite", "LGA1200", "Z590", 16, "ATX");

        // Membuat processor dan CPU untuk komputer kedua
        Processor proc2 = new Processor("Intel", "Core i7", "11700K", "11th Gen", 5.0);
        CPU cpu2 = new CPU("Intel", "Core i7-11700K", "8-Core", 5.0);
        cpu2.setProcessor(proc2);

        // Menambahkan RAM ke motherboard untuk komputer kedua
        Ram ram2_1 = new Ram("G.SKILL", "Trident Z RGB", 16, "DDR4-3200");
        Ram ram2_2 = new Ram("G.SKILL", "Trident Z RGB", 16, "DDR4-3200");
        mb2.addRam(ram2_1);
        mb2.addRam(ram2_2);

        // Menambahkan CPU dan Cooling System ke motherboard untuk komputer kedua
        CoolingSystem cooling2 = new CoolingSystem("Corsair", "iCUE H150i", "Liquid AIO", 2400);
        mb2.setCpu(cpu2);
        mb2.setCoolingSystem(cooling2);

        // Membuat VGA untuk komputer kedua
        VGA vga2 = new VGA("AMD", "Radeon RX 6800 XT", "RX 6800 XT", 16, "GDDR6");
        mb2.setVga(vga2);

        // Membuat Storage untuk komputer kedua
        Storage storage2 = new Storage("Samsung", "Secondary Storage", 1500);
       HardDrive hdd2_1 = new HardDrive("Toshiba", "X300", "HDD 7200RPM");
        SSD ssd2_1 = new SSD("ADATA", "XPG SX8200 Pro", 3500);

        storage2.addHarddrive(hdd2_1);
        storage2.addSsd(ssd2_1);

        // Membuat PowerSupply untuk komputer kedua
        PowerSupply psu2 = new PowerSupply("EVGA", "SuperNOVA 750 G5", 750, "80+ Gold");

        // Membuat Internet Internal untuk komputer kedua
        ModulInternetInternal inet2 = new ModulInternetInternal("Qualcomm", "QCA6174", 1200, "Connected");

        // Membuat Perangkat Jaringan untuk komputer kedua
        PerangkatJaringan network2 = new PerangkatJaringan("Netgear", "Nighthawk R7000", "192.168.0.1", "Comcast", "Fiber Optic");

        // Set komponen ke komputer kedua
        myComputer2.setMotherBoard(mb2);
        myComputer2.setPowerSupply(psu2);
        myComputer2.addStorage(storage2);
        myComputer2.setVga(vga2);
        myComputer2.setInternetInternal(inet2);
        myComputer2.setPerangkatJaringan(network2);

        // List untuk menyimpan dua komputer
        List<Komputer> listKomputer = new ArrayList<>();
        listKomputer.add(myComputer1);
        listKomputer.add(myComputer2);

        // Iterasi dan menampilkan informasi
        for (Komputer komputer : listKomputer) {
            komputer.showInfo();  // Menampilkan informasi dari setiap objek komputer
        }

        // Membersihkan memori
        myComputer1 = null;
        myComputer2 = null;
    }
}