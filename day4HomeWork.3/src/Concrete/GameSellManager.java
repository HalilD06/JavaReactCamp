package Concrete;

import Abstract.GameSellService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class GameSellManager implements GameSellService{

	@Override
	public void sale(Customer customer, Game game) {
		System.out.println(customer.getNickName() + " Named Gamer " + game.getGameName() + " purchased" + " Payment : " +game.getUnitPrice());
		
	}

	@Override
	public void campaignSale(Campaign campaign, Game game, Customer customer) {
		System.out.println(game.getGameName()+" Named Game" + " Purchased " + campaign.getUnitPriceAfterDiscountRate() + " by "+ customer.getNickName());
		
	}
	
	
}
