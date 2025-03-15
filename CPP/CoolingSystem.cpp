#include "Komponen.cpp"
#pragma once
class CoolingSystem : public Komponen
{
private:
    string tipePendingin;
    double kecepatanRpms;

public:
    // Konstruktor
    CoolingSystem(string merk = "", string nama = "", string tipePendingin = "", double kecepatanRpms = 0)
        : Komponen(merk, nama)
    {
        this->tipePendingin = tipePendingin;
        this->kecepatanRpms = kecepatanRpms;
    }

    // Destruktor
    ~CoolingSystem()
    {
    }

    // Getter
    string getTipePendingin() const
    {
        return tipePendingin;
    }

    double getKecepatanRpms() const
    {
        return kecepatanRpms;
    }

    // Setter
    void setTipePendingin(string tipePendingin)
    {
        this->tipePendingin = tipePendingin;
    }

    void setKecepatanRpms(double kecepatanRpms)
    {
        this->kecepatanRpms = kecepatanRpms;
    }

    // Method info
    string info() override
    {
        return "Cooling System: " + tipePendingin + " " + to_string(kecepatanRpms) +
               " RPM (Merk: " + merk + ")";
    }
};
