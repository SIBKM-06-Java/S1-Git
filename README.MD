# KEVIN

## FAST-FORWARD

### STEP 1
Buatlah Folder Project 
![](/img/1.%20Buat%20Folder%20Project.png)


### STEP 2
Buka Gitbash dan ketikkan cd "Path-project"
![](/img/2.%20Buka%20folder%20di%20git.png)

### STEP 3
Buatlah File README.md dan file txt (Bebas)
![](/img/3.%20Membuat%20README.png)

### STEP 4
1. Kemudian Ketikkan git add * untuk mengubah status perubahan file menjadi staging area.
2. lalu ketikkan git commit -m "Pesan" untuk mengubah status perubahan file ke repo seperti yang ada digambar

![](/img/4..png)

### STEP 5
Step selanjutnya adalah untuk membuat branch baru untuk dimerge ke master branch
![](/img/5..png)

### STEP 6
1. Setelah membuat branch ChildKevin , langkah selanjutnya masuk ke branch tersebut dengan mengetikkan perintah git checkout namabranch , kemudian buatlah file text2.txt
2. Lakukanlah hal yang sama dengan melakukan git add text2.txt lalu git commit -m "pesan"

![](/img/6.png)

### STEP 7
Kemudian pergi kembali ke branch master untuk memastikan file text2.txt tidak ada , karena hanya dibuat di branch ChildKevin
![](/img/7.png)

### STEP 8
Lakukan merge , setelah posisi kita sudah di master branch , kita ketikkan command git merge ChildKevin
![](/img/8.png)