# halo teman-teman

# belajar git

# fast forward example - taxt 1

![Alt text](<images/Screenshot 2024-02-28 233922.png>)
 ## Git init ber fungsi agar folder yang kita buat ini akan terealisasikan dengan git

 ![Alt text](<images/Screenshot 2024-02-28 234026.png>)
## Ls -al berfungsi untuk mengecek apakah sudah terrealisasikan dengan git

 ![Alt text](<images/Screenshot 2024-02-28 234218.png>)
## Ini berfungsi untuk membuat branch , disini saya masih membuat dengan default nya yaitu master
 ![Alt text](<images/Screenshot 2024-02-28 234659.png>)
## Git status ini berfungsi melihat status file kita ,sedang dimana  

 ![Alt text](<images/Screenshot 2024-02-29 000703.png>)
## Git add berfungsi untuk menambahkan perubahan yang telah Anda lakukan pada file atau direktori ke dalam staging area. Staging area merupakan tempat di mana Anda menyiapkan perubahan sebelum melakukan commit ke repositori 
 ![Alt text](<images/Screenshot 2024-02-29 002758.png>)
## digunakan untuk membuat commit dengan pesan commit yang diberikan secara langsung dari baris perintah. Ini memungkinkan Anda untuk membuat commit dengan pesan singkat tanpa harus membuka editor teks


## Kemudian kiat mencoba untuk mengubah / mengdit file ,kita tinggal melakukan hal yang sama seperiti tadi
![Alt text](<images/Screenshot 2024-02-29 003447.png>) 
## Cek status lagi kita kita lihat file kita sedang berada di modifite kemudian ,
 ![Alt text](<images/Screenshot 2024-02-29 003504.png>)
## Melakukan hal yang sama lagi agar commit ke git 
 ![Alt text](<images/Screenshot 2024-02-29 003518.png>)
## Git log berfungsi digunakan untuk menampilkan riwayat commit dalam repositori Git. Ini akan menampilkan daftar commit yang ada, beserta informasi seperti hash commit, penulis commit, tanggal commit, dan pesan commit.
 ![Alt text](<images/Screenshot 2024-02-29 004804.png>)
## git log --all --decorate --oneline –graph untuk menapilkan riwayat lebih simpel 

![Alt text](<images/Screenshot 2024-02-29 004818.png>) 
## Alias graph=” git log --all --decorate --oneline –graph” mempuat nama penggati sementara agar lebih simpel saja 
![Alt text](<images/Screenshot 2024-02-29 004547.png>) 
## Nano ~/.bash_profile ini membuat nama penggati secara permanen 
![Alt text](<images/Screenshot 2024-02-29 004646.png>) 
## Kemuian kita tinggal memasuka nama yang simpel yang ingin kita ganti . kalo sudah tigal kita simpan dengan cara ctrl+0 dang keluar dengan cara ctrl+X
 ![Alt text](<images/Screenshot 2024-02-29 022216.png>)
## git branch -m master perentdimas berfungsi untuk mengganti nama branch kita
 ![Alt text](<images/Screenshot 2024-02-29 022216.png>)
## git checkout -b childimas berfungsi untuk membuat branch baru dan berpindah branch jika brach itu sudah di buat

 
![Alt text](<images/Screenshot 2024-02-29 024026.png>)
## Kita ingin melalukan proses pewarisan agar di brach peretndimas tidak mengalami perubahan taxt agar yang ada perubahan text di childimas saja

 ![Alt text](<images/Screenshot 2024-02-29 024137.png>)

## git commit -am "fix ; exampel from fast forward" dengan cara ini kita melakukan perubahan / pewarisan .

 ![Alt text](<images/Screenshot 2024-02-29 024713.png>)

## Nah dengan bukti ini kita hanaya merubah taxt di childimas saja

 ![Alt text](<images/Screenshot 2024-02-29 025504.png>)

## Di perentdimas tidak ada perubahan taxt 

 ![Alt text](<images/Screenshot 2024-02-29 030439.png>)

## Nah disini kita melakukan pengabungan dengan catatan kita berada di brach perentdimas Dan hasilnya kedua branch akan sejajar 

 ![Alt text](<images/Screenshot 2024-02-29 033252.png>)

## Ini melakukan remote ke https://github.com/SIBKM-06-Java/S1-Git

![Alt text](<images/Screenshot 2024-02-29 033252.png>)
 
## Ini melakukan push file ke github s1-git 

 ![Alt text](<images/Screenshot 2024-02-29 033834.png>)

## Ini melakuna push dengan mengguna kan branch chlidimas



# Disini kita akan melakukan Three Way Merge setelah solve conflict lakukan merge dengan cara pull request (pr) dan reviewer akun @fuad-zein &  assignees
![Alt text](<images/Screenshot 2024-02-29 183531.png>)
 

## Pertama kita melakukan git clone terlebih dahulu bertujuan untuk mengambil data dari cloud, pastikan kita berada di luar foder yang kita push di awal agar file kita tidak berantakan 


 ![Alt text](<images/Screenshot 2024-02-29 185305.png>)

## Kemudian kita cek apakan sudah ada di lokal repositori kita dengan cara ls -l ,kemudian jika sudah ada kita lansung buka foledernya dengan cara cd S1-Git/ kalo berhasil kita akan berada di branch default yaitu perentsamara
![Alt text](<images/Screenshot 2024-02-29 185834.png>)
 

## Kemudian kita cek apa kita suda terkoneksi dengan repo yang aka kita up 

![Alt text](<images/Screenshot 2024-02-29 190825.png>)
## Kemudian kita cek branch kita dengan cara git branch -r untuk melihar daftar branch

  ![Alt text](<images/Screenshot 2024-02-29 191635.png>)

## Kemudian kita masuk ke branch kita pridi saja dengan cara dia atas.

![Alt text](<images/Screenshot 2024-02-29 195823.png>)

## Setelah kita up kita akan melakukan compare & pull request dengan mengeklik tombol compare & pull request
 
![Alt text](<images/Screenshot 2024-02-29 195618.png>)

## Kemudian kita base perentdimas sebagai file yang akan di updaet dan  compare childimas sebagai file comparel jika suda pilih create pull request untuk membuat pull

 ![Alt text](<images/Screenshot 2024-02-29 195732.png>)

## Kita tabakan fuad-zein Sebgaai Reviwers dan dimasaji1129(nama github kita) sebagai assignees jika sudah klik create pull request 

 ![Alt text](<images/Screenshot 2024-02-29 200721.png>)

## Disini kita tinggal commit saja untuk meng compare

![Alt text](<images/Screenshot 2024-02-29 202047.png>) 

## Untu meng update fie perentdimas di lokal kita ,kita tinggal gitpull saja seperti di atas 

# SELESAI

