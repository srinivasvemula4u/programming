package InventoryManagement;
public interface Inventory {
	public abstract void addNewItem(String name,double buyPrice,double sellPrice);
	public abstract void buyItem (String name,int quantity);
	public abstract void sellItem(String name,int quantity);
	public abstract void removeItem(String name);
	public abstract void report();
}
