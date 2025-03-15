from Komponen import Komponen
from Ram import Ram
from CPU import CPU
from CoolingSystem import CoolingSystem
from VGA import VGA


class Motherboard(Komponen):
    def __init__(self, merk="", nama="", socket_type="", chipset="", usb=0, form_factor=""):
        super().__init__(merk, nama)
        self.socket_type = socket_type
        self.chipset = chipset
        self.usb = usb
        self.form_factor = form_factor
        self.rams = []
        self.cpu = None
        self.cooling_system = None
        self.vga = None

    def get_socket_type(self):
        return self.socket_type

    def get_chipset(self):
        return self.chipset

    def get_usb(self):
        return self.usb

    def get_form_factor(self):
        return self.form_factor

    def set_socket_type(self, socket_type):
        self.socket_type = socket_type

    def set_chipset(self, chipset):
        self.chipset = chipset

    def set_usb(self, usb):
        self.usb = usb

    def set_form_factor(self, form_factor):
        self.form_factor = form_factor

    def add_ram(self, ram):
        self.rams.append(ram)

    def set_cpu(self, cpu):
        self.cpu = cpu

    def set_cooling_system(self, cooling_system):
        self.cooling_system = cooling_system

    def set_vga(self, vga):
        self.vga = vga

def info(self):
    result = f"Motherboard: {self.get_nama()} {self.chipset} (Merk: {self.get_merk()})\n" \
             f"  Socket: {self.socket_type}\n" \
             f"  Form Factor: {self.form_factor}\n" \
             f"  USB Ports: {self.usb}\n"

    result += "  RAMs:\n"
    for ram in self.rams:
        result += f"    - {ram.info()}\n"

    if self.cpu:
        result += f"  CPU: {self.cpu.info()}\n"

    if self.cooling_system:
        result += f"  Cooling System: {self.cooling_system.info()}\n"

    if self.vga:
        result += f"  VGA: {self.vga.info()}\n"

    return result