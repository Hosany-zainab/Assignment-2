import java.util.Scanner;
/**
 * 
 */

/**
 * @author Hosany Zainab
 *
 */
public class LabInventory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key = new Scanner(System.in);
		
		String itemId;
		String name;
		String description;
		String category;
		String supplierContacts;
		double price;
		int availableQty;
		
		int numItem = 0;
		int size = 0;
		int menu = 0;
		String userPassword = null;
		final String PASSWORD = "DitProg123";
		int wrong = 0;
		int i = 0;
		int j = 0;
		int attempt = 0;
		
		int count = 0;


		
		
		System.out.println("Welcome to Electronics Lab Store.");
		
		System.out.println("Enter the maximum number of item the store can contain.");
		size = key.nextInt(); // storing number of item in size
		
		Item[]itemDatabase = new Item[size]; //creating an array to store itemDatabase
		
		while (true) {
			 
			for (count = 0; count >= 0; count++) {
				System.out.println("What do you want to do? ");
				System.out.println("Press 1 to enter a new item in the inventory(password required): ");
				System.out.println("Press 2 to change information of an existing item(password required): ");
				System.out.println("Press 3 to display all the items with the specified category: ");
				System.out.println("Press 4 to display all the items to be re-ordered: ");
				System.out.println("Press 5 to know the number of items currently in store: ");
				System.out.println("Press 6 to quit: ");
				System.out.println("Enter your menu: ");
				menu = key.nextInt();
				
				if (menu == 1) {
					
					for (attempt = 1; attempt <= 4; attempt++) {
						System.out.println("Enter your password: ");
						userPassword = key.next();
						 
						System.out.println("How many item do you want to enter?");
						numItem = key.nextInt();
						
						//if(numItem > size) {
							//System.out.println("You have " + (numItem - size) + " spaces remaining");
							
						
						if (userPassword.equals(PASSWORD)) {
							System.out.println("Enter the name of the items from the list and its features");
							for (i = 0; i < size; i++) {
						
							System.out.println("Enter item ID: ");
							itemId = key.next();
							
							System.out.println("Enter item name: ");
							name = key.next();
							
							System.out.println("Enter item description: ");
							description = key.next();
							
							System.out.println("Enter item category: ");
							category = key.next();
							
							System.out.println("Enter item supplier contacts: ");
							supplierContacts = key.next();
							
							System.out.println("Enter item price: ");
							price = key.nextDouble();
							
							System.out.println("Enter available quantity of item: ");
							availableQty = key.nextInt();
							
							itemDatabase[i] = new Item(itemId, name, description, category, supplierContacts, price, availableQty);
							System.out.println(itemDatabase[i]);
							itemDatabase[i].setItemId(itemId);
							itemDatabase[i].setName(name);
							itemDatabase[i].setDescription(description);
							itemDatabase[i].setCategory(category);
							itemDatabase[i].setSupplierContacts(supplierContacts);
							itemDatabase[i].setPrice(price);
							itemDatabase[i].setAvailableQty(availableQty);
							
						}
							
						System.out.println("itemId" + "Name" + "description" + "category" + "SupplierContacts" + "price" + "AvailableQty");
						for (j = 0; j < size; j++) {
							System.out.println(itemDatabase[j]);
							
						}
						break;
					}
					else if(!userPassword.equals(PASSWORD)) {
						System.out.println("You have enter incorrect password.Only "+(3-(count))+ "attempts are left" );
						if (count == 2) {
							continue;
						}
						else if (count == 3) {
							System.out.println("Program detected suspicious activity and is terminating!");
							break;
						}
					}
					}
				}
				else if (menu == 2) {

                for (attempt = 1; attempt <= 3; attempt++) {
					
					System.out.println("Enter your password: ");
					userPassword = key.next();
					if (userPassword.equals(PASSWORD)) {
						System.out.println("Enter the item you want to update: ");
						itemId = key.next();
						
						for (i= 0; i<size; i++) {
							String Id = itemDatabase[i].getItemId();
							if(itemId.equalsIgnoreCase(Id)) {

							System.out.println("Enter the item  you want to enter: ");
							System.out.println(itemDatabase[i]);
							
							System.out.println("Item's Id"+itemDatabase[i].getItemId());
							System.out.println("Item's Name: "+itemDatabase[i].getName());
							System.out.println("Item's description" +itemDatabase[i].getDescription() );
							System.out.println("Item's category"+itemDatabase[i].getCategory());
							System.out.println("Supplier's contact"+itemDatabase[i].getSupplierContacts());
							System.out.println("Item's price"+itemDatabase[i].getPrice());
							System.out.println("Availability of items"+itemDatabase[i].getAvailableQty());
							System.out.println("Here is your choice");
							
							break;
							
							}
							
							else {
								System.out.println("Item not found");
								
								break;
							}
							
						}
							}
						}
					}
					else if (!userPassword.equals(PASSWORD)) {
						System.out.println("You have entered incorrect password. Only "+(3-(attempt))+ "attempts are left"); 
						
					}
			
					else if (menu == 3) {
						System.out.println("Enter category for an Item"); 
						
							
					}
			
					else if (menu == 4) {
						System.out.println("We should re order the the products ");
						
						if (itemDatabase[0].getAvailableQty() < 1) {
							System.out.println("Item Id : " + itemDatabase[0].getItemId()+ "\nItem Name : " + itemDatabase[0].getName()+ "\nAvailable Quantity : " + itemDatabase[0].getAvailableQty());							
							System.out.println(" Item ran out of the stock. Please re-order. ");
							
						}
						else {
							System.out.println("Item Id : " + itemDatabase[0].getItemId() + "\nItem Name : " + itemDatabase[0].getName()+ "\nAvailable Quantity: " + itemDatabase[0].getAvailableQty());
							System.out.println("There are enough item in the stock.");
							
							}
						
						if (itemDatabase[1].getAvailableQty() < 10) {
							System.out.println("The item Id : " + itemDatabase[1].getItemId() + "\n Item Name : " + itemDatabase[1].getName() + "\nAvailableQuantity : " + itemDatabase[1].getAvailableQty());
							System.out.println("There is not enough stock in Inventory. Re- Order.");
							
							}
						
						else {
							System.out.println("Item Id : " + itemDatabase[1].getItemId() + "\nItem Name : " + itemDatabase[1].getName()+ "\nAvailable: " + itemDatabase[1].getAvailableQty());
							System.out.println("There are sufficient item in the stock.");
							
									
						}
							
						}
					else if(menu == 5) {
						System.out.println("Number of items created so far: ");
						Item.getTotalItem();
						
					}
					else if (menu == 6) {
						System.out.println("You are now exiting the program");
						
					}
					else {
						System.out.println("You have wrongly entered your menu.");
					}
				
				
		}
			key.close();
	}
	
}
}
	
					
					
					
		
				
					
				
			
		
	


	

		
		
		
		

	


