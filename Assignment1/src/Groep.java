public class Groep {
	private int aantal;

	public Groep() {

	}

	public Groep(int aantal) {
		this.aantal = aantal;
		Student [] studenten = new Student [aantal]; // dit weet ik niet zeker hoor, waar we dit object aan moeten maken..

	}
	
	public boolean voegToe(Student s){
		return true;
	}

}
