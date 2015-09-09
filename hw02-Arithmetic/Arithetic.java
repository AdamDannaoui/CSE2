// Adam Dannaoui hw02 9/8/15
// Will compute the cost of the items purchased including and excluding a 6% sales tax
  public class Arithetic{ 
  public static void main (String[]args){
  int nSocks=3; 
  // number of pairs of socks 
  // cost per pair of sock
  double sockCost$=2.58;
  // number of drinking glasses
  int nGlasses=6;
  // cost per glass
  double glassCost$=2.29;
  //number of boxes of envelopes
  int nEnvelopes=1;
  // cost per box of envelopes
  double envelopeCost$=3.25;
  double taxPercent=1.06;
  // Sales tax
  double totalSockCost$=(((nSocks*sockCost$)*(taxPercent)));
  //declaring the formula for finding the total sock cost 
  double endSCost$=(int) (100*totalSockCost$);
  // Multiplying total sock cost by 100 and explicitley casting double to int 
  double endSoCost$=(endSCost$/100);
  //dividing the total sock cost by 100 so we get a normal value for the cost
  System.out.println("the total cost of the sock is" + endSoCost$ + "$");
  // Printing the statement 
  double totalGlassCost$=((glassCost$*nGlasses)*(taxPercent));
  // declaring the formula for finding the total glass cost 
  double endGCost$=(int) (100*totalGlassCost$);
  //multiplying total glass cost by 100 and explicitley casting double to int
  double endGlCost$=(endGCost$/100);
  //dividing by 100 so we get a normal value for the cost
  System.out.println("the total cost for the glass is" + endGlCost$ + "$");
  //printing the statement for the total cost of glass
  double totalEnvelopeCost$=((nEnvelopes*envelopeCost$)*(taxPercent));
  //declaring formula for finding the total envelope cost
  double endECost$=(int)(100*totalEnvelopeCost$);
  // multiplying total envelope cost by 100 and explicitley casting double to int
  double endEnCost$=(endECost$/100);
  //dividing by 100 to get a normal value for the total cost of envelopes
  System.out.println("total cost of envelopes is" + endEnCost$ + "$");
  //Printing the statement for total cost of envelopes
  double totalInitialCost$=((nEnvelopes*envelopeCost$)+(nSocks*sockCost$)+(nGlasses*glassCost$));
  //declaring total initial cost before taxes
  System.out.println("the total cost before taxes is"+ totalInitialCost$+ "$");
  //Printing the statement for the total initial cost before taxes
  double totalFinalCost$=(endEnCost$+endGlCost$+endSoCost$);
  //Declaring the formula for finding the total final cost 
  System.out.println("total cost of the purchases is" + totalFinalCost$ + "$");
  //Printing the statement for the total final cost 
    }
}