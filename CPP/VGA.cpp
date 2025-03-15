#include "Komponen.cpp"
#pragma once

class VGA : public Komponen
{
private:
    string namaVga;
    int memoriGB;
    string tipeMemori;

public:
    // Konstruktor
    VGA(string merk = "", string nama = "", string namaVga = "",
        int memoriGB = 0, string tipeMemori = "")
        : Komponen(merk, nama)
    {
        this->namaVga = namaVga;
        this->memoriGB = memoriGB;
        this->tipeMemori = tipeMemori;
    }

    // Destruktor
    ~VGA()
    {
    }

    // Getter
    string getNamaVga() const
    {
        return namaVga;
    }

    int getMemoriGB() const
    {
        return memoriGB;
    }

    string getTipeMemori() const
    {
        return tipeMemori;
    }

    // Setter
    void setNamaVga(string namaVga)
    {
        this->namaVga = namaVga;
    }

    void setMemoriGB(int memoriGB)
    {
        this->memoriGB = memoriGB;
    }

    void setTipeMemori(string tipeMemori)
    {
        this->tipeMemori = tipeMemori;
    }

    // Method info
    string info() override
    {
        return "VGA: " + namaVga + " " + to_string(memoriGB) + "GB " +
               tipeMemori + " (Merk: " + merk + ")";
    }
};
