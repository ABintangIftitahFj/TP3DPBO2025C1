class BaseIO:
    def __init__(self, last_device="", last_output=""):
        self._last_device = last_device
        self._last_output = last_output

    def get_last_device(self):
        return self._last_device

    def get_last_output(self):
        return self._last_output

    def set_last_device(self, last_device):
        self._last_device = last_device

    def set_last_output(self, last_output):
        self._last_output = last_output

    def info(self):
        return f"BaseIO: {self._last_device} {self._last_output}"