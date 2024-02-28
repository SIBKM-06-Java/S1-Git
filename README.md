# Ghifary Ahada Azra

## Tugas 1 : Versioning

#### Fast-Forward
1. Membuat folder project dan membuat file README.md. Kemudian melakukan inisialisasi dengan perintah `git init`.
![Gambar1](img/Screenshot%20(501).png)

2. Membuat branch parent dengan perintah `git checkout -b ParentGhifary`. Kemudian mencoba menambah file README.md ke staging area dengan `git add README.md`. Selanjutnya commit message dengan perintah `git commit -m "..."`
![Gambar2](img/Screenshot%20(502).png)

3. Karena folder project belum memiliki akses ke repository GitHub, maka kita akan menghubungkan folder lokal dengan repository GitHub dengan perintah `git remote add origin git@github.com:SIBKM-06-Java/S1-Git.git`. Selanjutnya melakukan push branch parent ke branch repository GitHub dengan perintah `git push origin ParentGhifary`.
![Gambar3](img/Screenshot%20(503).png)

4. Membuat branch child dengan perintah `git checkout -b ChildGhifary`. Kemudian memodifikasi README.md dengan menambahkan teks. Selanjutnya menambah file README.md ke staging area dengan `git add .`. Selanjutnya commit message dengan perintah `git commit -m "..."`.
![Gambar4](img/Screenshot%20(504).png)

5. Berpindah ke branch parent dengan perintah `git checkout ParentGhifary`. Kemudian mencoba menggabungkan perubahan yang terjadi pada branch child ke branch parent dengan perintah `git merge ChildGhifary`
![Gambar5](img/Screenshot%20(505).png)

6. Melakukan push branch parent ke repository GitHub dengan perintah `git push origin parentGhifary`.
![Gambar6](img/Screenshot%20(506).png)

7. Berpindah ke branch child dengan perintah `git checkout ChildGhifary`. Kemudian melakukan push branch child ke repository GitHub dengan perintah `git push origin ChildGhifary`.
![Gambar7](img/Screenshot%20(507).png)

#### Three - Way Merging
1. 
![Gambar9](img/Screenshot%20(509).png)