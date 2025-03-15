#include "Komponen.cpp"
#pragma once

class PerangkatJaringan : public Komponen
{
private:
    string alamatIp;
    string nameProvider;
    string internet;

public:
    // Konstruktor
    PerangkatJaringan(string merk = "", string nama = "", string alamatIp = "",
                      string nameProvider = "", string internet = "")
        : Komponen(merk, nama)
    {
        this->alamatIp = alamatIp;
        this->nameProvider = nameProvider;
        this->internet = internet;
    } // Destruktor
    ~PerangkatJaringan()
    {
    }

    // Getter
    string getAlamatIp() const
    {
        return alamatIp;
    }

    string getNameProvider() const
    {
        return nameProvider;
    }

    string getInternet() const
    {
        return internet;
    }

    // Setter
    void setAlamatIp(string alamatIp)
    {
        this->alamatIp = alamatIp;
    }

    void setNameProvider(string nameProvider)
    {
        this->nameProvider = nameProvider;
    }

    void setInternet(string internet)
    {
        this->internet = internet;
    }

    // Method info
    string info() override
    {
        return "Perangkat Jaringan: " + nama + " (Merk: " + merk + ")\n" +
               "  IP: " + alamatIp + "\n" +
               "  Provider: " + nameProvider + "\n" +
               "  Internet: " + internet;
    }
};