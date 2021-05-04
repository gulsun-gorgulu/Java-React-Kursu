
import Adapters.MernisServiceAdapter;
import Concrete.GamerCheckManager;
import Concrete.GamerManager;
import Concrete.SalesManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {
	public static void main(String[] args) {
		Game game = Game.getInstance();
		System.out.println(game.getDetail());
		
		Gamer gamer = new Gamer(1, 123, "firstName", "lastName", 2000, "12345678910");
		Campaign campaign1 = new Campaign(1, "Black Friday", 0.10);
		
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.register(gamer);
		
		SalesManager salesManager = new SalesManager();
		salesManager.sell(game, gamer, campaign1);
	
	}
}

