# Tugas Git - Versioning

## inisialisasi Repository Github

1. Pastikan perangkat kalian terhubung dengan SSH key akun github
   [link ke ssh keys](https://github.com/settings/keys)
   link dokumentasi
   [link ke dokumentasi](https://docs.github.com/en/authentication/connecting-to-github-with-ssh/generating-a-new-ssh-key-and-adding-it-to-the-ssh-agent)

2. Buat folder dan file README.md dan lakukan inisialisasi git folder dengan `git init`

```
$ git init

```

![Gambar yang menjelaskan inisialisasi folder terhadap folder yang dibuat dengan 'git init' di CLI](https://github.com/SIBKM-06-Java/S1-Git/blob/parentHaris/images/initialisasi.png)

### Fast Forward

1. Buat branch Parent dengan nama "parentHaris" dengan `git checkout -b parentHaris`
   ![Gambar yang menjelaskan tentang menjalankan perintah ke CLI untuk membuat branch "parentHaris" dengan 'git checkout -b parentHaris'](https://github.com/SIBKM-06-Java/S1-Git/blob/parentHaris/images/buatbranchParent.png)

2. Commit pertama di file Parent dengan memasukan file baru 'README.md' ke stages dari working direktori `git add README.md` dan memberikan pesan commit "add: file README.md"
   ![Commit pertama di file Parent dengan memasukan file baru 'README.md' ke stages dari working direktori 'git add README.md'dan memberikan pesan commit "add: file README.md"](https://github.com/SIBKM-06-Java/S1-Git/blob/parentHaris/images/commitpertama.png)

3. Membuat branch Child dengan nama "childHaris" dengan `git checkout -b childHaris`
   ![Gambar yang menjelaskan tentang menjalankan perintah ke CLI untuk membuat branch "childHaris" dengan 'git checkout -b childHaris'](https://github.com/SIBKM-06-Java/S1-Git/blob/parentHaris/images/buatbranchChild.png)

4. Melakukan Fast-Forward dengan git yaitu melakukan merge tanpa conflict antara parent dan child, kita perlu kembali ke branch parent dengan `git checkout parentHaris`
   ![Gambar yang menjelaskan tentang menjalankan perintah ke CLI untuk kembali ke branch parent dengan `git checkout parentHaris`](https://github.com/SIBKM-06-Java/S1-Git/blob/parentHaris/images/pindahbranchParent.png)

5. Melakukan merge Fast-Forward dilakukan pada branch Parent dengan `git merge childHaris`
   ![Melakukan merge Fast-Forward dilakukan pada branch Parent dengan `git merge childHaris`](https://github.com/SIBKM-06-Java/S1-Git/blob/parentHaris/images/mergeFastForward.png)

6. Memperlihatkan alur melakukan commit dan merge di github bisa dengan `git log --all --decorate --oneline --graph`

## Three-Way Merging

1.
