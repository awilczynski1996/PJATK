package zadanie1;

abstract public class Pacjent {
	protected String nazwisko;
	protected String choroba;
	protected String leczenie;
	
	public String nazwisko() {
		return this.nazwisko;
	}
	
	public String choroba() {
		return this.choroba;
	}
	
	public String leczenie() {
		return this.leczenie;
	}
}
