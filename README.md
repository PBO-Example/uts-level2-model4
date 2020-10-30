# UTS Praktikum Level 1 dari 4 Level
Baca instruksi yang diberikan dengan baik.


## Kelas Diagram
![Image of UTS Level 1](http://api.puro.del.ac.id/v1/file/94ad1691c1afc2246c05c3fff740c4f7)
>Realisasikan kelas diagram di atas ke dalam bahasa pemrograman Java, lengkapi dengan konstruktor tanpa parameter, konstruktor dengan parameter, kopi konstruktor, serta setter dan getter. Gunakan template yang disediakan di 
**src\main\java\uts**.


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
![Image of output of toString()](http://api.puro.del.ac.id/v1/file/f8908808c5629e77ad88a2105f6edfd8)	
	
	> Perintah test: 
	
	
		> gradle test --tests TestMobil.testToString

**Catatan Penting:**
1. Anda hanya boleh mengubah kode program yang ada di src\main\java
1. **Semua kode program yang ada di src\test\java  tidak boleh diubah sama sekali!!** Jika anda ubah (akan terlihat pada history), maka nilai anda langsung 0.
1. Jangan memindah-mindahkan file, biarkan setiap file di folder di mana file tersebut berada sebelumnya.
1. Pada beberapa template program sudah disediakan method yang tidak boleh diubah. Maka jangan anda ubah!
