//Adam Dannaoui 09/04/15 CSE2 
// This program will records both the time elapsed and 
//number of rotations the wheel has 
  public class Cyclometer {

  public static void main(String[] args) {

  int secsTrip1=480;// declaring variable and time in seconds for trip 1
  int secsTrip2=3220;// declaring variable and time in seconds for trip 2
  int countsTrip1=1561;// declaring variable and rotation count for trip1.
  int countsTrip2=9037;// declaring variable and rotation count for trip2.
  // declaring values for the data
  double wheelDiameter=27.0;// data for wheel diameter.
  double PI=3.14159; // value of pi.
  int feetPerMile=5280;// ratio value feet:mile.
  int inchesPerFoot=12;// ratio value inches:foot
  int secondsPerMinute=60;// ratio value seconds:minute
  double distanceTrip1, distanceTrip2, totalDistance;
  System.out.println("Trip 1 took "+
  (secsTrip1/secondsPerMinute)+" minutes and had "+
  countsTrip1+" counts."); 
  //statement for how long trip 1 will take and how many counts
  System.out.println("Trip 2 took "+
  (secsTrip2/secondsPerMinute)+" minutes and had "+
  countsTrip2+" counts.");
  //statement for how long trip 2 will take and how many counts
  distanceTrip1=countsTrip1*wheelDiameter*PI;
  // Gives distance in inches
  distanceTrip1=countsTrip1*wheelDiameter*PI/inchesPerFoot/feetPerMile; 
  // Gives distance in miles of trip1 in miles.
  distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
  totalDistance=distanceTrip1+distanceTrip2; // Gives total distance in miles
  System.out.println("Trip 1 was "+distanceTrip1+" miles");
  System.out.println("Trip 2 was "+distanceTrip2+" miles");
  System.out.println("The total distance was "+totalDistance+" miles"); 
  //prints statements for the distances that were traveled in trip 1 and 2 and the total distance
}
} 


