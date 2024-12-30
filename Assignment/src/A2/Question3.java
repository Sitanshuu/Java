package A2;
import java.util.*;

class Book{
	String bookTitle;
	double bookPrice;
	
	public Book (String bookTitle, double bookPrice){
		this.bookTitle = bookTitle;
		this.bookPrice = bookPrice;
	}
	
	public void setBook (String bookTitle, double bookPrice){
		this.bookTitle = bookTitle;
		this.bookPrice = bookPrice;		
	}
	
	public void getBook (){
		System.out.println();
		System.out.println();		
	}
}

public class Question3 {
	static Scanner Sc = new Scanner(System.in);
	
	public static void createBooks (int n, Book bookArr[]){
		for (int i=0; i<n; i++) {
			System.out.print("Enter title: ");
			String name = Sc.next();
			System.out.print("Enter price: ");
			double price = Sc.nextDouble();
			bookArr[i] = new Book(name, price);
		}	
	}
	
	public static void showBooks (Book bookArr[]){
		System.out.println(" --------------------------------------------------------");
		System.out.println("|          Book Title          |          Price          |");
		System.out.println(" --------------------------------------------------------");
		for (Book b: bookArr) {
			System.out.printf("|   %-25s  | %14s          |", b.bookTitle, b.bookPrice);
		}
	}
	
	public static void main (String[] args) {
		System.out.print("Enter n: ");
		int n = Sc.nextInt();
		Book bookArr[] = new Book[n];
		createBooks(n, bookArr);
		showBooks(bookArr);
	}
}