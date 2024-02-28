# Belajar Git & Github

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