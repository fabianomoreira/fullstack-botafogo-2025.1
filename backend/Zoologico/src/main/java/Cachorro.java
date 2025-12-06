
public class Cachorro extends Animal implements Pet{
	public void correr() {
		System.out.println("correndo...");
	}

	@Override
	public void serAmigavel() {
		System.out.println("está sendo amigável como um cachorro");
	}

	@Override
	public void brincar() {
		// TODO Auto-generated method stub
		
	}
}
