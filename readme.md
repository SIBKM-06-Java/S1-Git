Testing

## Oskar Maha Kasi

## Fast Forward Merge

#### Langkah 1

Buat folder baru lalu git init

#### Langkah 2

Buat file readme.md lalu git add .

#### Langkah 3

Commit perubahan
![](img/SCR-20240229-hlgb.png)

#### Langkah 4

Push perubahan ke branch parentOskar
![](img/SCR-20240229-hlym.png)

#### Langkah 5

Membuat branch baru (childOskar branch) yang nantinya di-merge ke parent branch dengan cara
`git checkout -b childOskar` lalu saya tambahkan file child.md
![](img/SCR-20240229-hmmy.png)

#### Langkah 6

Kembali ke branch parentOskar dengan cara
`git checkout parentOskar`

#### Langkah 8

Setelah berada di parentOskar, lakukan merge dengan command `git merge childOskar`
![](img/SCR-20240229-hnao.png)

lalu saya push ke parentOskar dengan command `git push origin parnetOskar`

## Three Way Merge

1. Clone branch parentOskar sebelum perubahan
2. Selanjutnya pada clone ubah file child.md
3. `git add .` perubahan tersebut lalu `git commit -m '[feature] try conflict'`
   ![](img/SCR-20240229-hsgz.png)
4. Push perubahan ke branch parentOskar dengan `git push origin parentOskar`
   ![](img/SCR-20240229-hsqj.png)
5. Selanjutnya coba commit & push perubahan pada branchParentOskar setelah diubah dari source code lain
6. Maka terjadi conflict yang mengharuskan pull terlebih dahulu
   ![](img/SCR-20240229-http.png)
7. Lakukan pull `git pull origin parentOskar --no-rebase` untuk merge sehingga mendapatkan source code perubahan
   ![](img/SCR-20240229-huog.png)
8. Exit merge editornya dengan menuliskan `:q` lalu enter sehingga berhasil merge
   ![](img/SCR-20240229-husu.png)
