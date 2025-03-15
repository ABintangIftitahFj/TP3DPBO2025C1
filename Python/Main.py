from Komputer import Komputer
from Motherboard import Motherboard
from Processor import Processor
from CPU import CPU
from Ram import Ram
from CoolingSystem import CoolingSystem
from VGA import VGA
from Storage import Storage
from Hardrive import Harddrive
from SSD import SSD
from PowerSupply import PowerSupply
from ModulInternetInternal import ModulInternetInternal
from PerangkatJaringan import PerangkatJaringan
from Mouse import Mouse




def main():
    # Membuat objek komputer pertama
    myComputer1 = Komputer("Gaming PC")

    # Membuat komponen motherboard untuk komputer pertama
    mb1 = Motherboard("ASUS", "ROG Strix Z690-A", "LGA1700", "Z690", 8, "ATX")

    # Membuat processor dan CPU untuk komputer pertama
    proc1 = Processor("Intel", "Core i9", "12900K", "12th Gen", 5.2)
    cpu1 = CPU("Intel", "Core i9-12900K", "16-Core (8P+8E)", 5.2)
    cpu1.set_processor(proc1)

    # Menambahkan RAM ke motherboard untuk komputer pertama
    ram1_1 = Ram("Corsair", "Vengeance RGB Pro", 16, "DDR4-3600")
    ram1_2 = Ram("Corsair", "Vengeance RGB Pro", 16, "DDR4-3600")
    mb1.add_ram(ram1_1)
    mb1.add_ram(ram1_2)

    # Menambahkan CPU dan Cooling System ke motherboard untuk komputer pertama
    cooling1 = CoolingSystem("NZXT", "Kraken X73", "Liquid AIO", 2000)
    mb1.set_cpu(cpu1)
    mb1.set_cooling_system(cooling1)

    # Membuat VGA untuk komputer pertama
    vga1 = VGA("NVIDIA", "GeForce RTX 3080", "RTX 3080", 10, "GDDR6X")
    mb1.set_vga(vga1)

    # Membuat Storage untuk komputer pertama
    storage1 = Storage("Western Digital", "Primary Storage", 2000)
    hdd1_1 = Harddrive("Seagate", "Barracuda", "HDD 7200RPM")
    hdd1_2 = Harddrive("Western Digital", "Blue", "HDD 5400RPM")
    ssd1_1 = SSD("Samsung", "970 EVO Plus", 3500)
    ssd1_2 = SSD("Crucial", "MX500", 2200)

    storage1.add_harddrive(hdd1_1)
    storage1.add_harddrive(hdd1_2)
    storage1.add_ssd(ssd1_1)
    storage1.add_ssd(ssd1_2)

    # Membuat PowerSupply untuk komputer pertama
    psu1 = PowerSupply("Corsair", "RM850x", 850, "80+ Gold")

    # Membuat Internet Internal untuk komputer pertama
    inet1 = ModulInternetInternal("Intel", "AX200", 1200, "Connected")

    # Membuat Perangkat Jaringan untuk komputer pertama
    network1 = PerangkatJaringan("TP-Link", "Archer C6", "192.168.1.1", "Telkom", "Fiber Optic")

    #menambhkan peripherals
    mouse1 = Mouse("Logitech", "G502", "RGB", "Wired", "Laser")
    mouse1.set_last_device("Mouse")
    mouse1.set_last_device("usb port 2")
    # Menambahkan Mouse
    mouse1 = Mouse("Logitech", "G502", "RGB", "Wired", "Laser")
    mouse1.setLastDevice("Mouse")
    mouse1.setLastDevice("usb port 2")
    mouse1.setStatus("Connected")
    mouse1.setBrand("Logitech")



    # Set komponen ke komputer pertama
    myComputer1.set_motherBoard(mb1)
    myComputer1.set_powerSupply(psu1)
    myComputer1.add_storage(storage1)
    myComputer1.set_vga(vga1)
    myComputer1.set_internetInternal(inet1)
    myComputer1.set_perangkatJaringan(network1)
    myComputer1.add_mouse(mouse1)

    # Membuat objek komputer kedua
    myComputer2 = Komputer("Workstation PC")

    # Membuat komponen motherboard untuk komputer kedua
    mb2 = Motherboard("Gigabyte", "Z590 AORUS Elite", "LGA1200", "Z590", 16, "ATX")

    # Membuat processor dan CPU untuk komputer kedua
    proc2 = Processor("Intel", "Core i7", "11700K", "11th Gen", 5.0)
    cpu2 = CPU("Intel", "Core i7-11700K", "8-Core", 5.0)
    cpu2.set_processor(proc2)

    # Menambahkan RAM ke motherboard untuk komputer kedua
    ram2_1 = Ram("G.SKILL", "Trident Z RGB", 16, "DDR4-3200")
    ram2_2 = Ram("G.SKILL", "Trident Z RGB", 16, "DDR4-3200")
    mb2.add_ram(ram2_1)
    mb2.add_ram(ram2_2)

    # Menambahkan CPU dan Cooling System ke motherboard untuk komputer kedua
    cooling2 = CoolingSystem("Corsair", "iCUE H150i", "Liquid AIO", 2400)
    mb2.set_cpu(cpu2)
    mb2.set_cooling_system(cooling2)

    # Membuat VGA untuk komputer kedua
    vga2 = VGA("AMD", "Radeon RX 6800 XT", "RX 6800 XT", 16, "GDDR6")
    mb2.set_vga(vga2)

    # Membuat Storage untuk komputer kedua
    storage2 = Storage("Samsung", "Secondary Storage", 1500)
    hdd2_1 = Harddrive("Toshiba", "X300", "HDD 7200RPM")
    ssd2_1 = SSD("ADATA", "XPG SX8200 Pro", 3500)

    storage2.add_harddrive(hdd2_1)
    storage2.add_ssd(ssd2_1)

    # Membuat PowerSupply untuk komputer kedua
    psu2 = PowerSupply("EVGA", "SuperNOVA 750 G5", 750, "80+ Gold")

    # Membuat Internet Internal untuk komputer kedua
    inet2 = ModulInternetInternal("Qualcomm", "QCA6174", 1200, "Connected")

    # Membuat Perangkat Jaringan untuk komputer kedua
    network2 = PerangkatJaringan("Netgear", "Nighthawk R7000", "192.168.0.1", "Comcast", "Fiber Optic")

    # Set komponen ke komputer kedua
    myComputer2.set_motherBoard(mb2)
    myComputer2.set_powerSupply(psu2)
    myComputer2.add_storage(storage2)
    myComputer2.set_vga(vga2)
    myComputer2.set_internetInternal(inet2)
    myComputer2.set_perangkatJaringan(network2)

    # List untuk menyimpan dua komputer
    listKomputer = [myComputer1, myComputer2]

    # Iterasi dan menampilkan informasi
    for komputer in listKomputer:
        komputer.show_info()  # Menampilkan informasi dari setiap objek komputer

    # Membersihkan memori
    del myComputer1
    del myComputer2

if __name__ == "__main__":
    main()