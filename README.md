# DatJava
Database Java
Nama : Franklin Jaya
NIM : 0806022310016

Selamat Subuh Pak Ano, Ini Adalah Tugas OOP Yaitu menghubungkan Java dengan Database sehingga kita dapat mengisi tabel pada database lewat code java saja tanpa perlu kita masuk ke dalam MySQL Workbench lagi.

Jadi Cara kerja nya pada code kita bisa memasukkan 2 ID student, 2 name mahasiswa, 2 age mahasiswa, 2 major mahasiswa.

Tugas ini menggunakan Mvn atau maven yang berfungsi mengatur dependencies dan build tools. Jadi, kesimpulannya maven kita gunakan untuk mengimport dependencies database ke project kita.

Nah saya mendapatkan Library dari website Maven Repository. Untuk menghubungkan java dengan database saya mengimpor mysql-connector-java.

Try Catch itu seperti lawan if else tetapi kode try akan berjalan dulu jika ada kesalahan pada try akan masuk ke catch. Pada code ini juga saya menggunakan abstract class User yang berfungsi mengget dan set ID, name, age, major.

Pada File Demo itu file kita mengeksekusi codenya. File Demo juga saya menetapkan target mysql saya seperti "jdbc:mysql://localhost:3306/tess" itu adalah localhost saya, Dst. import connection berfungsi mengirim pernyataan SQL dan menerima hasilnya, DriverManager memungkinkan aplikasi untuk mendapatkan koneksi ke database menggunakan URL koneksi, PreparedStatement untuk melakukan eksekusi yang berulang menggunakan parameter yang berbeda tanpa memerlukan pengkompilan ulang. 
