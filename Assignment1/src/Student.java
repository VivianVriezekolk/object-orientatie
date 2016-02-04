public class Student {
	private String voor;
	private String achter;
	private int studentNummer;

	public Student(String voor, String achter, int studentNummer) {
		this.setNaam(voor, achter);
		this.studentNummer = studentNummer;
	}
	
	public void setNaam(String voor, String achter){
		this.voor = voor;
		this.achter = achter;
	}
	
	public String toString(){
		return voor + " " + achter;
		
	}

}
