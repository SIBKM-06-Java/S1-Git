<h1 align="center">Tugas 1: Versioning</h1>

## Galih Titis Bagus Catry

### Fast Forward

1. Membuat folder project dan mengetikkan perintah `git init`
   <img src="/img/1.PNG" alt="Alt text" title="Optional title">
2. Membuat parent branch dengan perintah `git checkout -b ParentGalih`, lalu memindahkan readme.md ke staging area menggunakan perintah `git add README.md`. dan commit dengan perintah `git commit -m "add readme.md"`.
   <img src="/img/2.PNG" alt="Alt text" title="Optional title">
3. Menghubungkan lokal repo ke remote repository menggunakan perintah `git remote add origin git@github.com:SIBKM-06-Java/S1-Git.git`. Setelah terhubung, maka push parent branch menggunakan perintah `git push origin ParentGalih`
   <img src="/img/3.PNG" alt="Alt text" title="Optional title">
   <br>
   <img src="/img/parent.PNG" alt="Alt text" title="Optional title">
4. Membuat branch baru dengan perintah `git checkout -b ChildGalih` dan modifikasi readme.md, kemudian ketikkan perintah `git add .` dan commit
   <img src="/img/4.PNG" alt="Alt text" title="Optional title">
5. pindahkan branch saat ini ke ParentGalih dengan perintah `git checkout ParentGalih`. setelah branch sudah di pindah, maka ketikkan perintah `git merge ChildGalih` untuk merge ke dua branch
  <img src="/img/5.PNG" alt="Alt text" title="Optional title">
6. melakukan push branch ke remote repository dengan perintah `git push origin ParentGalih`
  <img src="/img/6.PNG" alt="Alt text" title="Optional title">
7. Pindah ke branch childgalih dengan perintah `git checkout ChildGalih` dan push menggunakan perintah `git push origin ChildGalih`
  <img src="/img/7.PNG" alt="Alt text" title="Optional title">
   <img src="/img/child.PNG" alt="Alt text" title="Optional title">