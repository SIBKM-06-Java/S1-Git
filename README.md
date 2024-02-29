# Versioning

#### Dibuat Oleh Muhammad Arsil Alhabsy

## Fast Forward Merge

1. Buat project baru (menggunakan git init)

   Melakukan insialisasi project dengan git secara local cukup dengan menggunakan perintah `git init`

![inisial_gjt](images/01-init.png)

2. Menambahkan file README.md

   Disini saya menggunakan README.md untuk melakukan pengetesan penerepan git.

![add_readme_file](images/02-create-readme-and-add-text.png)

3. Mengecek status branch (main), ketika di update

   Untuk melakukan pengecekan dimana terjadi perubahan pada suatu branch pada git, cukup menggunakan perintah `git status`

![check-status](images/03-status-and-add.png)

4. Tampilan status branch (main), ketika di `add .`

   Printah `add .` bermakna memindahkan perubahan dari _working directory_ ke _staging area_

![check-status-setelah-update](images/04-new-status.png)

5. Melalukan commit

   `commit -m '<message>'` adalah perintah untuk menyimpan suatu perubahan dari _staging area_ ke _directory git_

![melakukan-commit](images/05-commit.png)

6. Menambahkan branch baru (parentArsil)

   Perintah yang diggunakan untuk menambah branch baru ialah

   - `git branch <nama branch>` hanya membuat branch baru, diperlukan `git checkout <nama branch>` untuk berpindah dari branch sebelumnya ke branch target
   - `git checkout -b <nama branch>` membuat branch baru dan berpindah branch secara langsung

![menambah-parent-baru](images/06-create-bParent.png)

7. Melakukan update README.md pada branch (parentArsil)

![modify-prent-baru](images/08-update-git.png)

8. Menambahkan branch baru (childArsil)

![menambahkan-child-baru](images/09-update-from-child.png)

9. Melakukan merge dari branch (childArsil) ke branch (parentArsil)

   printah yang diggunakan untuk melakukan merge dari branch satu ke beranch yang lainnya adalah `git merge <nama branch target>`, pastikan anda berada pada branch yang ingin mengambil code bukan branch yang memiliki code.

![melakukan-merge](images/10-melakukan-merge-parent-and-child.png)

10. Tampilan graphs pada keseluruhan branch

    Untuk menampilkan graphs bisa dengan printah `git log --all --decorate --oneline --graph`. Namun disini saya telah menambahkan alias pada komputer, yang berfungsi untuk mempersingkat kode ketika melihat graphs dari git `alias graphs='git log --all --decorate --oneline --graph'`

![grap-tampilan](images/11-update-graph-child.png)

11. Menyelaraskan keseluruhan branch dengan melakukan merge dari master

![merge-all](images/12-melaraskan-branch.png)

<br><br>

## Three way marge

1. Melakukan clone dari branch main yang ada pada organization

![gambar-1](images/01.png)

2. Menambah dan menuliskan sesuatu pada file `.txt`

![gambar-2](images/02.png)

3. Melakukan origin pull request dari branch `parent-arsil-revisi`

![gambar-2](images/03.png)

4. Melakukan perubahan dan penambahan file pada branch `child-arsil`

![gambar-2](images/04.png)

5. Kembali ke branch parent untuk melakukan perubahan pada `file2.txt`

![gambar-2](images/05.png)

6. Berpindah ke branch `child-arsil` untuk melakukan pull request

![gambar-2](images/06.png)

7. Berikut merupakan tampilan graphs dari three way merge, setelah di solve confictnya

![gambar-2](images/07.png)

8. Melakukan push pada `child-arsil`

![gambar-2](images/08.png)

9.  Melakukan pull request dari parent ke child

![gambar-2](images/09.png)

10. Melakukan create pull requests

![gambar-2](images/010.png)

11. Melakukan pull dari parent kembali

![gambar-2](images/011.png)
