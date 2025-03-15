#include "Komponen.cpp"
#pragma once

class SSD : public Komponen
{
private:
    double readingSpeed;

public:
    // Konstruktor
    SSD(string merk = "", string nama = "", double readingSpeed = 0.0)
        : Komponen(merk, nama)
    {
        this->readingSpeed = readingSpeed;
    }

    // Destruktor
    ~SSD()
    {
    }

    // Getter
    double getReadingSpeed() const
    {
        return readingSpeed;
    }

    // Setter
    void setReadingSpeed(double readingSpeed)
    {
        this->readingSpeed = readingSpeed;
    }

    // Method info
    string info() override
    {
        return "SSD: " + nama + " dengan kecepatan baca " +
               to_string(readingSpeed) + " MB/s (Merk: " + merk + ")";
    }
};
