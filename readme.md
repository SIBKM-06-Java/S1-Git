#### <h1 align = "center"> TUGAS VERSIONING</h1>
<h2 align = "center"> Arda Prayogo </h2>

<h2> Uji Syntax Dasar </h2>

1. Melakukan pemanggilan folder
2. Melakukan get ini untuk membuat repository baru
3. Merename Branch utama menjadi parentArda(tapi disini menjadi ParentArdaP karena typo diakhir pengerjaan saat push)
4. Mengecek isi repo
  <img src="Screenshot (76).png" />
5. Menambahkan file readme.md ke dalam staging area
6. Mengecek kembali status repo
7. Melakukan commit dengan comment "Upload readme ke repo pertama kali"
8. Mengecek kembali status repo
9. Melakukan commit dengan comment "Update readme.md"
  <img src="Screenshot (77).png" />
  
<h2>Membuat Branch</h2>

10. Membuat branch dengan nama childArda(tapi disini menjadi ChildArdaP karena typo diakhir pengerjaan saat push)
11. Melakukan pengecekan branch yang telah dibuat
12. Melakukan perpindahan Branch dengan "checkout"
13. Menambahkan pembaharuan data di file dengan add dan dimasukkan kedalam semua repo dengan "add --all"
14. Melakukan commit dengan comment "Add deskripsi fast forward"
  <img src="Screenshot (78).png" />
  
<h2>Melakukan Fast Forward Merging</h2>

15. Melakukan commit dengan comment "Add deskripsi three way merging"
16. Melakukan git log --all --decorate --oneline --graph
    untuk menampilkan visualisasi branch dalam bentuk graph (history)
17. Melakukan fast forward merging dengan "git merge childArda"
  <img src="Screenshot (79).png" />
18. Melakukan commit ke semua branch dengan syntax "-a" dengan comment "Add step fast forward"
18. Melakukan commit ke childArda dengan comment "add step three way merging"
19. Membuat alias graph="git log --all --decorate --oneline --graph"
    memberikan alias syntax dalam menampilkan graph 
  <img src="Screenshot (80).png" />
  
<h2>Melakukan Merging Conflicts</h2>

20. Melakukan merge antara parentArda dan childArda
21. Kemudian di text editor terdapat notifikasi untuk revolve merging
  <img src="Screenshot (81).png" />
22. Setelah selesai resolving, dilakukan pengecekan status
23. Dilanjutkan commit dengan comment"merge dengan childArda"
24. Memanggil alias graph untuk menampilkan alur/history repo
  <img src="Screenshot (82).png" />
  
<h2>Melakukan remote git</h2>

25. Menyambungkan ke repository di github
  <img src="Screenshot (87).png" />
26. Mengganti nama branch karena error
27. Melakukan git push --set-upstream origin ParentArdaP untuk mengupload repo lokal ke github
  <img src="Screenshot (86).png" />
  <img src="Screenshot (88).png" />

<h2> Melakukan Tree Way Merging </h2>

28. Masuk ke github
29. Masuk ke repo SIBKM-06-java
30. Pilih S1-Git
31. Pilih Branch milik sendiri
32. Klik menu Pull request dan pilih branch child untuk dicompare dan di merge
33. Masukan title dan tambah orang untuk tujuan pengumpulan
34. jika sudah klik merge dan tambahkan komen 
  <img src="Screenshot (90).png" />



