# Laporan Tugas Git - Maulana Dzikri H

##

## **--- FAST FORWARD MERGE ---**

---

### - Membuat folder project

![](<img1/(1)buat%20folder%20project.png>)

### - Membuka git bash di folder project

![](<img1/(2)%20buka%20git%20bash%20di%20folder%20project.png>)

### - Menginisialisasi project

![](<img1/(3)%20inisialisasi%20project.png>)

### - Menghubungkan repo local dengan repo github

![](<img1/(4)%20menghubungkan%20repo%20local%20ke%20server%20github.png>)

### - Membuat file readme dan test1

![](<img1/(5)%20membuat%20file%20readme%20dan%20test1.png>)

### - git add . perubahan file

![](<img1/(6)%20git%20add.png>)

### - git commit

![](<img1/(7)%20git%20commit.png>)

### - Mengubah nama branch master menjadi ParentDzikri

![](<img1/(9)%20mengubah%20nama%20branch%20master.png>)

### - push branch ParentDzikri ke repo github

![](<img1/(10)%20git%20push.png>)

### - Cek commit

![](<img1/(8)%20cek%20commit.png>)

### - Membuat branch baru dengan nama ChildDzikri dan pindah ke branch tersebut

![](<img1/(11)%20buat%20branch%20child.png>)

### - Menambahkan kalimat pada line 3 di text1.txt (saya lupa untuk ss add dan commitnya)

![](<img1/(12)%20tambah%20line%20di%20child.png>)

### - Cek commit (saya pindah ke terminal git bash di dalam vs code)

![](<img1/(13)%20cek%20commit2.png>)

### - Push branch ChildDzikri ke repo github

![](<img1/(14)%20push%20commit2.png>)

### - Commit tambah foto

![](img1/15%20commit%20tambah%20foto.png)

### - Pindah ke branch ParentDzikri lalu merge branch ChildDzikri

![](img1/16%20pindah%20branch%20dan%20merge%20branch.png)

### - Branch ParentDzikri dan ChildDzikri sudah ter-merge

![](img1/17%20sudah%20ke%20merge.png)

---

## **--- THREE WAY MERGE ---**

### - Clone project repository S1-Git di luar folder project lain

![](img_three-way/1%20clone.png)

### - Masuk ke folder project

![](img_three-way/cd%20project.png)

### - Membuat perubahan pada branch Child

Pindah terlebih dahulu ke branch ChildDzikri caranya dengan perintah `git checkout ChilDzikri`. Setelah itu membuat perubahan pada file1.txt dan langsung commit `git commit -am "message"`.

![](img_three-way/2%20buat%20perubahan%20child%20dan%20commit.png)

### - Membuat perubahan pada branch Parent

Pindah terlebih dahulu ke branch ParentDzikri caranya dengan perintah `git checkout ParentDzikri`. Setelah itu membuat perubahan pada file1.txt dan langsung commit `git commit -am "message"`

![](img_three-way/3%20ubah%20test1%20parent.png)

### - Cek Commit

![](img_three-way/4%20graphs.png)

### - Push branch Parent

![](img_three-way/5%20push%20branch%20parent.png)

### - Push branch Child

![](img_three-way/6%20push%20child.png)

### - Pull branch Parent di branch Child

Pilih 'Access Both Changes'
![](img_three-way/7%20pull%20parent%20-%20accept%20both%20changes.png)

### - Resolve in merge editor

![](img_three-way/8%20resolve%20in%20merge%20editor.png)

### - Complete Merge

![](img_three-way/9%20complete%20merge.png)

#### complete with conflicts

![](img_three-way/10%20complete%20with%20conflicts.png)

#### Close With Conflicts

![](img_three-way/11.png)

### - git status. Conflict Solved

permintaan commit untuk merge
![](img_three-way/12%20cek%20status%20-%20minta%20untuk%20di%20commit.png)

### - git commit

![](img_three-way/13%20commit.png)

### - cek status setelah commit

diminta untuk push local commits
![](img_three-way/14%20cek%20status%20setelah%20commit.png)

### - git push local commits

![](img_three-way/15%20git%20push.png)

### - Lihat pada repo github, branch ChildDzikri sudah ter-merge dengan ParentDzikri

![](img_three-way/16%20pada%20child%20sudah%20termerge%20dengan%20parent.png)

### - Masuk ke Pull Request untuk merge branch ChildDzikri ke ParentDzikri

![](img_three-way/17%20masuk%20ke%20pull%20req.png)

### - Membuat Pull Request baru

![](img_three-way/18%20new%20pull%20req.png)

### - Pilih branch ParentDzikri sebagai base, lalu pilih branch ChildDzikri sebagai compare branch. lalu klik Create Pull Request

![](img_three-way/19%20pilih%20base%20dan%20compare%20lalu.png)

### - Masukan title PR, lalu pilih Reviewers yaitu ka fuad. dan pilih Assigneesnya saya sendiri. Kemudian klik Create Pull Request

![](img_three-way/20%20create%20PR.png)

### - Pull Request berhasil dibuat. Scroll ke bawah untuk merge PR

![](img_three-way/21%20hasil%20PR.png)

### - Klik Merge pull request

![](img_three-way/22%20merge%20pr.png)

### - Confirm merge

![](img_three-way/23%20confirm%20merge.png)

### - Pull Request berhasil di merge

![](img_three-way/24%20done.png)

### - Branch ParentDzikri pada repo github berhasil di merge

![](img_three-way/25%20parent%20berhasil%20merge%20child.png)

### - Branch ChildDzikri sudah berhasil dimerge pada local repo

![](img_three-way/26%20branch%20child%20di%20local%20sudah%20termerge.png)

### - Cek branch local ParentDzikri. ternyata belum termerge

![](img_three-way/27%20branch%20parent%20blm%20termerge.png)

### - Mengupdate local branch ParentDzikri dengan yang ada di repo github menggunakan perintah `git pull origin ParentDzikri`

![](img_three-way/28%20mengupdate%20local%20parent%20dr%20github.png)

# SEKIAN TERIMA KASIH :)
