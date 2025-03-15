from Komponen import Komponen
from Hardrive import Harddrive
from SSD import SSD

class Storage(Komponen):
    def __init__(self, merk="", nama="", kapasitasGB=0):
        super().__init__(merk, nama)
        self.kapasitasGB = kapasitasGB
        self.harddrives = []
        self.ssds = []

    def __del__(self):
        # Hapus semua harddrives dan SSDs
        for hdd in self.harddrives:
            del hdd
        for ssd in self.ssds:
            del ssd

    # Getter
    def get_kapasitasGB(self):
        return self.kapasitasGB

    # Setter
    def set_kapasitasGB(self, kapasitasGB):
        self.kapasitasGB = kapasitasGB

    # Tambah HDD dan SSD
    def add_harddrive(self, hdd):
        self.harddrives.append(hdd)

    def add_ssd(self, ssd):
        self.ssds.append(ssd)

    # Method info
    def info(self):
        result = f"Storage: {self.get_nama()} {self.kapasitasGB}GB (Merk: {self.get_merk()})\n"
        result += "  Harddrives:\n"
        for hdd in self.harddrives:
            result += f"    - {hdd.info()}\n"
        result += "  SSDs:\n"
        for ssd in self.ssds:
            result += f"    - {ssd.info()}\n"
        return result