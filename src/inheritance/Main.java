package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer mumine = new IndividualCustomer();
		mumine.customerNumber ="12345";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber ="Hepsi Burada";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber="99999";
		
		CustomerManager customerManager = new CustomerManager();
		
		Customer[] customers = {mumine,abc,hepsiBurada};
		
		customerManager.addMultiple(customers);
   }

}
