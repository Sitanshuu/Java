package ShoppingApplication;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


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

public class BrowseMedicine {
	static HashMap<Integer, ArrayList<Object>> medList = new HashMap<Integer, ArrayList<Object>>();
	
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
		System.out.println(medList);
		
		System.out.println("===== Available Medicines =====");
		System.out.println("ID | Name      | Price ($) | Quantity |	Description");
		System.out.println("---------------------------------------------------------------------");
		for (int i=1; i<=6; i++) {
			medList.get(i);
		}
		
		
		
		return medList;
	}
}