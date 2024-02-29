# GIT FAST FORWARD 

## MUHAMMAD IHSAN KURNIA AL-KARIM

## Langkah 1
Menginisialisasi git dengan menggunakan perintah berikut ini:

```bash
git init
```

![[Screenshot (520).png]]

## Langkah 2
Membuat file.txt yang nantinya akan di push di repository, setelah itu mengecek perubahan yang ada pada git dengan perintah berikut ini

```bash
git status
```

![[Screenshot (522).png]]

## Langkah 3
Menambahkan dan commit perubahan file.txt dengan perintah berikut ini:
Perintah untuk menambahkan file yang telah dibuat
```bash
git add .
```

Perintah untuk perubahan commit:
```bash
git commit -m "add: menambahkan file.txt"
```

![[Screenshot (523) 1.png]]

## Langkah 4
Membuat branch baru dan berpindah branch menggunakan perintah berikut ini:
```bash
git checkout -b ParentIhsanKurnia
```
![[img_createAndSwitchBranch.png]]

## Langkah 5
Menambahkan remote reposiotry dengan SSH reposiotry "git@github.com:SIBKM-06-Java/S1-Git.git" menggunakan perintah berikut ini:

Git remote untuk menyambungkan file ke git repository:
```bash
git remote add origin git@github.com:SIBKM-06-Java/S1-Git.git
```

Perintah untuk mengecek repository github yang tersimpan di local:
```bash
git remote -v
```

![[Pasted image 20240229073607.png]]

## Langkah 6 
Membuat branch baru yang bernama"ChildIhsanKurnia":

![[Pasted image 20240229074853.png]]



## Langkah 7 
Menghapus branch master dengan command berikut ini:
```bash
git branch -d master
```

![[Pasted image 20240229075430.png]]

Melihat daftar branch yang tersedia di lokal dengan command berikut ini:
```bash
git branch -a
```
![[Pasted image 20240229075614.png]]


## Langkah 7

Push file yang ada di local ke repository dengan perintah berikut ini:

```bash
git push --set-upstream origin ParentIhsanKurnia
```

![[Pasted image 20240229080302.png]]

![[Pasted image 20240229080225.png]]

## Langkah 8 
Mengubah isi file.txt dan push ke branch ChildIhsanKurnia

```bash
git push origin ChildIhsanKurnia
```

![[Pasted image 20240229080750.png]]

![[Pasted image 20240229081114.png]]



## GIT MERGE

## Langkah 1

Melakukan cloning dari repository dengan perintah berikut ini:

```bash
git clone git@github.com:SIBKM-06-Java/S1-Git.git THREE-WAY-MERGING
```
![[Pasted image 20240229082544.png]]

## Langkah 2

Melihat daftar branch yang telah tersedia di repository

```bash
git branch -a
```

![[Pasted image 20240229082746.png]]

## Langkah 3

Membuat branch Parent dan Child

![[Pasted image 20240229083326.png]]

![[Pasted image 20240229083338.png]]

![[Pasted image 20240229083349.png]]


## Langkah 4

Membuat perubahan pada file.txt dan melakukan push ke repository:

![[Pasted image 20240229084255.png]]


## Langkah 5
Pindah branch dari Parent ke ChildIhsanKurnia

![[Pasted image 20240229085156.png]]

Menambahkan perubahan pada file:
![[Pasted image 20240229085329.png]]


## Langkah 6 

Melakukan merge dan pull request:
![[Pasted image 20240229090526.png]]


![[Pasted image 20240229085505.png]]


Pull Request:
![[Pasted image 20240229085805.png]]


Melakukan pull request
![[Pasted image 20240229090209.png]]


Pull request berhasil:
![[Pasted image 20240229090432.png]]
