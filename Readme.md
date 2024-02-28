<div style="text-align:center;">

# Fast Forward <br/>

## **Rovines Derlan Hutabarat**

</div>

1. **Buat Folder Baru**
   <img src="./assets/Screenshot (687).png"/>

2. **Inisialisasi git**
   ```bash
   git init
   ```
   <img src="./assets/Screenshot (701).png"/>
3. **Buat File Readme.MD Pada Folder Yang Telah Dibuat**
4. **Tambahkan Text Pada File Readme**
5. **Tambahkan Branch Parent**
   ```bash
   git checkout -b ParentRovines
   ```
   <img src="./assets/Screenshot (702).png"/>
6. **Push File Ke Local Staging Area**
   ```bash
   git add .
   git commit -m "commit 1"
   ```
   <img src="./assets/Screenshot (703).png"/>
7. **Hubungkan Ke Repository Github**
   ```bash
   git remote add origin git@github.com:SIBKM-06-Java/S1-Git.git
   ```
   <img src="./assets/Screenshot (704).png"/>
8. **Lakukan Git Push**
   ```bash
   git push origin ParentRovines
   ```
   <img src="./assets/Screenshot (705).png"/>
   <img src="./assets/Screenshot (706).png"/>
9. **Buat Branch Child**

   ```bash
   git checkout -b ChildRovines
   ```

   <img src="./assets/Screenshot (707).png"/>

10. **Push File Ke Local Staging Area**
    ```bash
    git add .
    git commit -m "commit child branch"
    ```
    <img src="./assets/Screenshot (708).png"/>
11. **Cek Perbedaan File Di Parent branch dan Child Branch**
    ```bash
    git checkout ParentRovines
    git checkout ChildRovines
    ```
    <img src="./assets/Screenshot (709).png"/>
    <img src="./assets/Screenshot (710).png"/>
12. **Lakukan Merge Ketika Posisi branch ada di Parent branch**
    ```bash
    git merge ChildRovines
    ```
    <img src="./assets/Screenshot (711).png"/>
13. **Push Ke Repository Github**
    ```bash
    git push origin ParentRovines
    ```
    <img src="./assets/Screenshot (711).png"/>
