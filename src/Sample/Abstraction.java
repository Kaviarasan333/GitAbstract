package Sample;

public class Abstraction extends Company

{

	@Override
	public void compName() {
System.out.println("Lycatech");
	}
	public static void main(String[] args) {
		Abstraction ab=new Abstraction();
		ab.compLoc();
		ab.compName();
	}

}
