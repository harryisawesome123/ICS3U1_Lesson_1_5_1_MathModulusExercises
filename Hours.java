class Hours extends ConsoleProgram {

  /**
  * A program Hours.java that lets you enter a number of hours, and that converts it to days and hours
  * @author: H. Rahukulan
  */
  
  public void run() {
    
    // Declared variables
    int inthours;
    int intanswer;
    int intremaininghours;
    int inttotalhoursinday;

    // Asked user for information
    inthours = readInt("What is the amount of hours? ");

    // Processing
    intanswer = inthours / 24;
    inttotalhoursinday = intanswer * 24;
    intremaininghours = inthours - inttotalhoursinday;

    // Output
    System.out.println("The number of days and hours is " + intanswer + " days and " + intremaininghours + " hours.");
  }
}