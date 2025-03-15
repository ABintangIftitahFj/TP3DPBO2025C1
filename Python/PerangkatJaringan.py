from Komponen import Komponen


class PerangkatJaringan(Komponen):
    def __init__(self, merk="", nama="", alamat_ip="", name_provider="", internet=""):
        super().__init__(merk, nama)
        self.alamat_ip = alamat_ip
        self.name_provider = name_provider
        self.internet = internet

    # Getter
    def get_alamat_ip(self):
        return self.alamat_ip

    def get_name_provider(self):
        return self.name_provider

    def get_internet(self):
        return self.internet

    # Setter
    def set_alamat_ip(self, alamat_ip):
        self.alamat_ip = alamat_ip

    def set_name_provider(self, name_provider):
        self.name_provider = name_provider

    def set_internet(self, internet):
        self.internet = internet

    # Method info
    def info(self):
        return (f"Perangkat Jaringan: {self.get_nama()} (Merk: {self.get_merk()})\n"
                f"  IP: {self.alamat_ip}\n"
                f"  Provider: {self.name_provider}\n"
                f"  Internet: {self.internet}")