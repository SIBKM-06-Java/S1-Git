<p align="center">
<img src="https://metrodataacademy.s3.ap-southeast-1.amazonaws.com/assets/LogoMetrodata.png" alt="image"  width="300" height="auto" >
</p>

<p style="text-align: center;"><b>TUGAS VERSION CONTROL SYSTEM DENGAN GIT</b></p>

### FastFoward

1. Inisialisasi proyek pertama, dengan membuat folder dan memberikan `git init` sebagai penanda bahwa folder ini menggunakan _VCS_ 

    ![git init](images/fastfoward-remote/init.png)

2. membuat file didalam proyek, lalu gunakan `git add nama_file` untuk merubah posisi dari working directory ke staging area, dan gunakan `git status` untuk mengetahui status file yang sudah berada di staging area. Dan terakhir gunakan `git commit -m "pesan" nama_file` untuk memasukkan perubahan dalam repository git lokal

    ![git init](images/fastfoward-remote/git-status.png)
    ![gits](images/fastfoward-remote/git-add.png)
    ![comit](images/fastfoward-remote/commit-pertama.png)

3. merubah nama main branch ke `Parent` dengan command `git branch -m nama_brach_lama nama_branch_baru`, lalu membuat perubahan pada file. Dan gunakan `git add` serta `git commit`. Dan lihat untuk log perubahan yang ada `git log`

    ![](images/fastfoward-remote/menambahkan-baris-readme-parent.png)
    ![](images/fastfoward-remote/mengganti-nama-main-branch.png)
    ![](images/fastfoward-remote/git-log.png)

4. membuat branch baru `git branch nama_branch`, dan switch ke branch tersebut `git switch nama_branch`. Dan buat perubahan pada file branch child lalu pindahkan ke staging area dan commit

    ![](images/fastfoward-remote/membuat-child-dan-switch.png)
    ![](images/fastfoward-remote/commit-child-pertama.png)

5. melihat log sebelum merge parent dan child `git log --oneline`, dan pindah ke branch utama(parent) untuk menggabungkan branch cabang(child) dengan command `git merge nama_branch`, lalu cek dengan log melihat perubahan. NOTE: Branch main/master adalah branch utama tidak untuk di otak-atik untuk hal yang tidak perlu.

    ![](images/fastfoward-remote/log-sebelum-merge-fast.png)
    ![](images/fastfoward-remote/git-merge.png)
    ![](images/fastfoward-remote/setelah-merge.png)

6. me remote repository cloud, sebagai wadah proyek. `git remote add nama_panggilan_remote ssh_repo` dan selanjutnya push parent beserta child `git push nama_repo nama_branch`. 

    ![](images/fastfoward-remote/git-remote.png)
    ![](images/fastfoward-remote/git-push-parent-child-1.png)
    ![](images/fastfoward-remote/git-push-parent-child-2.png)


## Three way

1. clone proyek yang ada di repo `git clone nama_ssh`, lalu skema untuk terjadinya conflit adalah perbedaan kode yang ada pada branch parent dan child yang sebelumnya dibuat. Dengan cara berpindah ke branch parent dan child lalu berikan penambahan line pada file _teks yang berbeda_, dan selanjutnya di push. Konsep ini sama dengan merge sebelumnya tetapi dalam proyek kerja Tim. Ada bagian orang lain yang akan meriview apakah kode itu layak untuk di merge di branch utama.

    ![](images/threeway/clone.png)
    ![](images/threeway/menciptakan-conflict-pada-child.png)
    ![](images/threeway/menciptakan-conflict-parent.png)
    ![](images/threeway/switch-parent-clone.png)

2. terjadi conflict karena pada file yang sama README.md terjadi perubahan berbeda prespektif diantara branch,.ini yang perlu kita solve dan push kembali ketika conflict telah kita selesaikan. Lalu kita selanjutnya pull merge atau meminta persetujuan untuk adanya merge ke branch utama. 

    ![](images/threeway/conflict-terjadi-pull.png)
    ![](images/threeway/Screenshot%20from%202024-02-29%2020-10-36.png)
    ![](images/threeway/Screenshot%20from%202024-02-29%2020-11-44.png)