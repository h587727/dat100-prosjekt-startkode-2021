package no.hvl.dat100.prosjekt.modell;

import java.util.Random;


import no.hvl.dat100.prosjekt.TODO;

public class KortUtils {

	/**
	 * Sorterer en samling. Rekkefølgen er bestemt av compareTo() i Kort-klassen.
	 * 
	 * @see Kort
	 * 
	 * @param samling
	 * 			samling av kort som skal sorteres. 
	 */
	
	public static void sorter(KortSamling samling) {
		
		Kort[] sortering = samling.getAllekort();
		
	
	
	for (int kortNr=1; kortNr < samling.getAntalKort(); kortNr++) {
		int svar = sortering[kortNr].compareTo(sortering[kortNr-1]);
		
		if (svar < 0) {
			Kort temp = sortering[kortNr];
			sortering[kortNr]=sortering[kortNr-1];
			sortering[kortNr-1] = temp;
			kortNr = 1;
			
		}
	}
	
	for(int i = 0; i < sortering.length; i++) {
		System.out.println(sortering[i]);	
	
	// fjerner alle og legger til den nye kortstokken
	}
	samling.fjernAlle();
	for(Kort kort : sortering) {
		samling.leggTil(kort);
		
		}			

	}
	
	/**
	 * Stokkar en kortsamling. 
	 * 
	 * @param samling
	 * 			samling av kort som skal stokkes. 
	 */
	public static void stokk(KortSamling samling) {
		
		
		Kort[] Ustokket = samling.getAllekort();
		samling.fjernAlle();
		Random rand = new Random();
		
		
		for (int i = 0; i < Ustokket.length; i++) {
			int randomIndex = rand.nextInt(Ustokket.length);
			Kort temp = Ustokket[randomIndex];
			Ustokket[randomIndex] = Ustokket[i];
			Ustokket[i] = temp;
			
		}
		
		for (Kort kort : Ustokket) {
			samling.leggTil(kort);
		}
	}
	
}
