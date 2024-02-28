# Tugas Git

## Fast Forward

1. Buat folder dan file README.md dan lakukan inisialisasi git folder dengan `git init`
   ![Gambar yang menjelaskan inisialisasi folder terhadap folder yang dibuat dengan 'git init' di CLI](https://github.com/SIBKM-06-Java/S1-Git/blob/parentHaris/images/initialisasi.png)
2. Membuat branch Parent dengan nama "parentHaris" dengan `git checkout -b parentHaris`
   ![Gambar yang menjelaskan tentang menjalankan perintah ke CLI untuk membuat branch "parentHaris" dengan 'git checkout -b parentHaris'](https://github.com/SIBKM-06-Java/S1-Git/blob/parentHaris/images/buatbranchParent.png)
3. Commit pertama di file Parent dengan memasukan file baru 'README.md' ke stages dari working direktori `git add README.md` dan memberikan pesan commit "add: file README.md"
   ![Commit pertama di file Parent dengan memasukan file baru 'README.md' ke stages dari working direktori 'git add README.md'dan memberikan pesan commit "add: file README.md"](https://github.com/SIBKM-06-Java/S1-Git/blob/parentHaris/images/commitpertama.png)
4. Membuat branch Child dengan nama "childHaris" dengan `git checkout -b childHaris`
   ![Gambar yang menjelaskan tentang menjalankan perintah ke CLI untuk membuat branch "childHaris" dengan 'git checkout -b childHaris'](https://github.com/SIBKM-06-Java/S1-Git/blob/parentHaris/images/buatbranchChild.png)
5. Melakukan Fast-Forward dengan git yaitu melakukan merge tanpa conflict antara parent dan child, kita perlu kembali ke branch parent dengan `git checkout parentHaris`
   ![Gambar yang menjelaskan tentang menjalankan perintah ke CLI untuk kembali ke branch parent dengan `git checkout parentHaris`](https://github.com/SIBKM-06-Java/S1-Git/blob/parentHaris/images/pindahbranchParent.png)
6. Melakukan merge Fast-Forward dilakukan pada branch Parent dengan `git merge childHaris`
   ![Melakukan merge Fast-Forward dilakukan pada branch Parent dengan `git merge childHaris`](https://github.com/SIBKM-06-Java/S1-Git/blob/parentHaris/images/mergeFastForward.png)
