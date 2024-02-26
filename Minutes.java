class Minutes extends ConsoleProgram {

  /**
  * A program Minutes.java that lets you enter a number of minutes, and that will calculate the number of days, hours and minutes that represents
  * @author: H. Rahukulan
  */
  
  public void run() {
    
    // Declared variables
    int intmin;
    int inthour;
    int intday;
    int intremainingmins;
    int intremaininghours;

    // Asked user for information
    intmin = readInt("How many miniutes? ");

    // Processing
    inthour = intmin / 60;
    intday = inthour / 24;
    intremaininghours = intmin / 60 - (intday * 24);
    intremainingmins = intmin - (inthour * 60);

    // Output
    System.out.println("The number of days minuites and hours are " + intday + " days, " + intremaininghours + " hours and " + intremainingmins +  " miniutes.");

  }
}