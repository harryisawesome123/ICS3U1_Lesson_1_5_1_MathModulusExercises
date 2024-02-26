class Minutes extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // start coding here
    int intmin;
    int inthour;
    int intday;
    int intremainingmins;
    int intremaininghours;

    intmin = readInt("How many miniutes? ");

    inthour = intmin / 60;
    intday = inthour / 24;
    intremaininghours = intmin / 60 - (intday * 24);
    intremainingmins = intmin - (inthour * 60);

    System.out.println("The number of days minuites and hours are " + intday + " days, " + intremaininghours + " hours and " + intremainingmins +  " miniutes.");

  }
}