# Tugas Git - Versioning

### Fast Forward

1. Buat branch Parent dengan nama "parentHaris" dengan `git checkout -b parentHaris`

```
$ git checkout -b <nama_branch>
```

![Gambar yang menjelaskan tentang menjalankan perintah ke CLI untuk membuat branch "parentHaris" dengan 'git checkout -b parentHaris'](https://github.com/SIBKM-06-Java/S1-Git/blob/parentHaris/images/buatbranchParent.png)

2. Commit pertama di file Parent dengan menambahkan file baru 'README.md' ke stages dari working direktori dan memberikan pesan commit "add: file README.md"
   tambahkan file ke stages

```
$ git add <nama_file>
```

tambahkan pesan dan commit

```
$ git commit -m "<pesan>"
```

![Commit pertama di file Parent dengan memasukan file baru 'README.md' ke stages dari working direktori 'git add README.md'dan memberikan pesan commit "add: file README.md"](https://github.com/SIBKM-06-Java/S1-Git/blob/parentHaris/images/commitpertama.png)

3. Membuat branch Child dengan nama "childHaris" dengan command

```
$ git checkout -b <nama_branch_baru>
```

![Gambar yang menjelaskan tentang menjalankan perintah ke CLI untuk membuat branch "childHaris" dengan 'git checkout -b childHaris'](https://github.com/SIBKM-06-Java/S1-Git/blob/parentHaris/images/buatbranchChild.png)

4. Melakukan Fast-Forward dengan git yaitu melakukan merge tanpa conflict antara parent dan child, kita perlu kembali ke branch parent dengan command

```
$ git checkout <nama_branch_yang_dituju>
```

melihat branch yang tersedia dengan command

```
$ git branch
```

![Gambar yang menjelaskan tentang menjalankan perintah ke CLI untuk kembali ke branch parent dengan `git checkout parentHaris`](https://github.com/SIBKM-06-Java/S1-Git/blob/parentHaris/images/pindahbranchParent.png)

5. Melakukan merge Fast-Forward dilakukan pada branch Parent dengan command

```
$ git merge <nama_branch_yang_akan_di_merge_dengan_branch_saat_ini>
```

![Melakukan merge Fast-Forward dilakukan pada branch Parent dengan `git merge childHaris`](https://github.com/SIBKM-06-Java/S1-Git/blob/parentHaris/images/mergeFastForward.png)

6. Memperlihatkan alur melakukan commit dan merge di github bisa dengan command

```
$ git log --all --decorate --oneline --graph
```

## Three-Way Merging

1. Melakukan commit pada file saat ini
   ![Melakukan commit pada file saat ini](https://github.com/SIBKM-06-Java/S1-Git/blob/parentHaris/images/threeway1.png)
   tambahkan file ke stages

```
$ git add <nama_file>
```

tambahkan pesan dan commit

```
$ git commit -m "<pesan>"
```

2. buat typo disini update lalu pindah branch
   ![Melakukan commit pada file saat ini](https://github.com/SIBKM-06-Java/S1-Git/blob/parentHaris/images/threeway1.png)
