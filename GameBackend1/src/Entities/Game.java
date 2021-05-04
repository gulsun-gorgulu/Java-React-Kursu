package Entities;

public class Game {
	final int id = 1;
	final String name = "Big Hero 6";
	final String detail = "6 super heros try to save the world by coding.";
	final double price = 50;
	final String type = "MMORPG";
	
	private static Game game;
	
	private Game() {
		
	}
	
	public static Game getInstance() {
		
		if(game == null)
			game = new Game();
		
		return game;
	}
	
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDetail() {
		return detail;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getType() {
		return type;
	}
	
}

