# Melakukan Fast Forward
<img src="/path/to/Screenshot (1312).png">
## Membuat Project
Hal pertama yang perlu dilakukan adalah menentukan lokasi project yang akan dibuat dengan [cd "lokasi penyimpanan"]. Setelahnya, melakukan inisialisasi dengan [git init]. Ini akan membuat folder hidden .git.
## Permbuatan Branch Parent dan Child
Membuat branch parent dengan [git checkout -b (nama_parent_branch)] dan membuat file baru untuk melakukan Fast Forward. Di sini, saya menggunakan README.md dengan cara [touch README.md]. Di sini saya melakukan perubahan langsung sebelum menyimpan perubahannya dengan  melakukan [git add .] dan [git commit -m "commit message"]. Setelahnya membuat branch child dengan commad yang sama dengan parent lalu menambah data sebelum menyimpannya dengan add dan commit.
<img src="/path/to/Screenshot (1313).png">
## Melakukan merge
Setelah menambah data yang diperlukan, saya mengganti branch dengan [git checkout (parent branch)] lalu melakukan merge dengan cara [git merge (child branch)]

#Skenario Three Way Merge dan solusinya
<img src="/path/to/Screenshot (1320).png">
## Membuat Skenario
Sebelumnya, melakukan cloning terlebih dahulu lalu mencari lokasi proyek dengan cara yang sama seperti sebelumnya. Setelahnya membuat branch parent dan child dengan cara yang sama. Pada branch parent, mengisi hal yang diperlukan dan melakukan add dan commit lalu mengganti branch ke branch child dan melakukan hal yang sama. Setelahnya, kembali ke branch parent dan ubah data yang sebelumnya telah diganti di saat di branch child di posisi yang sama lalu melakukan add dan commit. Hal ini akan menyebabkan terjadinya konflik.
<img src="/path/to/Screenshot (1319).png">
## Solusi
Seperti yang terlihat pada gambar, terdapat konflik dalam data/file. Solusinya tidak lain adalah memilih data yang ingin disimpan pada file lalu melakukan add dan commit dengan message mengatakan "resolved conflict." Dengan begitu, tidak akan ada error mengenai three way merge.
