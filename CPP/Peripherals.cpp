#include "Basei_io.cpp"

class Peripherals : public Base_io
{
protected:
    string deviceType;
    string deviceName;
    string location;
    string brand;

public:
    Peripherals(string last_device = "", string last_output = "", string deviceType = "", string deviceName = "", string location = "", string brand = "") : Base_io(last_device, last_output)
    {
        this->deviceType = deviceType;
        this->deviceName = deviceName;
        this->location = location;
        this->brand = brand;
    }

    ~Peripherals()
    {
    }

    string getDeviceType()
    {
        return deviceType;
    }

    string getDeviceName()
    {
        return deviceName;
    }

    string getLocation()
    {
        return location;
    }

    string getBrand()
    {
        return brand;
    }

    void setDeviceType(string deviceType)
    {
        this->deviceType = deviceType;
    }

    void setDeviceName(string deviceName)
    {
        this->deviceName = deviceName;
    }

    void setLocation(string location)
    {
        this->location = location;
    }

    void setBrand(string brand)
    {
        this->brand = brand;
    }

    string info() override
    {
        return "Peripherals: " + deviceType + " " + deviceName + " " + location + " " + brand;
    }
};