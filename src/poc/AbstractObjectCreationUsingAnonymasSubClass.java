package poc;

abstract class Aj{
	
	public void print() {
		System.out.println("abstract Aj");
	}
}



public class AbstractObjectCreationUsingAnonymasSubClass {

	public static void main(String[] args) {
		Aj a=new Aj() {};
		a.print();
		
	}

}
