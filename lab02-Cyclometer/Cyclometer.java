//Adam Dannaoui 9/4/15 CSE2
//program will record two types of data, time and the number of rotations on the wheel during that time
    public class Cyclometer {
        public static void main (String [] args) {
    int (secsTrip1 = 480) ; // declaring variable and number of seconds in trip 1
    int (secsTrip2 = 3220) ; // declaring variable and number of seconds in trip 2
    int (countsTrip1 = 1561) ; // declaring variable and number of rotations for trip 1
    int countsTrip2 = 9037 ; // declaring variable and number of rotations for trip 2
    double wheelDiameter = 27.0 ; // declaring the variable and the length of the diameter
    double PI = 3.14159 ; // declaring the variable pi and its value
    int (feetPerMile = 5280) ; // declaring the amount of feet per mile 
    int (inchesPerFoot = 12 ; // declaring the amount of inchs per foot
    int (secondsPerMinute = 60) ; // declaring the amount of seconds per minute
    double distanceTrip1 , distanceTrip2 , totalDistance ;
    System.out.println (" Trip 1 took " +
    ( secsTrip1 / secondsPerMinute ) + " minutes and had " +
    countsTrip1 + " counts.") ;
    System.out.println (" Trip 2 took " +
    ( secsTrip2 / secondsPerMinute ) + " minutes and had " + countsTrip2 + " counts. " ) distanceTrip1 = ( countsTrip1 * wheelDiameter * PI ) ;
    //Above gives distance in inches
    //(for each count, a rotation of the wheel travels
    //the diameter in inches times PI)
    double distanceTrip1 = ( inchesPerFoot * feetPerMile ) ; // Converts to distance in miles
    double totalDistance = ( distanceTrip1 + distanceTrip2 ) ;
    double distanceTrip2 = ( ( countsTrip2 * wheelDiameter * PI ) / ( inchesPerFoot / feetPerMile ) );
    System.out.println( " Trip 1 was " + distanceTrip1 + " miles " ) ;
    System.out.println( " Trip 2 was " + distanceTrip2 + " miles " ) ;
    System.out.println( "The total distance was " + totalDistance +" miles " ) ;
    }
}