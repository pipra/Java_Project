package Chapter_Five;

public class MatchingObjectRunner {
    public static void main(String[] args) {
        MatchingObject rec1 = new MatchingObject( "Habib" , 20 );
        MatchingObject rec3 = rec1 ;
        MatchingObject rec2 = new MatchingObject( "Habib" , 20 );

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
