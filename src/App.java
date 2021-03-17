public class App {
    public static void main(String[] args) throws Exception {
    	//Use 1 for normal labyrinths or any other number to labyrinths with trap.
    	int opt = 0;
    	ILabyrinth labyrinth;
        ILabyrinthFactory factory;
        
        if(opt == 1) {
        	factory = new NormalLabyrinthFactory();
        	labyrinth = factory.createLabyrinth();
        }else {
        	factory = new TrapLabyrinthFactory();
        	labyrinth = factory.createLabyrinth();
        }
        
        labyrinth.drawLabyrinth();
    }
}
