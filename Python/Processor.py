from Komponen import Komponen

class Processor(Komponen):
    def __init__(self, merk="", nama="", namaprocessor="", generasi="", kecepatanGhz=0.0):
        super().__init__(merk, nama)
        self.namaprocessor = namaprocessor
        self.generasi = generasi
        self.kecepatanGhz = kecepatanGhz

    # Getter
    def get_namaprocessor(self):
        return self.namaprocessor

    def get_generasi(self):
        return self.generasi

    def get_kecepatanGhz(self):
        return self.kecepatanGhz

    # Setter
    def set_namaprocessor(self, namaprocessor):
        self.namaprocessor = namaprocessor

    def set_generasi(self, generasi):
        self.generasi = generasi

    def set_kecepatanGhz(self, kecepatanGhz):
        self.kecepatanGhz = kecepatanGhz

    # Method info
    def info(self):
        return f"Processor: {self.namaprocessor} {self.generasi} {self.kecepatanGhz} GHz (Merk: {self.get_merk()})"