class AreaSin extends ConsoleProgram {

  /**
  * A program AreaSin.java that uses the Math.sin() function to calculate the area of a triangle, given two sides and the contained angle.
  * @author: H. Rahukulan
  */
  
  public void run() {
    
    // Declared variables

    double dblArea;
    double dblSideA;
    double dblSideB;
    double dblAngle;

    // Asked user what the lengths and degree of sides and angle are

    dblSideA = readDouble("What is the length of the first side? ");
    dblSideB = readDouble("What is the length of the second side? ");
    dblAngle = readDouble("What is the length of the contained angle? ");

    // Processing the information

    dblArea = dblSideA * dblSideB * Math.sin(dblAngle) / 2;

    // Output

    System.out.println("The area of the triangle is: " + dblArea);
  }
}