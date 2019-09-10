/**
 * 
 */

/**
 * @author user
 *
 */
public class Item {
	
	private static int totalItem = 0;
	
	
	/*attributes*/
	private String itemId;
	private String name;
	private String description;
	private String category;
	private String supplierContacts;
	private double price;
	private int availableQty;
	
	/**
	 * default constructor with values initialized to default
	 */
	public Item() {
		this.itemId = null;
		this.name = null;
		this.description = null;
		this.category = null;
		this.supplierContacts = null;
		this.price = 0.0;
		this.availableQty = 0;
		
		settotalItem(getTotalItem() +1);    // increment the count to track number of object created
	}
	
	/**
	 * 7 overloaded constructors
	 * @param itemId
	 * @param name
	 * @param description
	 * @param category
	 * @param supplierContacts
	 * @param price
	 * @param availableQty
	 */
	public Item(String itemId, String name, String description, String category, String supplierContacts, double price, int availableQty) {
		this.itemId = itemId;
		this.name = name;
		this.description = description;
		this.category = category;
		this.supplierContacts = supplierContacts;
		this.price = price;
		this.availableQty = availableQty;
	}
	
	
	

	/**
	 * @return the counter
	 */
	
	public static int getTotalItem(){
		return totalItem;
	}
	/**
	 * 
	 * @param totalItem
	 */
	public static void settotalItem(int totalItem) {
		Item.totalItem = totalItem;
	}

	/**
	 * @return the itemId 
	 */
	public String getItemId() {
		return itemId;
	}

	/**
	 * @param itemId the itemId to set
	 */
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the supplierContacts
	 */
	public String getSupplierContacts() {
		return supplierContacts;
	}

	/**
	 * @param supplierContacts the supplierContacts to set
	 */
	public void setSupplierContacts(String supplierContacts) {
		this.supplierContacts = supplierContacts;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the availableQty
	 */
	public int getAvailableQty() {
		return availableQty;
	}

	/**
	 * @param availableQty the availableQty to set
	 */
	public void setAvailableQty(int availableQty) {
		this.availableQty = availableQty;
	}
	
	public boolean equals(Item i) {
		if (this.itemId.equalsIgnoreCase(i.itemId)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", name=" + name + ", description=" + description + ", category=" + category
				+ ", supplierContacts=" + supplierContacts + ", price=" + price + ", availableQty=" + availableQty
				+ "]";
	}
	
	
	
	
	
	
	
	
	 

}
