import Adapters.MerniceServiceAdapter;
import Concrete.CampaignManager;
import Concrete.CustomerManager;
import Concrete.GameManager;
import Concrete.GameSellManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer(5,"Halil "," Dönmez", "12345678910" , 1995 , "Bilader ");
		
		CustomerManager customerManager = new CustomerManager(new MerniceServiceAdapter());
		customerManager.add(customer1);
		customerManager.delete(customer1);
		customerManager.update(customer1);
		
		System.out.println("======================================");
		
		Game game1 = new Game(8, "Call Of Duty Modern Warfare 1 ", 500);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.delete(game1);
		gameManager.update(game1);
		
		
		System.out.println("======================================");
		
		Campaign campaign1 = new Campaign(1, "Black Sunday ", 30, game1.getUnitPrice());
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.delete(campaign1);
		campaignManager.update(campaign1);
		
		
		System.out.println("======================================");
		
		
		GameSellManager gameSellManager = new GameSellManager();
		System.out.println("////////////CAMPAIGN\\\\\\\\\\\\\"");
		gameSellManager.campaignSale(campaign1, game1, customer1);
		
		System.out.println("////////////WITHOUT CAMPAIGN\\\\\\\\\\\\\"");
		gameSellManager.sale(customer1, game1);
		
		
	
	}

}
