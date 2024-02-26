class Rads extends ConsoleProgram {

  /**
  * A program Rads.java that converts degree measures to radian measures
  * @author: H. Rahukulan
  */
  
  public void run() {
    
    // Declared Variables
    double dblDegree;
    double dblRad;

    // Asked user for information
    dblDegree = readDouble("What is the degree? ");

    // Processing
    dblRad = Math.toRadians(dblDegree);

    // Output
    System.out.println("The radian is " + dblRad);
  }
}