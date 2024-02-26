class Cos3rd extends ConsoleProgram {

  /**
  * A program Cos3rd.java that lets you enter two sides of a triangle and the contained angle, and that will use the cosine law to calculate the third side
  * @author: H. Rahukulan
  */
  
  public void run() {
    
    // Declared variables
    double dblSideA;
    double dblSideB;
    double dblAngleC;
    double dblSideC;

    // Asked user for information
    dblSideA = readDouble("What is the length of the first side? ");
    dblSideB = readDouble("What is the length of the second side? ");
    dblAngleC = readDouble("What is the degree of the contained angle? ");

    // Processing
    dblSideC = Math.sqrt(Math.pow(dblSideA, 2) + Math.pow(dblSideB, 2) - 2 * dblSideA * dblSideB * Math.cos(dblAngleC));

    // Output
    System.out.println("The third side of the triangle is: " + dblSideC);
  }
}