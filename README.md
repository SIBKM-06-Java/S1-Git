## VERSIONING 

# FAST FORWARD

1. ** Membuat file README.md **
``` bash 
touch README.md
``` 
<img src="./image/Screenshot_1.jpg" />

2. ** Inisialisasi git **
``` bash
git init
```
<img src="./image/Screenshot_3.jpg">

3. ** Membuat branch dengan mengganti nama master dengan nama sesuai yang kita inginkan ***
``` bash
git checkout -b (namayangdiinginkan)
```
<img src="./image/Screenshot_4.jpg">

4. ** Push file ke Local staging area **
``` bash
git add .
git commit -m "first commit child brench"
```
<img src="./image/Screenshot_5.jpg">

5. ** Hubungkan ke Repository Github **
``` bash
git remote add origin git@github.com:SIBKM-06-Java/S1-Git.git
```
<img src="./image/Screenshot_6.jpg">

6. ** Lakukan Git Push Parent**
``` bash
git push origin ParentAzharRevisi
```
<img src="./image/Screenshot_7.jpg">

7. ** Lalu membuat Branch Child**
``` bash
git checkout -b ChildAzhar
```
<img src="./image/Screenshot_8.jpg">

8. ** Push File ke Local Staging Area **
``` bash
git add .
git commit -m "first commit child branch"
```
<img src="./image/Screenshot_9.jpg>

9. ** Lakukan Git Push Child**
``` bash
git push origin ChildAzhar
```
<img src="./image/pushChild.jpg">

10. ** Lakukan Merge**
```bash
git merge  ChildAzhar
```
<img src="./image/git merge.jpg">

11. ** Lakukan Push ke repository Github **
``` bash
git push origin ParentAzharRevisi
```
<img src="./image/git push.jpg">