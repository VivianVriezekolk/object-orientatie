public class Groep {
	private int aantal;
	private Student[] studenten;
	private int size;
	private int index;

	public Groep() {

	}

	public Groep(int aantal) {
		index = 0;
		size = 0;
		this.aantal = aantal;
		studenten = new Student[aantal]; // dit weet ik niet zeker hoor, waar we
											// dit object aan moeten maken..

	}

	public boolean voegToe(Student s) {
		if (size == aantal) {
			return false;
		} else {
			studenten[size] = s;
			size += 1;
			return true;
		}
	}

	public Student getStudent(int i) {
		//size = studenten.length;
		if (size < i) {
			return null;
		} else {
			return studenten[i];
		}

	}

	public String toString() {
		if (index == size) {
			return " ";
		} else {
			index += 1;
			return studenten[index - 1] + "\n" + toString();
		}

		// for(int i = 0; i < studenten.length; i++)
		// }
	}
}
