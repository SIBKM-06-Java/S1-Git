# Tugas Versioning
## Pembukaan
(Insert Picture) Membuat tempat untuk menyimpan proyek. Hal ini bisa dilakukan dengan command `cd "lokasi folder(disarankan untuk melakukan copy-paste untuk menghindari kesalahan lokasi)`. 
(Insert picture) Berikutnya melakukan inisialisasi dengan command `git init`. Command ini akan membuat folder .git tetapi hidden. Tetapi, folder dapat dimunculkan. (Insert picture folder git). 
(Insert Picture) Berikutnya, membuat branch baru dengan `git branch NamaBranchParentBaru` atau `git checkout -b NamaBranchBaru`. Jika sudah punya branch parent tetapi ingin di-*rename*, bisa dengan command `git branch -m NamaLama NamaBaru`. 
(Insert picture) Berikutnya, membuat file yang diinginkna dengan command `touch nama_file.formatfile`. File tersebut akan langsung muncul secara otomatis pada folder yang lokasinya sudah ditentukan sebelumnya. (Insert picture). 
(Insert picture) Berikutnya, ganti isi file sesuai kebutuhan. Setelahnya, perubahan yang telah dilakukan ditambahkan ke staging area dengan command `git add .`. 
(Insert picture) Berikutnya, jika tidak ada lagi yang ingin diganti bisa langsung dikomit agar hasil perubahan masuk ke repo local dengan cara `git commit -m "Judul Perubahan"`. 