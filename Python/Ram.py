from Komponen import Komponen

class Ram(Komponen):
    def __init__(self, merk="", nama="", kapasitasGB=0, tipeDDR=""):
        super().__init__(merk, nama)
        self.kapasitasGB = kapasitasGB
        self.tipeDDR = tipeDDR

    def get_kapasitasGB(self):
        return self.kapasitasGB

    def get_tipeDDR(self):
        return self.tipeDDR

    def set_kapasitasGB(self, kapasitasGB):
        self.kapasitasGB = kapasitasGB

    def set_tipeDDR(self, tipeDDR):
        self.tipeDDR = tipeDDR

    def info(self):
        return f"RAM: {self.kapasitasGB}GB {self.tipeDDR} (Merk: {self.get_merk()})"