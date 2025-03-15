
public class Peripherals extends BaseIO {
    private String deviceType;
    private String deviceName;
    private String location;
    private String brand;

    public Peripherals(String lastDevice, String lastOutput, String deviceType, String deviceName, String location, String brand) {
        super(lastDevice, lastOutput);
        this.deviceType = deviceType;
        this.deviceName = deviceName;
        this.location = location;
        this.brand = brand;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public String getLocation() {
        return location;
    }

    public String getBrand() {
        return brand;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String info() {
        return "Peripherals: " + deviceType + " " + deviceName + " " + location + " " + brand;
    }
}