package Concrete;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService {
	private GamerCheckService checkService;

	public GamerManager(GamerCheckService checkService) {
		this.checkService = checkService;
	}

	@Override
	public void register(Gamer gamer) {

		if (checkService.checkIfRealPerson(gamer))
			System.out.println("The gamer has been registered to the system.");
		else
			System.out.println("Not a valid person!");

	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("The gamer's informations has been updated.");
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("The gamer has been deleted from the system.");
	}

}
