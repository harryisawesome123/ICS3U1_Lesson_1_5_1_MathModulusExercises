class Power extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // start coding here
    
    double dblA;
    double dblB;
    double dblanswer;

    dblA = readDouble("What is the base? ");
    dblB = readDouble("What is the power? ");

    dblanswer = Math.pow(dblA, dblB);

    System.out.println("The answer is: " + dblanswer);
  }
}