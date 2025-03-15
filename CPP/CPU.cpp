#include "Komponen.cpp"
#include "Processor.cpp"
#pragma once

class CPU : public Komponen
{
private:
    string jumlahCore;
    double kecepatanGhz;
    Processor *processor;

public:
    // Konstruktor
    CPU(string merk = "", string nama = "", string jumlahCore = "", double kecepatanGhz = 0.0)
        : Komponen(merk, nama)
    {
        this->jumlahCore = jumlahCore;
        this->kecepatanGhz = kecepatanGhz;
        this->processor = nullptr;
    }

    // Destruktor
    ~CPU()
    {
        if (processor != nullptr)
        {
            delete processor;
        }
    }

    // Getter
    string getJumlahCore() const
    {
        return jumlahCore;
    }

    double getKecepatanGhz() const
    {
        return kecepatanGhz;
    }

    Processor *getProcessor() const
    {
        return processor;
    }

    // Setter
    void setJumlahCore(string jumlahCore)
    {
        this->jumlahCore = jumlahCore;
    }

    void setKecepatanGhz(double kecepatanGhz)
    {
        this->kecepatanGhz = kecepatanGhz;
    }

    void setProcessor(Processor *processor)
    {
        this->processor = processor;
    }

    // Method info
    string info() override
    {
        string result = "CPU: " + nama + " " + jumlahCore + " " +
                        to_string(kecepatanGhz) + "GHz (Merk: " + merk + ")";
        if (processor != nullptr)
        {
            result += "\n  Processor: " + processor->info();
        }
        return result;
    }
};
