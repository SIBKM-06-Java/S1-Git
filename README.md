# 1. Fast Forward

## Inisialisasi GIT
- Buatlah sebuah folder
- Klik kanan di dalam folder tersebut dan pilih git bash here
- ![gitbash](images/gitbash.png)
- setelah gitbash terbuka ketikkan git init untuk inisialiasi
- ![gitinit](images/gitInit.png)

## Add,Commit
- gunakan perintah git status untuk melihat adanya perubahan
- ![gitstatus](images/gitstatus.png)
- "git add *" untuk menambahkan seluruh file yang ada ke dalam staging area
- ![gitadd](images/gitadd.png)
- "git commit" untuk melakukan commit ke local repo
- ![gitcommit](images/gitcommit.png)
- "git log" untuk melihat riwayat commit
- ![gitlog](images/gitlog.png)

## Branch
- gunakan command "git checkout -b childRaihan" untuk membuat sekaligus berpindah ke branch baru
- ![gitb](images/git-b.png)
- lakukan add dan commit seperti biasa
- bisa dilihat pada gambar dibawah hanya childParent saja yang berubah.
- ![graphs](images/graphs.png)

## merging
- Sebelum melakukan merging pindahkan dulu ke branch parent nya
- gunakan command "git merge child" untuk melakukan merge dari parent ke child
- ![merge](images/merge.png)
- diliat dari graphs posisi parent dan child sudah sejajar
- ![graphs2](images/graphs2.png)

## Remote
- perintah pada gambar dibawah ini untuk menghubungkan repo lokal kita ke repo cloud di github
- ![remote](images/gitremote.png)
- Kemudian kita akan melakukan push dari branch parent ke repo github
- ![pushparent](images/pushparent.png)
- Lakukan juga kepada branch child
- ![pushchild](images/pushchild.png)

# 2. Three Way Merging
## Membuat dan Solving Conflict
- Lakukan clone dari github(cloud) ke local repo
- ![](images/gitclone.png)
- kemudian masuk ke branch parent dan child
- ![](images/branchin.png)
- Edit file readme.md di branch parent agar nantinya akan terjadi    
conflict dengan branch child
- ![](images/editparent.png)
- Lakukan commit dan push pada branch parent
- ![](images/pushcommit.png)
- lakukan hal yang sama pada branch child tapi jangan disamakan
- ![](images/editchild.png)
- lakukan commit.
- git pull dari branch child ke branch parent
- ![](images/Pulling.png)
- Solve conflict dengan menggunakan vscode
- ![](images/solving.png)
- Pilih accept both changes nanti akan menjadi seperti dibawah
- ![](images/bothchanges.png)
- Lakukan commit dan pull sekali lagi
- ![](images/pulls.png)

## Open Pull Request
- Buka repo di github dan lakukan open new pull request dengan branch parent sebagai base dan child parent sebagai subjek yang ingin dikomparasi
- ![](images/createNewPR.png)
- ![](images/createPR.png)
- set reviewer dan assignee
- ![](images/sett.png)
- Accept Merge (seharusnya ini tidak dilakukan sendiri tanpa persetujuan reviewer namun dalam kasus ini hanyalah uji coba saja)
- ![](images/mergePR.png)