package Concrete;

import Abstract.SalesService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SalesManager implements SalesService{
	@Override
	public void sell(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(game.getName() + " has been sold to gamer: " + gamer.getFirstName() + " " + gamer.getLastName() +
				"\nPrice: " + game.getPrice() + "\nDiscounted price: " + (game.getPrice() - (game.getPrice() * campaign.getDiscountRate())));
	}

}
