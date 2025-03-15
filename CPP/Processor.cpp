#include "Komponen.cpp"
#pragma once

class Processor : public Komponen
{
private:
    string namaprocessor;
    string generasi;
    double kecepatanGhz;

public:
    // Konstruktor
    Processor(string merk = "", string nama = "", string namaprocessor = "",
              string generasi = "", double kecepatanGhz = 0.0)
        : Komponen(merk, nama)
    {
        this->namaprocessor = namaprocessor;
        this->generasi = generasi;
        this->kecepatanGhz = kecepatanGhz;
    }

    // Destruktor
    ~Processor()
    {
    }

    // Getter
    string getnamaprocessor() const
    {
        return namaprocessor;
    }

    string getGenerasi() const
    {
        return generasi;
    }

    double getKecepatanGhz() const
    {
        return kecepatanGhz;
    }

    // Setter
    void setnamaprocessor(string namaprocessor)
    {
        this->namaprocessor = namaprocessor;
    }

    void setGenerasi(string generasi)
    {
        this->generasi = generasi;
    }

    void setKecepatanGhz(double kecepatanGhz)
    {
        this->kecepatanGhz = kecepatanGhz;
    }

    // Method info
    string info() override
    {
        return "Processor: " + namaprocessor + " " + generasi + " " +
               to_string(kecepatanGhz) + " GHz (Merk: " + merk + ")";
    }
};
