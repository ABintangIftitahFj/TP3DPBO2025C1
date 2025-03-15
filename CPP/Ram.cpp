#include "Komponen.cpp"
using namespace std;
#pragma once
class Ram : public Komponen
{
private:
    int kapasitasGB;
    string tipeDDR;

public:
    // Konstruktor
    Ram(string merk = "", string nama = "", int kapasitasGB = 0, string tipeDDR = "")
        : Komponen(merk, nama)
    {
        this->kapasitasGB = kapasitasGB;
        this->tipeDDR = tipeDDR;
    }

    // Destruktor
    ~Ram()
    {
    }

    // Getter
    int getKapasitasGB() const
    {
        return kapasitasGB;
    }

    string getTipeDDR() const
    {
        return tipeDDR;
    }

    // Setter
    void setKapasitasGB(int kapasitasGB)
    {
        this->kapasitasGB = kapasitasGB;
    }

    void setTipeDDR(string tipeDDR)
    {
        this->tipeDDR = tipeDDR;
    }

    // Method info
    string info() override
    {
        return "RAM: " + to_string(kapasitasGB) + "GB " + tipeDDR + " (Merk: " + merk + ")";
    }
};
