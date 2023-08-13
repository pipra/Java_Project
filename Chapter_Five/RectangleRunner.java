package Chapter_Five;

public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle( "Habib" , 20 );
        Rectangle rec3 = rec1 ;
        Rectangle rec2 = new Rectangle( "Habib" , 20 );

        if ( rec1 == rec2 ){
            System.out.println("Match");
        }
        else{
            System.out.println("No match");
        }
        if( rec1 == rec3 ){
            System.out.println("Match2");
        }
        else{
            System.out.println("No match2");
        }
    }
}
