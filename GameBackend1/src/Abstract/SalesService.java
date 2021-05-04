package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface SalesService {
	void sell(Game game, Gamer gamer, Campaign campaign);
}

