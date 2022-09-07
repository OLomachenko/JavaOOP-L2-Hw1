package homework2;

public class HW2Basic {

	public static void main(String[] args) {
		Cat murka = new Cat("Murka");
		Dog baron = new Dog("Baron");
		
		murka.setRation("Proplan");
		murka.setColor("White");
		murka.setWeight(2.3);
		
		baron.setRation("Pedigree");
		baron.setColor("Brown");
		baron.setWeight(18.5);
		
		murka.eat(); 
		System.out.println(murka.getVoice("Mew"));
		murka.sleep();
		
		baron.eat();
		System.out.println(baron.getVoice("Whof"));
		baron.sleep();

		Veterenerian doctor = new Veterenerian("AiBolit");
		
		doctor.cure(baron);
		doctor.cure(murka);
	}

}
