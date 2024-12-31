//Done..
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int number = Sc.nextInt();

        if (number % 2 == 0){
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }

        Sc.close();
    }
}