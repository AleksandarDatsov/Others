
public class Demo {
	public static void main(String[] args) {
		Buddhism shiva = new Buddhism();
		shiva.setName("shiva");
		shiva.prey();
		Christian petko = new Christian();
		petko.setName("Petko");
		
		
		petko.prey();
		new Muslim("Ahmed").prey();
		
		Muslim saniha = new Muslim("Saniha");
		saniha.prey();
	}
}

