//mobil.java
package uts.pck1;
public class Mobil{
	//atribut
	private String merk;
	private String warna;
	private Ban jenisBan;
	private int jumlahBan;
	private double isiTangki;
	
	//konstruktor
	public Mobil(){
		merk = "Toyota Avanza";
		warna = "putih";
		jenisBan=new Ban();
		jumlahBan=4;
		isiTangki=45;
	}
	public Mobil(String merk, String warna, Ban jenisBan, int jumlahBan, double isiTangki){
		this.merk = merk;
		this.warna = warna;
		this.jenisBan= new Ban(jenisBan);
		this.jumlahBan=jumlahBan;
		this.isiTangki= isiTangki;
	}
	public Mobil(Mobil M){
		merk = M.merk;
		warna = M.warna;
		jenisBan=new Ban(M.jenisBan);
		jumlahBan =M.jumlahBan;
		isiTangki=M.isiTangki;
	}
	
	//setter
	public void setMerk(String merk){
		this.merk = merk;
	}
	public void setWarna(String warna){
		this.warna = warna;
	}
	public void setJenisBan(Ban jenisBan){
		this.jenisBan= jenisBan;
	}
	public void setJumlahBan(int jumlahBan){
		this.jumlahBan= jumlahBan;
	}
	public void setIsiTangki(double isiTangki){
		this.isiTangki= isiTangki;
	}
	//getter
	public String getMerk( ){
		return merk;
	}
	public String getWarna( ){
		return warna;
	}
	public Ban getJenisBan(){
		return jenisBan;
	}
	public int getJumlahBan(){
		return jumlahBan;
	}
	public double getIsiTangki( ){
		return isiTangki;
	}
	public String maju(double jarak){
		//15 km/liter
		if((jarak/15) <= isiTangki){
			isiTangki-=(double)jarak/15;
			return("\nMobil sudah menempuh jarak "+jarak+ " km, dan sisa isi tangki saat ini adalah "+isiTangki+" liter");
		}else
			return("\nBensin mobil anda tidak cukup untuk menempuh jarak "+jarak+" km, isi bensin anda terlebih dahulu");
	}
	public String toString(){
		return "Mobil "+merk+" warna "+warna+", jumlah ban "+jumlahBan+ " merk "+ jenisBan+", isi tangki "+isiTangki+" liter";
	}
	
	//method ini tidak boleh dihapus atau diubah
	public boolean equals(Object o){
		if (o instanceof Mobil){
			Mobil mbl = (Mobil) o;
			return (getMerk().equalsIgnoreCase(mbl.getMerk())&& getWarna().equalsIgnoreCase(mbl.getWarna())&&getJenisBan().equals(mbl.getJenisBan())&&getJumlahBan()==mbl.getJumlahBan() && getIsiTangki()==mbl.getIsiTangki() );
		}
		return false;
	}
}