from Komponen import Komponen


class VGA(Komponen):
    def __init__(self, merk="", nama="", nama_vga="", memori_gb=0, tipe_memori=""):
        super().__init__(merk, nama)
        self.nama_vga = nama_vga
        self.memori_gb = memori_gb
        self.tipe_memori = tipe_memori

    # Getter
    def get_nama_vga(self):
        return self.nama_vga

    def get_memori_gb(self):
        return self.memori_gb

    def get_tipe_memori(self):
        return self.tipe_memori

    # Setter
    def set_nama_vga(self, nama_vga):
        self.nama_vga = nama_vga

    def set_memori_gb(self, memori_gb):
        self.memori_gb = memori_gb

    def set_tipe_memori(self, tipe_memori):
        self.tipe_memori = tipe_memori

    # Method info
    def info(self):
        return f"VGA: {self.nama_vga} {self.memori_gb}GB {self.tipe_memori} (Merk: {self.get_merk()})"