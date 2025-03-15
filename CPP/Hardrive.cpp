#include "Komponen.cpp"
#pragma once

class Harddrive : public Komponen {
    private:
        string tipeDrive;
        
    public:
        // Konstruktor
        Harddrive(string merk = "", string nama = "", string tipeDrive = "") 
            : Komponen(merk, nama) {
            this->tipeDrive = tipeDrive;
        }
        
        // Destruktor
        ~Harddrive() {
        }
        
        // Getter
        string getTipeDrive() const {
            return tipeDrive;
        }
        
        // Setter
        void setTipeDrive(string tipeDrive) {
            this->tipeDrive = tipeDrive;
        }
        
        // Method info
        string info() override {
            return "Harddrive: " + tipeDrive + " (Merk: " + merk + ", Nama: " + nama + ")";
        }
    };



