<h1 align="center">Tugas 1: Versioning</h1>

## Galih Titis Bagus Catry

### Fast Forward

1. Membuat Folder dan melakukan `git init` untuk inisiasi lokal repository
   <img src="/img/1.PNG" alt="Alt text" title="Optional title">
2. Membuat branch baru dengan perintah `git checkout -b ParentGalihRevisi` dan membuat file README.md, parent.txt
   <img src="/img/2.PNG" alt="Alt text" title="Optional title">
3. Mengisi file yang telah dibuat <br>
   <img src="/img/3.PNG" alt="Alt text" title="Optional title">
5. Setelah file di isi, dan mengetikkan `git status` maka akan muncul file yang telah dirubah
   <img src="/img/4.PNG" alt="Alt text" title="Optional title">
6. Kemudian mengetikkan `git add .` untuk memindah file yang telah dirubah ke staging area. dan `git commit -m "first commit parent"` untuk melakukan commit <br>
   <img src="/img/5.PNG" alt="Alt text" title="Optional title"> <br>
7. Karena lokal repository belum terhubung ke `git@github.com:SIBKM-06-Java/S1-Git.git` maka mengetikkan `git remote add origin git@github.com:SIBKM-06-Java/S1-Git.git` agar bisa terhubung. kemudian `git push origin ParentGalihRevisi` untuk push ke remote <br>
   <img src="/img/6.PNG" alt="Alt text" title="Optional title"> <br>
   berikut adalah hasil nya <br>
   <img src="/img/7.PNG" alt="Alt text" title="Optional title"><br>
8. Membuat Branch baru dan file child <br>
   <img src="/img/8.PNG" alt="Alt text" title="Optional title"> <br>
9. mengisikan file child <br>
   <img src="/img/9.PNG" alt="Alt text" title="Optional title"> <br>
10. Setelah file child di isi, maka ketikkan perintah `git add .` dan `git push origin ChildGalihRevisi` untuk push ke remote repository
   <img src="/img/10.PNG" alt="Alt text" title="Optional title">
11. ketika sudah di push, kemudian mengetikkan perintah `git pull origin ParentGalihRevisi` untuk menyamakan isi branch ChildGalihRevisi dan ParentGalihRevisi, dan akan terjadi conflict, karena ada file yang dirubah bersama sama.
    <img src="/img/11.PNG" alt="Alt text" title="Optional title">
    berikut adalah conflict nya
    <img src="/img/12.PNG" alt="Alt text" title="Optional title">
12. Setelah conflict di solve, kemudian `git add .` dan `git push origin ChildGalihRevisi`
    <img src="/img/13.PNG" alt="Alt text" title="Optional title">
13. berikut adalah graph dari branch ParentGalihRevisi dan ChildGalihRevisi.
    <img src="/img/14.PNG" alt="Alt text" title="Optional title">
