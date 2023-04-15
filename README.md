# TP2 PRAKTIKUM DPBO 2023

> Saya **Muhamad Nur Yasin Amadudin** [2100137] mengerjakan
TP 2 Praktikum dalam
mata kuliah Desain Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan
kecurangan seperti yang telah dispesifikasikan. Aamiin.

## Desain Program
- Manusia
- Mahasiswa
- Dosen
- Laptop
- PengurusBEM
- PengurusDPM
- AsistenDosen

Hubungan tujuh kelas di atas dijelaskan pada gambar berikut:

![Desain Kelas](https://github.com/mnyasin26/TP1DPBO2023/blob/main/Desain%20Kelas.png)

## Penjelasan Kelas
1. Manusia:
Manusia merupakan kelas basis yang digunakan untuk mendefiniskan Mahasiswa dan Dosen dengan common atribut NoKTP, nama, dan alamat yang pasti juga dimiliki oleh Mahasiswa dan Dosen
2. Mahasiswa:
Kelas ini mendefinisikan seorang Mahasiswa, merupakan child dari Manusia dan basis bagi PengurusBEM, PengurusDPM, dan AsistenDosen, kelas ini digunakan juga sebagai pendefinisian Mahasiswa "biasa" tanpa role tambahan seperti PengurusBEM, Mahasiswa dapat memiliki laptop
3. Dosen:
Merpresentasikan seorang Dosen, Dosen dapat memiliki asisten dalam membantu kegiatan perkuliahan, Dosen memiliki kemampuan untuk dapat mengajar, memberikan tugas, serta dapat mengawasi kinerja asistennya
4. Laptop:
Laptop merupakan objek yang biasa digunakan bagi Manusia untuk melakukan aktivitas pekerjaan khususnya Mahasiswa dan Dosen, kelas ini diadakan karena hal tersebut
5. PengurusBEM:
Merepresentasikan Mahasiswa yang memiliki aktivitas berbeda dengan Mahasiswa biasa, yaitu mengurus BEM, di dalam kelas ini terdapat atribut pembeda dengan Mahasiswa biasa, misal jabatan dan kabinet serta beberapa method yang tidak bisa dilakukan oleh Mahasiswa biasa yaitu membuat program kerja
6. PengurusDPM:
pada dasarnya kelas ini mirip dengan kelas PengurusBEM, namun ada aktivitas yang membedakan antara BEM dan DPM, yaitu DPM dapat memantau aktivitas dan mengevalusi kinerja BEM, sehingga PengurusDPM memerlukan PengurusBEM sebagai atributnya untuk dapat dipantau serta dapat diberi apresiasi
7. AsistenDosen:
Kelas ini merupakan perwujudan dari Mahasiswa yang menjadi asisten dari seorang dosen, memiliki atribut dan method yng membedakan antara Mahasiswa biasa dan Mahasiswa yang memiliki kegiatan khusus lainnya

## Alur Program
1. Instansiasi kelas Laptop, PengurusBEM, PengurusDPM, AsistenDosen, Mahasiswa, dan Dosen dengan parameter berupa data dummy
2. Hasil instansiasi, beberapa diset memiliki laptop serta semua intansiasi dipanggil salah satu methodnya untuk menunjukkan keberadaannya
3. Instansiasi kelas table lalu isi data laptop untuk memperlihatkan list of object dalam bentuk tabel
4. Tampilkan data dengan memanggil method displayData pada objek table yang telah diinstansiasi

## Dokumentasi Program Saat Dijalankan
![Dokumentasi Program Python](https://github.com/mnyasin26/TP1DPBO2023/blob/main/Screenshot/Cuplikan%20layar%202023-03-19%20223200.png)
