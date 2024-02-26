class Power extends ConsoleProgram {

  /**
  * A program Power.java that let you enter two numbers a,b, and that prints out a^b
  * @author: H. Rahukulan
  */
  
  public void run() {
    
    // Declared Variables
    
    double dblA;
    double dblB;
    double dblanswer;

    // Asked user for information
    dblA = readDouble("What is the base? ");
    dblB = readDouble("What is the power? ");

    // Processing
    dblanswer = Math.pow(dblA, dblB);

    // Output
    System.out.println("The answer is: " + dblanswer);
  }
}