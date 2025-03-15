from Base_io import BaseIO


class Peripherals(BaseIO):
    def __init__(self, last_device="", last_output="", device_type="", device_name="", location="", brand=""):
        super().__init__(last_device, last_output)
        self.device_type = device_type
        self.device_name = device_name
        self.location = location
        self.brand = brand

    def get_device_type(self):
        return self.device_type

    def get_device_name(self):
        return self.device_name

    def get_location(self):
        return self.location

    def get_brand(self):
        return self.brand

    def set_device_type(self, device_type):
        self.device_type = device_type

    def set_device_name(self, device_name):
        self.device_name = device_name

    def set_location(self, location):
        self.location = location

    def set_brand(self, brand):
        self.brand = brand

    def info(self):
        return f"Peripherals: {self.device_type} {self.device_name} {self.location} {self.brand}"