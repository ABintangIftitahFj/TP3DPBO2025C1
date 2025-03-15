from Peripherals import Peripherals


class Mouse(Peripherals):
    def __init__(self, last_device="", last_output="", deviceType="", deviceName="", location="", brand="", mouseName="", status="", isWireless=False):
        super().__init__(last_device, last_output, deviceType, deviceName, location, brand)
        self.mouseName = mouseName
        self.status = status
        self.isWireless = isWireless

    def getMouseName(self):
        return self.mouseName

    def getStatus(self):
        return self.status
    
    def getBrand(self):
        return self.brand

    def getIsWireless(self):
        return self.isWireless

    def setMouseName(self, mouseName):
        self.mouseName = mouseName

    def setStatus(self, status):
        self.status = status

    def setIsWireless(self, isWireless):
        self.isWireless = isWireless

    def setLastDevice(self, last_device):
        self.last_device = last_device

    def setLastOutput(self, last_output):
        self.last_output = last_output

    def setBrand (self, brand):
        self.brand = brand

    def selfStatus(self, status):
        self.status = status

    def info(self):
        return f"Mouse: {self.mouseName} (Device Type: {self.get_device_type()}, Device Name: {self.get_device_name()}, Location: {self.location}, Brand: {self.getBrand()}, Status: {self.getStatus()}, Wireless: {'Yes' if self.isWireless else 'No'}, Last Device: {self.get_last_device()}, Last Output: {self.get_last_output()}"