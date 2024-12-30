// Done..

package A2;
import java.util.Scanner;


public class Question1 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int n = Sc.nextInt();
		
		for (int i=0; i<=n; i++) {
			if (i%2 == 0) {
				System.out.println(i);
			}
		}
		
		Sc.close();
	}
}