// Done..
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        double percentage = Sc.nextDouble();
        
        if (percentage >= 60){
            System.out.println("Grade A");
        }
        else if (percentage >= 45 && percentage < 60){
            System.out.println("Grade B");
        }
        else if (percentage >= 35 && percentage < 45){
            System.out.println("Grade C");
        }
        else if (percentage < 35){
            System.out.println("Fail");
        }
        else{
            System.out.println("Invalid Percentage!");
        }

        Sc.close();
    }
}
