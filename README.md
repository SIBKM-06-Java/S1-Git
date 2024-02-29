## Kevin

# FAST FORWARD

#### Berikut Langkah-langkahnya

- Buatlah Folder Project Git
  ![foto1](img/1.png)
- Buka GitBash
- Masuk ke folder letak Project dibuat dengan mengetikkan command seperti dibawah ini.
```
cd "D:\Kuliah\Semester 6\3. Git\Belajar_Git_Kevin_Revisi"
```
  ![foto2](img/2.png)
- Ketikkan perintah ``git init`` membuat repository yang ada pada file lokal dan berlokasi di folder .git.
  ![foto3](img/3.png)
- Ubah Nama Branch Master Menjadi ParentKevinRevisi dengan mengetikkan ``git branch -m master ParentKevinRevisi``
  ![foto4](img/4.png)
- Buka IDE Visual Studio Code dengan mengetikkan command ``code .``
  ![foto5](img/5.png)
- Langkah selanjutnya adalah membuat file dummy (bebas).
- Setelah membuat file dummy coba cek status dengan mengetikkan ``git status``
  ![foto6](img/6.png)
- Masukkan `dokumen_ke1.txt` ke staging index dengan mengetikkan ``git add dokumen_ke1.txt``
  ![foto7](img/7.png)
- Kemudian setelah dipindahkan ke staging index masukkan ke repository dengan mengetikkan ``git commit -m "add: dokumen_ke1.txt"``
  ![foto8](img/8.png)
- Sekarang kita akan membuat branch ChildKevinRevisi , ketikkan command ``git branch ChildKevinRevisi`` , untuk memastikan apakah branch telah dibuat kita bisa mengetikkan command ``git branch``
  ![foto9](img/9.png)
- Masuk ke branch Childnya dengan mengetikkan ``git checkout ChildKevinRevisi`` , kemudian tambah isi dari file `dokumen_ke1.txt`
  ![foto10](img/10.png)
- Lakukan step untuk memasukkan perubahan tersebut ke staging area dan repository seperti langkah sebelumnya.
  ![foto11](img/11.png)
- Ketikkan ``git log --oneline`` untuk melihat log
  ![foto12](img/12.png)
- Langkah selanjutnya adalah melakukan `merge` branch `ParentKevinRevisi` dengan `ChildKevinRevisi`
- Kita pindah ke posisi branch `ParentKevinRevisi` dengan mengetikkan ``git checkout ParentKevinRevisi`` kemudian ketikkan ```git merge ChildKevinRevisi```
  ![foto13](img/13.png)

### FAST FORWARD SUDAH SELESAI
### LANGKAH SELANJUTNYA ADALAH MELAKUKAN PUSH KE CLOUD REPOSITORY

### Berikut Langkah-langkahnya
- Ketikkan ``git remote add origin git@github.com:SIBKM-06-Java/S1-Git.git`` untuk menghubungkan local repository kita ke cloud repository. Jika sudah pastikan berhasil terhubung dengan mengetikkan command `git remote -v` seperti gambar dibawa ini
  ![foto14](img/14.png)
- Lakukan push terhadap 2 branch yaitu `ParentKevinRevisi` dan `ChildKevinRevisi` dengan mengetikkan command ``git push``.
  ![foto15](img/15.png)
  ![foto16](img/16.png)
- Langkah selanjutnya cek di cloud repository apakah sudah berhasil terupload, jika berhasil akan seperti gambar dibawah ini.
  ![foto17](img/17.png)

# THREE WAY MERGING
Kita akan melakukan THREE WAY MERGING , tetapi sebelumnya kita akan melakukan cloning dari cloud repo ke local repo kita.

- Langkah pertama adalah buka Git bash
- Pergi menuju folder / lokasi yang akan anda letakkan hasil cloning.
  ![foto18](img/18.png)
- Di gitbash masuk ke path folder tersebut lalu ketikkan command ini ``git clone git@github.com:SIBKM-06-Java/S1-Git.git``, maka akan ada folder `S1-Git` yang terbuat. 
  ![foto19](img/19.png)
- Kemudian masuk ke folder S1-Git tersebut dari gitbash
- Masuk ke branch `ParentKevinRevisi` kemudian buka IDE VScode. seperti contoh dibawah ini.
  ![foto20](img/20.png)
- Tambahkan sesuatu difile dummy dokumen_ke1.txt untuk mempraktekkan THREE WAY MERGING pada masing-masing branch yaitu `ParentKevinRevisi` dan `ChildKevinRevisi`
  ![foto21](img/21.png)
  ![foto22](img/22.png)
- Lakukan push 2 branch tersebut ke cloud repo
  ![foto23](img/23.png)
- Cek apakah sudah terupload ke cloud repo
  ![foto24](img/24.png)
  ![foto25](img/25.png)
- Sekarang kita akan melakukan merge , tetapi dengan PR (Pull Request).
- Langkah selanjutnya kita akan melakukan pull untuk mengecek / solve konflik.
- Posisi ke Branch `ChildKevinRevisi` lalu lakukan pull ke `ParentKevinRevisi` dengan mengetikkan command ``git pull origin ParentKevinRevisi``
  ![foto26](img/26.png)
- Dari foto di atas bisa dilihat sebelah kanan akan terlihat pilihan untuk melakukan solve conflict, pilih `Accept Both Change`.
  ![foto27](img/27.png)
- Karena ada perubahan data terhadap file tersebut , maka `dokumen_ke1.txt` kita perlu melakukan commit untuk memasukkan kembali ke repository
  ![foto28](img/28.png)
- Selanjutnya kita akan push `ChildKevinRevisi` ke cloud repo.
  ![foto29](img/29.png)
  ![foto30](img/30.png)
- Langkah selanjutnya adalah melakukan PullRequest di cloud repo
- Klik Compare & pull request pada `ParentKevinRevisi`
  ![foto31](img/31.png)
- Pilih Base Branch nya `ParentKevinRevisi` dan compare `ChildKevinRevisi` dan Masukkan reviewer nya Pak fuad , dan assigness nya diri kita, Masukkan judul juga ya
  ![foto32](img/32.png)
- Klik Create pull Request
- Kemudian Kita Merge pull request sendiri :v
  ![foto33](img/33.png)
- Maka data `ParentKevinRevisi` akan sama seperti `ChildKevinRevisi`
  ![foto34](img/34.png)
- Langkah selanjutnya adalah kita mengupdate data `ParentKevinRevisi` yang ada dilocal repo dengan cara pull ke cloud repo
- Ketikkan command ``git pull origin ParentKevinRevisi``
  ![foto35](img/35.png)




