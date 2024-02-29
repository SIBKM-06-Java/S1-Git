# Tugas Versioning
## Pembukaan
(Insert Picture) Membuat tempat untuk menyimpan proyek. Hal ini bisa dilakukan dengan command `cd "lokasi folder(disarankan untuk melakukan copy-paste untuk menghindari kesalahan lokasi)`.
(Insert picture) Berikutnya melakukan inisialisasi dengan command `git init`. Command ini akan membuat folder .git tetapi hidden. Tetapi, folder dapat dimunculkan. (Insert picture folder git).
(Insert Picture) Berikutnya, membuat branch baru dengan `git branch NamaBranchParentBaru` atau `git checkout -b NamaBranchBaru`. Jika sudah punya branch parent tetapi ingin di-*rename*, bisa dengan command `git branch -m NamaLama NamaBaru`.
(Insert picture) Berikutnya, membuat file yang diinginkna dengan command `touch nama_file.formatfile`. File tersebut akan langsung muncul secara otomatis pada folder yang lokasinya sudah ditentukan sebelumnya. (Insert picture).
(Insert picture) Berikutnya, ganti isi file sesuai kebutuhan. Setelahnya, perubahan yang telah dilakukan ditambahkan ke staging area dengan command `git add .`.
(Insert picture) Berikutnya, jika tidak ada lagi yang ingin diganti bisa langsung dikomit agar hasil perubahan masuk ke repo local dengan cara `git commit -m "Judul Perubahan"`.
## Fast-Forward
(Insert Picture) Pertama-tama, membuat brand child dengan command `git checkout -b NamaBranchBaru`. Command ini akan langsung mengganti menjadi branch baru. Perubahan yang dilakukan akan terjadi pada branch tersebut.
(Insert Picture) Berikutnya, melakukan berubahan lalu melakukan command `git add .` seperti sebelumnya dan melakukan komit dengan command `git commit` agar perubahannya tersimpan pada repo lokal.
(Insert Picture) Karena perubahan dilakukan di child branch dan tidak pada parent branch, maka perlu diperbaiki dengan cara membuat branch baru dengan nama hotfix dan command `git checkout -b hotfix`.
(Insert picture) Lalu melakukan command `vim FileYangDikerjakan.FormatFile`. Setelahnya melakukan komit untuk menyimpan perubahan pada local repo. Kembali ke parent branch lalu merge parent branch dengan hotfix dengan command `git merge hotfix`.
(Insert picture) Dengan begitu fast-forward akan muncul menandakan bahwa perubahan file telah berubah menjadi file yang sesuai dengan child branch.
(Insert picture) Berikutnya menghapus branch hotfix.
(Insert picture) Setelahnya update ke git hub dengan cara menambah remote origin. Cek apakah sudah terhubungan dengan command `git remote-v`. Setelahnya lakukan update dengan command `git push origin NamaBranch