package homework2;

public class Veterenerian {
	private String name;

	public Veterenerian(String name) {
		super();
		this.name = name;
	}

	public Veterenerian() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected void cure(Animal animal) {
		System.out.println("Doctor " + name + " will cure " + animal);
	}

	@Override
	public String toString() {
		return "Veterenerian [name=" + name + "]";
	}

}
