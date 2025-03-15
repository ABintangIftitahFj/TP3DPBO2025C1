#include "Komponen.cpp"
#pragma once

class PowerSupply : public Komponen
{
private:
    int dayaWatt;
    string sertifikasi;

public:
    // Konstruktor
    PowerSupply(string merk = "", string nama = "", int dayaWatt = 0, string sertifikasi = "")
        : Komponen(merk, nama)
    {
        this->dayaWatt = dayaWatt;
        this->sertifikasi = sertifikasi;
    }

    // Destruktor
    ~PowerSupply()
    {
    }

    // Getter
    int getDayaWatt() const
    {
        return dayaWatt;
    }

    string getSertifikasi() const
    {
        return sertifikasi;
    }

    // Setter
    void setDayaWatt(int dayaWatt)
    {
        this->dayaWatt = dayaWatt;
    }

    void setSertifikasi(string sertifikasi)
    {
        this->sertifikasi = sertifikasi;
    }

    // Method info
    string info() override
    {
        return "Power Supply: " + nama + " " + to_string(dayaWatt) +
               "W " + sertifikasi + " (Merk: " + merk + ")";
    }
};