class Rads extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // start coding here
    double dblDegree;
    double dblRad;

    dblDegree = readDouble("What is the degree? ");

    dblRad = Math.toRadians(dblDegree);

    System.out.println("The radian is " + dblRad);
  }
}