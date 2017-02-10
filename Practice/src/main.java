import java.util.Random;

public class main{

static Random rnd = new Random();

public static void main( String[] args ){
    int randNum = rnd.nextInt( 16 )+1;
    for( int i = 0; i < 16; i++ )
        if( i != randNum )
            System.out.print("*");
        else
            System.out.print(" ");
    }
}