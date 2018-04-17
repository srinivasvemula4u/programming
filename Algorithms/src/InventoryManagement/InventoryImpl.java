package InventoryManagement;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class InventoryImpl implements Inventory {
	
	private Map<String,Item> inventory;
	
	public InventoryImpl() {
		inventory = new TreeMap<>();
	}
	
	public void addNewItem(String name,double buyPrice,double sellPrice) {
		if(!inventory.containsKey(name)) {
			inventory.put(name,new Item(name, buyPrice, sellPrice));
		} else {
			System.out.println("Item already added to the inventory");
		}
	}
	
	public void buyItem (String name,int quantity) {
		if(inventory.containsKey(name)) {
			inventory.get(name).buy(quantity);
		} else {
			System.out.println(name +" can not be purchased");
		}
	}
	
	public void sellItem(String name,int quantity) {
		if(inventory.containsKey(name)) {
			inventory.get(name).sell(quantity);	
		}
	}
		
	public void removeItem(String name) {
		if(inventory.containsKey(name)) {
			inventory.remove(name);	
		}
	}
	
	public void report() {
		System.out.println("                          Inventory Report ......................");
		System.out.println("Item Name               " + "Buy At           "+ "Sell At" + " on Hand" + "  Value" );
		System.out.println("----------      " + "------------        "+ "--------" + " ------" + " --------" );
		Set<String> keySet = inventory.keySet();
		double totalValue = 0.0;
		double totalProfit = 0.0;
		for(String s : keySet) {
		  Item item = inventory.get(s);
		  System.out.println(item.getItemName()+"      "+item.getBuyPrice()  +"      " +item.getSellPrice() + "        "+ item.getQuantity() + "     " + item.getTotalValue());
		  totalValue += item.getTotalValue();
		  totalProfit += item.getProfit();
		  // Resetting the profit amount
		  item.UpdateProfit(item.getProfit());
		}
		System.out.println("-------------------------------");
		System.out.println("Total value of inventorty                                               "+ totalValue);
		System.out.println("Profit Since last report                                                "+  totalProfit);
	}
	
}
