#include "Komponen.cpp"
#include "Ram.cpp"
#include "CPU.cpp"
#include "CoolingSystem.cpp"
#include "VGA.cpp"
#pragma once


class Motherboard : public Komponen {
    private:
        string socketType;
        string chipset;
        int usb;
        string formFactor;
        vector<Ram*> rams;
        CPU* cpu;
        CoolingSystem* coolingSystem;
        VGA* vga;
        
    public:
        // Konstruktor
        Motherboard(string merk = "", string nama = "", string socketType = "", 
                    string chipset = "", int usb = 0, string formFactor = "") 
            : Komponen(merk, nama) {
            this->socketType = socketType;
            this->chipset = chipset;
            this->usb = usb;
            this->formFactor = formFactor;
            this->cpu = nullptr;
            this->coolingSystem = nullptr;
            this->vga = nullptr;
        }
        
        // Destruktor
        ~Motherboard() {
            for (auto& ram : rams) {
                delete ram;
            }
            if (cpu != nullptr) {
                delete cpu;
            }
            if (coolingSystem != nullptr) {
                delete coolingSystem;
            }
            if (vga != nullptr) {
                delete vga;
            }
        }
        
        // Getter
        string getSocketType() const {
            return socketType;
        }
        
        string getChipset() const {
            return chipset;
        }
        
        int getUsb() const {
            return usb;
        }
        
        string getFormFactor() const {
            return formFactor;
        }
        
        // Setter
        void setSocketType(string socketType) {
            this->socketType = socketType;
        }
        
        void setChipset(string chipset) {
            this->chipset = chipset;
        }
        
        void setUsb(int usb) {
            this->usb = usb;
        }
        
        void setFormFactor(string formFactor) {
            this->formFactor = formFactor;
        }
        
        // Add components
        void addRam(Ram* ram) {
            rams.push_back(ram);
        }
        
        void setCpu(CPU* cpu) {
            this->cpu = cpu;
        }
        
        void setCoolingSystem(CoolingSystem* coolingSystem) {
            this->coolingSystem = coolingSystem;
        }
        
        void setVga(VGA* vga) {
            this->vga = vga;
        }
        
        // Method info
        string info() override {
            string result = "Motherboard: " + nama + " " + chipset + " (Merk: " + merk + ")\n" +
                           "  Socket: " + socketType + "\n" +
                           "  Form Factor: " + formFactor + "\n" +
                           "  USB Ports: " + to_string(usb) + "\n";
            
            result += "  RAMs:\n";
            for (auto& ram : rams) {
                result += "    - " + ram->info() + "\n";
            }
            
            if (cpu != nullptr) {
                result += "  CPU: " + cpu->info() + "\n";
            }
            
            if (coolingSystem != nullptr) {
                result += "  Cooling System: " + coolingSystem->info() + "\n";
            }
            
            if (vga != nullptr) {
                result += "  VGA: " + vga->info() + "\n";
            }
            
            return result;
        }
    };
    