___
<h1 align = "center">LATIHAN GIT</h1>
<p align = "center">by arda prayogo</p>

___

<p>
Pada latihan ini merupakan uji coba Fast Forward Merge dan Three Way Merge serta push ke github, selamat membaca..
</p>

***

# 🆕 CREATE NEW FOLDER, 🔄 GIT INIT, ✏️ RENAME BRANCE

<p>
    Dibagian awal ini terdapat beberapa hal yang dilakukan seperti membuat folder baru, git init, dan mengganti nama branch utama
</p>

1. Buat folder untuk menyimpan file project
![Nama_alternatif](img/Screenshot%20(100).png)

2. Buka lewat terminal
![Nama_alternatif](img/Screenshot%20(101).png)

3. Ketik code . dan tekan enter
![Nama_alternatif](img/Screenshot%20(102).png)

4. Buat file readme.md
![Nama_alternatif](img/Screenshot%20(103).png)
![Nama_alternatif](img/Screenshot%20(104).png)

5. Buka git bash
![Nama_alternatif](img/Screenshot%20(105).png)

6. Masuk folder dengan cd
![Nama_alternatif](img/Screenshot%20(106).png)

7. Git init untuk membuat local repo baru
![Nama_alternatif](img/Screenshot%20(107).png)

8. Ubah master dengan git branch -m ParentArdaRev
![Nama_alternatif](img/Screenshot%20(108).png)

9. Mengecek file yang terdapat di folder latihan dengan ls -l
![Nama_alternatif](img/Screenshot%20(109).png)

10. Git status
![Nama_alternatif](img/Screenshot%20(110).png)

***
# ➕ GIT ADD, 📊 STATUS, ✅ COMMIT
<p>
Pada bagian ini merupakan implementasi git add, git status, dan melakukan commit
</p>

11. Melakukan git add readme.md
12. Git status
![Nama_alternatif](img/Screenshot%20(111).png)

13. Memasukkan ## Halo latihan git Arda dan disave
14. Git add
15. Git status untuk menunjukkan bahwa file sudah dimodified dan perlu di commit
![Nama_alternatif](img/Screenshot%20(112).png)

16. Git commit -m "Upload readme.md pertama kali"
![Nama_alternatif](img/Screenshot%20(113).png)

17. Tambahkan beberapa line di readme.md ## Disini saya menambahkan satu line untuk ujicoba git status --short dan save
18. Git status --short untuk mengecek apakah file sudah modified
19. Git commit -m "menambahkan satu line di readme"
![Nama_alternatif](img/Screenshot%20(114).png)

***
# 🌿 GIT BRANCH, ⤵️ CHECKOUT, 📈 GRAPH, 🔀 FAST FORWARD MERGE
<p>
Pada bagian ini merupakan implementasi git branch, git checkout, graph, dan melakukan fast forward merge
</p>

20. Membuat git branch dengan nama ChildArdaRev git branch ChildArdaRev
21. Melihat git branch yang ada dengan git branch
![Nama_alternatif](img/Screenshot%20(115).png)

22. Berpindah ke branch ChildArdaRev dengan git checkout ChildArdaRev
![Nama_alternatif](img/Screenshot%20(116).png)

23. Edit readme di ChildArdaRev ##Disini adalah contoh penggunaan git add
![Nama_alternatif](img/Screenshot%20(117).png)

24. Git add
25. Git status
26. Git commit -m "menambahkan 1 line di branch ChildArdaRev"
![Nama_alternatif](img/Screenshot%20(118).png)

27. Bandingkan isi file di Branch parent dan child dengan cara berpindah branch dan di ss 2 2 nya dan disini memasukkan alias untuk menampilkan graph
![Nama_alternatif](img/Screenshot%20(119).png)
![Nama_alternatif](img/Screenshot%20(120).png)

28. Git checkout ParentArdaRev
![Nama_alternatif](img/Screenshot%20(121).png)

29. Git merge ChildArdaRev
![Nama_alternatif](img/Screenshot%20(122).png)

***
# 📡 GIT REMOTE, 🚀 PUSH, ↔️ THREE WAY MERGE
<p>
Pada bagian ini merupakan implementasi git remote, git push, dan three way merge
</p>

30. Git remote
![Nama_alternatif](img/Screenshot%20(123).png)

31. Git Push 2 2 nya dan di git hub akan muncul branch yang baru kita masukkan
![Nama_alternatif](img/Screenshot%20(124).png)
![Nama_alternatif](img/Screenshot%20(125).png)

32. Tambahkan line di readme.md branch ChildArdaRev ## Disini line pertama untuk uji coba merge conflict
![Nama_alternatif](img/Screenshot%20(126).png)

33. Tambahkan line di readme.md branch Parent ## Disini line Kedua untuk uji coba merge conflict dan check dengan graph
![Nama_alternatif](img/Screenshot%20(127).png)
![Nama_alternatif](img/Screenshot%20(128).png)

34. Lakukan git merge di parent
![Nama_alternatif](img/Screenshot%20(129).png)

35. Resolve conflit di text dieditor dan ss
![Nama_alternatif](img/Screenshot%20(130).png)
![Nama_alternatif](img/Screenshot%20(131).png)
![Nama_alternatif](img/Screenshot%20(132).png)
![Nama_alternatif](img/Screenshot%20(133).png)

37. Git status
38. Git commit -a -m "merged"
![Nama_alternatif](img/Screenshot%20(134).png)

***
# 🛠️ PULL REQUEST
<p>
Pada bagian ini merupakan implementasi Pull direquest.
</p>


39. Lakukan git push untuk mengupdate repo di github
![Nama_alternatif](img/Screenshot%20(137).png)

40. Masuk ke github dan buka tab pull request
![Nama_alternatif](img/Screenshot%20(135).png)

41. Klik new pull request
![Nama_alternatif](img/Screenshot%20(136).png)

42. Pilih branch yang akan di compare
![Nama_alternatif](img/Screenshot%20(138).png)

43. Klik create pull request
![Nama_alternatif](img/Screenshot%20(139).png)

44. Tambahkan assignees
![Nama_alternatif](img/Screenshot%20(140).png)

45. Klik merge pull request
![Nama_alternatif](img/Screenshot%20(141).png)

46. Klik confirm merge
![Nama_alternatif](img/Screenshot%20(142).png)

47. Pull request sudah berhasil
![Nama_alternatif](img/Screenshot%20(143).png)

48. Tampilan pull jika berhasil
![Nama_alternatif](img/Screenshot%20(144).png)

49. Readme.md di ChildArdaRev telah diupdate
![Nama_alternatif](img/Screenshot%20(145).png)