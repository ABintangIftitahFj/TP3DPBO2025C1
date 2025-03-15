from Komponen import Komponen

class PowerSupply(Komponen):
    def __init__(self, merk="", nama="", daya_watt=0, sertifikasi=""):
        super().__init__(merk, nama)
        self.daya_watt = daya_watt
        self.sertifikasi = sertifikasi

    def get_daya_watt(self):
        return self.daya_watt

    def get_sertifikasi(self):
        return self.sertifikasi

    def set_daya_watt(self, daya_watt):
        self.daya_watt = daya_watt

    def set_sertifikasi(self, sertifikasi):
        self.sertifikasi = sertifikasi

    def info(self):
        return f"Power Supply: {self.get_nama()} {self.daya_watt}W {self.sertifikasi} (Merk: {self.get_merk()})"
