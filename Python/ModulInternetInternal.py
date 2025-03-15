from Komponen import Komponen

class ModulInternetInternal(Komponen):
    def __init__(self, merk="", nama="", kecepatan_mbps=0, status_koneksi=""):
        super().__init__(merk, nama)
        self.kecepatan_mbps = kecepatan_mbps
        self.status_koneksi = status_koneksi

    def get_kecepatan_mbps(self):
        return self.kecepatan_mbps

    def get_status_koneksi(self):
        return self.status_koneksi

    def set_kecepatan_mbps(self, kecepatan_mbps):
        self.kecepatan_mbps = kecepatan_mbps

    def set_status_koneksi(self, status_koneksi):
        self.status_koneksi = status_koneksi

    def info(self):
        return (f"Modul Internet Internal: {self.get_merk()} (Merk: {self.get_merk()})\n"
                f"  Kecepatan: {self.kecepatan_mbps} Mbps\n"
                f"  Status: {self.status_koneksi}")