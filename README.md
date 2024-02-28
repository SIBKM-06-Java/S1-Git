
# Git - Fast Forward Merge

Fast forward merupakan sebuah kasus dimana terdapat 2 branch yang melakukan merge di 1 jalur yang sama, sehingga terhindar dari conflict.

## Studi Kasus

Mencoba melakukan studi kasus fast-forward di repository sederhana.
Terdapat 2 branch: 
- Branch Parent
    - Branch parent akan membuat sebuah file, dengan mengisi judul saja
- Branch Child
    -   Branch cild akan menambah kan informasi pada file yang sudah dibuat oleh Branch Parent

Branch Parent akan melakukan merge dengan Branch Child untuk mendapatkan informasinya. Sehingga setelah proses selesai maka Branch Parent akan mendapatkannya tanpa terjadi konflik. pada proses inilah yang dimaksud **fast-forward merge**

## Preview

![App Screenshot](./images/1_inisialisasi_proyek.png)

Inisialisasi Proyek git repository
```bash
  git init
```
___


![App Screenshot](./images/2_git_status_menambah_file1_untracted.png)
Mengecek perubahan yang terjadi, dimana branch utama menambah file1.txt dan memberi title: Belajar git. Hasilnya memberi tahu bahwa status saat ini, ada file yang masih berada di working directory
```bash
  git status
```
___


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


![App Screenshot](./images/4_commit_file1_branch_ParentAhmad.png)
Melakukan commit dengan message "add file1.txt"
```bash
  git commit -m "add file1.txt"
```
___


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

![App Screenshot](./images/6_membuat_branch_baru_ChildAhmad.png)
Membuat branch child
```bash
  git branch ChildAhmad
```
___
![App Screenshot](./images/7_rename_branch_utama_master_ParentAhmad.png)
rename branch master ke ParentAhmad
```bash
  git branch -m ParentAhmad
```

___
![App Screenshot](./images/8_Log_kedua_liat_posisi_branch.png)
Melihat log kembali setelah menambahkan branch child, dimana brach ParentAhmad dan ChildAhmad berada di posisi yang sejajar.
```bash
  git log --all --decorate --oneline --graph
```


___
![App Screenshot](./images/8.1switch_branch_ke_child.png)
Pindah branch ke ChildAhmad
```bash
  git switch ChildAhmad
```

___
![App Screenshot](./images/9_mengubah_file1_di_branch_ChildAhmad.png)
Melakukan perubahan pada file1.txt dengan menambahkan deskripsi di branch ChildAhmad. artinya perubahan hanya terlihat di branch ChildAhmad. lalu cek statusnya, sekarang file statusnya dimodifikasi dan berada di working directory.
```bash
  git status
```


___
![App Screenshot](./images/10_menambah_file1_ke_staging_dan_cek_status.png)
Memindahkan file1.txt ke staging area di branch ChildAhmad, lalu cek statusnya. Dan statusnya bahwa perubahan siap untuk di commit
```bash
  git add .
```

```bash
  git status
```

___
![App Screenshot](./images/11_commit_fil1_di_branch_ChildAhmad.png)
Commit dan beri pesan pada perubahan yang terjadi ChildAhmad
```bash
  git commit -m "menambah deskripsi pada file1.txt"
```


___
![App Screenshot](./images/12_log_ketiga_melihat_posisi_ChildAhmad_mendahului_ParentAhmad.png)
melakukan log untuk melihat posisi commit saat ini, yang mana ChildAhmad berada 1 diatas ParentAhmad untuk commitnya.

```bash
  git log --all --decorate --oneline --graph
```


___
![App Screenshot](./images/13_switch_ke_ParentAhmad.png)
Pindah branch ke parent

```bash
  git log switch ParentAhmad
```

___
![App Screenshot](./images/14_log_keempat_melihat_posisi_branch_ParentAhmad_yang_dibawah_ChildAhmad.png)
melakukan log dan melihat bahwa pointer saat ini berada di ParentAhmad dan dia berada dibawah ChildAhmad. Dan kita bisa lihat didalam file1.txt deskripsi yang ditambahkan oleh branch ChildAhmad sudah tidak ada, karena perubaha itu terjadi hanya di branch ChildAhmad

```bash
  git log switch ParentAhmad
```

___
![App Screenshot](./images/15_merge_ParentAhmad_dengan_ChildAhmad.png)
Melakukan merge dengan branch ChildAhmad, yang mana semua perubahan yang ada di CildAhmad akan ditarik ke branch ParentAhmad. Kita dapat melihatnnya di dile1.txt bahwa deksripsinya sekarang sudah ada

```bash
  git merge ChildAhmad
```

___
![App Screenshot](./images/16_log_kelima_melihat_posisi_branch_yang_sudah_sama.png)
Melihat log, dimana sekarang branch ParentAhmad dan ChildAhmad sudah sejajar. bukan dibawah nya

```bash
  git log --all --decorate --oneline --graph
```
