# TUGAS VERSIONING MENGGUNAKAN GITHUB
### MUHAMMAD IHSAN KURNIA AL-KARIM
### METRODATA ACADEMY

## GIT FAST FORWARD  

## Langkah 1

Menginisialisasi git dengan menggunakan perintah berikut ini:

```bash
git init
```

![Alt Text](<./img/Screenshot%20(520).png>)

## Langkah 2

Membuat file.txt yang nantinya akan di push di repository, setelah itu mengecek perubahan yang ada pada git dengan perintah berikut ini

```bash
git status
```

![Alt Text](<./img/Screenshot%20(522).png>)

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

![Alt Text](<./img/Screenshot%20(523).png>)

## Langkah 4

Membuat branch baru dan berpindah branch menggunakan perintah berikut ini:

```bash
git checkout -b ParentIhsanKurnia
```

![Alt Text](./img/img_createAndSwitchBranch.png)

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

![Alt Text](./img/Pasted%20image%2020240229073607.png)


## Langkah 6

Membuat branch baru yang bernama"ChildIhsanKurnia":

![Alt Text](./img/Pasted%20image%2020240229074853.png)


## Langkah 7

Menghapus branch master dengan command berikut ini:

```bash
git branch -d master
```

![Alt Text](./img/Pasted%20image%2020240229075430.png)

Melihat daftar branch yang tersedia di lokal dengan command berikut ini:

```bash
git branch -a
```

![Alt Text](./img/Pasted%20image%2020240229075614.png)


## Langkah 8
Push file yang ada di local ke repository dengan perintah berikut ini:

```bash
git push --set-upstream origin ParentIhsanKurnia
```

![Alt Text](./img/Pasted%20image%2020240229080302.png)


![Alt Text](./img/Pasted%20image%2020240229080225.png)

## Langkah 9
Mengubah isi file.txt dan push ke branch ChildIhsanKurnia

```bash
git push origin ChildIhsanKurnia
```

![Alt Text](./img/Pasted%20image%2020240229080750.png)


![Alt Text](./img/Pasted%20image%2020240229081114.png)


## Langkah 10 

Pindah ke branch ParentIhsanKurnia
```bash
git checkout ParentIhsanKurnia
```

Menggabungkan seluruh perubahan yang ada di branch ChildIhsanKurnia ke branch ParentIhsanKurnia
```bash
git merge ChildIhsanKurnia
```

![Alt Text](./img/gitmerge_fastforward.png)


## GIT THREE-WAY-MERGING

## Langkah 1

Melakukan cloning dari repository dengan perintah berikut ini:

```bash
git clone git@github.com:SIBKM-06-Java/S1-Git.git THREE-WAY-MERGING
```

![Alt Text](./img/Pasted%20image%2020240229082544.png)

## Langkah 2

Melihat daftar branch yang telah tersedia di repository

```bash
git branch -a
```

![Alt Text](./img/Pasted%20image%2020240229082746.png)

## Langkah 3
Membuat branch Parent dan Child
```bash
git checkout -b ParentIhsanKurnia origin/ParentIhsanKurnia
```
![Alt Text](./img/Pasted%20image%2020240229083326.png)

```bash
git checkout -b ChildIhsanKurnia origin/ChildIhsanKurnia
```

![Alt Text](./img/Pasted%20image%2020240229083338.png)

Melihat list branch yang telah tersedia di local:
```bash
git branch
```

![Alt Text](./img/Pasted%20image%2020240229083349.png)

## Langkah 4
Membuat perubahan pada file.txt dan melakukan push ke repository:

![Alt Text](./img/Pasted%20image%2020240229084255.png)

![Alt Text](./img/git_file_ss.png)

## Langkah 5

Karena tadi masih berada di branch parent. Maka perlu pindah branch dari ParentIhsanKurnia ke ChildIhsanKurnia

![Alt Text](./img/Pasted%20image%2020240229085156.png)

Selain itu, Menambahkan perubahan pada file, seperti pada gambar dibawah ini:
![Alt Text](./img/Pasted%20image%2020240229085329.png)

## Langkah 6

### 6.1 Melakukan Pull Request dan merge langsung di github:
Melakukan pull request dan merge dengan perintah dibawah ini
![Alt Text](./img/Pasted%20image%2020240229090526.png)

![Alt Text](./img/Pasted%20image%2020240229085505.png)

Pull Request dari branch ChildIhsanKurnia ke branch ParentIhsanKurnia langsung di github:
![Alt Text](./img/Pasted%20image%2020240229085805.png)
![Alt Text](./img/git_pullrequest.png)


![Alt Text](./img/Pasted%20image%2020240229090209.png)
![Alt Text](./img/git_pullrequest.png)

Pull request berhasil dan melakukan merge branch langsung di github:
![Alt Text](./img/Pasted%20image%2020240229090432.png)

### 6.2 Melakukan Pull Request dan merge di local

#### Mengambil perubahan terbaru dari remote repository ke dalam branch ParentIhsanKurnia.
![Alt Text](./img/gitpullorigin.png)

#### Memastikan pindah branch ParentIhsanKurnia
![Alt Text](./img/gitcheckout.png)

#### Menggabungkan perubahan dari branch ChildIhsanKurnia ke dalam branch ParentIhsanKurnia
![Alt Text](./img/gitmerge.png)

#### Mengirim perubahan yang telah di-merge ke remote repository.
![Alt Text](./img/gitpushpr.png)

