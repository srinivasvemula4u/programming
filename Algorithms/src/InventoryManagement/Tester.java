package InventoryManagement;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) throws IOException {
        Inventory inventory = InventoryFactory.getInventory();
        System.out.println("please enter input");
        /* FileReader in = new FileReader("C:/test.txt");
		    BufferedReader br = new BufferedReader(in);
		    String line;
		    while ((line = br.readLine()) != null) {
		        System.out.println(line);
		    }*/
        Scanner scan = new Scanner(System.in);
        while (true) {
            String str = scan.nextLine();
            String[] itemDetails = str.split(" ");
            if ("new".equals(itemDetails[0])) {
                createItem(inventory, itemDetails);
            } else if ("buy".equals(itemDetails[0])) {
                buyItem(inventory, itemDetails);
            } else if ("sell".equals(itemDetails[0])) {
                sellItem(inventory, itemDetails);
            } else if ("delete".equals(itemDetails[0])) {
                deleteItem(inventory, itemDetails);
            } else if ("report".equals(itemDetails[0])) {
                generateReport(inventory);
            } else if ("*".equals(itemDetails[0])) {
                break;
            }
        }
    }

    private static void createItem(Inventory inventory, String[] itemDetails) {
        inventory.addNewItem(itemDetails[1], Double.parseDouble(itemDetails[2]), Double.parseDouble(itemDetails[3]));

    }

    private static void buyItem(Inventory inventory, String[] itemDetails) {
        inventory.buyItem(itemDetails[1], Integer.parseInt(itemDetails[2]));
    }

    private static void sellItem(Inventory inventory, String[] itemDetails) {
        inventory.sellItem(itemDetails[1], Integer.parseInt(itemDetails[2]));
    }

    private static void deleteItem(Inventory inventory, String[] itemDetails) {
        inventory.removeItem(itemDetails[1]);
    }

    private static void generateReport(Inventory inventory) {
        inventory.report();
    }

}
