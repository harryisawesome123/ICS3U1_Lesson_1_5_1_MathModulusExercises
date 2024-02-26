class AreaSin extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // start coding here
    double dblArea;
    double dblSideA;
    double dblSideB;
    double dblAngle;

    dblSideA = readDouble("What is the length of the first side? ");
    dblSideB = readDouble("What is the length of the second side? ");
    dblAngle = readDouble("What is the length of the contained angle? ");

    dblArea = dblSideA * dblSideB * Math.sin(dblAngle) / 2;

    System.out.println("The area of the triangle is: " + dblArea);
  }
}