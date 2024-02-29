# Tugas Versioning Git [Romi Putra]

## Eksperimen Fast-Forward Merge

## Eksperimen Three Way Merge -> ChildRomi
## Eksperimen Three Way Merge -> ParentRomi

# Laporan

## Fast-Forward Merge
1. 
- Buat directory local baru dan salin path-nya pada git bash
![buat_dir](img/FF_buat_directory.png)
![input_dir](img/FF_inputpath.png)

- Masukkan command `git init` untuk membuat local repo di directory
![git_init](img/FF_gitinit.png)

- Buka text editor dan buat file *README.md* pada text editor atau command `touch [Namafile]`
![make_readme](img/FF_codeeditor_readme.png)

- Rename branch *master* menjadi branch *Parent[Nama]*
![rename_branch](img/FF_rename_master.png)

- Tambahkan konten pada *README.md*
![konten_!_ff](img/FF_edit_readme_1.png)

- File *README.md* masih pada status untracked (`git status`), Lakukan `git add *` ke staging arena dan `git commit -m "[message]" ` melakukan commit pertama
![commit_1](img/FF_gitadd_gitcommit_add_readme.png)

- Untuk melihat history commit dapat menggunakan command ` git log --decorate --oneline --graph`

![graph1](img/FF_gitstatus_after_1stcommit.png)

- Buat branch *Child[Nama]* dan pindah langsung dengan command `git checkout -b [NamaBranch]` (Argumen -b untuk membuat branch baru)
![make_child](img/FF_make_childbranch.png)


- untuk Tambahkan konten di text editor *README.md* pada branch child
![alt text](img/FF_edit_readme_child.png)

- Lakukan add dan commit pada branch child, karena tidak menambah file dapat langsung dengan argumen `git commit -am "[Message]"`

![alt text](img/FF_commit_onbranch.png)

- Jika dilihat history commit kedua branch, maka akan terlihat bahwa branch parent tertinggal
![alt text](img/FF_compare_graph_before_merge.png)

- Pada parent directory, lakukan Fast Forward Merge dengan command `git merge [branch]` dan history commit seharusnya sudah menyatu
![alt text](img/FF_git_merge.png)
![alt text](img/FF_git_merge_v2.png)

- Lakukan koneksi dengan remote GitHub. Cek koneksi dengan `git remote -v` dan hubungan dengan repository dengan `git remote add origini [SSH]`
![alt text](img/FF_connect_remote.png)

- Lakukan `git push` untuk menyimpan perubahan di repository GitHub untuk kedua branch
![alt text](img/FF_gitpush.png)


## Three Way Merge
- Copy path dari directory yang akan digunakan pada git bash, dan lakukan `git clone [Link Repo]` pada directory tersebut
![alt text](img/TW_copypath.png)
![alt text](img/TW_gitclone.png)

- Gunakan `git checkout` untuk mendeteksi branch yang kita gunakan pada local
![alt text](img/TW_detect_branch.png)

- Tambahkan konten di *README.md* untuk branch Parent
![alt text](img/TW_edit_dari_parent.png)

- Lakukan `git commit -am "[Message]"` untuk menyimpan commit pada parent
![alt text](img/TW_commit_parent.png)

- Lakukan `git push` Untuk menyimpan perubahan branch Parent pada remote GitHub
![alt text](img/TW_gitpush_parent.png)
![alt text](img/TW_tempresult_parent.png)

- Pindah ke branch child dan tambahkan konten di *README.md* untuk branch Child, lalu lakukan `git commit -am "[Message]"` untuk menyimpan commit pada child
![alt text](img/TW_edit_dari_child.png)
![alt text](img/TW_commit_child.png)

- Lakukan `git push` Untuk menyimpan perubahan branch child pada remote GitHub
![alt text](img/TW_gitpush_child.png)
![alt text](img/TW_tempresult_child.png)

- Lakukan `git pull` pada branch Child untuk memulai me-resolve conflict pada branch Child
![alt text](img/TW_gitpull.png)

- Lakukan Three Way Merge pada text editor. Pada kasus ini dipilih 'Accept Both Changes' atau hapus baris kode yang kita tidak ingin simpan. Setelah itu, klik 'Complete Merge'
![alt text](img/TW_result_conflict_child.png)
![alt text](img/TW_complete_merge.png)
![alt text](img/TW_result_conflict_child_after.png)

- Lakukan `git commit` untuk menyimpan perubahaan Three Way Merge pada Child branch
![alt text](img/TW_commit_after_resolved_child.png)

- Untuk merge pada branch Parent akan dilakukan dengan Pull Request. Masuk ke menu Pull Request di Repository GitHub
![alt text](img/TW_step1_PR.png)

- Pada menu selanjutnya, tentukan base nya sebagai branch Parent dan compare adalah branch Child. Beri Title dan Description. Set asginees menjadi diri sendiri, dan Reviewer adalah supervisor.
![alt text](img/TW_pullrequest_setasginees.png)

- Jika terdapat tombol `Resolve Conflict` pada pull request kita, maka selesaikan dengan menentukan line yang disimpan dan tekan `Merge Conflict`
![alt text](img/TW_commitmerge.png)

- Setelah itu, kita dapat kembali ke halaman Pull Request kita dan klik `Merge pull request`
![alt text](TW_mergepullreq.png)
![alt text](TW_mergepullreq_done.png)

- Setelah itu, branch Parent sudah terupdate!
![alt text](img/TW_tempresult_parent.png)


