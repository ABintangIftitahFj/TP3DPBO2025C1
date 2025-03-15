from Motherboard import Motherboard
from PowerSupply import PowerSupply
from Storage import Storage
from VGA import VGA
from ModulInternetInternal import ModulInternetInternal
from PerangkatJaringan import PerangkatJaringan
from Mouse import Mouse




class Komputer:
    def __init__(self, nama=""):
        self.nama = nama
        self.motherBoard = None
        self.powerSupply = None
        self.storages = []
        self.vga = None
        self.internetInternal = None
        self.perangkatJaringan = None
        self.mouse = None


    def __del__(self):
        print("program selesai sedang memanggil destruktor")
        if self.motherBoard is not None:
            del self.motherBoard
        if self.powerSupply is not None:
            del self.powerSupply
        for storage in self.storages:
            del storage
        if self.vga is not None:
            del self.vga
        if self.internetInternal is not None:
            del self.internetInternal
        if self.perangkatJaringan is not None:
            del self.perangkatJaringan
        if self.mouse is not None:
            del self.mouse

    # Getter
    def get_nama(self):
        return self.nama

    # Setter
    def set_nama(self, nama):
        self.nama = nama

    def set_motherBoard(self, motherBoard):
        self.motherBoard = motherBoard

    def set_powerSupply(self, powerSupply):
        self.powerSupply = powerSupply

    def add_storage(self, storage):
        self.storages.append(storage)

    def set_vga(self, vga):
        self.vga = vga

    def set_internetInternal(self, internetInternal):
        self.internetInternal = internetInternal

    def set_perangkatJaringan(self, perangkatJaringan):
        self.perangkatJaringan = perangkatJaringan

    def add_mouse(self, mouse):
        self.mouse = mouse

    def show_info(self):
        print("=" * 46)
        print(f"INFORMASI KOMPUTER: {self.nama}".center(46))
        print("=" * 46)
        
        components = [
            ("Motherboard", self.motherBoard),
            ("Power Supply", self.powerSupply),
            ("VGA", self.vga),
            ("Internet Internal", self.internetInternal),
            ("Perangkat Jaringan", self.perangkatJaringan),
            ("Mouse", self.mouse, "Tidak ada mouse yang terhubung")
        ]
        
        for name, component, *default_msg in components:
            if component is not None:
                print(component.info())
            elif default_msg:  # Hanya untuk mouse yang memiliki pesan default
                print(f"{name}: {default_msg[0]}")
        
        # Khusus untuk storages yang berupa list
        print("Storages:")
        for storage in self.storages:
            print(storage.info())
            
        print("=" * 46 + "\n")