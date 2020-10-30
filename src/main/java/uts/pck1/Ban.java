//Ban.java
package uts.pck1;
public class Ban{
	//atribut
	private String merk;
	private int ukuran;
	
	//kontruktor
	public Ban(){
		merk = "Good Year";
		ukuran =185;
	}
	public Ban(String merk, int ukuran){
		this.merk = merk;
		this.ukuran =ukuran;
	}
	public Ban(Ban b){
		merk = b.merk;
		ukuran =b.ukuran;
	}
	
	//setter
	public void setMerk(String merk){
		this.merk = merk;
	}
	public void setUkuran(int ukuran){
		this.ukuran =ukuran;
	}
	//getter
	public String getMerk(){
		return merk;
	}
	public int getUkuran(){
		return ukuran;
	}
	public String toString(){
		return merk+ " ukuran "+ukuran;
	}
	
	//method ini tidak boleh dihapus atau diubah
	public boolean equals(Object o){
		if (o instanceof Ban){
			Ban b = (Ban) o;
			return (getMerk().equalsIgnoreCase(b.getMerk())&&getUkuran()==b.getUkuran());
		}
		return false;
	}
}