class Cos3rd extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // start coding here
    double dblSideA;
    double dblSideB;
    double dblAngleC;
    double dblSideC;

    dblSideA = readDouble("What is the length of the first side? ");
    dblSideB = readDouble("What is the length of the second side? ");
    dblAngleC = readDouble("What is the degree of the contained angle? ");

    dblSideC = Math.sqrt(Math.pow(dblSideA, 2) + Math.pow(dblSideB, 2) - 2 * dblSideA * dblSideB * Math.cos(dblAngleC));

    System.out.println("The third side of the triangle is: " + dblSideC);
  }
}