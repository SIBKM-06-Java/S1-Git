<<<<<<< HEAD
## Tugas Fakhmi Wahyu Ramdhani - Git

### Tugas Fast Forward - branch Childfakhmi

### Three Way Merge - Childfakhmi

### there Way Merge - Parentfakhmi

- git push => upload file local ke cloud
- git pull => download file cloud ke local

- reviewer => parent -> jangan sampai solved conflict
- assigness => child -> seharusnya solved conflict

- creator = write - read
- continous = read - write

## ** Laporan Tugas Git **

 ### 1. Fast Forward

- Buatlah Folder projeck
 ![](<img/1. Buat Folder Projeck.png.png>)

- Buka Git bash dan ketikkan cd "Path-project"
 ![Alt text](img/2.png.png)

- Buatlah File README.md dan file txt (Bebas), dan Ketikkan git add . untuk mengubah status perubahan file menjadi staging area.
 ![Alt text](img/3.png.png)

- Lalu ketikkan git commit -m "Pesan" untuk mengubah status perubahan file ke repo seperti yang ada di gambar.
 ![Alt text](img/4.png.png)

- Selanjutnya adalah untuk membuat branch baru untuk dimerge ke master branch.
 ![Alt text](img/5.png.png)

- Setelah membuat branch Childfakhmi , langkah selanjutnya masuk ke branch tersebut dengan mengetikkan perintah git checkout namabranch , kemudian buatlah file text2.txt, hal yang sama dengan melakukan git add text2.txt lalu git commit -m "pesan"
 ![Alt text](img/6.png.png)

- Kemudian pergi kembali ke branch master untuk memastikan file text2.txt tidak ada , karena hanya dibuat di branch Childfakhmi
 ![Alt text](img/7.png.png)

- Lakukan merge, setelah posisi kita sudah di master branch, kita ketikkan command git merge Childfakhmi
 ![Alt text](img/8.png.png)

 ### 2. Push ke Repo Parent Dan Child

- saya ingin mengupdate hasil screenshoot di README.md yang di branch Parentfakhmi
![](![Alt text](img2/1.png.png))

- sekarang kita akan menyambungkan local repo kita ke server github. dengan cara ketikkan git remote add SSH, dan saya akan mengganti nama Branch master menjadi Parentfakhmi dengan mengetikkan command seperti di bawah ini.
![](![Alt text](img2/2.png.png))

- Selanjutnya adalah push pada branch Parentfakhmi dengan mengikuti langkah dibawah ini.
![](![Alt text](img2/3.png.png))

- Dan selanjutnya adalah push Chil , sama seperti step ke 4 , tetapi pindah dahulu git checkout Childfakhmi.
![](![Alt text](img2/4.png.png))

### 3. Three Way Merging

- Lakukan perubahan pada file README.MD pada Childfakhmi, agar terjadi konflik (karena sebelumnya di Parentfakhmi file tersebut sudah ada valuenya).
![Alt text](img2/5.png.png)

- Kemudian lakukan add dan commit pada perubahan yang terjadi.
![Alt text](img2/6.png.png)

-kemudian cek graph nya dengan melihat jalurnya , apakah sudah keluar dari parent apa belum.
![Alt text](img2/7.png.png)

- Jika sudah maka selanjutnya adalah memperbaiki konflik menggunakan IDE VSCODE apply change.
![Alt text](img2/8.png.png)

- selanjutnya akan ada commitan baru karena file telah dimodified di atas.
![Alt text](img2/9.png.png)

- selanjutnya lakukan pull origin Parentfakhmi
![Alt text](img2/10.png.png)

- Dan terakhir adalah git push ke repo server github.
![Alt text]()
=======
1
>>>>>>> 130769686d62f88deb30c1674f71fc1c47a31a18
