package sg.edu.nus.iss;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );

        MountainBike mountainBike= new MountainBike (5,10,20);
        System.out.println(mountainBike.toString());
    }
}
