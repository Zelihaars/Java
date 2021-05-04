package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer zeliha =new IndividualCustomer();
		zeliha.customerNumber="12345";
		
		CorporateCustomer hepsiburada=new CorporateCustomer();
		hepsiburada.customerNumber="654321";
		
		CustomerManager customerManager = new CustomerManager();
		
		Customer[] customers = {zeliha ,hepsiburada};
		
		customerManager.addMultiple(null);
		System.out.println("Zeliha Arslan");,
		
		
		
	}

}
