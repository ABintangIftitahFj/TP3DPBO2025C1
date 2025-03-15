#include "Komponen.cpp"
#include "Hardrive.cpp"
#include "SSD.cpp"
#pragma once

class Storage : public Komponen
{
private:
    int kapasitasGB;
    vector<Harddrive *> harddrives;
    vector<SSD *> ssds;

public:
    // Konstruktor
    Storage(string merk = "", string nama = "", int kapasitasGB = 0)
        : Komponen(merk, nama)
    {
        this->kapasitasGB = kapasitasGB;
    }

    // Destruktor
    ~Storage()
    {
        // Hapus semua harddrives dan SSDs
        for (auto &hdd : harddrives)
        {
            delete hdd;
        }
        for (auto &ssd : ssds)
        {
            delete ssd;
        }
    }

    // Getter
    int getKapasitasGB() const
    {
        return kapasitasGB;
    }

    // Setter
    void setKapasitasGB(int kapasitasGB)
    {
        this->kapasitasGB = kapasitasGB;
    }

    // Tambah HDD dan SSD
    void addHarddrive(Harddrive *hdd)
    {
        harddrives.push_back(hdd);
    }

    void addSSD(SSD *ssd)
    {
        ssds.push_back(ssd);
    }

    // Method info
    string info() override
    {
        string result = "Storage: " + nama + " " + to_string(kapasitasGB) + "GB (Merk: " + merk + ")\n";
        result += "  Harddrives:\n";
        for (auto &hdd : harddrives)
        {
            result += "    - " + hdd->info() + "\n";
        }
        result += "  SSDs:\n";
        for (auto &ssd : ssds)
        {
            result += "    - " + ssd->info() + "\n";
        }
        return result;
    }
};