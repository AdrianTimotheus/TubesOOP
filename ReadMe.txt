Plant vs zombie

Ketentuan umum game :
- Points awal = 300
- Skor awal = 0
- Game berakhir jika Zombie sudah mencapai ujung layar kiri.

User dapat memilih untuk memasukkan command: BUY/SKIP.

Ketika pengguna memilih BUY
- Jika credits pengguna tinggal 0, maka akan muncul pesan ("Maaf, Anda tidak memiliki sisa credits. Pembelian tidak dapat dilakukan.")
- Jika pengguna masih memiliki sisa credits :
Pengguna akan diminta untuk memilih jenis tumbuhan yang akan dibeli 
(1 : Sunflower - 5 credits
 2 : Pea       - 10 credits)
Setelah itu, pengguna akan diminta untuk memasukkan posisi yang diinginkan utk meletakkan tumbuhan tsb.
a. Jika ternyata posisi yg diinginkan sudah ada tumbuhan lain, maka pengguna akan diminta ulang untuk memasukkan posisi lain.
b. Jika credits yang dimiliki tidak cukup untuk melakukan pembelian, maka pembelian gagal.
c. Jika credits yang dimiliki cukup, pembelian berhasil. Setelah itu game akan ditampilkan ke layar dengan tumbuhan yg dibeli sudah diposisikan pada tempatnya.

Ketika pengguna memilih SKIP
- Ketika pengguna memasukkan command  SKIP pertama kali : Zombie akan muncul dari ujung kanan layar, dimana letaknya maupun tipe zombie itu akan dirandom 
NOTE : Karena random, jumlah zombie yg muncul jg akan bervariasi. Ada kalanya ketika pengguna input command SKIP, tidak ada penambahan zombie baru sama sekali di ujung kanan layar
- Ketika pengguna memasukkan command SKIP kedua kali, dst : Zombie yg tadinya sdh muncul akan bergerak maju sesuai dengan speednya masing-masing.
- Ketentuan zombie bergerak maju : Z (2 steps), Y (1 step)
  Jika pada layar terdapat zombie dengan posisi sbg berikut : YZ
  Maka, untuk seterusnya zombie ttp akan bergerak maju dalam keadaan seperti itu, karena Z tidak bisa melompati Y (Jika Z melompati Y, maka posisinya jadi berimpit)
