
public class Fish implements Prey, predator{

	@Override
	public void hunt() {
		System.out.println("Huntin' smaller fishes");
	}

	@Override
	public void flee() {
		System.out.println("fleein' from larger ones!..");
	}

	

}
