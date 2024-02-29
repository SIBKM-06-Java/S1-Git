
# TUGAS GIT (VERSIONING) - FAZA NAURA

## Tahapan fast forward:
1. Masuk ke direktori folder yang akan di tempati dengan mengetikan cd "nama folder" 
2. ketik git init untuk membuat repository
3. buat branch dengan ketik command git branch -m master parentfazarevisi
4. buat file readme.md dan isi 
5. masukan file dengan command git add. lalu commit
6. sambungkan dengan repository grup kelas dengan command git remote add origin git@github.com:SIBKM-06-Java/S1-Git.git
7. lalu push agar branch parent yang sebelumnya dibuat masuk ke repository yang telah tersambung dengan command git push origin parentfazarevisi
8. kemudian buat branch child lakukan hal yang sama seperti sebelumnya



## Tahapan Three way merge:
1. clone terlebih dahulu di file yang berbeda dengan sebelumnya
2. masuk ke direktori S1-Git
3. kemudian masuk ke branch parentfazarevisi, lalu tambah readme dengan three way merge - parentfazarevisi
4. kemudian update dan commit 
5. beralih ke branch childfazarevisi, dan lalukan hal yang sama seperti sebelumnya. lalu pada saat pull akan terjadi conflict sehingga kita perlu resolve terlebih dahulu
6. pindah ke vscode, klik accept both change, resolve in merge editor, dan complete merge
7. kemudian commit fix conflict
8. lalu lakukan push 
9. lalu lakukan pull request 