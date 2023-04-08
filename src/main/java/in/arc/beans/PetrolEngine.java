package in.arc.beans;

public class PetrolEngine implements Engine {

	public boolean start() {
		System.out.println("PetrolEngine.start().. Started..");
		return true;
	}

	public PetrolEngine() {
		System.out.println("PetrolEngine.PetrolEngine() :: 0param CONSRUCTOR");
	}

}
