package ShoppingApplication;
import java.util.*;

class Medicine{
//	String name;
//	double price;
//	int quantity;
//	String description;
	ArrayList<Object> med = new ArrayList<Object>();
	
	public Medicine (String name, double price, int quantity, String description){
//		this.name = name;
//		this.price = price;
//		this.quantity = quantity;
//		this.description = description;
		
		med.add(name);
		med.add(price);
		med.add(quantity);
		med.add(description);
	}
	
	public ArrayList<Object> getList (){
		return med;
	}
}

public class BrowseMedicine{
	static HashMap<Integer, ArrayList<Object>> medList = new HashMap<Integer, ArrayList<Object>>();
	static ArrayList<Object> userCart = new ArrayList<Object>();
	
	Medicine m1 = new Medicine("Paracetamol", 5.00, 100, "For fever and pain relief.");
	Medicine m2 = new Medicine("Amoxicillin", 10.00, 50, "Antibiotic for infections.");
	Medicine m3 = new Medicine("Loratadine", 7.50, 75, "Antihistamine for allergies.");
	Medicine m4 = new Medicine("Lisinopril", 20.00, 50, "Enzyme inhibitors used to treat hypertension.");
	Medicine m5 = new Medicine("Atorvastatin", 12.00, 30, "Medicine used to prevent heart attack.");
	Medicine m6 = new Medicine("Centrizine", 30.00, 120, "Antihistamine used to treat allergic rhinitis.");
	
	public BrowseMedicine (){
		medList.put(1, m1.getList());
		medList.put(2, m2.getList());
		medList.put(3, m3.getList());
		medList.put(4, m4.getList());
		medList.put(5, m5.getList());
		medList.put(6, m6.getList());
	}
	
	public HashMap<Integer, ArrayList<Object>> getMedList (){
		System.out.println("\n===== Available Medicines =====");
		System.out.println("");
		System.out.println(" --------------------------------------------------------------------------------------------------------");
		System.out.printf("|  %s  |         %s         |%s|%s |      %s", "ID", "Name", "Price ($)", "Quantity", "Description                                     |\n");
		System.out.println(" --------------------------------------------------------------------------------------------------------");
		
        for (Map.Entry<Integer, ArrayList<Object>> e : medList.entrySet()){
            System.out.printf("| %d    | %-20s | %-7.2f | %-7d | %-20s", e.getKey(), e.getValue().get(0), e.getValue().get(1), e.getValue().get(2), e.getValue().get(3));
            System.out.println();
        }
		return medList;
	}
	
	public void addToCart (){
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter the ID of medicine to add to cart (0 to exit): ");
		int idOfMedicine = Sc.nextInt();
		if (idOfMedicine > 6 && idOfMedicine < 0) {
			System.out.println("Please enter valid Id..");
			System.exit(0);
		}
		else{
			// Final medicine add to user's cart			
			ArrayList<Object> choiceMedicine = medList.get(idOfMedicine);
		}
	}
}