from Komponen import Komponen

class Harddrive(Komponen):
    def __init__(self, merk="", nama="", tipe_drive=""):
        super().__init__(merk, nama)
        self.tipe_drive = tipe_drive

    def get_tipe_drive(self):
        return self.tipe_drive

    def set_tipe_drive(self, tipe_drive):
        self.tipe_drive = tipe_drive

    def info(self):
        return f"Harddrive: {self.tipe_drive} (Merk: {self.get_merk()}, Nama: {self.get_nama()})"