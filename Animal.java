package homework2;

public class Animal {
	private String ration;
	private String color;
	private double weight;

	public Animal(String ration, String color, double weight) {
		super();
		this.ration = ration;
		this.color = color;
		this.weight = weight;
	}

	public Animal() {
		super();
	}

	public String getRation() {
		return ration;
	}

	public void setRation(String ration) {
		this.ration = ration;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getVoice(String voice) {
		return voice + voice;
	}

	public void eat() {
		System.out.println("Eating " + ration);
	}

	public void sleep() {
		System.out.println("zzZZ zzZZ zzZZ");
	}

	@Override
	public String toString() {
		return "Animal [ration=" + ration + ", color=" + color + ", weight=" + weight + "]";
	}

}
