package oop1;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Vade oranı";

		Product product1 = new Product();
		// set value:değer atıyoruz
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(0);
		product1.setUnitInStock(0);
		product1.setImageUrl(mesaj);

		Product product2 = new Product();
		// set value:değer atıyoruz
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(0);
		product2.setUnitInStock(0);
		product2.setImageUrl(mesaj);

		Product product3 = new Product();
		// set value:değer atıyoruz
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(0);
		product3.setUnitInStock(0);
		product3.setImageUrl(mesaj);

		// get: var olanı okutuyoruz

		Product[] products = { product1, product2, product3, };

		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>");

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("131535131");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Gulnaz");
		individualCustomer.setLastName("Inan");

		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Stay");
		corporateCustomer.setCustomerNumber("13155");
		corporateCustomer.setPhone("135131");
		corporateCustomer.setTaxNumber("13135212");
		
		Customer[] customers = {individualCustomer, corporateCustomer};

	}

}
