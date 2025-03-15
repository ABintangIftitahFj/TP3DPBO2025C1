# TP3DPBO2025C1

# Janji

Saya A Bintang Iftitah FJ dengan NIM 2305995 mengerjakan soal Tes Praktikum 3 dalam mata kuliah Desain Pemrograman Berbasis Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.


# Desain Program 

![TP3-DPBO](https://github.com/user-attachments/assets/3edd730f-794a-436b-8cbc-f0dde93e0812)

# Deskripsi Kode
## Struktur Kelas

1. **Kelas Utama: Komponen**
   - Mewarisi atribut `merk` dan `nama`.

2. **Jumlah Kelas**
   - Terdapat total **18 kelas**.

3. **Hubungan Kelas**
   - Kelas `Mouse`, `Peripherals`, dan `Base_io` **tidak terhubung** dengan `Komponen`.

4. **Multilevel Inheritance**
   - `Mouse` → `Peripherals` → `Base_io`.

5. **Komposisi dalam Diagram**
   - Ditandai dengan **panah diamond hitam** (🔷).

6. **Single Inheritance**
   - Ditandai dengan **panah arrow** (→).

7. **Polimorfisme**
   - Terdapat **metode `getInfo()`** yang menyesuaikan dengan kelas yang dipanggil.

8. **Metode Getter dan Setter**
   - Setiap kelas memiliki **getter dan setter** untuk mengakses atributnya.


Inheritance (Pewarisan):

Terdapat beberapa hubungan inheritance yang ditandai dengan panah sederhana (→) pada diagram:

Mouse → peripherals → Base_IO (inheritance multilevel)
HardDrive, SSD, VGA, RAM, CPU, CoolingSystem → Komponen (inheritance single)
Motherboard memiliki hubungan inheritance dengan Komponen
PowerSupply memiliki hubungan inheritance dengan Komponen
modul_Internet_internal memiliki hubungan inheritance dengan Komponen

Composite (Komposisi):

Hubungan composite ditandai dengan panah diamond hitam (♦→) pada diagram:

Komputer memiliki komposisi dengan Storage, VGA, modul_Internet_internal, Motherboard, dan PowerSupply (komputer terdiri dari komponen-komponen ini)
Motherboard memiliki komposisi dengan CPU, RAM, CoolingSystem, VGA, dan SSD (motherboard terdiri dari komponen-komponen ini)

Polimorfisme:

Polimorfisme terlihat pada metode getInfo() yang dimiliki oleh berbagai kelas
Implementasi getInfo() berbeda-beda tergantung pada kelas yang memanggil
Ini memungkinkan perilaku yang berbeda untuk metode yang sama tergantung pada jenis objeknya

# Alur Program 
Program di desain untuk mengeluarkan output komponen dan alat i/o yang terdapat pada komputer.

Kelas Komponen merupakan kelas utama yang memiliki atribut merk dan nama yang diwariskan ke kelas-kelas turunannya
Terdapat struktur hirarki inheritance yang memungkinkan kelas-kelas turunan (seperti Processor, CoolingSystem, CPU, dll) untuk mewarisi sifat-sifat dari kelas Komponen
Kelas Komputer menggunakan komposisi untuk menggabungkan berbagai komponen hardware (seperti Storage, VGA, dan lainnya)
Terdapat jalur inheritance multilevel dari Mouse → peripherals → Base_IO yang menggambarkan hirarki perangkat input
Setiap kelas memiliki metode getter dan setter untuk akses dan modifikasi atribut
Implementasi polimorfisme pada getInfo() memungkinkan program untuk menampilkan informasi yang spesifik sesuai dengan jenis komponen yang dipilih
Program dapat menampilkan informasi tentang semua komponen komputer dan perangkat I/O yang terhubung

Diagram tersebut menunjukkan arsitektur sistem komputer yang komprehensif dengan berbagai jenis hubungan antar komponen, yang mencerminkan struktur perangkat keras komputer yang sebenarnya.

![java](https://github.com/user-attachments/assets/a053db4f-78d2-4bae-806a-ca13ad8c8af3)



![Python](https://github.com/user-attachments/assets/2e62dceb-4f32-4f6e-984a-f7da2d430522)

![cpp](https://github.com/user-attachments/assets/bc604ef7-74b6-451a-87cc-2f963ac555ad)


