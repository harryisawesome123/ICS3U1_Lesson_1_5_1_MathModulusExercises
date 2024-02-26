class Circumference extends ConsoleProgram {

  /**
  * A program Circumference.java that computes the circumference of a circle given a radius from user entry.
  * @author: H. Rahukulan
  */
  
  public void run() {
    
    // Declared the variables
    double dblRad;
    double dblCir;

    // Asked user for information
    dblRad = readDouble("What is the radius of the circle? ");

    // Processing
    dblCir = (Math.PI * dblRad * 2);

    // Output
    System.out.println("The circumference of the circle is: " + dblCir);
  }
}