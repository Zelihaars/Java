package day4homework2;

public class Day4HomeWork2 {

    public static void main(String[] args) {
       newMember newmember = new newMember ("Zeliha","Arslan","12345","7 Nisan");
          Campaign campaign = new Campaign(1,"Yeni Üye Kampanyası");
          Sales sales = new Sales (1,"Tank",250);
           
          newMemberManager newmembermanager = new newMemberManager();
          campaignManager campaignmanager = new campaignManager();
          salesManager salesmanager = new salesManager();
    }
    
}
