# TP2 PRAKTIKUM DPBO 2023

> Saya **Muhamad Nur Yasin Amadudin** [2100137] mengerjakan
TP 2 Praktikum dalam
mata kuliah Desain Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan
kecurangan seperti yang telah dispesifikasikan. Aamiin.

## Deskripsi Umum Program
Program ini bisa menampung job list sebagai "To Do List" untuk menyimpan daftar perkerjaan yang akan dilakukan ataupun yang sudah dilakukan lengkap dengan tanggal, gambar, durasi, dan status keterlaksanaan

![Menu Utama Program](https://github.com/mnyasin26/TP2DPBO2023/blob/main/Screenshot/Cuplikan%20layar%202023-04-12%20185419.png)

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
1. `User`: Merupakan kelas yang digunakan untuk mendefiniskan User bseserta propertinya, seperti usename dan password untuk keperluan login
2. `Job`: Merupakan kelas yang digunakan untuk model data table Job, mendefinisikan satu buah job
3. `DBConnection`: DBConnection berfungsi menjadi penghubung program dengan database
4. `Laptop`: Laptop merupakan objek yang biasa digunakan bagi Manusia untuk melakukan aktivitas pekerjaan khususnya Mahasiswa dan Dosen, kelas ini diadakan karena hal tersebut
5. `LoginPage`: Merupakan kelas view yang menghandle tampilan Login dan juga sebagai entry ke tampilan JobList
6. `JobList`: Merupakan kelas view yang menampilkan list card yang berisikan data dari table job, merupakan menu utama dari program
7. `Card`: Merupakan kelas yang merepresentasikan job (penampil)
8. `JobForm`: Merupakan kelas view yang menghandle input data

## Desain Database
![Desain Database](https://github.com/mnyasin26/TP2DPBO2023/blob/main/Desain%20Database.png)

## Disclaimer
- Program untuk penyimpanan image hanya bisa pada file JAR
- Program yang dijalankan via IDE tak akan tampil gambar

## Alur Program
1. Pada saat program dibuka, maka akan tampil halaman login

![Halaman Login](https://github.com/mnyasin26/TP2DPBO2023/blob/main/Screenshot/Cuplikan%20layar%202023-04-12%20185356.png)

2. Isi username dan password
-> Username: mnyasin26
-> Password: 12345678

![Halaman Login Terisi](https://github.com/mnyasin26/TP2DPBO2023/blob/main/Screenshot/Cuplikan%20layar%202023-04-12%20185407.png)

3. Ketika tombol login dipencet, program akan mengecek data usernama dan password apakah sama dengan data yang ada di database
Kalau match:

![Login Berhasil](https://github.com/mnyasin26/TP2DPBO2023/blob/main/Screenshot/Cuplikan%20layar%202023-04-12%20185412.png)

4. Program akan langsung menampilkan job list, pada setiap job yang ada user dapat mengubah, delete, atau mengubah status dari belum dikerjakan menjadi dikerjakan menggunakan tombol done

![Menu Utama](https://github.com/mnyasin26/TP2DPBO2023/blob/main/Screenshot/Cuplikan%20layar%202023-04-12%20185419.png)

6. User dapat tambah job dengan menekan tombol "Tambah Data"

![Tambah Data](https://github.com/mnyasin26/TP2DPBO2023/blob/main/Screenshot/Cuplikan%20layar%202023-04-12%20185434.png)

7. User dapat kembali ke halaman sebelumnya dengan menekan tombol "back"

![back](https://github.com/mnyasin26/TP2DPBO2023/blob/main/Screenshot/Cuplikan%20layar%202023-04-12%20185534.png)

