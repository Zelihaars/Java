package dayfourtask2;

public class campaignManager {
    public void add(Campaign campaign){
        System.out.println(campaign.getCampaignId()+ " kampanyası eklendi");
    }
    
    public void delete(Campaign campaign){
         System.out.println(campaign.getCampaignName() + " kampanyası silindi");

    }
    
    public void update(Campaign campaign){
          System.out.println(campaign.getCampaignName()+ " kampanyası güncellendi");

    }
}
