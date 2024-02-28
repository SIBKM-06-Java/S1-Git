# **Tugas Git - Versioning**

## **inisialisasi Repository Github**

1. Pastikan perangkat kalian terhubung dengan SSH key akun github dengan [atur ssh keys](https://github.com/settings/keys) dan langkah-langkahnya dapat dilihat pada [dokumentasi ssh key](https://docs.github.com/en/authentication/connecting-to-github-with-ssh/generating-a-new-ssh-key-and-adding-it-to-the-ssh-agent)

2. Buat folder dan file README.md dan lakukan inisialisasi git pada folder dengan command

```
$ git init
```

![Gambar yang menjelaskan inisialisasi folder terhadap folder yang dibuat dengan 'git init' di CLI](https://github.com/SIBKM-06-Java/S1-Git/blob/parentHaris/images/initialisasi.png)

3. hubungkan folder dari lokal perangkat dengan repository github

```
$ git remote add origin <git_ssh_key_di_'<>code'_repository>
```

4. cek local direktori dan github terhubung melalui git

```
$ git remote -v
```

nb:akan ditampilkan pesan saat terhubung terdiri dari fetch dan push

5. melakukan push dan pull agar remote repo update

update repo

```
$ git push
```

```
$ git push --set-upstream origin
```

dapatkan outdated repo

```
$ git pull
```

### **Fast Forward**

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

### **Three-Way Merging**

1. Melakukan commit pada file saat ini

```
$ git add <nama_file>
```

tambahkan pesan dan commit

```
$ git commit -m "<pesan>"
```

![Melakukan commit pada file saat ini](https://github.com/SIBKM-06-Java/S1-Git/blob/parentHaris/images/threeway1.png)
tambahkan file ke stages

2. buat typo disini update lalu pindah branch child

```
$ git checkout "<nama_branch_child>"
```

melihat branch yang tersedia dengan command

```
$ git branch
```

![Melakukan commit pada file saat ini](https://github.com/SIBKM-06-Java/S1-Git/blob/parentHaris/images/threeway2.png)

3. ubah child lalu kembali ke parent

```
$ git checkout "<nama_branch_parent>"
```

melihat branch yang tersedia dengan command

```
$ git branch
```

4. Kunjungi [halaman pull request](https://github.com/SIBKM-06-Java/S1-Git/pulls) untuk melakukan compare & merge atau melalui `source control vs code`

5. Buat request baru tentukan `base:<nama_branch_lokasi_merge>` dan `compare:<nama_branch_merge_yang_ingin_digabungkan>`
   serta tentukan `Reviewers` yan memutuskan kelayakan dalam team dan `Assignees` yang membuat permintaan merge
   ![Melakukan review terhadap commit](https://github.com/SIBKM-06-Java/S1-Git/blob/parentHaris/images/threeway3.png)

6. Pull Request akan mempertanyakan kelayakan yang ditentukan `Reviewers` setelah layak akan di merge
   ![Melakukan review terhadap commit](https://github.com/SIBKM-06-Java/S1-Git/blob/parentHaris/images/threeway4.png)
