package _02_smurf;

public class SmurfRunner {
public static void main(String[] args) {
	Smurf HandySmurf = new Smurf("Handy Smurf");
	System.out.println(HandySmurf.getName());
	HandySmurf.eat();
	Smurf PapaSmurf = new Smurf("Papa Smurf");
	System.out.println(PapaSmurf.getName()); 
	System.out.println(PapaSmurf.getHatColor());
	System.out.println(PapaSmurf.isGirlOrBoy());
	Smurf Smurfette = new Smurf("Smurfette");
	System.out.println(Smurfette.getName());
	System.out.println(Smurfette.getHatColor());
	System.out.println(Smurfette.isGirlOrBoy());
}
}
