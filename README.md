# Selamat!!! Anda sekarang sudah di UTS Praktikum Level 2 dari 4 Level
Baca instruksi yang diberikan dengan baik.


## Kelas Diagram
![Image of UTS Level 2](http://api.puro.del.ac.id/v1/file/787fb11bc022145d0ad58c24efbf55ab)
>Realisasikan kelas Mobil dan kelas Ban yang ada pada kelas diagram di atas ke dalam bahasa pemrograman Java. Untuk masing-masing kelas lengkapi dengan konstruktor tanpa parameter, konstruktor dengan parameter, kopi konstruktor, serta setter dan getter. Gunakan template yang disediakan di 
**src\main\java\uts**.

>**Anda boleh menggunakan (menyalin) kode program yang sudah anda hasilkan dari level 1**

>**Perhatikan bahwa, pada level 2 ini, tipe atribut jenisBan adalah Ban.**

>**Untuk mendapatkan nilai sempurna pada level ini, konsentrasi menyesuaikan kode program kelas LiftPenumpang.java yang anda kerjakan pada level 1 sehingga semua konstruktor dan method dapat menerima atribut jenisBan yang bertipe Ban (bukan String).**

>**Perhatikan bahwa keluaran method toString() dari kelas Mobil perlu diupdate. Silahkan cek gambar yang ada pada rubrik penilaian no. 6**



## Rubrik Penilaian 
1. **[Poin 15]** program dilengkapi dengan konstruktor tanpa parameter yang set data dengan nilai default sebagai berikut:
merk mobil Toyota Avanza, warna putih, jenis bannya Good Year, jumlah ban 4, dan isi tangki bisa menampung sampai 45 liter.
	
	> Perintah test: 
	
	
		>gradle test --tests TestMobil.testKonstruktorI

2. **[Poin 15]** program dilengkapi dengan konstruktor dengan parameter 

	
	> Perintah test: 
	
	
		>gradle test --tests TestMobil.testKonstruktorII

3. **[Poin 15]** program dilengkapi dengan kopi konstruktor
	
	
	> Perintah test: 
	
	
		> gradle test --tests TestMobil.testKopiKonstruktor

4. **[Poin 20]** Program dilengkapi dengan sekumpulan setter dan getter	
	
	> Perintah test: 
	
	
		> gradle test --tests TestMobil.testSetter

5. **[Poin 20]** Program dilengkapi dengan method maju(). 
1 liter hanya dapat digunakan untuk menempuh 15 km. Semua nilai yang dilempar saat memanggil method maju() satuannya km.
Method ini akan mengembalikan sebuah pesan.
> Misalnya data sebuah mobil  r kondisi 45 liter dan method maju() dipanggil dengan r.maju(30.0) maka pesan yang dihasilkan adalah: Mobil sudah menempuh jarak 30.0 km, dan sisa isi tangki saat ini adalah 43.0 liter

> Misalnya data sebuah mobil  r kondisi 45 liter dan method maju() dipanggil dengan r.maju(3000.0) maka pesan yang dihasilkan adalah: Bensin mobil anda tidak cukup untuk menempuh jarak 3000.0 km, isi bensin anda terlebih dahulu

	
	> Perintah test: 
	
	
		> gradle test --tests TestMobil.testMaju

6. **[Poin 15]** program dilengkapi dengan method toString() yang akan menampilkan data di dalam objek Rumah. Perhatikan contoh keluaran yang diberikan.
![Image of output of toString()](http://api.puro.del.ac.id/v1/file/302f1b9d63c74359f8ffa7457a1585e5)	
	
	> Perintah test: 
	
	
		> gradle test --tests TestMobil.testToString

**Catatan Penting:**
1. Anda hanya boleh mengubah kode program yang ada di src\main\java
1. **Semua kode program yang ada di src\test\java  tidak boleh diubah sama sekali!!** Jika anda ubah (akan terlihat pada history), maka nilai anda langsung 0.
1. Jangan memindah-mindahkan file, biarkan setiap file di folder di mana file tersebut berada sebelumnya.
1. Pada beberapa template program sudah disediakan method yang tidak boleh diubah. Maka jangan anda ubah!
