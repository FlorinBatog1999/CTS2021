package ro.ase.cts.adapter.program;

import ro.ase.cts.adapter.clase.Adapter;
import ro.ase.cts.adapter.clase.AdapterBilet;
import ro.ase.cts.adapter.clase.Bilet;
import ro.ase.cts.adapter.clase.BiletOnline;

public class Main {
	public static void rezervaSiVindeBilet(BiletOnline biletOnline) {
		biletOnline.rezerva();
		biletOnline.vinde();
	}
	public static void rezervaSiVindeBiletCasa(Bilet bilet) {
		bilet.rezerva();
		bilet.vinde();
	}
	public static void main(String[] args) {
		Bilet bilet=new Bilet(17);
		BiletOnline biletOnline=new Adapter(18);
		rezervaSiVindeBilet(biletOnline);
		rezervaSiVindeBiletCasa(bilet);
		
		AdapterBilet adapterBilet=new AdapterBilet(bilet);
		rezervaSiVindeBilet(adapterBilet);
		
	}
}
