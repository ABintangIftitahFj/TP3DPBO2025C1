from Komponen import Komponen


class CoolingSystem(Komponen):
    def __init__(self, merk="", nama="", tipe_pendingin="", kecepatan_rpms=0):
        super().__init__(merk, nama)
        self.tipe_pendingin = tipe_pendingin
        self.kecepatan_rpms = kecepatan_rpms

    # Getter
    def get_tipe_pendingin(self):
        return self.tipe_pendingin

    def get_kecepatan_rpms(self):
        return self.kecepatan_rpms

    # Setter
    def set_tipe_pendingin(self, tipe_pendingin):
        self.tipe_pendingin = tipe_pendingin

    def set_kecepatan_rpms(self, kecepatan_rpms):
        self.kecepatan_rpms = kecepatan_rpms

    # Method info
    def info(self):
        return f"Cooling System: {self.tipe_pendingin} {self.kecepatan_rpms} RPM (Merk: {self.get_merk()})"