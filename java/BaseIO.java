public class BaseIO {
    private String lastDevice;
    private String lastOutput;

    public BaseIO() {
        this.lastDevice = "";
        this.lastOutput = "";
    }

    public BaseIO(String lastDevice, String lastOutput) {
        this.lastDevice = lastDevice;
        this.lastOutput = lastOutput;
    }

    public String getLastDevice() {
        return lastDevice;
    }

    public void setLastDevice(String lastDevice) {
        this.lastDevice = lastDevice;
    }

    public String getLastOutput() {
        return lastOutput;
    }

    public void setLastOutput(String lastOutput) {
        this.lastOutput = lastOutput;
    }

    public String info() {
        return "BaseIO: " + lastDevice + " " + lastOutput;
    }
}