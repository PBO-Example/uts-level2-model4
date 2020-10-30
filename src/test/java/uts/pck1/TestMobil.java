//TestLaptop.java
package uts.pck1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import java.util.stream.*;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestMobil {

	Mobil rum;
			
	static Stream<Arguments> rumArray1() {
    return Stream.of(
        Arguments.of("Toyota Avanza","putih","Good Year",4,45.0),
        Arguments.of("Mitsubishi Xpander","hitam","Interlube",4,50.0),
		Arguments.of("Hyundai Fuso","kuning","Goodyear",8,80.0)
    );}
	static Stream<Arguments> rumArray2() {
    return Stream.of(
        Arguments.of(new Mobil("Toyota Avanza","putih","Good Year",4,45.0)),
        Arguments.of(new Mobil("Mitsubishi Xpander","hitam","Interlube",4,50.0)),
		Arguments.of(new Mobil("Hyundai Fuso","kuning","Goodyear",8,80.0))
    );}
	
	static Stream<Arguments> rumArray3() {
    return Stream.of(
        Arguments.of("Toyota Avanza","putih","Good Year",4,45.0,new Mobil("Toyota Avanza","putih","Good Year",4,45.0)),
        Arguments.of("Mitsubishi Xpander","hitam","Interlube",4,50.0,new Mobil("Mitsubishi Xpander","hitam","Interlube",4,50.0)),
		Arguments.of("Hyundai Fuso","kuning","Goodyear",8,80.0,new Mobil("Hyundai Fuso","kuning","Goodyear",8,80.0))
    );}

	static Stream<Arguments> rumArray4() {
    return Stream.of(
        Arguments.of(new Mobil("Toyota Avanza","putih","Good Year",4,45.0),"Mobil Toyota Avanza warna putih, jumlah ban 4 merk Good Year, isi tangki 45.0 liter"),
        Arguments.of(new Mobil("Mitsubishi Xpander","hitam","Interlube",4,50.0),"Mitsubishi Xpander warna hitam, jumlah ban 4 merk Interlube, isi tangki 50.0 liter"),
		Arguments.of(new Mobil("Hyundai Fuso","kuning","Goodyear",8,80.0),"Hyundai Fuso warna kuning, jumlah ban 8 merk Goodyear, isi tangki 80.0 liter")
    );}
	
	static Stream<Arguments> rumArray5() {
    return Stream.of(
        Arguments.of(new Mobil("Toyota Avanza","putih","Good Year",4,45.0),30.0,"\nMobil sudah menempuh jarak 30.0 km, dan sisa isi tangki saat ini adalah 43.0 liter"),
        Arguments.of(new Mobil("Mitsubishi Xpander","hitam","Interlube",4,50.0), 3000.0,"Bensin mobil anda tidak cukup untuk menempuh jarak 3000.0 km, isi bensin anda terlebih dahulu"),
		Arguments.of(new Mobil("Hyundai Fuso","kuning","Goodyear",8,80.0),300.50,"\nMobil sudah menempuh jarak 300.5 km, dan sisa isi tangki saat ini adalah 59.96666666666667 liter")
    );}
	
	
	
	@Test
	public void testKonstruktorI()
	{ 
		 rum = new Mobil();
		 assertThat("Toyota Avanza", equalToIgnoringCase(rum.getMerk()));
		 assertThat("putih", equalToIgnoringCase(rum.getWarna()));
		 assertThat("Good Year", equalToIgnoringCase(rum.getJenisBan()));
		 assertEquals(4, rum.getJumlahBan()); 
		 assertEquals(45.0, rum.getIsiTangki()); 
	}
	@ParameterizedTest
	@MethodSource("rumArray1")
	public void testKonstruktorII(String merk, String w, String jban, int ban, double tangki) {
		rum = new Mobil(merk,w,jban,ban,tangki);
		assertThat(merk, equalToIgnoringCase(rum.getMerk()));
		 assertThat(w, equalToIgnoringCase(rum.getWarna()));
		 assertThat(jban, equalToIgnoringCase(rum.getJenisBan()));
		 assertEquals(ban, rum.getJumlahBan()); 
		 assertEquals(tangki, rum.getIsiTangki());  
	}
	

	@ParameterizedTest
	@MethodSource("rumArray2")
	public void testKopiKonstruktor(Mobil r) {
		rum = new Mobil(r);
		assertThat(r.getMerk(), equalToIgnoringCase(rum.getMerk()));
		 assertThat(r.getWarna(), equalToIgnoringCase(rum.getWarna()));
		 assertThat(r.getJenisBan(), equalToIgnoringCase(rum.getJenisBan()));
		 assertEquals(r.getJumlahBan(), rum.getJumlahBan()); 
		 assertEquals(r.getIsiTangki(), rum.getIsiTangki()); 
		 assertNotSame(r,rum, "should not point to same Object");
	}

	@ParameterizedTest
	@MethodSource("rumArray3")
	void testSetter(String merk, String w, String jban, int ban, double tangki,Mobil r) {
		rum = new Mobil();
		rum.setMerk(merk);
		rum.setWarna(w);
		rum.setJenisBan(jban);
		rum.setJumlahBan(ban);
		rum.setIsiTangki(tangki);
		assertEquals(r, rum); 
	}
	
	@ParameterizedTest
	@MethodSource("rumArray4")
	void testToString(Mobil r, String s) {
		assertThat(r.toString(), containsString(s));
	}
	
	@ParameterizedTest
	@MethodSource("rumArray5")
	void testMaju(Mobil lap, double j, String psn) {
		assertThat(lap.maju(j), containsString(psn));
	}
}