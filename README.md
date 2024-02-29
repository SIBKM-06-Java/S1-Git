<p align="center">
<img src="https://metrodataacademy.s3.ap-southeast-1.amazonaws.com/assets/LogoMetrodata.png" alt="image"  width="300" height="auto" >
</p>

<center><h2><b>TUGAS GIT MBKM-JAVA METRODATA</b></h2></center>

## FastFoward

1. **Inialisasi proyek**

   `git init` digunakan untuk menginisialisasi bahwa folder ini akan menggunakan version control system GIT
   
   ![git init](/image/init.png)

2. **Membuat File Dan Basic Command (status,add,commit)**

   `git add` digunakan untuk merubah tempat dari working directory ke staging area pada perubahan file yang terjadi
   `git commit` digunakan untuk merubah dari staging ke repository lokal, menetapkan perubahan secara pasti
   `git status` digunakan untuk memeriksa perubahan file apa saja yang masih di working direktori

   ![git add](/image/init.png)
   ![git commit](/image/commit.png)
   ![git status](/image/status.png)

1. **Branching dan Merge Fastfoward**

   `git branch` digunakan untuk mengetahui branch apa saja yang ada
   `git branch nama_branch` digunakan untuk membuat branch baru
   `git branch -m nama_branch_lama nama-branch_baru` digunakan untuk merubah nama branch
   `git log` melihat log yang terjadi pada folder atau file
   `git checkout nama_branch` digunakan untuk pindah branch
   `git merge nama_branch_tujuan` digunakan untuk merge dari branch utama ingin merge ketertinggalan dari branch child

   ![git branch](/image/mengganti-nama-branch.png)
   ![git checkout](/image/checkout-parent-ingin-merge.png)
   ![git merge](/image/merge-parent-child.png)
   ![git log](/image/view-log-sebelum-merge.png)
        <center>__Sebelum merge dari branch child dan parent__</center>
   ![git log](/image/hasil-merge.png)
        <center>__Setelah merge dari branch child dan parent__</center>
   
3. **Remote dan Push**

   `git remote add nama-remote ssh_repository` digunakan untuk menambah remote repository dari channel seperti github,gitlab,bitbucket
   `git remote -v` memeriksa remote yang ada pada folder/direktori
   `git push nama_remote nama_branch` digunakan untuk push proyek ke repository

   ![git remote](/image/remote.png)
   ![git push](/image/push-parent.png)
   ![git push](/image/push-child.png)

## Three way merge

1. **git clone**

   `git clone` digunakan untuk mengambil folder proyek yang ada pada repository cloud

   ![git clone](/image/clone.png)
   ![git clone](/image/clone.png)

2. **melakukan perobaan push dan solve conflict**


