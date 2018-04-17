package InventoryManagement;
public class InventoryFactory {
   static Inventory obj;
   private InventoryFactory() {	
   }
   public static Inventory getInventory() {
	   if(obj == null){
				 obj = new InventoryImpl();
	   }
	   return obj;
   }
}
