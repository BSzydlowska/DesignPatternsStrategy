
public class DzikaKaczka extends Kaczka{

	public DzikaKaczka() {
		latanieInterface = new LatamBoMamSkrzydla();
		kwakanieInterface = new Kwacz();
	}

	@Override
	public void wyswietl() {
		System.out.println("Jestem Dzika Kaczka!");
	}
	
}
