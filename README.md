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

## Three Way Merge

- clone dari github(cloud) ke local repo
  > git clone git@github.com:SIBKM-06-Java/S1-Git.git

> cd S1-Git

> masuk ke branch ParentPutri n ChildPutri
> ![alt text](image-5.png)

- selanjutnya, Edit file readme.md di branch parent agar nantinya akan terjadi conflict dengan branch child
  ![alt text](image-6.png)
- Lakukan commit dan push pada branch parent
  ![alt text](image-7.png)
- lakukan dengan hal sama pada branch ChildPutri, tetapi tidak dipush
  ![alt text](image-8.png)
- Lakukan git pull dari branch child ke branch parent
  ![alt text](image-9.png)
- setelah itu, Terjadi Solve conflict dengan file README.md
  ![alt text](image-10.png)
- Lakukan commit dan pull seperti gambar dibawah ini
  ![alt text](image-11.png)

## PR (Pull Request)

- Buka pull request dan lakukan open new pull request dengan branch parent sebagai base dan child parent sebagai subjek yang ingin dikomparasi
  ![alt text](image-13.png)
  ![alt text](image-12.png)

      ![alt text](image-14.png)

  ![alt text](image-16.png)

- Untuk Accept Merge perlu diketahui ini tidak dilakukan sendiri tanpa persetujuan reviewer namun dalam kasus ini hanyalah uji coba saja)

  ![alt text](image-15.png)
