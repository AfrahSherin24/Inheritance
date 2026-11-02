//4.An online shopping application has a parent class Product with attributes 
//productId and price. Three subclasses, Electronics, Clothing, and Books, 
//inherit from Product and display their respective product categories.
//
//Implement hierarchical inheritance and display the details of all three product types.


package FirstProgram;

class Product1{
	int productId;
	int price;
	
	void display() {
		System.out.println(productId);
		System.out.println(price);
		
	}
}

class Electronics extends Product1{
	String name;
	void displayElectronics() {
		System.out.println(name);
	}
}

class Clothing extends Product1{
	String name;
	void displayClothing() {
		System.out.println(name);
	}
}

class books extends Product1{
	String name;
	void displaybooks() {
		System.out.println(name);
	}
	
}

public class ShoppingApplication {

	public static void main(String[] args) {
		
		Electronics obj1 = new Electronics();
		obj1.productId = 101;
		obj1.price = 2500;
		obj1.name ="airpods";
		obj1.display();
		obj1.displayElectronics();
		
		Clothing obj2 = new Clothing();
		obj2.productId = 102;
		obj2.price = 500;
		obj2.name ="shorts";
		obj2.display();
		obj2.displayClothing();
		
		books obj3 = new books();
		obj3.productId = 103;
		obj3.price = 900;
		obj3.name ="harry potter";
		obj3.display();
		obj3.displaybooks();
		
	}

}
