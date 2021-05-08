package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " Named Game Added");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + " Named Game Deleted !!!");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() + " Named Game Update");
		
	}
	
}
