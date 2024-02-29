# HALO INI SETYO ARDIKA PUTRA
## TUGAS GIT BRANCH `ChildSetyoRevisi`
# SETYO ARDIKA PUTRA
## Tugas Git

## 1. FAST-FORWARD Merge

* ### Langkah 1: Disini saya membuat folder baru terlebih dahulu.
![]( img/img_1.png )


* ### Langkah 2: Selanjutnya saya membuka GitBash dan mengarahkan ke directory path folder yang sudah dibuat pada tahap sebelumya. Setelah itu menghubungkan git dengan IDE code(visual code saya dan saya sudah membuat README.md).
![]( img/img2.png )
![]( img/img12.png )


* ### Langkah 3: Selanjutnya saya melakukan `git init` dan mengecek list apa saja yang ada pada directory path.
![]( img/img3.png )


* ### Langkah 4: Selanjutnya saya disini mengecek status dari branch master. Diteruskan dengan menambahkan `README.md` ke dalam branch master.
![]( img/img4.png )

* ### Langkah 5: Saya disini akan mengecek log dan graph pada branch master. Saya juga melakukan inisial untuk `log --all --decorate --oneline --graph` yaitu menjadi `graphs` dan mengecek branch yang tersedia.
![]( img/img5.png )


* ### Langkah 6: Disini saya mengubah nama branch `master` menjadi `ParentSetyoRevisi` dan membuat branch child yaitu `ChildSetyoRevisi`. Setelah itu update `README.md` untuk branch `ChildSetyoRevisi`.
![]( img/img6.png )
![]( img/img7.png )
![]( img/img13.png )

* ### Langkah 7: Mengecek graph dan status dari branch. Setelah aman semua, selanjutnya saya melakukan merge `fast-forward` kedua branch ini, antara `ParentSetyoRevisi` dengan `ChildSetyoRevisi` yang mana parent branchnya terletak pada `ParentSetyoRevisi`.
![]( img/img8.png )
![]( img/img14.png )


* ### Langkah 8: Menghubungkan path git dengan repository yang ada di GitHub
![]( img/img9.png )


* ### Langkah 9: Melakukan push pada masing-masing branch, yaitu branch `ParentSetyoRevisi` dan `ChildSetyoRevisi`.
![]( img/img10.png )
![]( img/img11.png )


 ## Hasil screenshoot tambahan:
* ### menambahkan beberapa file gambar yang terletak di folder `img` dan `README.md` yang baru.
![]( img/img15.png )
![]( img/img16.png )


## 2. THREE WAY MERGE & SOLVE CONFLICT
* ### Langkah 1: Membuat folder baru untuk repository `S1-Git/`.
![]( img/img17.png )

* ### Langkah 2: Mengecek branch dan switch ke branch `ParentSetyoRevisi`. 
![]( img/img18.png )


* ### Langkah 3: Selanjutnya melakukan edit di branch child dan parent hingga nantinya menghasilkan sebuah solve conflict. Melakukan pull pada branch `ChildSetyoRevisi` seperti gambar berikut ini:
![]( img/img19.png )

* ### Langkah 4: Selanjutnya mengecek status pada setiap branch dan melakukan alias untuk graph yaitu `git log -- decorate --oneline --graph`, alias untuk graphs yaitu `git log --all --decorate --oneline --graph`. Setelah alias berhasilmaka saya akan mengecek `graph` dan `graphs`. 
![]( img/img21.png )
![]( img/img22.png )
![]( img/img23.png )

* ### Langkah 5: Setelah terjadi solve conflict, kita bisa menyelesaikannya melalui IDE yang digunakan, misalnya saya disini menggunakan `visual studio code`. Pada gambar pertama itu kita klik `Accept Both Changes` lalu klik `Resolve in Merge Editor`, sedangkan pada gambar kedua proses selanjutnya itu kita klik `Complete Merge`
![]( img/img24.png )
![]( img/img25.png )


* ### Langkah 6: Selanjutnya mengecek status dan melakukan commit untuk manambahkan bebebrapa file baru.
![]( img/img26.png )


* ### Langkah 7: Mengecek kondisi `graphs` terbaru.
![]( img/img27.png )


* ### Langkah 8: Kita masuk pada GitHub, gambar pertama itu kita set title, set reviewers, dan Assignees. Lalu pada gambar kedua kita kilk `confirm` dan pada gambar ketiga klik `confirm merge`
![]( img/img28.png )
![]( img/img30.png )
![]( img/img29.png )


## TERIMA KASIH...