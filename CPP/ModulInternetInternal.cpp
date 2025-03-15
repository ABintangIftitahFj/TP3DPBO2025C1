#include "Komponen.cpp"
#pragma once

class ModulInternetInternal : public Komponen {
    private:
        int kecepatanMbps;
        string statusKoneksi;
        
    public:
        // Konstruktor
        ModulInternetInternal(string merk = "", string nama = "", int kecepatanMbps = 0, 
                               string statusKoneksi = "") 
            : Komponen(merk, nama) {
            this->kecepatanMbps = kecepatanMbps;
            this->statusKoneksi = statusKoneksi;
        }
        
        // Destruktor
        ~ModulInternetInternal() {
        }
        
        // Getter
        int getKecepatanMbps() const {
            return kecepatanMbps;
        }
        
        string getStatusKoneksi() const {
            return statusKoneksi;
        }
        
        // Setter
        void setKecepatanMbps(int kecepatanMbps) {
            this->kecepatanMbps = kecepatanMbps;
        }
        
        void setStatusKoneksi(string statusKoneksi) {
            this->statusKoneksi = statusKoneksi;
        }
        
        // Method info
        string info() override {
            return "Modul Internet Internal: " + nama + " (Merk: " + merk + ")\n" +
                   "  Kecepatan: " + to_string(kecepatanMbps) + " Mbps\n" +
                   "  Status: " + statusKoneksi;
        }
    };