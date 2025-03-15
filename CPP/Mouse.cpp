#include "Peripherals.cpp"

class Mouse : public Peripherals
{
private:
    string mouseName;
    string status;
    bool isWireless;

public:
    Mouse(string last_device = "", string last_output = "", string deviceType = "", string deviceName = "", string location = "", string brand = "", string mouseName = "", string status = "", bool isWireless = false) : Peripherals(last_device, last_output, deviceType, deviceName, location, brand)
    {
        this->mouseName = mouseName;
        this->status = status;
        this->isWireless = isWireless;
    }

    ~Mouse()
    {
    }

    string getMouseName()
    {
        return mouseName;
    }

    string getStatus()
    {
        return status;
    }

    bool getIsWireless()
    {
        return isWireless;
    }

    void setMouseName(string mouseName)
    {
        this->mouseName = mouseName;
    }

    void setStatus(string status)
    {
        this->status = status;
    }

    void setIsWireless(bool isWireless)
    {
        this->isWireless = isWireless;
    }

    void setLastDevice(string last_device)
    {
        this->last_device = last_device;
    }

    void setLastOutput(string last_output)
    {
        this->last_output = last_output;
    }
    string info() override
    {
        return "Mouse: " + mouseName + " (Device Type: " + deviceType + ", Device Name: " + deviceName + ", Location: " + location + ", Brand: " + brand + ", Status: " + status + ", Wireless: " + (isWireless ? "Yes" : "No") + ", Last Device: " + last_device + ", Last Output: " + last_output + ")";
    }
};