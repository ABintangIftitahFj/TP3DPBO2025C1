from Komponen import Komponen


class SSD(Komponen):
    def __init__(self, merk="", nama="", reading_speed=0.0):
        super().__init__(merk, nama)
        self.reading_speed = reading_speed

    @property
    def reading_speed(self):
        return self._reading_speed

    @reading_speed.setter
    def reading_speed(self, reading_speed):
        self._reading_speed = reading_speed

    def info(self):
        return f"SSD: {self.get_nama()} dengan kecepatan baca {self.reading_speed} MB/s (Merk: {self.get_merk()})"