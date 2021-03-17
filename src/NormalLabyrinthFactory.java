public class NormalLabyrinthFactory implements ILabyrinthFactory {
	public ILabyrinth createLabyrinth() {
		return new NormalLabyrinth();
	}
}
