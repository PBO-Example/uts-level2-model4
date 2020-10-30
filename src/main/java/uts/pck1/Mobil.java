//mobil.java
package uts.pck1;
public class Mobil{
	//atribut
	/*deklarasikan atribut di sini*/
	
	
	//konstruktor
	//konstruktor
	/*tulis konstruktor tanpa parameter di sini*/
	
	
	/*tulis konstruktor dengan  parameter di sini*/
	
	
	/*tulis kopi konstruktor di sini*/
	
	//setter
	/*tulis semua setter di sini*/
	
	
	
	
	//getter
	/*tulis semua getter di sini*/
	
	
	
	/*tulis method maju() di sini*/
	/*Method maju() akan mengembalikan sebuah string, baca file Readme.md*/
	
	
	
	
	/*tulis method toString() di sini*/
	/*Method toString() akan mengembalikan sebuah string, baca file Readme.md*/
	
	


	
	//method ini tidak boleh dihapus atau diubah
	public boolean equals(Object o){
		if (o instanceof Mobil){
			Mobil mbl = (Mobil) o;
			return (getMerk().equalsIgnoreCase(mbl.getMerk())&& getWarna().equalsIgnoreCase(mbl.getWarna())&&getJenisBan().equals(mbl.getJenisBan())&&getJumlahBan()==mbl.getJumlahBan() && getIsiTangki()==mbl.getIsiTangki() );
		}
		return false;
	}
}