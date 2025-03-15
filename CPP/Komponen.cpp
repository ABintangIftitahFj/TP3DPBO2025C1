#include <bits/stdc++.h>
#include <string>
#include <vector>
#include <iostream>
#pragma once

using namespace std;


class Komponen
{
protected:
    string merk;
    string nama;

public:
    // konstruktor
    Komponen(string merk = "", string nama = "")
    {
        this->merk = merk;
        this->nama = nama;
    }
    // Destruktor
    ~Komponen()
    {
    }
    // getter
    string getMerk()
    {
        return merk;
    }
    string getNama()
    {
        return nama;
    }
    // setter
    void setMerk(string merk)
    {
        this->merk = merk;
    }
    void setNama(string nama)
    {
        this->nama = nama;
    }

    // method info
    virtual string info()
    {
        return "Komponen : " + nama + "(Merk : " + merk + ")";
    }
};