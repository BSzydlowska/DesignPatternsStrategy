
public class SymulatorKaczki {
	public static void main(String[] args) {
		Kaczka dzika = new DzikaKaczka();
		dzika.plywaj();
		dzika.wykonajLec();
		dzika.wykonajKwacz();
	
		Kaczka gumowaKaczka = new GumowaKaczka();
		gumowaKaczka.wykonajKwacz();
		gumowaKaczka.wykonajLec();
		gumowaKaczka.plywaj();
		
		gumowaKaczka.ustawLatanieInterface(new RzutKaczka());
		gumowaKaczka.wykonajLec();
		
		ModelKaczka modelKaczka = new ModelKaczka();
		modelKaczka.wyswietl();
		modelKaczka.wykonajKwacz();
		modelKaczka.wykonajLec();
		System.out.println("Zmiana");
		modelKaczka.ustawLatanieInterface(new LatamBoMamSkrzydla());
		modelKaczka.ustawKwakanieInterface(new Piszcz());
		modelKaczka.wykonajKwacz();
		modelKaczka.wykonajLec();
	}
}
