
public abstract class Kaczka {
	LatanieInterface latanieInterface;
	KwakanieInterface kwakanieInterface;
	
	public Kaczka() {
	}
	
	public abstract void wyswietl();
	
	public void wykonajLec(){
		latanieInterface.lec();
	}
	
	public void wykonajKwacz(){
		kwakanieInterface.kwacz();
	}
	
	public void plywaj(){
		System.out.println("Wszystkie plywaja!");
	}
	
	public void ustawLatanieInterface (LatanieInterface li){
		latanieInterface = li;
	}
	
	public void ustawKwakanieInterface (KwakanieInterface ki){
		kwakanieInterface = ki;
	}

}
