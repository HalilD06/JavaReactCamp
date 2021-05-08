package Abstract;

import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public interface GameSellService {
	
	void sale (Customer customer , Game game);
	void campaignSale (Campaign campaign , Game game , Customer customer);
	
}
