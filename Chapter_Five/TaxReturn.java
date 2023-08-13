package Chapter_Five;

import static Constants.Constant.*;

public class TaxReturn {
    private double income ;
    private double status ;
    public TaxReturn ( double income , double status ){
        this.income = income ;
        this.status = status ;
    }
    public double getTax (){
        double tax1 = ZERO ;
        double tax2 = ZERO ;
        if( status == SINGLE ){
            if( income <= RATE1_SINGLE_LIMIT ){
                tax1 = income * RATE1 ;
            }
            else{
                tax1 = RATE1 * RATE1_SINGLE_LIMIT ;
                tax2 = (income - RATE1_SINGLE_LIMIT) * RATE2 ;
            }
        }

        else if( status == DOUBLE ){
            if( income <= RATE1_DOUBLE_LIMIT ){
                tax1 = income * RATE2 ;
            }
            else{
                tax1 = RATE1 * RATE1_DOUBLE_LIMIT ;
                tax2 = (income - RATE1_DOUBLE_LIMIT) * RATE2 ;
            }
        }

        return tax1 + tax2 ;
    }
}
