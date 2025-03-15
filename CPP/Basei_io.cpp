#include <bits/stdc++.h>
#include <string>
#include <vector>
#include <iostream>
#pragma once
#include <iostream>
using namespace std;

class Base_io
{
protected:
    string last_device;
    string last_output;

public:
    Base_io(string last_device = "", string last_output = "")
    {
        this->last_device = last_device;
        this->last_output = last_output;
    }

    ~Base_io()
    {
    }

    string getLastDevice()
    {
        return last_device;
    }

    string getLastOutput()
    {
        return last_output;
    }

    void setLastDevice(string last_device)
    {
        this->last_device = last_device;
    }

    void setLastOutput(string last_output)
    {
        this->last_output = last_output;
    }

    virtual string info()
    {
        return "Base_io: " + last_device + " " + last_output;
    }
};