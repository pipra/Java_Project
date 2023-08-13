package class_09_08;

public class PowerTable {
    public static void main(String[] args) {
        for( int i=1 ; i<= 4 ; i++ ){
            System.out.printf( "%10d" , i );
        }
        System.out.println();
        for( int i=1 ; i<= 4 ; i++ ){
            System.out.printf( "%10s" , "x " );
        }
        System.out.println();
        System.out.println();
        for( int number = 1 ; number < 11 ; number++ ) {
            System.out.printf( "%10d", number );
            System.out.printf( "%10d", number*number );
            System.out.printf( "%10d", number*number*number );
            System.out.printf( "%10d", number*number*number*number );
            System.out.println();
        }
    }
}
