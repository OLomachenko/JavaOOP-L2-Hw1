package homework2;

public class Cat extends Animal {
	private String name;

	public Cat(String name) {
		super();
		this.name = name;
	}

	public Cat() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVoice(String voice) {
		return name + " says " + voice + " " + voice;
	}

	public void eat() {
		System.out.println(name + " likes to eat: " + super.getRation());
	}

	public void sleep() {
		System.out.println(name + " goes to sleep, mew");
	}

	@Override
	public String toString() {
		return name + ": Weight - " + super.getWeight() + ", Color - " + super.getColor();
	}
	
	

}
