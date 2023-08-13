package Chapter_Five;

import java.util.Scanner;
import static Constants.Constant.*;
public class TaxCalculator {
    public static void main(String[] args) {
//        TaxReturn tax  = new TaxReturn();
        Scanner in = new Scanner(System.in);
        double income ;
        double status ;
        System.out.print("Please Enter your income: ");
        income = in.nextDouble();
        System.out.print("Are you SINGLE (Y/N) ");
        char input = in.next().charAt(0);
        if( input == 'Y' ){
            status = SINGLE ;
//            System.out.println(1);
        }
        else{
            status = DOUBLE ;
//            System.out.println(2);
        }
        TaxReturn tax  = new TaxReturn( income , status );
        System.out.println( "Tax: " + tax.getTax() );
    }
}
