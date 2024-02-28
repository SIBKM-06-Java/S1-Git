### PUSH KE REPO PARENT DAN CHILD

## STEP KE 1
Sebelumnya saya ingin mengupdate hasil screenshoot di README.md yang di branch ParentKevin
![](/img2/add%20ss.png)

## STEP KE 2
sekarang kita akan menyambungkan local repo kita ke server github. dengan cara ketikkan git remode add SSH
![](/img2/1.%20cek%20-v.png)

## STEP KE 3
Sebelumnya saya akan mengganti nama Branch master menjadi ParentKevin dengan mengetikkan command seperti difoto ini.
 ![](/img2/2.%20ganti%20nama%20branch%20master.png)

## STEP KE 4
langkah selanjutnya adalah push pada branch ParentKevin dengan mengikuti langkah dibawah ini.
![](/img2/3.%20git%20push.png)

## STEP KE 5
langkah selanjutnya adalah push ChildKevin , sama seperti step ke 4 , tetapi pindah dahulu git checkout ChildKevin
![](/img2/4.%20git%20push%20child.png)
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
