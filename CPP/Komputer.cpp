#include "Motherboard.cpp"
#include "PowerSupply.cpp"
#include "Storage.cpp"
#include "VGA.cpp"
#include "ModulInternetInternal.cpp"
#include "PerangkatJaringan.cpp"
#include "Mouse.cpp"
#pragma once

class Komputer
{
private:
    string nama;
    Motherboard *motherBoard;
    PowerSupply *powerSupply;
    vector<Storage *> storages;
    VGA *vga;
    ModulInternetInternal *internetInternal;
    PerangkatJaringan *perangkatJaringan;
    Mouse *mouse;

public:
    // Konstruktor
    Komputer(string nama = "")
    {
        this->nama = nama;
        this->motherBoard = nullptr;
        this->powerSupply = nullptr;
        this->vga = nullptr;
        this->internetInternal = nullptr;
        this->perangkatJaringan = nullptr;
        this->mouse = nullptr;
    }

    // Destruktor
    ~Komputer()
    {
        cout << "program selesai sedang memanggil konstruktor" << endl;
        if (motherBoard != nullptr)
        {
            delete motherBoard;
        }
        if (powerSupply != nullptr)
        {
            delete powerSupply;
        }
        for (auto &storage : storages)
        {
            delete storage;
        }
        if (vga != nullptr)
        {
            delete vga;
        }
        if (internetInternal != nullptr)
        {
            delete internetInternal;
        }
        if (perangkatJaringan != nullptr)
        {
            delete perangkatJaringan;
        }
        if (mouse != nullptr)
        {
            delete mouse;
        }
    }

    // Getter
    string getNama() const
    {
        return nama;
    }

    // Setter
    void setNama(string nama)
    {
        this->nama = nama;
    }

    void setMotherBoard(Motherboard *motherBoard)
    {
        this->motherBoard = motherBoard;
    }

    void setPowerSupply(PowerSupply *powerSupply)
    {
        this->powerSupply = powerSupply;
    }

    void addStorage(Storage *storage)
    {
        storages.push_back(storage);
    }

    void setVga(VGA *vga)
    {
        this->vga = vga;
    }

    void setInternetInternal(ModulInternetInternal *internetInternal)
    {
        this->internetInternal = internetInternal;
    }

    void setPerangkatJaringan(PerangkatJaringan *perangkatJaringan)
    {
        this->perangkatJaringan = perangkatJaringan;
    }

    void addMouse(Mouse *mouse)
    {
        this->mouse = mouse;
    }

    // Method info
    void show_info()
    {
        cout << "==============================================" << endl;
        cout << "INFORMASI KOMPUTER: " << nama << endl;
        cout << "==============================================" << endl;

        if (motherBoard != nullptr)
        {
            cout << motherBoard->info() << endl;
        }

        if (powerSupply != nullptr)
        {
            cout << powerSupply->info() << endl;
        }

        cout << "Storages:" << endl;
        for (auto &storage : storages)
        {
            cout << storage->info() << endl;
        }

        if (vga != nullptr)
        {
            cout << vga->info() << endl;
        }

        if (internetInternal != nullptr)
        {
            cout << internetInternal->info() << endl;
        }

        if (perangkatJaringan != nullptr)
        {
            cout << perangkatJaringan->info() << endl;
        }
        if (mouse != nullptr)
        {
            cout << mouse->info() << endl;
        }
        else if (mouse == nullptr)
        {
            cout << "Mouse: Tidak ada mouse yang terhubung" << endl;
        }

        cout << "==============================================\n"
             << endl;
    }
};
