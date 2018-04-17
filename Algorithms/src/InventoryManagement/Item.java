package InventoryManagement;
public class Item extends ItemEntry {
    private int quantity;
	private double profit;
	private double totalValue;
	
    public Item(String name,double buyPrice,double sellPrice) {
    	this.itemName = name;
    	this.buyPrice = buyPrice;
    	this.sellPrice = sellPrice;
    	this.quantity = 0;
    	this.profit = 0.0;
    }
    public int getQuantity() {
		return quantity;
	}
	public double getProfit() {
		return profit;
	}
	public double getTotalValue() {
		return (quantity*buyPrice);
	}
	public void UpdateProfit(double profit) {
		this.profit -= profit;
	}
	@Override
	void buy(int quantity) {
		this.quantity += quantity;	
	}

	@Override
	void sell(int quantity) {
		// TODO Auto-generated method stub
		if(quantity < this.quantity) {
		this.quantity -= quantity;
		profit += (quantity)*(this.sellPrice-this.buyPrice);  
		}
		else 
		System.out.println("Entered"+ quantity + "is larger than available stock");
	}

}
