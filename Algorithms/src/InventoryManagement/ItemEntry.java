package InventoryManagement;
public abstract class ItemEntry {
     protected String itemName;
     protected double buyPrice;
 	 protected double sellPrice;
 	 
     public double getBuyPrice() {
		return buyPrice;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

     public String getItemName() {
		return itemName;
	}
	public double getSellPrice() {
		return sellPrice;
	}
	
	 abstract void buy(int quantity);
     abstract void sell(int quantity);
     //abstract void remove(String item);
}
