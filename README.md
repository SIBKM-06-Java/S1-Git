## hi Putri Maharani

i hope u hard study and are great !!

## Laporan TUGAS_Versioning

Langkah pertama, Tentukan lokasi project yang akan dibuat dengan "cd". selanjutnya

git init => untuk menginisialisasi repo git di komputer kita

git remote -v => mengecek kepemilikian repo yang di-remote

git status =>untuk mengetahui status repo kita

git commit => untuk melakukan commit

git add . => menambahkan file baru ke repository yang baru dipilih

![alt text](<Screenshot 2024-02-29 081254.png>)

## Fast Forward

Langkah kedua,Melakukan merge Setelah menambahkan data yang diperlukan,,lalu mengganti branch dengan [git checkout (parent branch)] lalu melakukan merge dengan cara [git merge (child branch)]

<<<<<<< HEAD
Three way Merge
ChildPutri
=======
**Branch**

- Lakukan command "git checkout -b "childPutri" untuk membuat sekaligus berpindah ke branch baru

![alt text](image.png)

- lakukan [git add . ] dan commit seperti biasa

* bisa di cek bahwa,hanya branch(ChildPutri) saja yang berubah
  ![alt text](image-2.png)

**Merging**

- kita perlu melakukan merging,tetapi pindahkan ke branch utama(ParentPutri)
- command git merge ChildPutri

  ![alt text](image-1.png)

- lakukan command "graphs", dan sekarang branch sudah bersatu
  ![alt text](image-3.png)

**Remote**

- remote -v => Cek kepemilikian repo yang di-remote

- git remote add origin => untuk menghubungkan repo lokal kita ke repo cloud di github

![alt text](image-4.png)

## tips Three Way Merging

2. Three Way Merge
   ParentPutrimaharani (revisi)
>>>>>>> 841f7e185c4888dbfc792702c7f237e487c73e69
