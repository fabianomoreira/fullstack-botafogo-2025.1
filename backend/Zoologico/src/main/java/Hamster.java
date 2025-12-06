
public class Hamster extends Animal implements Pet{

	@Override
	public void serAmigavel() {
		System.out.println("animal está sendo amigável");
	}

	@Override
	public void brincar() {
		System.out.println("brincando...");		
	}

}
