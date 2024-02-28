# Belajar Git & Github
## Tugas 1 - Versioning
<br>

## Membuat Repository Local dan Push ke Github
- **STEP 1** - Lakukan initialisasi pada folder yang sudah dibuat dengan `git init`

![Image Git Bash](https://github.com/SIBKM-06-Java/S1-Git/blob/ParentNanang/img/Screenshot%20(233).png?raw=true)

- **STEP 2** - Sesuaikan nama branch, branch default yang diberikan oleh git biasanya bernama master. Jika ingin menyesuaikan nama branch-nya gunakan command `git branch <nama_branch>` 

![Image Git Bash](https://github.com/SIBKM-06-Java/S1-Git/blob/ParentNanang/img/Screenshot%20(234).png?raw=true)

- **STEP 3** - lakukan add pada file/folder yang ingin dimasukan kedalam Repository Local, menggunakan command `git add <nama_file>` atau `git add .` untuk add semua file dan folder.

![Image Git Bash](https://github.com/SIBKM-06-Java/S1-Git/blob/ParentNanang/img/Screenshot%20(235).png?raw=true)

- **STEP 4** - lakukan commit untuk file dan folder yang sudah di add sebelumnya menggunakan command `git commit -m "<pesan_commit>"`.

![Image Git Bash](https://github.com/SIBKM-06-Java/S1-Git/blob/ParentNanang/img/Screenshot%20(236).png?raw=true)

Pada tahap ini sebenarnya file/folder kalian sudah masuk kedalam Local Repository, tetapi file/folder nya belum masuk ke Remote Repository (Github). Untuk memasukan file/folder kalian ke Remote Repository ikuti langkah-langkah berikut : 

- **STEP 5** - lakukan remote pada repository github yang dituju menggunakan command `git remote add <nama_variabel_remote> <url/ssh_github>`.

![Image Git Bash](https://github.com/SIBKM-06-Java/S1-Git/blob/ParentNanang/img/Screenshot%20(237).png?raw=true)

- **STEP 6** - Terakhir lakukan push Repository Local ke Repository Remote (Github) menggunakan command `git push <nama_variabel_remote> <nama_branch>`.

![Image Git Bash](https://github.com/SIBKM-06-Java/S1-Git/blob/ParentNanang/img/Screenshot%20(238).png?raw=true)

**Selamat!!** file dan folder kalian sudah masuk kedalam Repository Remote (Github). Lalu, bagaimana jika kita ingin melakukan commit dan push untuk yang kedua dan seterusnya???

Untuk melakukan Push kembali ke Repository Remote (Github) kalian, cukup lakukan command `git add`, `git commit`, dan `git push`. Berarti kalian hanya perlu mengulangi Step 3, 4, dan 6. 

<br>

# Fast-forward
Fast-forward adalah proses dimana Git memperbarui pointer seperti HEAD ke commit yang merupakan keturunanannya. Ini terjadi apabila tidak ada perubahan yang berbeda pada Parent dan Child untuk digabungkan, sehingga Git hanya memindahkan pointer ke depan. Berikut adalah contoh dari kondisi fast-forward : 

- **STEP 1** - membuat branch baru untuk dijadikan branch child, menggunakan command `git checkout -b <nama_branch>`.

![Image Git Bash](https://github.com/SIBKM-06-Java/S1-Git/blob/ParentNanang/img/Screenshot%20(239).png?raw=true)

Untuk melihat semua branch yang ada pada repository, bisa menggunakan command `git branch`.

![Image Git Bash](https://github.com/SIBKM-06-Java/S1-Git/blob/ParentNanang/img/Screenshot%20(240).png?raw=true)

Maka akan tampil semua branch, branch yang aktif biasanya ditandai dengan tulisan berwarna hijau. Jika ingin berpindah branch, bisa menggunakan command `git checkout <nama_branch>`

- **STEP 2** - Silahkan commit perubahan pada file/folder seperti pada langkah-langkah sebelumnya.

- **STEP 3** - Setelah selesai melakukan commit, selanjutnya kita akan melihat riwayat commit untuk mengetahui struktur commitnya, menggunakan command `git log --all --decorate --oneline --graph`.

![Image Git Bash](https://github.com/SIBKM-06-Java/S1-Git/blob/ParentNanang/img/Screenshot%20(241).png?raw=true)

Bisa kita lihat dari commit pada gambar tersebut, bahwa pointer HEAD sekarang sudah ada di branch child dan posisi dari commit branch child dan parent tidak sejajar, yang menandakan ada commit yang berbeda.

- **STEP 4** - Untuk melakukan fast-forward kita harus pindah dari branch child ke branch parent nya untuk melakukan merge, menggunakan command `git checkout <nama_branch>`

![Image Git Bash](https://github.com/SIBKM-06-Java/S1-Git/blob/ParentNanang/img/Screenshot%20(242a).png?raw=true)

- **STEP 5** - Setelah berhasil pindah branch ke parent, sekarang kita bisa melakukan merge menggunakan command `git merge <nama_branch>`

![Image Git Bash](https://github.com/SIBKM-06-Java/S1-Git/blob/ParentNanang/img/Screenshot%20(242).png?raw=true)

Untuk memastikan apakah penggabungan commit nya berhasil, kita akan melihat riwayat commitnya menggunakan command `git log --all --decorate --oneline --graph`.

![Image Git Bash](https://github.com/SIBKM-06-Java/S1-Git/blob/ParentNanang/img/Screenshot%20(243).png?raw=true)

Bisa kita lihat pada gambar tersebut, bahwa pointer HEAD sekarang sudah berada dikedua branch dan kedua branch pun berada pada posisi commit yang sama. 

<br>

# Three-way Merging
Three-way merging adalah metode yang digunakan dalam sistem kontrol versi seperti Git untuk menggabungkan perubahan dari dua cabang (branches) yang berbeda. Keuntungan dari three-way merge adalah kemampuannya untuk secara otomatis menyelesaikan konflik yang mungkin terjadi ketika dua cabang mencoba menggabungkan perubahan mereka. Berikut adalah contoh dari kondisi three-way merging :

- **STEP 1** - Kita push branch child supaya masuk kedalam Repository Remote(Github), caranya sama semperti push Repository Local sebelumnya.

- **STEP 2** - Setelah dipush kita akan mencoba edit isi file yang ada pada branch child dan branch parent, sehingga kedua branch mempunyai perubahannya masing-masing dan nantinya akan mengakibatkan konflik.

- **STEP 3** - Selanjutnya kita pergi ke branch Child dan melakukan pull dengan menggunakan Command `git pull <nama_branch>`.

![Image Git Bash](https://github.com/SIBKM-06-Java/S1-Git/blob/ParentNanang/img/Screenshot%20(244).png?raw=true)

- **STEP 4** - Pada pesan pull diatas terjadi konflik pada kedua branch karena kedua branch mempunyai perubahannya masing-masing. Masalah tersebut bisa kita selesaikan menggunakan IDE seperti VS Code, pada VS code masuk ke Source Control untuk melihat konflik yang terjadi, setelah itu pada kasus ini saya pilih `Accept Both Changes` untuk menggabungkan perubahan pada kedua branch, setelah itu lanjut klik `Resolve in Merge Editor`, dan akan masuk ke halaman berikut.

![Image Git Bash](https://github.com/SIBKM-06-Java/S1-Git/blob/ParentNanang/img/Screenshot%20(245).png?raw=true)

Setelah berada pada halaman seperti gambar diatas, selanjutnya klik `Complete Merge` untuk menyelesaikan Konflik, pada gambar itu juga kita bisa melihat perubahan apa saja yang ada pada kedua branch dan kita juga bisa melihat perubahan apa saya yang digabungkan.

- **STEP 5** - Setelah selesai langkah terakhir silahkan kalian push ulang perubahan hasil penggabungan kedua branch. setelah selesai kalian bisa langsung melakukan Pull Request tanpa adanya konflik.