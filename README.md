# TP2 PRAKTIKUM DPBO 2023

> Saya **Muhamad Nur Yasin Amadudin** [2100137] mengerjakan
TP 2 Praktikum dalam
mata kuliah Desain Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan
kecurangan seperti yang telah dispesifikasikan. Aamiin.

## Desain Program
- User
- Job
- DBConnection
- LoginPage
- JobList
- Card
- JobForm

Hubungan tujuh kelas di atas dijelaskan pada gambar berikut:

![Desain Kelas](https://github.com/mnyasin26/TP2DPBO2023/blob/main/TP2DPBO2023_Design.png)

## Penjelasan Kelas
1. User:
Merupakan kelas yang digunakan untuk mendefiniskan User bseserta propertinya, seperti usename dan password untuk keperluan login
2. Job:
Merupakan kelas yang digunakan untuk model data table Job, mendefinisikan satu buah job
3. DBConnection:
DBConnection berfungsi menjadi penghubung program dengan database
4. Laptop:
Laptop merupakan objek yang biasa digunakan bagi Manusia untuk melakukan aktivitas pekerjaan khususnya Mahasiswa dan Dosen, kelas ini diadakan karena hal tersebut
5. LoginPage:
Merupakan kelas view yang menghandle tampilan Login dan juga sebagai entry ke tampilan JobList
6. JobList:
Merupakan kelas view yang menampilkan list card yang berisikan data dari table job, merupakan menu utama dari program
7. Card:
Merupakan kelas yang merepresentasikan job (penampil)
8. JobForm
Merupakan kelas view yang menghandle input data

## Alur Program
1. Instansiasi kelas Laptop, PengurusBEM, PengurusDPM, AsistenDosen, Mahasiswa, dan Dosen dengan parameter berupa data dummy
2. Hasil instansiasi, beberapa diset memiliki laptop serta semua intansiasi dipanggil salah satu methodnya untuk menunjukkan keberadaannya
3. Instansiasi kelas table lalu isi data laptop untuk memperlihatkan list of object dalam bentuk tabel
4. Tampilkan data dengan memanggil method displayData pada objek table yang telah diinstansiasi

## Dokumentasi Program Saat Dijalankan
![Dokumentasi Program Python](https://github.com/mnyasin26/TP1DPBO2023/blob/main/Screenshot/Cuplikan%20layar%202023-03-19%20223200.png)
