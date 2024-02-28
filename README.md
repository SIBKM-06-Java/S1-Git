# Git - Merge
Menggabungkan 2 branch yang berbeda menjadi satu
# 1.  Fast Forward Merge

Fast forward merupakan sebuah kasus dimana terdapat 2 branch yang melakukan merge di 1 jalur yang sama, sehingga terhindar dari konflik

## Studi Kasus

Mencoba melakukan studi kasus fast-forward di repository sederhana.
Terdapat 2 branch: 
- Branch Parent
    - Branch parent akan membuat sebuah file, dengan mengisi judul saja
- Branch Child
    -   Branch cild akan menambah kan informasi pada file yang sudah dibuat oleh Branch Parent

Branch Parent akan melakukan merge dengan Branch Child untuk mendapatkan informasinya. Sehingga setelah proses selesai maka Branch Parent akan mendapatkannya tanpa terjadi konflik. pada proses inilah yang dimaksud **fast-forward merge**

## Preview
### langkah 1
![App Screenshot](./images/1_inisialisasi_proyek.png)

Inisialisasi Proyek git repository
```bash
git init
```
___

### langkah 2
![App Screenshot](./images/2_git_status_menambah_file1_untracted.png)
Mengecek perubahan yang terjadi, dimana branch utama menambah file1.txt dan memberi title: Belajar git. Hasilnya memberi tahu bahwa status saat ini, ada file yang masih berada di working directory
```bash
  git status
```
___

### langkah 3
![App Screenshot](./images/3_git_status_menambah_file1_staging.png)
Melakukan git add . untuk memindahkan file yang masih ada di working directory ke staging area. Artinya file sudah disiapkan untuk disimpan secara permanen di repository
```bash
  git add .
```
Mencek kembali status setelah melakukan git add . , dimana saat ini terdapat status bahwa file siap untuk di commit
```bash
  git status
```
___

### langkah 4
![App Screenshot](./images/4_commit_file1_branch_ParentAhmad.png)
Melakukan commit dengan message "add file1.txt"
```bash
  git commit -m "add file1.txt"
```
___

### langkah 5
![App Screenshot](./images/5_log_pertama.png)
Melihat informasi log commit. disini terlihat bahwa pointer saat ini berada branch utama
```bash
  git log --oneline 
```
atau
```bash
  git log --all --decorate --oneline --graph
```
___

### langkah 6
![App Screenshot](./images/6_membuat_branch_baru_ChildAhmad.png)
Membuat branch child
```bash
  git branch ChildAhmad
```

___
### langkah 7
![App Screenshot](./images/7_rename_branch_utama_master_ParentAhmad.png)
rename branch master ke ParentAhmad
```bash
  git branch -m ParentAhmad
```

___
### langkah 8
![App Screenshot](./images/8_Log_kedua_liat_posisi_branch.png)
Melihat log kembali setelah menambahkan branch child, dimana brach ParentAhmad dan ChildAhmad berada di posisi yang sejajar.
```bash
  git log --all --decorate --oneline --graph
```


___
### langkah 9

![App Screenshot](./images/8.1switch_branch_ke_child.png)
Pindah branch ke ChildAhmad
```bash
  git switch ChildAhmad
```

___
### langkah 10
![App Screenshot](./images/9_mengubah_file1_di_branch_ChildAhmad.png)
Melakukan perubahan pada file1.txt dengan menambahkan deskripsi di branch ChildAhmad. artinya perubahan hanya terlihat di branch ChildAhmad. lalu cek statusnya, sekarang file statusnya dimodifikasi dan berada di working directory.
```bash
  git status
```


___
### langkah 11
![App Screenshot](./images/10_menambah_file1_ke_staging_dan_cek_status.png)
Memindahkan file1.txt ke staging area di branch ChildAhmad, lalu cek statusnya. Dan statusnya bahwa perubahan siap untuk di commit
```bash
  git add .
```
```bash
  git status
```

___
### langkah 12
![App Screenshot](./images/11_commit_fil1_di_branch_ChildAhmad.png)
Commit dan beri pesan pada perubahan yang terjadi ChildAhmad
```bash
  git commit -m "menambah deskripsi pada file1.txt"
```


___
### langkah 13
![App Screenshot](./images/12_log_ketiga_melihat_posisi_ChildAhmad_mendahului_ParentAhmad.png)
melakukan log untuk melihat posisi commit saat ini, yang mana ChildAhmad berada 1 diatas ParentAhmad untuk commitnya.

```bash
  git log --all --decorate --oneline --graph
```


___
### langkah 14
![App Screenshot](./images/13_switch_ke_ParentAhmad.png)
Pindah branch ke parent

```bash
  git log switch ParentAhmad
```

___
### langkah 15
![App Screenshot](./images/14_log_keempat_melihat_posisi_branch_ParentAhmad_yang_dibawah_ChildAhmad.png)
melakukan log dan melihat bahwa pointer saat ini berada di ParentAhmad dan dia berada dibawah ChildAhmad. Dan kita bisa lihat didalam file1.txt deskripsi yang ditambahkan oleh branch ChildAhmad sudah tidak ada, karena perubaha itu terjadi hanya di branch ChildAhmad

```bash
  git log switch ParentAhmad
```

___
### langkah 16
![App Screenshot](./images/15_merge_ParentAhmad_dengan_ChildAhmad.png)
Melakukan merge dengan branch ChildAhmad, yang mana semua perubahan yang ada di CildAhmad akan ditarik ke branch ParentAhmad. Kita dapat melihatnnya di dile1.txt bahwa deksripsinya sekarang sudah ada

```bash
  git merge ChildAhmad
```

___
### langkah 17
![App Screenshot](./images/16_log_kelima_melihat_posisi_branch_yang_sudah_sama.png)
Melihat log, dimana sekarang branch ParentAhmad dan ChildAhmad sudah sejajar. bukan dibawah nya

```bash
  git log --all --decorate --oneline --graph
```

# 2. Git - Three Way Merge
Percabangan yang tidak 1 jalur. Hal ini disebabkan, satu file diubah di branch yang berbeda, sehingga ketika di merge, kita perlu melakukan yang namanya Merge Conflict

## Studi Kasus
Disini kita mencoba melakukan cloning project dari github. Dan nantinya terdapat 2 branch yaitu ParentAhmad dan CHildAhmad. kita akan mencoba mengubah 1 file yang sama di baris sama di 2 branch itu, lalu kita push ke github dan melakukan merge disana menggunakan pull request. ParentAhmad <- ChildAhmad, disini kita mencoba menggabungkan ChildAhmad ke ParentAhmad yang nantinya akan terjadi merge conflict dikarenakan kedua branch melakukan perubahan di baris yang sama pada file yang sama.

Nantinya kita akan coba mensolve masalah ini di local repository dan di push kembali ke github.


## Preview
### langkah 1
![App Screenshot](./img/1_git_clone.png)
Clone Project
```bash
  git clone git@github.com:SIBKM-06-Java/S1-Git.git
```
___

### langkah 2
![App Screenshot](./img/2_melihat_semua_branch.png)
Melihat semua branch yang terdapat di remote (github)
```bash
  git branch -a
```
___

### langkah 3
![App Screenshot](./img/3_membuat_branch_yang_mengarah_ke_branch_remote.png)
Membuat branch ParentAhmad dan ChildAhmad yang mengarah kepada branch diremote origin/ParentAhmad dan origin/ChildAhmad

```bash 
  git checkout -b ParentAhmad origin/ParentAhmad
```

```bash 
  git checkout -b ChildAhmad origin/ChildAhmad
```
___

### langkah 4
![App Screenshot](./img/4_melihat_branch_saat_ini.png)
Melihat daftar branch di local
```bash
  git branch 
```
___

### langkah 5
![App Screenshot](./img/5_mengubah_file1.txt_menambah_informasi.png)
Melakukan perubahan pada file1.txt di baris ke, dan mencek statusnya yang masih di working directory

```bash
git status
```

___

### langkah 6
![App Screenshot](./img/6_dipindahkan_ke_staging_di_branch_ParentAhmad.png)
add perubahan kedalam stagin area
```bash
  git add .
```

### langkah 7
![App Screenshot](./img/7_commit_dan_push_kegithub.png)
commit dan push perubahan ke dalam github
```bash
git commit -m "menambah informasi status commit di file1.txt"
```

```bash
git push origin ParentAhmad origin/ParentAhmad
```
___
### langkah 8
![App Screenshot](./img/8_melihat_perubahan_masuk_ke_github.png)
Melihat perubahan yang sudah masuk kedalam github


___
### langkah 9

![App Screenshot](./img/9_log_melihat_branch_PArentAhmad_dan_ChildAhmad.png)
Melihat history commit menggunakan log. Dimana branch local dan remote nya ParentAhmad sudah berada diatas Child(pointer saat ini)
```bash
  git branch --all --decorate --oneline --graph
```
___
### langkah 10
![App Screenshot](./img/10_melakukan_perubah_di_ChildAhmad_difile1.txt.png)
Melakukan perubahan di file1.txt di baris keempat di branch childAhmad. dan mencek statusnya
```bash
git status
```


___
### langkah 11
![App Screenshot](./img/11_mencek_status_dan_pindahkan_ke_staging.png)
add perubahan ke stagin area. untuk melihat perubahannya gunakan git status
```bash
git add
```
```bash
git status
```

___
### langkah 12
![App Screenshot](./img/12_commit_childAhmd.png)
commit perubahan dan berikan pesan
```bash
git commit -m "menambah informasi penyumpanan perubahan ke stagin area"
```


___
### langkah 13
![App Screenshot](./img/13_push_ke_github.png)
Push branch ChildAhmad ke github 
```bash
  git push origin ChildAhmad origin/ChildAhmad
```
___
### langkah 14
![App Screenshot](./img/14_melihat_perubahan_masuk_ke_github.png)
Melihat perubahan yang sudah masuk kedalam branch ChildAhmad di remotenya/github
___
### langkah 15
![App Screenshot](./img/15_melakukan_pull_requesr_dari_child_ke_parent.png)
Mencoba melakukan merge di github dengan pull request, dimana branch ParentAhmad akan merge dengan ChildAhmad. Namun terdapat pesan bahwa ini tidak bisa otomatis di merge.
___
### langkah 16
![App Screenshot](./img/16_terdapat_konflik.png)
Setelah kita klik Create pull request terdapat info kembali bahwa branch ini terjadi konflik sehingga harus diselesaikan terlbih dahulu. Github menawari untuk menyelesaikan masalah itu langsung dari platformnya, namun pada kasus ini kita coba memperbaikinya di local terlebih dahulu

___
### langkah 16.1
![App Screenshot](./img/16.1_mergen_conflict_di_local.png)
Sekarang kita coba melakukan merge di local dari ParentAhmad ke ChildAhmad. Secara otomatis terdapat pesan yang sama yaitu terdapat konflik dan harus diselesaikan.
```bash
  git merge ParentAhmad
```


___
### langkah 17
![App Screenshot](./img/17_merapihkan_conflict.png)
Kita dapat menyelesaikan dengan mengambil kedua perubahan antara ChildAhmad dan ParentAhmad

___
### langkah 18
![App Screenshot](./img/18commit_dan_push.png)
Jika sudah kita bisa tambah perubahan, commit dan push kembali ke github.
```bash
  git add .
```

```bash
  git commit -m "fix conflict in fle1.txt"
```

```bash
  git push origin ChildAhmad
```

___
### langkah 19
![App Screenshot](./img/19_github_merge_bisa.png)
Secara otomatis jika kita kembali ke github status dari pull request kita berubah menjadi merge pull request sehigga kita bisa melakukan merge di github.

___
### langkah 20
![App Screenshot](./img/20_melihat_perubahan_di_github.png)
Untuk melihat perubahan yang terjadi di github menggunkakan fitu Files Changed

### langkah 21
___
![App Screenshot](./img/21_confirm_merge.png)
Setelah merasa yakin bahwa branch sudah siap di merge kita bisa memberi pesan dan confirm merge

### langkah 22
___
![App Screenshot](./img/22_pull_request_success.png)
status merge sukses

### langkah 23
___
![App Screenshot](./img/23_pull.png)
Jika kita ingat bahwa merge terjadi di remote, sehingga branch ParentAhmad yang dilocal belum menerima perubahan tersebut untuk menarik perubahan terbaru yang ada diremote kita bisa menambahakan perintah git pull di branch ParentAhmad otomatis perubahan apapun yang terjadi di branch remote ParentAhmad akan ditarik ke local

```bash
git pull origin/ParentAhmad
```
