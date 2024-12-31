// Done..
import java.util.Scanner;

public class Question1 {
    static String displayMonthFromNumber (int number){
        switch (number){
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Invalid Input";
        }
    }
    
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        
        int number = Sc.nextInt();
        System.out.println(displayMonthFromNumber(number));

        Sc.close();
    }
}