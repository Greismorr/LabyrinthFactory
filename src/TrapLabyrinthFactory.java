public class TrapLabyrinthFactory implements ILabyrinthFactory {
	public ILabyrinth createLabyrinth() {
		return new TrapLabyrinth();
	}
}
