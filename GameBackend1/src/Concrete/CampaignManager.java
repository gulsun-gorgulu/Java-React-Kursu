package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {
	@Override
	public void add(Campaign campaign) {
		System.out.println("The following campaign has beed added: " + campaign.getName() + "\nDiscount rate: " + campaign.getDiscountRate());
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("The campaign has been updated.");
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("The campaign has been deleted.");
	}
	
}
