
class Komponen:
    def __init__(self, merk="", nama=""):
        self._merk = merk
        self._nama = nama


    # getter
    def get_merk(self):
        return self._merk

    def get_nama(self):
        return self._nama

    # setter
    def set_merk(self, merk):
        self._merk = merk

    def set_nama(self, nama):
        self._nama = nama

    # method info
    def info(self):
        return f"Komponen : {self._nama} (Merk : {self._merk})"