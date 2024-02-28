# <center>Tugas 1: Versioning

## Galih Titis Bagus Catry

### Fast Forward

1. Membuat folder project dan mengetikkan perintah `git init`
   ![Gambar 1](img/1.png)
2. Membuat parent branch dengan perintah `git checkout -b ParentGalih`, lalu memindahkan readme.md ke staging area menggunakan perintah `git add README.md`. dan commit dengan perintah `git commit -m "add readme.md"`.
   ![Gambar 2](img/2.png)
3. Menghubungkan lokal repo ke remote repository menggunakan perintah `git remote add origin git@github.com:SIBKM-06-Java/S1-Git.git`. Setelah terhubung, maka push parent branch menggunakan perintah `git push origin ParentGalih`
   ![Gambar 3](img/3.png)
   <br>
   ![Gambar parent](img/parent.png)
4. Membuat branch baru dengan perintah `git checkout -b ChildGalih` dan modifikasi readme.md, kemudian ketikkan perintah `git add .` dan commit
   ![Gambar 4](img/4.png)
5. pindahkan branch saat ini ke ParentGalih dengan perintah `git checkout ParentGalih`. setelah branch sudah di pindah, maka ketikkan perintah `git merge ChildGalih` untuk merge ke dua branch
   ![Gambar 5](img/5.png)
6. melakukan push branch ke remote repository dengan perintah `git push origin ParentGalih`
   ![Gambar 6](img/6.png)
7. Pindah ke branch childgalih dengan perintah `git checkout ChildGalih` dan push menggunakan perintah `git push origin ChildGalih`
   ![Gambar 7](img/7.png)
   ![Gambar child](img/child.png)
