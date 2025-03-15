from Komponen import Komponen

class CPU(Komponen):
    def __init__(self, merk="", nama="", jumlahCore="", kecepatanGhz=0.0):
        super().__init__(merk, nama)
        self.jumlahCore = jumlahCore
        self.kecepatanGhz = kecepatanGhz
        self.processor = None

    def __del__(self):
        if self.processor is not None:
            del self.processor

    def get_jumlah_core(self):
        return self.jumlahCore

    def get_kecepatan_ghz(self):
        return self.kecepatanGhz

    def get_processor(self):
        return self.processor

    def set_jumlah_core(self, jumlahCore):
        self.jumlahCore = jumlahCore

    def set_kecepatan_ghz(self, kecepatanGhz):
        self.kecepatanGhz = kecepatanGhz

    def set_processor(self, processor):
        self.processor = processor

    def info(self):
        result = f"CPU: {self.get_nama()} {self.jumlahCore} {self.kecepatanGhz}GHz (Merk: {self.get_merk()})"
        if self.processor is not None:
            result += f"\n  Processor: {self.processor.info()}"
        return result