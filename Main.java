package oopÝntro;

public class Main {

	public static void main (String[] args) {
		Product product1= new Product( 1,"Levovo V14",16000,"32 GB Ram",10); //referans oluþturma, intance
		
		Product product2= new Product();
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setDetail("16 GB Ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Yiyecek");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Ýçecek ! ");
		
		System.out.println(category1.getId());
		System.out.println(category2.getName());
		
	}

}
 