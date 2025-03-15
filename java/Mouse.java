public class Mouse extends Peripherals {
    private String mouseName;
    private String status;
    private boolean isWireless;

    public Mouse(String last_device, String last_output, String deviceType, String deviceName, String location, String brand, String mouseName, String status, boolean isWireless) {
        super(last_device, last_output, deviceType, deviceName, location, brand);
        this.mouseName = mouseName;
        this.status = status;
        this.isWireless = isWireless;
    }

    public String getMouseName() {
        return mouseName;
    }

    public String getStatus() {
        return status;
    }

    public String getBrand() {
        return super.getBrand();
    }

    public boolean getIsWireless() {
        return isWireless;
    }

    public void setMouseName(String mouseName) {
        this.mouseName = mouseName;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setIsWireless(boolean isWireless) {
        this.isWireless = isWireless;
    }

    public void setLastDevice(String last_device) {
        super.setLastDevice(last_device);
    }

    public void setLastOutput(String last_output) {
        super.setLastOutput(last_output);
    }

    public void setBrand(String brand) {
        super.setBrand(brand);
    }

    public void selfStatus(String status) {
        this.status = status;
    }

    public String info() {
        return "Mouse: " + mouseName + " (Device Type: " + getDeviceType() + ", Device Name: " + getDeviceName() + ", Location: " + getLocation() + ", Brand: " + getBrand() + ", Status: " + getStatus() + ", Wireless: " + (isWireless ? "Yes" : "No") + ", Last Device: " + getLastDevice() + ", Last Output: " + getLastOutput() + ")";
    }
}