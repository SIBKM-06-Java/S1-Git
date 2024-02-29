# **Tugas 1 : Versioning**

### Laporan tugas Git
- Implementasi yang sudah dipelajari terkait Git
- Buat skenario Fast-Forward dengan membuat branch Parent: ex. ParentNama & branch Child: ex. ChildNama

## `Fast-Forward`
- Melakukan inisialisasi repository di dalam komputer, dengan cara mengcopy directory file dan dicetak pada terminal untuk menjalankan Git
![](img/ssFolder.png)
![](img/init.png)

- Berdasarkan ketentuan soal, branch parent master diubah menjadi ParentDutaRevisi
![](img/branch_parent.png)


- Mengetik "code ." pada terminal untuk memanggil suatu IDE, lalu membuat file README.md sebagai main file untuk menjalankan Git. Lakukan commit pada terminal Git supaya file dapat digunakan
![](img/runFileGit.png)
![](img/IDE.png)

- Buat beberapa data untuk branch parent
![](img/data1_parent.png)
![](img/data1_parentGit.png)

- Buat branch child dengan set nama branch ChildDutaRevisi. Buat beberapa data supaya branch child tidak kosong.
![](img/data1_child.png)
![](img/data1_childGit.png)

- Kembali ke branch parent dan lakukan merge branch child terhadap branch parent supaya kondisi Fast-Forward terpenuhi.
 ![](img/mergeFF.png)

- Query Git diatas telah ditampilkan dan dijelaskan secara urut. Selanjutnya akan dilanjutkan SS Git untuk Fast-Forward.
![](img/finalGit.png)
![](img/git_remote1.png)
![](img/git_pushParent.png)
![](img/git_pushChild.png)
![](img/add_image.png)


## `Three Way Merge`
- Dari path direktori folder file README.md, kembali ke folder sebelum folder file README.md lalu lakukan git clone.
![](img/git_clone.png)

- Masuk ke folder S1-Git dari Github setelah melakukan git clone dan masuk ke branch default.
![](img/branch_default.png)

- Beralih ke branch child dan lakukan git push, tampilkan graph dari git log.
![](img/pindah_BranchChild.png.png)
![](img/graphsAwal.png)

- Berpindah ke IDE vscode dari sebelumnya yang sudah "code .", pilih bagian source control dan klik bagian *accept both changes* pada bagian atas HEAD.
![](img/sc_vscode.png)
*klik bagian bawah resolve in merge editor & complete merge*
![](img/sc_vscode2.png)
*setelah itu pilih complete with conflict dan close with complete pada bagian pop up pemberitahuan*

- Buka Github, klik complete & pull request. Lalu add title request dan tambah reviewer akun request dan add assigness, create pull request. Di akhir klik meger pull request dan confirm.
![](img/Github1.png)
![](img/Github2.png)
![](img/Github3.png)

- Kembali ke terminal dan lakukan git pull origin branch parent.
![](img/gitpull_origin.png)

- Cek status dan lakukan commit serta git push. Lalu tampilkan graph git log.
![](img/cek_status.png)
![](img/commit_gitPush.png)
![](img/graphsAkhir.png)
