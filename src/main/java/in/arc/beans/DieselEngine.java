package in.arc.beans;

public class DieselEngine implements Engine {

	public boolean start() {
		System.out.println("DieselEngine.start().. Started..");
		return true;
	}
	public DieselEngine() {
		System.out.println("DieselEngine.DieselEngine() :: 0param CONSRUCTOR");
	}

}
